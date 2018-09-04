function UserManager() {}

UserManager.prototype.login = function (data, callback) {

    $.ajax({
        url  : "../login_process.jsp",
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

window.userManager = new UserManager();