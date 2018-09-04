setNavbarActive("settings.jsp");

$( document ).ready(function() {

    window.updateSettings = function (field, value) {

        settingsManager.put(field, value, function () {


        })
    }

    function readURL(input) {

        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function(e) {
                $('#file-preview').attr('src', e.target.result);
            };

            reader.readAsDataURL(input.files[0]);
        }
    }

    $("#file-upload").change(function() {
        readURL(this);
    });
});