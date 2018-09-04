app.service('UserService',['$http', function($http) {

    function UserService () {

    }

    UserService.prototype.getCurrentUser = function (callback) {

        $http({
            method: 'GET',
            url: "user_get.jsp",
            data: 'json',
        }).then(function successCallback(response) {

            if(typeof callback == "function") {

                callback(response.data);
            }
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
    return UserService;
}]);