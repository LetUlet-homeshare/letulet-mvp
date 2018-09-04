var container = document.getElementById("properties");
var loader = document.getElementById("properties-loader");
var header = document.getElementById("header");
var subheader = document.getElementById("subheader");
var dashboardButton = document.getElementById("dashboardButton");

$.ajax({
    url: "inport_airbnb_data_json.jsp",
    context: document.body,
    type: 'GET',
    beforeSend: function() {
        $(loader).show();
    },
    success: function (properties) {

        $(dashboardButton).show();
        $(loader).hide();

        var propertiesElmt = document.createDocumentFragment();
        $(subheader).hide();
        if (properties.length == 0) {

            $(header).html("No properties were found.");
        } else {

            $(header).html("Congrats ! The following properties have been imported");
        }

        for (var p = 0; p < properties.length; p++) {

            var propertyElement = getPropertyElement(properties[p]);

            propertiesElmt.appendChild(propertyElement);

            container.appendChild(propertiesElmt);
        }
    },
    error: function () {

        var p = document.createElement("p");
        p.innerHTML = "An error occurred";
        container.appendChild(p);

        $(dashboardButton).show();
        $(loader).hide();
    }
});

var getPropertyElement = function (property) {

    var wrapper = document.createElement("div");
    wrapper.className = "property";

    //Icon
    var iconWrapper = document.createElement("div");
    iconWrapper.className = "container_icon";

    var icon = document.createElement("img");
    icon.className = "lazy img-circle property_icon";
    icon.alt = property.name;
    icon.src = property.picture;

    iconWrapper.appendChild(icon);
    wrapper.appendChild(iconWrapper);

    //Details
    var detailsWrapper = document.createElement("div");
    detailsWrapper.className = "property-details";

    var details1 = document.createElement("p");

    details1.innerHTML = "<span class='property-name'>" + property.name + "</span>";

    detailsWrapper.appendChild(details1);

    wrapper.appendChild(detailsWrapper);

    return wrapper;
};