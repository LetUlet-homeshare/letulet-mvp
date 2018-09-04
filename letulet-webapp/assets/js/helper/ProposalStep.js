ProposalStep.prototype.modaloptions = {
    keyboard: false,
    backdrop: false
};

function ProposalStep(options) {
    this.activestep = options.activateStep ? options.activateStep : 1;
    this.steps= [];
    this.tips= [];
    this.puces= [];
    this.classStep = "active";

    this.onActivestep = options.activateStep;
    this.beforeNextStep = options.beforeNextStep;

    this._bootstrap();
}

ProposalStep.prototype._bootstrap = function () {

    var _this = this;

    this.steps = document.getElementsByClassName("step");

    this.tips = document.getElementsByClassName("tip");

    this.puces = document.getElementsByClassName("step-number");
    
    this.activateStep(this.activestep);

    for (var i = 0; i < this.steps.length; i++) {

        var stepElt = this.steps[i];

        $(stepElt).on("click", function () {
            
        });
    }

    //Forms
    $("#form1").on("submit", function (e) {

        _this.nextStep();

        return false;
    })

    $("#form2").on("submit", function (e) {

        _this.nextStep();

        return false;
    })
}

ProposalStep.prototype.activateStep = function (step) {


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

    if (this.onActiveStep == "function") {


        this.onActivestep(this.activestep);
    }

    this.jumpToAnchor(step);
    this.activateTip();
    this.activatePuce();
};

ProposalStep.prototype.activateTip = function () {

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

ProposalStep.prototype.activatePuce = function () {

    var step = this.activestep;

    for (var i = 0; i < this.puces.length; i++) {

        var puceElt = this.puces[i];

        if (step - 1 < i) {

            $(puceElt).removeClass(this.classStep);

        } else {

            if (!$(puceElt).hasClass(this.classStep)) {

                $(puceElt).addClass(this.classStep);
            }
        }
    }
};

ProposalStep.prototype.nextStep = function () {


    if (typeof this.beforeNextStep == "function") {

        if (!this.beforeNextStep(this.activestep, this.activestep + 1)) {

            return;
        }
    }

    var next = this.activestep + 1;

    this.activateStep(next);

    return false;
};

ProposalStep.prototype.previousStep = function () {

    var prev = this.activestep - 1;

    this.activateStep(prev);

    return false;
};

ProposalStep.prototype.jumpToAnchor = function (step) {

    if ($("#anchor-step" + step).length > 0) {

        $('html, body').animate({
            scrollTop: $("#anchor-step" + step).offset().top
        }, 500);
    }
};