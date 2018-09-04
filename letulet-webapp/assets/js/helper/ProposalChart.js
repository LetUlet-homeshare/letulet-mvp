ProposalChart.prototype.payout = 0;
ProposalChart.prototype.slider = null;
ProposalChart.prototype._slider = null;
ProposalChart.prototype.container = null;
ProposalChart.prototype.landlordpercentage = null;
ProposalChart.prototype.warningpopoverslider = {
    active : false,
    popoverSlider: null
};
ProposalChart.prototype.chart = {
    id: null,
    options: {
        chart: {
            backgroundColor: 'transparent',
            spacing: 0,
            plotBackgroundColor: null,
            plotBorderWidth: 0,
            plotShadow: false,
            width: 230,
            height: 230,
            spacingBottom: 0,
            spacingTop: 0,
            spacingLeft: 0,
            spacingRight: 0,
        },
        legend: {
            margin: 0,
            padding: 0
        },
        subtitle: {
            text: 'Your Share',
            align: 'center',
            verticalAlign: 'middle',
            y: 15
        },
        plotOptions: {
            pie: {
                dataLabels: {
                    enabled: false,
                    distance: 0,
                    style: {
                        fontWeight: 'bold',
                        color: 'white'
                    }
                },
                startAngle: -180,
                endAngle: 180,
                center: ['50%', '50%'],
            }
        },
        series: [{
            type: 'pie',
            name: 'Payout',
            innerSize: '40%',
            data: [
                {
                    name: "Landlord",
                    y: 20,
                    color: "#f6df71"
                },
                {
                    name: "Tenant",
                    y: 80,
                    color: "#68e2c2"
                }
            ]
        }]
    }
}

var CONFIGURATIONS = {
    dataproposalpayout : "data-proposal-payout",
    dataproposaltenantpercentage : "data-proposal-tenant-percentage",
    dataproposaltenantamount : "data-proposal-tenant-amount",
    dataproposallandlordpercentage : "data-proposal-landlord-percentage",
    dataproposallandlordamount : "data-proposal-landlord-amount",
    dataproposallandlordfeeamount : "data-proposal-landlord-fee-amount",
    DEFAULT_LANDLORD_PERCENTAGE: 20,
    DEFAULT_PAYOUT: 1000
}

function ProposalChart (containerID, options) {

    this.viewByLandlord = (typeof options.viewByLandlord != "undefined") ? options.viewByLandlord  : false;

    if (typeof containerID != "undefined") {

        this.container = document.getElementById(containerID);
    }

    if (typeof options.slider != "undefined") {

        this.slider = options.slider;
    }

    if (typeof options.chart != "undefined" && typeof options.chart.id != "undefined") {

        this.chart.id = options.chart.id;
    }

    this._bootstrap();

    //SET DEFAULT
    if (typeof options.landlordpercentage != "undefined" && typeof options.landlordpercentage != "undefined") {

        this.landlordpercentage = parseInt(options.landlordpercentage);

    } else {

        this.landlordpercentage = parseInt(CONFIGURATIONS.DEFAULT_LANDLORD_PERCENTAGE);

    }

    if (this.slider != null) {

        if (!this.viewByLandlord) {

            $(this._slider).slider('setValue', 100 - this.landlordpercentage);
        } else {

            $(this._slider).slider('setValue', this.landlordpercentage);
        }
    }

    this.setPayout((typeof options.payout != "undefined" && typeof options.payout != "undefined") ? options.payout : CONFIGURATIONS.DEFAULT_PAYOUT);

    this.refresh();
}

ProposalChart.prototype._bootstrap = function () {

    var _this = this;

    var dataproposalpayout = _this.container.querySelectorAll("[" + CONFIGURATIONS.dataproposalpayout +"]");

    for (var i = 0; i < dataproposalpayout.length; i++) {

        var _dataproposalpayout = dataproposalpayout[i];

        $(_dataproposalpayout).on("change", function() {

            _this.payout = this.value;

            if (_this.slider != null) {

                $(_this._slider).bootstrapSlider("refresh");
            }

            _this.refresh();
        })
    }

    if (this.slider != null) {

        this._slider = $(this.slider).slider({
            formatter: function(value) {
                return 'Current value: ' + value;
            }
        }).on("slide", function (field){

            _this.refresh();
        });
    }

    Highcharts.chart(this.chart.id, this.chart.options);

    this.refresh();
}

