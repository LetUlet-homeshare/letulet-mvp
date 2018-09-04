function TransactionManager() {}

TransactionManager.prototype.get = function (id, callback) {

    $.ajax({
        url  : "../transaction_get.jsp",
        type : 'GET',
        data : {
            bankAccontID: id
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

window.transactionManager = new TransactionManager();