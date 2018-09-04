app.service('BankAccountService',['$http', function($http) {

    function BankAccountService () {

    }

    BankAccountService.prototype.getBankAccounts = function (callback) {

        $http({
            method: 'GET',
            url: "bankaccount_get.jsp",
            data: 'json'
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

    BankAccountService.prototype.add = function (bankAccount, callback) {

        $http({
            method: 'POST',
            url: "bankaccount_post.jsp",
            data: 'json',
            params: bankAccount
        }).then(function successCallback(response) {

            if(typeof callback == "function") {
                
                console.log("add response", response);

                callback(response.data);
            }
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    BankAccountService.prototype.addAndConnectToProposal = function (bankAccount, proposal, callback) {
        
        var params = bankAccount;
        
        if (proposal != null) {
            
            params["proposalUID"] = proposal.uid;
        }

        $http({
            method: 'POST',
            url: "bankaccount_post.jsp",
            data: 'json',
            params: params
        }).then(function successCallback(response) {

            if(typeof callback == "function") {

                console.log("add response", response);

                callback(response.data);
            }
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    BankAccountService.prototype.edit = function (bankAccount, callback) {

        $http({
            method: 'POST',
            url: "bankaccount_put.jsp",
            data: 'json',
            params: bankAccount
        }).then(function successCallback(response) {

            if(typeof callback == "function") {
                
                callback(response.data);
            }
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    BankAccountService.prototype.delete = function (bankAccount, callback) {

        $http({
            method: 'POST',
            url: "bankaccount_delete.jsp",
            data: 'json',
            params: bankAccount
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

    return BankAccountService;
}]);