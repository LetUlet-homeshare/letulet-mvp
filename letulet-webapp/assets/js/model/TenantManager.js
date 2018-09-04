function TenantManager() {}

TenantManager.prototype.add = function (data, callback) {

    $.ajax({
        url  : "../tenant_post.jsp",
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

window.tenantManager = new TenantManager();