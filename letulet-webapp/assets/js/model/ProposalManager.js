function ProposalManager() {}


ProposalManager.prototype.addProposal = function (data, callback) {

    $.ajax({
        url  : "proposal_post.jsp",
        type : 'POST',
        data : data,
        dataType: 'json',
        success : function(data) {
            
            if (typeof callback == "function") callback(data);
        },
        error : function() {

            if (typeof callback == "function") callback({
                status: "error",
                message: "An error occurred"
            });
        }
    });
}

ProposalManager.prototype.declineProposal = function (data, callback) {

    var json = data + '&action=decline';
    
    $.ajax({
        url  : "proposal_put.jsp",
        type : 'POST',
        data : json,
        dataType: 'json',
        success : function(data) {

            if (typeof callback == "function") callback(data);
        },
        error : function() {

            if (typeof callback == "function") callback({
                status: "error",
                message: "An error occurred"
            });
        }
    });
}

ProposalManager.prototype.signProposal = function (data, callback) {

    var json = data + '&action=sign';

    $.ajax({
        url  : "proposal_put.jsp",
        type : 'POST',
        data : json,
        dataType: 'json',
        success : function(data) {

            if (typeof callback == "function") callback(data);
        },
        error : function() {

            if (typeof callback == "function") callback({
                status: "error",
                message: "An error occurred"
            });
        }
    });
}

ProposalManager.prototype.setRules = function (data, callback) {

    var json = data + '&action=set_rules';

    $.ajax({
        url  : "proposal_put.jsp",
        type : 'POST',
        data : json,
        dataType: 'json',
        success : function(data) {

            if (typeof callback == "function") callback(data);
        },
        error : function() {

            if (typeof callback == "function") callback({
                status: "error",
                message: "An error occurred"
            });
        }
    });
}

ProposalManager.prototype.setPayout = function (data, callback) {

    var json = data + '&action=set_payout';

    $.ajax({
        url  : "proposal_put.jsp",
        type : 'POST',
        data : json,
        dataType: 'json',
        success : function(data) {

            if (typeof callback == "function") callback(data);
        },
        error : function() {

            if (typeof callback == "function") callback({
                status: "error",
                message: "An error occurred"
            });
        }
    });
}

ProposalManager.prototype.getProposalByUid = function (uid, callback) {

    $.ajax({
        url  : "proposal_get.jsp",
        type : 'GET',
        data : {
            uid: uid
        },
        dataType: 'json',
        success : function(data) {

            if (typeof callback == "function") callback(data);
        },
        error : function() {

            if (typeof callback == "function") callback({
                status: "error",
                message: "An error occurred"
            });
        }
    });
}

window.proposalManager = new ProposalManager();