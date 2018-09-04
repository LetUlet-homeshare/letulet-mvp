app.service('TransactionService',['$http', function($http) {

    function TransactionService () {

    }

    TransactionService.prototype.retry = function (transaction, callback) {

        $http({
            method: 'GET',
            url: "transaction_retry.jsp",
            data: 'json',
            params: {
                "transactionID" : transaction.id
            }
        }).then(function successCallback(response) {

            if(typeof callback == "function") {

                if (response.data.status == "error") {

                    callback(null);
                    return;
                }

                callback(response.data);
            }
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
    return TransactionService;
}]);