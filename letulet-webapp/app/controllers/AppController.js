app.controller('AppController', ['$scope', '$location', '$document', '$window', '$timeout', '$anchorScroll', '$http', 'UserService', function($scope, $location, $document, $window, $timeout, $anchorScroll, $http, UserService) {

    var params = $location.search();

    var userService = new UserService();

    $scope.user = null;

    userService.getCurrentUser(function(user) {

        $scope.user = user;
    });
}]);