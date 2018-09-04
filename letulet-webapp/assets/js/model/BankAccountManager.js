function BankAccountManager() {}

BankAccountManager.prototype.add = function (data, callback) {

    $.ajax({
        url  : "../bankaccount_post.jsp",
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

BankAccountManager.prototype.get = function (data, callback) {

    $.ajax({
        url  : "../bankaccount_get.jsp",
        type : 'GET',
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

BankAccountManager.prototype.edit = function (data, callback) {

    $.ajax({
        url  : "../bankaccount_put.jsp",
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

BankAccountManager.prototype.delete = function (data, callback) {

    $.ajax({
        url  : "../bankaccount_delete.jsp",
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
window.bankAccountManager = new BankAccountManager();