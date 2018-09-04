app.service('JSONArrayHelper',[function() {

    var UNIQUE_KEY = "id";

    function JSONArrayHelper () {

    }

    JSONArrayHelper.prototype.updateElementFromArray = function (jsonarray, element) {

        var index = this.getIndex(jsonarray, element);
        
        if (index > -1) {

            jsonarray[index] = element;
        }
        
        return jsonarray;
    };
    
    JSONArrayHelper.prototype.deleteElementFromArray = function (jsonarray, element) {

        var index = this.getIndex(jsonarray, element);
        if (index > -1) {
            jsonarray.splice(index, 1);
        }
        
        return jsonarray;
    };

    JSONArrayHelper.prototype.getIndex = function(jsonarray, element) {

        for (var i = 0; i < jsonarray.length; i++) {

            if (jsonarray[i][UNIQUE_KEY] == element[UNIQUE_KEY]) {

                return i;
            }
        }
        
        return -1;
    };

    return JSONArrayHelper;
}]);