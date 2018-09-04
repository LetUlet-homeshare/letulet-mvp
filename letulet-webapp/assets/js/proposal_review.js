setNavbarActive("proposals.jsp");

var _this = this;
var numberOfRulesDisplayed = 1;

$( document ).ready(function() {

    //Notes popover
    var popover = $('#notes').popover({
        html: true,
        trigger: "manual",
        template: '<div class="popover popover-style-1" role="tooltip"><div class="arrow"></div><div class="text-sm popover-content"></div></div>',
        content: '<p style="padding-left:10px;margin-bottom: 20px;">It is helpful that your landlord understands why hosting is important to you. Use our pre-written sentences describing the importance of hosting, or write in your own words. This will increase your changes of getting approval as it shows you will be a caring and responsible host.</p>' +
        '<form onchange="proposal.fillNotes(this)">' +
        '<div class="radio radio-style-1 radio-center">' +
        '<label class="container">  Hosting helps me earn extra income while I’m away and helps me stay in the city that I love' +
        '<input type="radio" name="notes" value="1">' +
        '<span class="checkmark"></span>' +
        '</label>' +
        '</div>' +
        '<div class="radio radio-style-1 radio-center">' +
        '<label class="container"> I respect my building and neighbor and will make hosting safe an successful'+
        '<input type="radio" name="notes" value="2">' +
        '<span class="checkmark"></span>' +
        '</label>' +
        '</div>' +
        '<div class="radio radio-style-1 radio-center">' +
        '<label class="container"> Write your own' +
        '<input type="radio" name="notes" value="3" checked>' +
        '<span class="checkmark"></span>' +
        '</label>' +
        '</div>' +
        '</form>',
        viewport: {
            "selector": "#notes", "padding": 0
        }
    });

    window.proposalStep = new ProposalStep({
        activateStep: 1,
        beforeNextStep: function (currentStep, nextStep) {
            
            if (!_this.landlordPasswordIsSet && currentStep == 1) {

                showPasswordModal();

                return false;
            }

            return true;
        }
    });

    proposalManager.getProposalByUid(uid, function (data) {

        window.proposalChart2 = new ProposalChart("step3", {
            slider: null,
            chart: {
                id: "chart-payout-static"
            },
            viewByLandlord: true,
            landlordpercentage: data.Agreement.landlordCommissionRate,
            payout: data.Agreement.payout
        });

        window.proposalChart = new ProposalChart("chartspayoutmodal", {
            slider: $('#slider-payout'),
            chart: {
                id: "chart-payout"
            },
            viewByLandlord: true,
            landlordpercentage: data.Agreement.landlordCommissionRate,
            payout: data.Agreement.payout
        });



        updateProposalOnScreen(data.Agreement);
    });

    //Forms
    $("#form2").on("submit", function (e) {

        _this.setRules(function (data) {

            updateProposalOnScreen(data.Agreement);
        });

        return false;
    });

    $("#form-payout").on("submit", function (e) {

        _this.sendPayout(function () {

            $("#chartspayoutmodal").modal("hide");
            $("#payoutsendedtenantmodal").modal("show");
        });

        return false;
    });


    //Update dynamically the proposal
    $('#previewproposalmodal').on('show.bs.modal', function (e) {

        proposalManager.getProposalByUid(uid, function (data) {

            var valtextagreement = document.querySelectorAll("[val-text-agreement]");

            for (var i = 0; i < valtextagreement.length; i++) {

                valtextagreement[i].value = data.Agreement.textAgreement;
            }
        });
    });

    $('#landlordreviewproposalmodal').on('show.bs.modal', function (e) {

        proposalManager.getProposalByUid(uid, function (data) {

            var valtextagreement = document.querySelectorAll("[val-text-agreement]");

            for (var i = 0; i < valtextagreement.length; i++) {

                valtextagreement[i].value = data.Agreement.textAgreement;
            }
        });
    });

    //Autoplay video
    $('#videomodal').on('show.bs.modal', function (e) {

        var video = $('video')[0];

        if( video.paused) {
            video.play();
        }
    });

    $('#videomodal').on('hide.bs.modal', function (e) {

        var video = $('video')[0];

        if(!video.paused) {
            video.pause();
        }
    });

    //Popovers
    $('.tenant-popover').popover({
        html : true,
        container: "body",
        trigger: 'hover',
        placement: 'bottom',
        content: function() {
            return $('#content-tenant-popover').html();
        }
    }).on('shown.bs.popover', function () {
    })
});

