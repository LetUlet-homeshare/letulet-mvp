function LandlordManager() {}


LandlordManager.prototype.setPassword = function (password, agreementUID, callback) {

    $.ajax({
        url  : "landlord_put.jsp",
        type : 'POST',
        data : {
            password: password,
            action: "new_password",
            agreementUID: agreementUID
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

LandlordManager.prototype.add = function (data, callback) {

    $.ajax({
        url  : "../landlord_post.jsp",
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

window.landlordManager = new LandlordManager();