ProposalChart.prototype.setPayout = function (payout) {

    this.payout = payout;

    var dataproposalpayout = this.container.querySelectorAll("[" + CONFIGURATIONS.dataproposalpayout +"]");

    for (var i = 0; i < dataproposalpayout.length; i++) {

        var _dataproposalpayout = dataproposalpayout[i];
        _dataproposalpayout.value = this.payout;
    }
}


ProposalChart.prototype.getPayout = function () {

    return this.payout;
}

ProposalChart.prototype.refresh = function () {

    var payout = this.getPayout();
    var tenantPercentage = null;
    var landlordPercentage = null;

    if (!this.viewByLandlord) {

        var val = (this.slider != null) ? $(this._slider).val() : 100 - this.landlordpercentage;
        tenantPercentage = parseInt(val);
        landlordPercentage = parseInt((100 - tenantPercentage));
    } else {

        var val = (this.slider != null) ? $(this._slider).val() : this.landlordpercentage;
        landlordPercentage = parseInt(val);
        tenantPercentage = parseInt((100 - landlordPercentage));
    }
    
    var landlordFeeAmount = parseInt((payout * (3 /100)));
    var payoutWithoutFee = parseInt(payout - landlordFeeAmount);
    var tenantAmount = parseInt((payoutWithoutFee * (tenantPercentage /100)));
    var landlordAmount = parseInt((payoutWithoutFee * (landlordPercentage /100)));
    var chartText = (!this.viewByLandlord) ? '$' + tenantPercentage : '$' + landlordPercentage;

    var dataproposaltenantpercentage = this.container.querySelectorAll("[" + CONFIGURATIONS.dataproposaltenantpercentage +"]");
    var dataproposallandlordpercentage = this.container.querySelectorAll("[" + CONFIGURATIONS.dataproposallandlordpercentage +"]");

    for (var i = 0; i < dataproposaltenantpercentage.length; i++) {

        var _dataproposaltenantpercentage = dataproposaltenantpercentage[i];
        _dataproposaltenantpercentage.value = tenantPercentage + "%";
    }

    for (var i = 0; i < dataproposallandlordpercentage.length; i++) {

        var _dataproposallandlordpercentage = dataproposallandlordpercentage[i];
        _dataproposallandlordpercentage.value = landlordPercentage + "%";
    }

    var dataproposaltenantamount = this.container.querySelectorAll("[" + CONFIGURATIONS.dataproposaltenantamount +"]");
    var dataproposallandlordamount = this.container.querySelectorAll("[" + CONFIGURATIONS.dataproposallandlordamount +"]");

    for (var i = 0; i < dataproposaltenantamount.length; i++) {

        var _dataproposaltenantamount = dataproposaltenantamount[i];
        _dataproposaltenantamount.innerHTML = "$" + tenantAmount;
    }

    for (var i = 0; i < dataproposallandlordamount.length; i++) {

        var _dataproposallandlordamount = dataproposallandlordamount[i];
        _dataproposallandlordamount.innerHTML = "$" + landlordAmount;
    }

    var dataproposallandlordfeeamount = this.container.querySelectorAll("[" + CONFIGURATIONS.dataproposallandlordfeeamount +"]");

    for (var i = 0; i < dataproposallandlordfeeamount.length; i++) {

        var _dataproposallandlordfeeamount = dataproposallandlordfeeamount[i];
        _dataproposallandlordfeeamount.innerHTML = landlordFeeAmount;
    }

    //hightcharts
    var chart = $('#' + this.chart.id).highcharts();

    chart.setTitle({
        text: chartText,
        align: 'center',
        verticalAlign: 'middle',
        y: 0
    });

    chart.series[0].setData(
        [
            {
                name: "Landlord",
                y: landlordPercentage,
                color: "#f6df71"
            }, {
                name: "Tenant",
                y: tenantPercentage,
                color: "#68e2c2"
            }
        ]
    );


    //Popover
    if (this._slider != null) {

        if (this.popoverSlider == null) {

            this.popoverSlider = $('#slider-payout').popover({
                html: true,
                container: $('#chartspayoutmodal'),
                trigger: 'manual',
                placement: 'top',
                content: function () {
                    return $('#content-chartspayoutmodal-popover').html();
                },
                template: '<div class="popover chartspayoutmodal-popover" role="tooltip"><div class="arrow"></div><div class="popover-content"></div></div>'
            });
        }

        if (landlordPercentage <= 25) {

            if (!this.warningpopoverslider.active) {

                $(this.popoverSlider).popover('show');
                this.warningpopoverslider.active = true;
            }

        } else {

            if (this.warningpopoverslider.active) {

                $(this.popoverSlider).popover('hide');
                this.warningpopoverslider.active = false;
            }
        }
    }
};