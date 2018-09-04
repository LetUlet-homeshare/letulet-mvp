app.controller('ProposalController', ['$window', '$scope', '$http', 'ProposalService', 'BankAccountService', function($window, $scope, $http, ProposalService, BankAccountService) {

    var proposalService = new ProposalService();
    var bankAccountService = new BankAccountService();

    $scope.proposals = [];
    $scope.proposalSelected = null;
    $scope.bankAccount = {
        id:null,
        name: "",
        isActive: false,
        edit: true,
        isLoading: false,
        message: null,
        hideNC2State: true
    };

    $scope.user = null;

    $scope.$parent.$watch('user', function(){

        if (!$scope.$parent.user) return;

        $scope.user = $scope.$parent.user;

        proposalService.getProposals(function(proposals) {

            if ($scope.user.userType == "landlord") {

                $scope.proposals = proposals;
            }
            
            if ($scope.user.userType == "tenant") {
                
            }
        });
    });

    $scope.getProposalStatus = function (proposal) {

        if (proposal.status == "DECLINED") {

            return "Declined";
        }

        if (proposal.status == "NEW") {

            return "New";
        }


        console.log(proposal);

        if (typeof proposal.LandlordBankAccount == "undefined" || proposal.LandlordBankAccount == null) {

            return "Needs Bank Info";
        }

        if (proposal.LandlordBankAccount != null && !proposal.LandlordBankAccount.isActive) {

            return "Needs Bank Info";
        }
        
        return proposal.statusLabel;
    };

    $scope.openCreateBankAccountModal = function (proposal) {

        $scope.proposalSelected = proposal;
        $("#createbankaccountmodal").modal("show");
    }

    $scope.updateBankAccount = function (proposal) {

        if ($scope.user.userType == "landlord") {

            $window.location.href = "banks_landlord.jsp";
        }

        if ($scope.user.userType == "tenant") {

            $window.location.href = "banks_tenant.jsp";
        }
    }

    $scope.edit = function (bankAccount, index) {

        //Tenant
        if ($scope.user.userType == "landlord") {

            bankAccountService.addAndConnectToProposal($scope.bankAccount, $scope.proposalSelected, function (bankAccount) {

                //retrieve new proposal (connected)
                proposalService.getProposals(function(proposals) {

                    if ($scope.user.userType == "landlord") {

                        $scope.proposals = proposals;
                        $scope.proposalSelected = null;
                        $("#createbankaccountmodal").modal("hide");
                    }
                });
            });
        }
    };

    $scope.viewProposal = function (proposal) {

        if (proposal.status == 'NEW') {

            //$window.location.href = "proposal_review2.jsp?uid=" + proposal.uid;
            $window.open("proposal_review2.jsp?uid=" + proposal.uid, "_blank");
        } else if (proposal.status == 'DECLINED') {

        } else {
            $("#proposalagreementmodal_" + proposal.uid).modal("show");
        }
    }
}]);