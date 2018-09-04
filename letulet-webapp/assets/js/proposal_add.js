setNavbarActive("proposals.jsp");

$( document ).ready(function() {
    
    //Notes popover
    var popover = $('#notes').popover({
        html: true,
        trigger: "manual",
        template: '<div class="popover popover-style-1" role="tooltip"><div class="arrow"></div><div class="text-sm popover-content"></div></div>',
        content: '<p style="padding-left:10px;margin-bottom: 20px;">It is helpful that your landlord understands why hosting is important to you. Use our pre-written sentences describing the importance of hosting, or write in your own words. This will increase your changes of getting approval as it shows you will be a caring and responsible host.</p>' +
        '<form onchange="fillNotes(this)">' +
        '<div class="radio radio-style-1 radio-center">' +
        '<label class="radio-container">  Hosting helps me earn extra income while I’m away and helps me stay in the city that I love' +
        '<input type="radio" name="notes" value="1">' +
        '<span class="checkmark"></span>' +
        '</label>' +
        '</div>' +
        '<div class="radio radio-style-1 radio-center">' +
        '<label class="radio-container"> I respect my building and neighbor and will make hosting safe an successful'+
        '<input type="radio" name="notes" value="2">' +
        '<span class="checkmark"></span>' +
        '</label>' +
        '</div>' +
        /*'<div class="radio radio-style-1 radio-center">' +
        '<label class="container"> Write your own' +
        '<input type="radio" name="notes" value="3" checked>' +
        '<span class="checkmark"></span>' +
        '</label>' +
        '</div>' +*/
        '</form>',
        viewport: {
            "selector": "#notes", "padding": 0
        }
    });

    window.proposalStep = new ProposalStep({
        onActiveSteps: function (step) {
            
            if (step != 3) {

                $(".popover").addClass("disabled");
            } else {

                $(".popover").removeClass("disabled");
            }
        }
    });

    window.proposalChart = new ProposalChart("form2", {
        slider: $('#slider-payout'),
        chart: {
            id: "chart-payout"
        }
    });

    togglePopover();
});

function togglePopover (step) {

    if (this.popover == null) return;

    if (step == 3) {

        $(".popover").removeClass("disabled");
    } else {

        $(".popover").addClass("disabled");
    }
}

function openInvitationModal() {

    $("#sendinvitationmodal").modal(proposalStep.modaloptions).modal("show");
}

function sendInvitation (form) {

    var _this = this;
    var data = $('#form1, #form2, #form3, #form4').serialize();

    //Check emails
    var email1 = form.elements["data[Landlord][email]"].value;
    var email2 = form.elements["data[Landlord][re_email]"].value;

    if (email1 != email2) {

        $(form.elements["data[Landlord][re_email]"]).val("").focus();

        return false;
    }

    proposalManager.addProposal(data, function (jsn) {


        if (jsn.status == "error") {

            $("#form4-message").empty().html(jsn.message);

            return;
        }

        $("#sendinvitationmodal").modal("hide");
        $("#sendinvitationcongratsmodal").modal(proposalStep.modaloptions).modal("show");
    });

    return false;
}

function fillNotes (form) {

    var input = form.elements["notes"].value;

    if (input == 1) {

        $("#notes").val("Hosting helps me earn extra income while I’m away and helps me stay in the city that I love");
    } else if (input == 2) {

        $("#notes").val("I respect my building and neighbor and will make hosting safe an successful");
    } else {

        $("#notes").val("");
    }
}