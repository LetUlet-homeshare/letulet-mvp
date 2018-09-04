setNavbarActive("proposals.jsp");

function previewProposal (uid) {

    proposalManager.getProposalByUid(uid, function (data) {

        var valtextagreement = document.querySelectorAll("[val-text-agreement]");

        for (var i = 0; i < valtextagreement.length; i++) {

            valtextagreement[i].value = data.Agreement.textAgreement;
        }

        $("#previewproposalmodal").modal("show");
    });

}