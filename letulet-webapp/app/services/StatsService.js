app.service('StatsService', ['$http','StatsDataConnectorHelper', function($http, StatsDataConnectorHelper) {

    var statsDataConnectorHelper = new StatsDataConnectorHelper();
    
    function StatsService () {

    }

    StatsService.prototype.getHomeshareRevenueData = function (id, callback) {

        $http({
            method: 'GET',
            url: "statistics_get.jsp",
            data: 'json',
            params: {
                propertyID: id,
                type: "homesharerevenue"
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

    return StatsService;
}]);