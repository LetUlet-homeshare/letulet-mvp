//Highcharts
/*Highcharts.chart('revenue', {
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
        data: [{
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
    }]
});*/

//Calendar
/*var event1 = new CalendarEvent("03-01-2018", "03-04-2018", 1);
var event2 = new CalendarEvent("03-04-2018", "03-06-2018", 2);
var event3 = new CalendarEvent("03-08-2018", "03-10-2018", 3);
var event4 = new CalendarEvent("03-15-2018", "03-20-2018", 4);
var event5 = new CalendarEvent("03-13-2018", "03-14-2018", 5);
var event6 = new CalendarEvent("03-20-2018", "03-22-2018", 6);
var event7 = new CalendarEvent("03-23-2018", "03-25-2018", 7);
var event8 = new CalendarEvent("03-27-2018", "03-29-2018", 8);

var currentPopover = null;

var calendar = new Calendar("calendar", {
    isFilled: function () {

        this.addEvent(event1);
        this.addEvent(event2);
        this.addEvent(event3);
    },
    onEventClick: function (target, event) {
        
    }
});*/

function updateProperty (elt) {

    var houselistitems = document.getElementsByClassName("house-list-item");
    var propertyID = elt.dataset.propertyId;

    for (var i = 0; i < houselistitems.length; i++) {

        houselistitems[i].classList.remove("active");
        var _propertyID = houselistitems[i].dataset.propertyId;

        if (propertyID == _propertyID) {
            houselistitems[i].classList.add("active");
        }
    }

    /*calendar.calendarPopoverEngine.closeAll();
    calendar.removeAllEvents();

    if (propertyID == 1) {
        calendar.addEvent(event1);
        calendar.addEvent(event2);
        calendar.addEvent(event3);
    }

    if (propertyID == 2) {
        calendar.addEvent(event4);
        calendar.addEvent(event5);
    }

    if (propertyID == 3) {
        calendar.addEvent(event6);
        calendar.addEvent(event7);
        calendar.addEvent(event8);
    }*/
}

//Action modal
$(document).ready(function(){
    /*$('#btn-action-landlord').popover({
        html : true,
        container: "#revenue",
        trigger: 'click',
        placement: 'bottom',
        content: function() {
            return $('#content-action-landlord').html();
        }
    }).on('shown.bs.popover', function () {
        $('#btn-action-clean').popover("hide");
        $('#btn-action-order').popover("hide");
        $('#btn-action-letulet').popover("hide");
    });

    $('#btn-action-clean').popover({
        html : true,
        container: "#revenue",
        trigger: 'click',
        placement: 'bottom',
        content: function() {
            return $('#content-action-clean').html();
        }
    }).on('shown.bs.popover', function () {
        $('#btn-action-landlord').popover("hide");
        $('#btn-action-order').popover("hide");
        $('#btn-action-letulet').popover("hide");
    })

    $('#btn-action-order').popover({
        html : true,
        container: "#revenue",
        trigger: 'click',
        placement: 'bottom',
        content: function() {
            return $('#content-action-order').html();
        }
    }).on('shown.bs.popover', function () {
        $('#btn-action-landlord').popover("hide");
        $('#btn-action-clean').popover("hide");
        $('#btn-action-letulet').popover("hide");
    })

    $('#btn-action-letulet').popover({
        html : true,
        container: "#revenue",
        trigger: 'click',
        placement: 'bottom',
        content: function() {
            return $('#content-action-letulet').html();
        }
    }).on('shown.bs.popover', function () {
        $('#btn-action-landlord').popover("hide");
        $('#btn-action-clean').popover("hide");
        $('#btn-action-order').popover("hide");
    })*/
});