<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=9">
    <meta name="description" content="">
    <meta name="keywords" content="" />
    <meta name="robots" content="all,index,follow" />
    <meta name="dcterms.audience" content="Global" />
    <meta name="dcterms.rightsHolder" content="Copyright 2017 Letulet.com" />
    <meta name="rating" content="General" />
    <meta name="revisit-after" content="7 days" />
    <meta property="og:image" content=""/>
    <meta property="og:title" content="LetULet"/>
    <meta property="og:description" content=""/>
    <meta property="og:url" content="https://www.letulet.com/"/>
    <meta property="og:site_name" content="LetULet"/>
    <meta property="og:type" content="website"/>

    <link href="/favicon.ico" type="image/x-icon" rel="icon" /><link href="/favicon.ico" type="image/x-icon" rel="shortcut icon" />
    <!-- Add jQuery library -->
    <script type="text/javascript" src="<%= request.getContextPath() %>/node_modules/jquery/dist/jquery.min.js"></script>

    <!-- Add Bootstrap library -->
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/node_modules/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/node_modules/bootstrap/dist/css/bootstrap-theme.css" />
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/assets/css/letulet.css" />
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/assets/css/bootstrap-formhelpers.css" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="index-page">

<%@ include file="../inc-navbar-logout.jsp" %>

<div class="cover cover-landlord">
    <div class="container">
        <div class="row">
            <div class="col-xs-offset-0 col-xs-12 col-sm-offset-2 col-sm-10 col-md-6 col-lg-6">
                <h1 class="hidden-xs cover-title">GROW YOUR<br/>RENTAL PROFIT</h1>
                <h1 class="hidden-sm hidden-md hidden-lg cover-title">GROW YOUR RENTAL PROFIT</h1>
                <div class="row">
                    <div class="col-xs-offset-2 col-xs-8 col-sm-offset-0 col-sm-10 col-md-offset-0 col-md-10 col-lg-offset-0 col-lg-10">
                        <p class="cover-subtitle">With letUlet, it's super easy to have your tenants start hosting on Airbnb.</p>
                    </div>
                </div>
                <button onclick="$('#signinmodal').modal('show');return false;" class="btn btn-rounded btn-lg btn-red">GET STARTED</button>
                <p class="hidden-sm hidden-md hidden-lg are-you-a-landlord">Are you a landlord?</p>
                <p class="text-center">
                    <a href="#hosts" class="hidden-sm hidden-md hidden-lg scrolling-down"></a>
                </p>
            </div>
        </div>
    </div>
</div>

<div class="section">
    <div class="container">
        <div class="row">
            <div class="col-xs-offset-0 col-xs-12 col-sm-offset-0 col-sm-12 col-md-offset-2 col-md-8 col-lg-offset-1 col-lg-10">
                <h1 class="text-center">LANDLORD BENEFITS</h1>

                <div class="col-xs-offset-2 col-xs-8 text-center">
                    <p>Join the 640,000+ Airbnb hosts around the world and start making extra income with your rented property.</p>
                </div>

                <div class="text-center col-xs-12 hosts">
                    <div>
                        <img class="landlord-1-icon" src="<%= request.getContextPath() %>/img/icons/extra-revenue.svg" />
                        <h2>Extra revenue</h2>
                        <p>You will earn average 20% of the home-sharing revenue</p>
                    </div>
                    <div>
                        <img class="landlord-2-icon" src="<%= request.getContextPath() %>/img/icons/insurance.svg" />
                        <h2>$1M Insurance</h2>
                        <p>Your property will be protected by Letulet's Host Protection Insurance</p>
                    </div>
                    <div>
                        <img class="landlord-3-icon" src="<%= request.getContextPath() %>/img/icons/more-tenants.svg" />
                        <h2>More Tenants</h2>
                        <p>your property will be more attractive to growing Millennial renters</p>
                    </div>
                </div>

                <div class="col-xs-12 text-center">
                    <button onclick="$('#signinmodal').modal('show');return false;" class="btn btn-lg btn-rounded btn-red">GET STARTED</button>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="padding-top-0 section">
    <div class="container">
        <div class="row">

            <div class="col-xs-offset-0 col-xs-12 col-sm-offset-0 col-sm-12 col-md-offset-2 col-md-8 col-lg-offset-1 col-lg-10">
                <h1 class="text-center">STAY IN CONTROL</h1>

                <div class="text-center landlord-screenshot-container">
                    <img src="<%= request.getContextPath() %>/img/landlord_dashboard_screenshot.png" />
                </div>

                <div class="col-xs-offset-0 col-xs-12 col-sm-offset-2 col-sm-8 text-center">
                    <p class="margin-bottom-60">Letulet provides you with an all-in-one dashboard that allows you to view and control the revenue, guests, and rental schedules. Work with Letulet and stay in control.</p>
                </div>

                <div class="col-xs-12 text-center">
                    <button onclick="$('#signinmodal').modal('show');return false;" class="btn btn-lg btn-rounded btn-red">GET STARTED</button>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="../inc-footer-logout.jsp" %>

</body>

<%@ include file="../modal/signin_landlord.jsp" %>
<%@ include file="../modal/login.jsp" %>
<%@ include file="../inc-footer-nolinks.jsp" %>
<script>
    function signLandlord(form) {

        $("#signinform-message").empty();

        var data = $(form).serialize();

        landlordManager.add(data, function (data) {

            if (data.status == "error") {

                $("#signinform-message").html(data.message);
                return;
            }

            if (data.status == "success") {

                window.location = "../dashboard.jsp";
            }
        });

        return false;
    }
</script>
<script type="text/javascript" src="<%= request.getContextPath() %>/node_modules/jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="<%= request.getContextPath() %>/node_modules/bootstrap/dist/js/bootstrap.js"></script>
</html>