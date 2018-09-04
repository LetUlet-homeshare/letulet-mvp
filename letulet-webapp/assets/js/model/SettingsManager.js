function SettingsManager() {}

SettingsManager.prototype.put = function (field, value, callback) {

    $.ajax({
        url  : "settings_put.jsp",
        type : 'POST',
        data : {
            field: field,
            value: value
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

window.settingsManager = new SettingsManager();