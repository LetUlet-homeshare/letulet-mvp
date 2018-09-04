app.service('BookingService',['$http', function($http) {

    function BookingService () {

    }

    BookingService.prototype.getBookingsByProperty = function (propertyID, callback) {

        $http({
            method: 'GET',
            url: "booking_get.jsp",
            data: 'json',
            params: {
                propertyID: propertyID
            }
        }).then(function successCallback(response) {

            if(typeof callback == "function") {

                callback(response.data);
            }
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    return BookingService;
}]);