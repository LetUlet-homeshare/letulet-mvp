app.controller('TenantDashboardController', ['$window', '$scope', '$http', 'PropertyService', 'StatsService', 'BookingService', function($window, $scope, $http, PropertyService, StatsService, BookingService) {

    var propertyService = new PropertyService();
    var statsService = new StatsService();
    var bookingService = new BookingService();

    $scope.properties = [];
    $scope.property = null;

    $scope.calendar = null;

    $scope.userIsOnboarding = false;

    //TODO need a specific service
    $scope.onboarding = {
        property: {
            id: 0,
            name: "property test",
            statistics: {
                YTD: {
                    amount: 3000,
                    guests: 5
                },
                MTD: {
                    amount: 400,
                    guests: 3
                }
            },
            bookings: [
                {
                    id: 1,
                    checkinDate: "2018-05-01",
                    checkoutDate: "2018-05-20",
                    guestFirstName: "Cedric",
                    guestLastName: "Raudin",
                    adultCount: 1,
                    childrenCount: 1,
                    property: {
                        name: "name",
                        city: "SF",
                        address1: "Street name",
                        zipCode: "2222"
                    }
                },
                {
                    id: 2,
                    checkinDate: "2018-05-24",
                    checkoutDate: "2018-05-26",
                    guestFirstName: "Cedric",
                    guestLastName: "Raudin",
                    adultCount: 1,
                    childrenCount: 1,
                    property: {
                        name: "name",
                        city: "SF",
                        address1: "Street name",
                        zipCode: "2222"
                    }
                },
                {
                    id: 3,
                    checkinDate: "2018-05-30",
                    checkoutDate: "2018-06-03",
                    guestFirstName: "Cedric",
                    guestLastName: "Raudin",
                    adultCount: 1,
                    childrenCount: 1,
                    property: {
                        name: "name",
                        city: "SF",
                        address1: "Street name",
                        zipCode: "2222"
                    }
                }
            ]
        },
        homesharerevenue: [{
            month: 'January',
            y : 50,
            guest: 5,
            stay: 4
        }, {
            month: 'February',
            y : 71,
            guest: 5,
            stay: 4
        }, {
            month: 'March',
            y : 106,
            guest: 5,
            stay: 4
        }, {
            month: 'April',
            y : 130,
            guest: 5,
            stay: 4
        }, {
            month: 'May',
            y : 144,
            guest: 5,
            stay: 4
        }, {
            month: 'June',
            y : 170,
            guest: 5,
            stay: 4
        }, {
            month: 'July',
            y : 130,
            guest: 5,
            stay: 4
        }, {
            month: 'August',
            y : 150,
            guest: 5,
            stay: 4
        }]
    };

    $scope.refreshGraphic = function () {

        statsService.getHomeshareRevenueData($scope.property.id, function (data) {

            if ($scope.userIsOnboarding) {
            
                data = $scope.onboarding.homesharerevenue;
            }
            
            Highcharts.chart('revenue', {
                chart: {
                    type: 'column'
                },
                title: {
                    text: null
                },
                legend: {
                    enabled: false
                },
                tooltip: {
                    backgroundColor: {
                        linearGradient: [0, 0, 0, 60],
                        stops: [
                            [0, '#ffffff'],
                            [1, '#ffffff']
                        ]
                    },
                    padding: 0,
                    borderColor: 'white',
                    useHTML: true,
                    formatter: function() {

                        return '<div class="highcharts-tooltip-content">' +
                            '<div class="highcharts-tooltip-date">' + this.point.month + '</div>' +
                            '<div class="highcharts-tooltip-price"><h1>$' + this.y + '</h1>earned</div>' +
                            '<div class="highcharts-tooltip-info"><p><span class="green">' + this.point.guest + '</span> Guests</p><p><span class="green">' + this.point.stay + '</span> Total Stays</p></div>' +
                            '</div>'
                    }
                },
                xAxis: {
                    categories: [
                        'Jan',
                        'Feb',
                        'Mar',
                        'Apr',
                        'May',
                        'Jun',
                        'Jul',
                        'Aug'
                    ],
                    crosshair: false
                },
                yAxis: {
                    min: 0,
                    title: {
                        text: null
                    },
                    visible: false
                },
                plotOptions: {
                    series: {
                        pointPadding: 0.1,
                        groupPadding: 0,
                        borderWidth: 0,
                        shadow: false,
                        borderRadius: 8,
                        color: 'rgba(104, 226, 195, 0.7)',
                        className: 'column'
                    },
                    column : {
                        states: {
                            hover: {
                                color: 'rgba(104, 226, 195, 1)'
                            }
                        }
                    }
                },
                series: [{
                    name: null,
                    data: data
                }]
            });
        });
    };

    $scope.refreshCalendar = function (cal) {

        if ($scope.calendar == null) return;

        $scope.calendar.calendarPopoverEngine.closeAll();
        $scope.calendar.removeAllEvents();

        var _this = this;

        if ($scope.userIsOnboarding) {
            for (var i = 0; i < $scope.property.bookings.length; i++) {

                var booking = $scope.property.bookings[i];
                var event = new CalendarEvent(booking.checkinDate, booking.checkoutDate, booking.id);

                $scope.calendar.addEvent(event);
            }

            return;
        }

        bookingService.getBookingsByProperty($scope.property.id, function (bookings) {

            $scope.property.bookings = bookings;

            for (var i = 0; i < bookings.length; i++) {

                var booking = bookings[i];
                var event = new CalendarEvent(booking.checkinDate, booking.checkoutDate, booking.id);

                $scope.calendar.addEvent(event);
            }
        });
    }
    
    $scope.$parent.$watch('user', function(){

        if (!$scope.$parent.user) return;

        $scope.user = $scope.$parent.user;

        propertyService.getProperties(function (properties) {

            if (properties.length == 0) {

                $scope.userIsOnboarding = true;
                $scope.properties.push($scope.onboarding.property);
            } else {

                $scope.properties = properties;
            }


            $scope.property = $scope.properties[0];

            $scope.calendar = new Calendar("calendar", {
                isFilled: function () {

                    $scope.refreshCalendar();
                },
                onEventClick: function (target, event) {}
            });
        });
    });

    $scope.$watch('property', function(){

        if (!$scope.property) return;

        $scope.refreshGraphic();

        $scope.refreshCalendar();
    });
}]);