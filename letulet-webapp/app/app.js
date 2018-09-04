var app = angular.module('letulet', ['pikaday'])
    .config(['$locationProvider', function($locationProvider){
        $locationProvider.html5Mode({
            enabled: true,
            requireBase: false,
            rewriteLinks: false
        });
    }]);


app.filter('capitalize', function() {
    return function(input) {
        return (!!input) ? input.charAt(0).toUpperCase() + input.substr(1).toLowerCase() : '';
    }
});

app.filter('cut', function () {
    return function (value, wordwise, max, tail, cutOnSpace) {
        if (!value) return '';

        max = parseInt(max, 10);
        if (!max) return value;
        if (value.length <= max) return value;

        value = value.substr(0, max);
        if (wordwise) {
            var lastspace = value.lastIndexOf(' ');
            if (lastspace != -1 && cutOnSpace) {
                //Also remove . and , so its gives a cleaner result.
                if (value.charAt(lastspace-1) == '.' || value.charAt(lastspace-1) == ',') {
                    lastspace = lastspace - 1;
                }
                value = value.substr(0, lastspace);
            } else {
                value = value.substr(0, max - tail.length);
            }
        }

        return value + (tail || ' …');
    };
});

app.filter("trust", ['$sce', function($sce) {
    return function (htmlCode) {
        return $sce.trustAsHtml(htmlCode);
    }
}]);

app.config(['$qProvider', function($qProvider){
    $qProvider.errorOnUnhandledRejections(false);
}]);
