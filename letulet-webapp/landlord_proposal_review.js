setNavbarActive("proposals.jsp");

$( document ).ready(function() {

    var _this = this;
    
    //Scroll
    var element = $('.follow-scroll'),
        originalY = element.offset().top;

    var topMargin = 20;

    element.css('position', 'relative');

    $(window).on('scroll', function(event) {
        var scrollTop = $(window).scrollTop();

        element.stop(false, false).animate({
            top: scrollTop < originalY
                ? 0
                : scrollTop - originalY + topMargin
        }, 300);
    });

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

    window.proposal = new Proposal({
        popover: popover
    });

    proposalManager.getProposalByUid(uid, function (data) {

        window.proposalChart = new ProposalChart("chartspayoutmodal", {
            slider: $('#slider-payout'),
            chart: {
                id: "chart-payout"
            },
            viewByLandlord: true,
            landlordpercentage: data.Agreement.landlordCommissionRate,
            payout: data.Agreement.payout
        });

        proposal.updateProposalOnScreen(data.Agreement);
    });
});

Proposal.prototype.sendinvitationmodal = $("#sendinvitationmodal");
Proposal.prototype.sendinvitationcongratsmodal = $("#sendinvitationcongratsmodal");
Proposal.prototype.modaloptions = {
    keyboard: false,
    backdrop: false
};

function Proposal(options) {
    this.activestep = 1;
    this.steps= [];
    this.tips= [];
    this.puces= [];
    this.classStep = "active";

    this.popover = (typeof options.popover != "undefined") ? options.popover : null;

    this._bootstrap();
}

Proposal.prototype._bootstrap = function () {

    var _this = this;

    this.steps = document.getElementsByClassName("step");

    this.tips = document.getElementsByClassName("tip");

    this.puces = document.getElementsByClassName("step-number");

    $(this.popover).popover("show");

    this.activateStep(this.activestep);

    for (var i = 0; i < this.steps.length; i++) {

        var stepElt = this.steps[i];

        $(stepElt).on("click", function () {


        });
    }

    //Forms
    $("#form2").on("submit", function (e) {

        _this.setRules();

        return false;
    })

    $("#form-payout").on("submit", function (e) {

        _this.sendPayout();

        return false;
    })


}


Proposal.prototype.activateStep = function (step) {


    for (var i = 0; i < this.steps.length; i++) {

        var stepElt = this.steps[i];

        if (step - 1 == i) {

            if (!$(stepElt).hasClass(this.classStep)) {

                $(stepElt).addClass(this.classStep);
            }
        } else {

            $(stepElt).removeClass(this.classStep);
        }
    }

    this.activestep = step;

    if (this.activestep != 3) {

        $(".popover").addClass("disabled");
    } else {

        $(".popover").removeClass("disabled");
    }

    this.jumpToAnchor(step);
    this.activateTip();
    this.activatePuce();
    this.togglePopover(step);
};

Proposal.prototype.activateTip = function () {

    var step = this.activestep;

    for (var i = 0; i < this.tips.length; i++) {

        var tipElt = this.tips[i];

        if (step - 1 == i) {

            if (!$(tipElt).hasClass(this.classStep)) {

                $(tipElt).addClass(this.classStep);
            }
        } else {

            $(tipElt).removeClass(this.classStep);
        }
    }
};

Proposal.prototype.activatePuce = function () {

    var step = this.activestep;

    for (var i = 0; i < this.puces.length; i++) {

        var puceElt = this.puces[i];

        if (step - 1 == i) {

            if (!$(puceElt).hasClass(this.classStep)) {

                $(puceElt).addClass(this.classStep);
            }
        } else {

            $(puceElt).removeClass(this.classStep);
        }
    }
};

Proposal.prototype.nextStep = function () {

    var next = this.activestep + 1;

    this.activateStep(next);

    return false;
};

Proposal.prototype.previousStep = function () {

    var prev = this.activestep - 1;

    this.activateStep(prev);

    return false;
};

Proposal.prototype.jumpToAnchor = function (step) {

    $('html, body').animate({
        scrollTop: $("#anchor-step" + step).offset().top
    }, 500);
};

Proposal.prototype.togglePopover = function (step) {

    if (this.popover == null) return;

    if (step == 3) {

        $(".popover").removeClass("disabled");
    } else {

        $(".popover").addClass("disabled");
    }
}

Proposal.prototype.openInvitationModal = function () {

    $(this.sendinvitationmodal).modal(this.modaloptions).modal("show");
}

Proposal.prototype.sendInvitation = function (form) {

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

        $(_this.sendinvitationmodal).modal("hide");
        $(_this.sendinvitationcongratsmodal).modal(_this.modaloptions).modal("show");
    });

    return false;
}

Proposal.prototype.setLandlordPassword = function (form) {

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

        _this.nextStep();
    });

    return false;
}

Proposal.prototype.fillNotes = function (form) {

    var input = form.elements["notes"].value;

    if (input == 1) {

        $("#notes").val("Hosting helps me earn extra income while I’m away and helps me stay in the city that I love");
    } else if (input == 2) {

        $("#notes").val("I respect my building and neighbor and will make hosting safe an successful");
    } else {

        $("#notes").val("");
    }
}

Proposal.prototype.showDeclineModal = function () {

    $("#proposaldeclinemodal").modal("show");

    return false;
}

Proposal.prototype.showPasswordModal = function () {
    
    $("#landlorlsetpasswordmodal").modal("show");

    return false;
}

Proposal.prototype.decline = function () {

    var _this = this;
    var data = $('#form-proposal-decline').serialize();
    
    proposalManager.declineProposal(data, function (jsn) {


        if (jsn.status == "error") {

            $("#form-proposal-decline-message").empty().html(jsn.message);

            return;
        }

        $(_this.sendinvitationmodal).modal("hide");

        _this.goToIndex();
    });

    return false;
}

Proposal.prototype.reviewProposalModal = function () {

    $("#landlordreviewproposalmodal").modal("show");

    return false;
}

Proposal.prototype.reviewProposal = function (form) {

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

Proposal.prototype.goToDashboard = function () {

    window.location = "./dashboard.jsp";
}

Proposal.prototype.goToIndex = function () {

    window.location = "./index.jsp";
}

Proposal.prototype.setRules = function () {

    var _this = this;

    var data = $('#form2').serialize();
    
    proposalManager.setRules(data, function (data) {

        var uid = data.Agreement.uid;

        proposalManager.getProposalByUid(uid, function (data) {

            _this.updateProposalOnScreen(data.Agreement);
            _this.nextStep();
        });
    });
}

Proposal.prototype.updateProposalOnScreen = function (proposal) {

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

        htmldisallownoiseafter[i].innerHTML = disallowNoiseAfter; //TODO handle am / pm
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
}

Proposal.prototype.showChartsPayoutModal = function () {
    
    $("#chartspayoutmodal").modal("show");
}

Proposal.prototype.sendPayout = function () {

    var data = $('#form-payout').serialize();

    proposalManager.setPayout(data, function (data) {

        $("#chartspayoutmodal").modal("hide");
        $("#payoutsendedtenantmodal").modal("show");
    });
}