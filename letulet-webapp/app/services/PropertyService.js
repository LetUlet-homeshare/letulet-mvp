app.service('PropertyService',['$http', function($http) {

    function PropertyService () {

    }

    PropertyService.prototype.getProperties = function (callback) {

        $http({
            method: 'GET',
            url: "property_get.jsp",
            data: 'json'
        }).then(function successCallback(response) {

            if(typeof callback == "function") {

                callback(response.data);
            }
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    PropertyService.prototype.getPropertyByID = function (id, callback) {

        $http({
            method: 'GET',
            url: "property_get.jsp",
            data: 'json',
            params: {
                id: id
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
    return PropertyService;
}]);