function setLandlordPassword (form) {

    var _this = this;
    var data = $('#landlorlsetpasswordform').serialize();

    //Check emails
    var password1 = form.elements["data[Landlord][password]"].value;
    var password2 = form.elements["data[Landlord][re_password]"].value;
    var agreementUID = form.elements["data[Agreement][uid]"].value;

    if (password1 != password2) {

        $(form.elements["data[Landlord][re_password]"]).val("").focus();

        return false;
    }

    landlordManager.setPassword(password1, agreementUID, function (jsn) {


        if (jsn.status == "error") {

            $("#landlorlsetpasswordform-message").empty().html(jsn.message);

            return;
        }

        $("#landlorlsetpasswordmodal").modal("hide");

        _this.landlordPasswordIsSet = true;

        proposalStep.nextStep();
    });

    return false;
}

function decline() {

    var _this = this;
    var data = $('#form-proposal-decline').serialize();

    proposalManager.declineProposal(data, function (jsn) {


        if (jsn.status == "error") {

            $("#form-proposal-decline-message").empty().html(jsn.message);

            return;
        }

        $("#sendinvitationmodal").modal("hide");

        _this.goToIndex();
    });

    return false;
}

function showDeclineModal () {

    $("#proposaldeclinemodal").modal("show");

    return false;
}

function showPasswordModal () {

    $("#landlorlsetpasswordmodal").modal("show");

    return false;
}

function reviewProposalModal () {

    $("#landlordreviewproposalmodal").modal("show");

    return false;
}

function reviewProposal (form) {

    var _this = this;
    var data = $('#landlordreviewproposalform').serialize();

    proposalManager.signProposal(data, function (jsn) {


        if (jsn.status == "error") {

            $("#landlordreviewproposalmodal-message").empty().html(jsn.message);

            return;
        }

        $("#landlordreviewproposalmodal").modal("hide");
        $("#pairingsuccessfulmodal").modal("show");
    });

    return false;
}

function previewProposal () {

    _this.setRules(function () {

        $("#previewproposalmodal").modal("show");
    });
}

function goToDashboard () {

    window.location = "./dashboard.jsp";
}

function goToIndex () {

    window.location = "./index.jsp";
}

function setRules (callback) {

    var _this = this;

    var data = $('#form2').serialize();

    proposalManager.setRules(data, function (data) {

        var uid = data.Agreement.uid;

        proposalManager.getProposalByUid(uid, function (data) {

            //proposalStep.nextStep();

            if (typeof callback == "function") {

                callback(data);
            }
        });
    });
}

function sendPayout (callback) {

    var data = $('#form-payout').serialize();

    proposalManager.setPayout(data, function (data) {

        if (typeof callback == "function") {
            
            callback();
        }
    });
}

