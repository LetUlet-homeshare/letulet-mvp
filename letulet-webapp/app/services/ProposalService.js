app.service('ProposalService',['$http', function($http) {

    function ProposalService () {

    }

    ProposalService.prototype.getProposals = function (callback) {

        $http({
            method: 'GET',
            url: "proposal_get.jsp",
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

    ProposalService.prototype.getProposalByUid = function (uid, callback) {

        $http({
            method: 'GET',
            url: "proposal_get.jsp",
            data: 'json',
            params: {
                uid: uid
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
    
    return ProposalService;
}]);