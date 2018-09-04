Highcharts.chart('revenue', {
    chart: {
        type: 'column'
    },
    title: {
        text: null
    },

    legend: {
        enabled: false
    },
    tooltip : {
       padding: 0,
        useHTML: true,
    },
    xAxis: {
        categories: [
            'Jan',
            'Feb',
            'Mar',
            'Apr',
            'May',
            'Jun',
            'Jul',
            'Aug'
        ],
        crosshair: false
    },
    yAxis: {
        min: 0,
        title: {
            text: null
        },
        visible: false
    },
    plotOptions: {
        series: {
            pointPadding: 0.1,
            groupPadding: 0,
            borderWidth: 0,
            shadow: false,
            borderRadius: 8,
            color: 'rgba(104, 226, 195, 0.7)',
            className: 'column'
        },
        column : {
            states: {
                hover: {
                    color: 'rgba(104, 226, 195, 1)'
                }
            }
        }
    },
    series: [{
        name: null,
        data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5]
    }]
});