function updateProposalOnScreen (proposal) {

    console.log(proposal);

    //Tenant name
    var htmltenantbestProfile = document.querySelectorAll("[html-tenant-bestProfile]");

    for (var i = 0; i < htmltenantbestProfile.length; i++) {

        htmltenantbestProfile[i].innerHTML = proposal.Tenant.bestProfile;
    }

    //Inform me rule
    var notifiedOfNewBooking = (typeof proposal.Property.notifiedOfNewBooking != "undefined") ? proposal.Property.notifiedOfNewBooking : false;
    var shownotifynewbooking = document.querySelectorAll("[show-notify-new-booking]");

    for (var i = 0; i < shownotifynewbooking.length; i++) {

        shownotifynewbooking[i].style.display = (!notifiedOfNewBooking) ? "none" : "block";
    }

    //landlordCommissionRate
    var htmllandlordcommissionrate = document.querySelectorAll("[html-landlord-commission-rate]");

    for (var i = 0; i < htmllandlordcommissionrate.length; i++) {

        htmllandlordcommissionrate[i].innerHTML = proposal.landlordCommissionRate;
    }

    //Compliance rule
    var complianceRules = (typeof proposal.Property.complianceRules != "undefined") ? proposal.Property.complianceRules : null;
    var showcompliancerule = document.querySelectorAll("[show-compliance-rule]");
    var htmlcompliancerule = document.querySelectorAll("[html-compliance-rule]");

    for (var i = 0; i < showcompliancerule.length; i++) {

        showcompliancerule[i].style.display = (complianceRules == null) ? "none" : "block";
    }

    for (var i = 0; i < htmlcompliancerule.length; i++) {

        htmlcompliancerule[i].innerHTML = complianceRules;
    }

    //Maximum guest
    var maximumGuests = (typeof proposal.Property.maximumGuests != "undefined" && proposal.Property.maximumGuests > 0) ? proposal.Property.maximumGuests : null;
    var showmaximumguest = document.querySelectorAll("[show-maximum-guest]");
    var htmlmaximumguest = document.querySelectorAll("[html-maximum-guest]");

    for (var i = 0; i < showmaximumguest.length; i++) {

        showmaximumguest[i].style.display = (maximumGuests == null) ? "none" : "block";
    }

    for (var i = 0; i < htmlmaximumguest.length; i++) {

        htmlmaximumguest[i].innerHTML = maximumGuests;
    }
    
    //Maximum reservation per year
    var maximumReservationsPerYear = (typeof proposal.Property.maximumReservationsPerYear != "undefined" && proposal.Property.maximumReservationsPerYear > 0) ? proposal.Property.maximumReservationsPerYear : null;
    var showmaximumreservationsperyear = document.querySelectorAll("[show-maximum-reservations-per-year]");
    var htmlmaximumreservationsperyear = document.querySelectorAll("[html-maximum-reservations-per-year]");

    for (var i = 0; i < showmaximumreservationsperyear.length; i++) {

        showmaximumreservationsperyear[i].style.display = (maximumReservationsPerYear == null) ? "none" : "block";
    }

    for (var i = 0; i < htmlmaximumreservationsperyear.length; i++) {

        htmlmaximumreservationsperyear[i].innerHTML = maximumReservationsPerYear;
    }

    //Maximum days per year
    var maximumDaysPerYear = (typeof proposal.Property.maximumDaysPerYear != "undefined" && proposal.Property.maximumDaysPerYear > 0) ? proposal.Property.maximumDaysPerYear : null;
    var showmaximumdaysperyear = document.querySelectorAll("[show-maximum-days-per-year]");
    var htmlmaximumdaysperyear = document.querySelectorAll("[html-maximum-days-per-year]");

    for (var i = 0; i < showmaximumdaysperyear.length; i++) {

        showmaximumdaysperyear[i].style.display = (maximumDaysPerYear == null) ? "none" : "block";
    }

    for (var i = 0; i < htmlmaximumdaysperyear.length; i++) {

        htmlmaximumdaysperyear[i].innerHTML = maximumReservationsPerYear;
    }

    //Not pets
    var noPetsAllowed = (typeof proposal.Property.allowPets != "undefined") ? !proposal.Property.allowPets : false;
    var shownopetsallowedrule = document.querySelectorAll("[show-no-pets-allowed-rule]");

    for (var i = 0; i < shownopetsallowedrule.length; i++) {

        shownopetsallowedrule[i].style.display = (!noPetsAllowed) ? "none" : "block";
    }

    //No loud noise after
    var disallowNoiseAfter = (typeof proposal.Property.disallowNoiseAfter != "undefined") ? proposal.Property.disallowNoiseAfter : null;
    var showdisallownoiseafter = document.querySelectorAll("[show-disallow-noise-after]");
    var htmldisallownoiseafter = document.querySelectorAll("[html-disallow-noise-after]");

    for (var i = 0; i < showdisallownoiseafter.length; i++) {

        showdisallownoiseafter[i].style.display = (disallowNoiseAfter == null) ? "none" : "block";
    }

    for (var i = 0; i < htmldisallownoiseafter.length; i++) {

        var prefix = (disallowNoiseAfter >= 12 && disallowNoiseAfter < 24) ? "pm" : "am";

        if (prefix == "pm") {
            disallowNoiseAfter = disallowNoiseAfter - 12;
        }

        htmldisallownoiseafter[i].innerHTML = disallowNoiseAfter + " " + prefix;
    }

    //Not smoking
    var allowSmoking = (typeof proposal.Property.allowSmoking != "undefined") ? !proposal.Property.allowSmoking : false;
    var shownosmokingrule = document.querySelectorAll("[show-no-smoking-rule]");

    for (var i = 0; i < shownosmokingrule.length; i++) {

        shownosmokingrule[i].style.display = (!allowSmoking) ? "none" : "block";
    }

    //Compliance rule
    var houseRules = (typeof proposal.Property.houseRules != "undefined") ? proposal.Property.houseRules : null;
    var showhouserule = document.querySelectorAll("[show-house-rule]");
    var htmlhouserule = document.querySelectorAll("[html-house-rule]");

    for (var i = 0; i < showhouserule.length; i++) {

        showhouserule[i].style.display = (houseRules == null) ? "none" : "block";
    }

    for (var i = 0; i < htmlhouserule.length; i++) {

        htmlhouserule[i].innerHTML = houseRules;
    }

    //Empty hosting limits
    var shownohostinglimits = document.querySelectorAll("[show-no-hosting-limits]");

    if ((!notifiedOfNewBooking || notifiedOfNewBooking == 0) &&
        (!maximumGuests || maximumGuests == 0) &&
        (!maximumDaysPerYear || maximumDaysPerYear == 0) &&
        (!maximumReservationsPerYear || maximumReservationsPerYear == 0)) {

        shownohostinglimits[i].style.display = "block";
    } else {
        shownohostinglimits[i].style.display = "none";
    }

    //Empty
    var shownohouserules = document.querySelectorAll("[show-no-house-rules]");

    if ((!noPetsAllowed) &&
        (!disallowNoiseAfter) &&
        (!allowSmoking)) {

        shownohouserules[i].style.display = "block";
    } else {
        shownohouserules[i].style.display = "none";
    }
}

function showChartsPayoutModal () {

    $("#chartspayoutmodal").modal("show");
}

function openLetuletVideo() {

    $("#videomodal").modal("show");
}

function addOneRule () {
    var name = "data[Proposal][Rules][" + (numberOfRulesDisplayed + 1) + "]";
    var id = "rules" + (numberOfRulesDisplayed + 1);
    var element = $("<div class=\"checkbox checkbox-red checkbox-circle\"><input id=\"" + id + "\" type=\"checkbox\" checked> <label for=\"" + id + "\"> <textarea name=\"" + name +"\"  class=\"form-control\" rows=\"2\" placeholder=\"Write your own house rules (optional)\"></textarea> </label> </div>");

    $(element).insertAfter( $("#rules" + numberOfRulesDisplayed).parent() ).hide().show(500);

    $(element).find("textarea")[0].focus();

    numberOfRulesDisplayed++;

    $("#rulesCount").val(numberOfRulesDisplayed);
}
