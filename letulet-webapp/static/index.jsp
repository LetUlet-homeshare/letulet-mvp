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

<div class="cover cover-index">
    <div class="">
        <div class="row">
            <div class="cover-block-text col-xs-offset-1 col-xs-8">
                <h1 class="hidden-xs cover-title">EMPOWERING TENANT<br/>HOME-SHARING</h1>
                <h1 class="hidden-sm hidden-md hidden-lg cover-title">EMPOWERING TENANT HOME-SHARING</h1>
                <div class="row">
                    <div class="col-xs-8">
                        <p class="cover-subtitle">Say hello to Letulet, a new way for tenants and landlords to collaborate - so a tenant can host their place on Airbnb legally, transparently and confidently.  </p>
                    </div>
                </div>
                <button onclick="$('#signinmodal').modal('show');return false;" class="btn btn-rounded btn-lg btn-red">GET STARTED</button>
                <p class="are-you-a-landlord">Are you a landlord? <a class="link-white" href="<%= request.getContextPath() %>/static/landlord.jsp">Click here</a></p>
            </div>
            <div class="scrolling-down-wrapper text-center col-xs-12">
                <a href="#hosts" class="scrolling-down"></a>
            </div>
        </div>
    </div>
</div>

<div class="section">
    <div class="container">

        <div class="row">
            <div class="col-xs-12">
                <h1 class="text-center">LET'S GET HOSTING</h1>

                <div class="text-center">
                    <p>Together with Airbnb, we are inviting tenants to join us to transform home-sharing for renters. So, let's get hosting.</p>
                </div>

                <div class="text-center col-xs-12 hosts">
                    <div>
                        <img class="hosts-1-icon" src="<%= request.getContextPath() %>/img/icons/index-1.svg" />
                        <h2>START THE CONVERSATION</h2>
                        <p>We get it, home-sharing is a sensitive topic. Use the Letulet app to start the conversation with your landlord off right</p>
                    </div>
                    <div>
                        <img class="hosts-2-icon" src="<%= request.getContextPath() %>/img/icons/index-2.svg" />
                        <h2>ESTABLISH AN</br>AGREEMENT</h2>
                        <p>We provide a lease amendment allowing you to host with customizable terms that are right for you</p>
                    </div>
                    <div>
                        <img class="hosts-3-icon" src="<%= request.getContextPath() %>/img/icons/index-3.svg" />
                        <h2>HOST WITH CONFIDENCE</h2>
                        <p>We;ve partnered with Airbnb so all the terms of your agreement with your landlord are fulfilled automatically for you</p>
                    </div>
                </div>

                <div class="col-xs-12">
                    <div class=" col-xs-offset-1 col-xs-10 col-sm-offset-1 col-md-10 col-md-offset-4 col-md-4 col-lg-offset-4 col-lg-4 text-center">
                        <button onclick="" class="btn btn-lg btn-rounded btn-red">LEARN MORE</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="padding-top-0 section">
    <div class="container">
        <div class="row">

            <div class="col-xs-offset-0 col-xs-12 col-sm-offset-1 col-sm-10 col-md-offset-2 col-md-8 col-lg-offset-1 col-lg-10">
                <h1 class="text-center">OUR HAPPY CUSTOMERS</h1>

                <div class="col-xs-12">

                   <div id="carousel-customer" class="carousel slide carousel-letulet" data-ride="carousel">

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                            <div class="item active">
                                <div class="row">
                                    <div class="col-xs-offset-1 col-xs-10">
                                        <div class="carousel-image">
                                            <img src="<%= request.getContextPath() %>/img/customer-default.png">
                                        </div>
                                        <div class="carousel-content">
                                            <p class="quote">Letulet allowed me to start hosting on Airbnb almost immdiately, and I am making additional income to pay my own rent! My landlord is also really happy!!</p>
                                            <p class="nomargin quote-author">Justin Peterson</p>
                                            <p class="nomargin quote-date">Hosting since 2017</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="row">
                                    <div class="col-xs-offset-1 col-xs-10">
                                        <div class="carousel-image">
                                            <img src="<%= request.getContextPath() %>/img/customer-default.png">
                                        </div>
                                        <div class="carousel-content">
                                            <p class="quote">Letulet allowed me to start hosting on Airbnb almost immdiately, and I am making additional income to pay my own rent! My landlord is also really happy!!</p>
                                            <p class="nomargin quote-author">Justin Peterson</p>
                                            <p class="nomargin quote-date">Hosting since 2017</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-customer" role="button" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#carousel-customer" role="button" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>


                <div class="col-xs-12">
                    <div class="col-xs-12 text-center">
                        <button onclick="$('#signinmodal').modal('show');return false;" class="btn btn-lg btn-rounded btn-red">GET STARTED</button>
                    </div>
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