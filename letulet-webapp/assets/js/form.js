$(document).ready(function() {
    
    function initInputNumber() {
        
        var inputs = document.getElementsByClassName("input-number");
        
        for (var i = 0; i < inputs.length; i++) {

            var input = inputs[i];

            refreshInputNumber(input);

            var group = input.parentNode;

            //-
            var minusBtns = group.getElementsByClassName("input-number-minus");

            for (var v = 0; v < minusBtns.length; v++) {


                var minusBtn = minusBtns[v];

                (function(btn, input) {

                    btn.onclick = function (e) {

                        input.dataset.value = (parseInt(input.dataset.value) > 1) ? parseInt(input.dataset.value) - 1 : parseInt(input.dataset.value);

                        refreshInputNumber(input);
                    }
                })(minusBtn, input);
            }

            //+
            var plusBtns = group.getElementsByClassName("input-number-plus");

            for (var v = 0; v < plusBtns.length; v++) {


                var plusBtn = plusBtns[v];

                (function(btn, input) {

                    btn.onclick = function (e) {

                        input.dataset.value = parseInt(input.dataset.value) + 1;

                        refreshInputNumber(input);
                    }
                })(plusBtn, input);
            }
        }
    }

    function refreshInputNumber (input) {

        var label = input.dataset.label;
        var value = input.dataset.value;

        var plurial = (value > 1) ? label + "s" : label;
        input.value = value + " " + plurial;

    }
    
    initInputNumber();
});