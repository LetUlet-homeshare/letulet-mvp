app.controller('BankAccountController', ['$window', '$scope', '$http', 'BankAccountService', 'TransactionService', 'JSONArrayHelper', function($window, $scope, $http, BankAccountService, TransactionService, JSONArrayHelper) {

    /*
    IMPORTANT
     only landlord can have multiple accounts for the mvp, the tenant will only have one agreement so only one bank account
     */
    var bankAccountService = new BankAccountService();
    var transactionService = new TransactionService();
    var jSONArrayHelper = new JSONArrayHelper();

    $scope.bankAccounts = [];
    $scope.defaultBankAccount = {
        id:null,
        name: "",
        isActive: false,
        edit: true,
        isLoading: false,
        message: null
    };
    $scope.bankAccount = null;
    $scope.user = null;

    $scope.$parent.$watch('user', function(){

        if (!$scope.$parent.user) return;

        $scope.user = $scope.$parent.user;

        bankAccountService.getBankAccounts(function(bankAccount) {

            if ($scope.user.userType == "tenant") {

                $scope.bankAccount = (Object.keys(bankAccount).length == 0) ? null : bankAccount;
            }

            if ($scope.user.userType == "landlord") {

                for (var i = 0; i < bankAccount.length; i++) {

                    bankAccount[i].edit = false;
                }


                $scope.bankAccounts = bankAccount;
            }
        });
    });

    $scope.edit = function (bankAccount, index) {

        if ($scope.user.userType == "tenant") {

            if ((bankAccount.id == null)) {

                bankAccount.isLoading = true;

                bankAccountService.add(bankAccount, function (bankAccount) {

                    $scope.bankAccount = bankAccount;

                    $("#createbankaccountmodal").modal("hide");
                });
            } else {
                bankAccountService.edit(bankAccount, function (bankAccount) {

                    $scope.bankAccount = bankAccount;
                });
            }
        }

        if ($scope.user.userType == "landlord") {

            if (bankAccount.id == null) {

                $scope.bankAccount.isLoading = true;

                bankAccountService.add($scope.bankAccount, function(_bankAccount) {

                    $scope.bankAccounts.push(_bankAccount);

                    $('[data-toggle="tooltip"]').tooltip();
                });

            } else {

                $scope.bankAccounts[index].isLoading = true;
                $scope.bankAccounts[index].message = null;

                bankAccountService.edit(bankAccount, function(_bankAccount) {

                    $scope.bankAccounts[index] = _bankAccount;
                    $scope.bankAccounts[index].isLoading = false;

                    if (_bankAccount.status == "error") {

                        $scope.bankAccounts[index].message = _bankAccount.message;
                        $scope.bankAccounts[index].edit = true;
                    } else {

                        $scope.bankAccounts[index].edit = false;
                    }

                    $('[data-toggle="tooltip"]').tooltip();
                    console.log($scope.bankAccounts[index]);
                });
            }
        }
    };

    $scope.openDeleteModal = function (bankAccount) {

        $('#deletebankaccountmodal_' + bankAccount.id).modal('show');
    };

    $scope.delete = function (bankAccount) {

        //Tenant
        if ($scope.user.userType == "tenant") {

            bankAccountService.delete(bankAccount, function (_bankAccount) {

                $scope.bankAccount = null;
                $('#deletebankaccountmodal').modal('hide');
                $('[data-toggle="tooltip"]').tooltip();
            });
        }

        //Landlord
        if ($scope.user.userType == "landlord") {

            bankAccountService.delete(bankAccount, function () {

                jSONArrayHelper.deleteElementFromArray($scope.bankAccounts, bankAccount);
                $('#deletebankaccountmodal_' + bankAccount.id).modal('hide');
                $('[data-toggle="tooltip"]').tooltip();
            });
        }
    };

    $scope.openCreateBankAccountModal = function () {


        $("#createbankaccountmodal").modal("show");
    }
    
    $scope.retryTransaction = function (transaction) {

        transactionService.retry(transaction, function () {

            bankAccountService.getBankAccounts(function(bankAccount) {

                if ($scope.user.userType == "tenant") {

                    $scope.bankAccount = (Object.keys(bankAccount).length == 0) ? null : bankAccount;
                }

                if ($scope.user.userType == "landlord") {

                    for (var i = 0; i < bankAccount.length; i++) {

                        bankAccount[i].edit = false;
                    }


                    $scope.bankAccounts = bankAccount;
                }
            });
        })
    }
}]);