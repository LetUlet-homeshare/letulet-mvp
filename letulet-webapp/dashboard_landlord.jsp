<%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="com.letulet.backend.model.Tenant" %>
<%@ page import="com.letulet.backend.model.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<%
    request.setCharacterEncoding("UTF-8");

    Landlord landlord = null;
    User user =  (User)request.getSession().getAttribute("user");

    if (user instanceof Landlord) {

        landlord =  (Landlord)user;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Letulet | Dashboard</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>

<div class="dashboard-page content">

    <%@ include file="inc-menu.jsp" %>

    <div class="container-space container">

        <%@ include file="inc-navbar.jsp" %>

        <div class="row">

            <div class="col-xs-12">

                <div class="flex row">
                    <div class="flex align-center col-xs-6">
                        <form id="form1">
                            <div class="form-group margin-bottom-0 required">
                                <label class="sr-only" for="propertydropdown">Zipcode</label>
                                <select id="propertydropdown" name="data[Property][id]" data-style="btn-style-1" multiple data-selected-text-format="count > 3" class="selectpicker" title="All properties">
                                    <option data-content="<span class='btn-style-1-option'>Property 1</span>" value="1">Property 1</option>
                                    <option data-content="<span class='btn-style-1-option'>Property 2</span>" value="1">Property 2</option>
                                    <option data-content="<span class='btn-style-1-option'>Property 3</span>" value="1">Property 3</option>
                                </select>
                            </div>
                        </form>

                        <button class="btn btn-light btn-with-icon btn-link btn-black">
                            <img src="<%= request.getContextPath() %>/img/icons/download.png" />
                            Download Report
                        </button>
                    </div>

                    <div class="col-xs-6">
                        <div class="flex flex-end">
                            <button id="btn-action-landlord" class="btn-action btn-action-landlord">
                                <img src="<%= request.getContextPath()%>/img/icons/btn-action-keycafe.svg"/>
                                <span>KEYCAFE</span>
                            </button>

                            <button id="btn-action-clean" class="btn-action btn-action-clean">
                                <img src="<%= request.getContextPath()%>/img/icons/btn-action-clean.svg"/>
                                <span>CLEAN</span>
                            </button>

                            <button id="btn-action-order" class="btn-action btn-action-order">
                                <img src="<%= request.getContextPath()%>/img/icons/btn-action-order.svg"/>
                                <span>ORDER</span>
                            </button>

                            <button id="btn-action-letulet" class="btn-action btn-action-letulet">
                                <img src="<%= request.getContextPath()%>/img/icons/btn-action-letulet.svg"/>
                                <span>LETULET</span>
                            </button>
                        </div>
                    </div>

                    <!-- Action content -->
                    <div id="content-action-landlord" class="popover-style-2" style="display: none">
                        <div class="action-popover">
                            <div class="action-popover-header">
                                <button class="btn-action btn-action-landlord">
                                    <img src="<%= request.getContextPath()%>/img/icons/btn-action-keycafe.svg"/>
                                    <span>KEYCAFE</span>
                                </button>
                                <h2>KEYCAFE</h2>
                            </div>

                            <div class="action-popover-body">
                                <div class="action-popover-list">
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="content-action-clean" class="popover-style-2" style="display: none">
                        <div class="action-popover">
                            <div class="action-popover-header">
                                <button class="btn-action btn-action-clean">
                                    <img src="<%= request.getContextPath()%>/img/icons/btn-action-clean.svg"/>
                                    <span>CLEAN</span>
                                </button>
                                <h2>Clean Your Property</h2>
                            </div>

                            <div class="action-popover-body">
                                <div class="action-popover-list">
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="content-action-order" class="popover-style-2" style="display: none">
                        <div class="action-popover">
                            <div class="action-popover-header">
                                <button class="btn-action btn-action-order">
                                    <img src="<%= request.getContextPath()%>/img/icons/btn-action-order.svg"/>
                                    <span>ORDER</span>
                                </button>
                                <h2>Order</h2>
                            </div>

                            <div class="action-popover-body">
                                <div class="action-popover-list">
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="content-action-letulet" class="popover-style-2" style="display: none">
                        <div class="action-popover">
                            <div class="action-popover-header">
                                <button id="btn-action-letulet" class="btn-action btn-action-letulet">
                                    <img src="<%= request.getContextPath()%>/img/icons/btn-action-letulet.svg"/>
                                    <span>LETULET</span>
                                </button>
                                <h2>LETULET</h2>
                            </div>

                            <div class="action-popover-body">
                                <div class="action-popover-list">
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                    <div class="action-popover-item">
                                        <div class="title">Tom’s Maid Serives</div>
                                        <div class="darkgray">
                                            <span>123-123-1234<br/>tomsmaid.com</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="clearfix"></div>

            <div class="col-xs-5">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="statistic statistic-green">
                            <p><span class="statistic-number">$1,765</span> <span class="statistic-legend">YTD</span></p>
                            <p class="statistic-legend">From 25 Guests</p>
                        </div>
                    </div>

                    <div class="col-xs-12">
                        <div class="statistic statistic-green">
                            <p><span class="statistic-number">$725</span> <span class="statistic-legend">MTD</span></p>
                            <p class="statistic-legend">From 5 Guests</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-7">
                <div class="widget">
                    <h1 class="widget-title">Homeshare Revenue</h1>
                    <div id="revenue" style="min-width: 100%; height: 300px; margin: 0 auto"></div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-7">
                <div class="widget">
                    <h1 class="widget-title col-xs-5">
                        <a href="#" data-calendar-previous-month><img src="<%= request.getContextPath() %>/img/icons/calendar-previous.svg" /></a>
                        <span style="text-transform: uppercase;" data-calendar-current-month></span>
                        <a href="#" data-calendar-next-month><img src="<%= request.getContextPath() %>/img/icons/calendar-next.svg" /></a>
                    </h1>
                    <div class="row">
                        <div class="col-xs-8">
                            <div id="calendar"></div>
                        </div>

                        <div class="col-xs-4">
                            <div id="house-list-scroll">
                                <div id="house-list-scroll-1" class="house-list">
                                    <div data-property-id="1" onclick="updateProperty(this)" class="house-list-item active">
                                        <img class="selected" src="<%= request.getContextPath() %>/img/icons/house-icon.svg"/>
                                        <img class="unselected" src="<%= request.getContextPath() %>/img/icons/house-icon-unselected.svg"/>
                                        1234 Stewart Rd.<br/>
                                        San Francisco, CA
                                    </div>

                                    <div data-property-id="2" onclick="updateProperty(this)" class="house-list-item">
                                        <img class="selected" src="<%= request.getContextPath() %>/img/icons/house-icon.svg"/>
                                        <img class="unselected" src="<%= request.getContextPath() %>/img/icons/house-icon-unselected.svg"/>
                                        1234 Stewart Rd.<br/>
                                        San Francisco, CA
                                    </div>

                                    <div data-property-id="3" onclick="updateProperty(this)" class="house-list-item">
                                        <img class="selected" src="<%= request.getContextPath() %>/img/icons/house-icon.svg"/>
                                        <img class="unselected" src="<%= request.getContextPath() %>/img/icons/house-icon-unselected.svg"/>
                                        1234 Stewart Rd.<br/>
                                        San Francisco, CA
                                    </div>

                                    <div data-property-id="4" onclick="updateProperty(this)" class="house-list-item">
                                        <img class="selected" src="<%= request.getContextPath() %>/img/icons/house-icon.svg"/>
                                        <img class="unselected" src="<%= request.getContextPath() %>/img/icons/house-icon-unselected.svg"/>
                                        1234 Stewart Rd.<br/>
                                        San Francisco, CA
                                    </div>

                                    <div data-property-id="5" onclick="updateProperty(this)" class="house-list-item">
                                        <img class="selected" src="<%= request.getContextPath() %>/img/icons/house-icon.svg"/>
                                        <img class="unselected" src="<%= request.getContextPath() %>/img/icons/house-icon-unselected.svg"/>
                                        1234 Stewart Rd.<br/>
                                        San Francisco, CA
                                    </div>
                                </div>

                                <div onclick="$('#house-list-scroll-1').animate({scrollTop: $('#house-list-scroll-1').scrollTop() + 72},'slow')"class="house-list-action">
                                    <img src="<%= request.getContextPath() %>/img/icons/arrow-down.svg">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-5">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="guest guest-red">
                            <div id="carousel-current-guest" class="carousel-current-guest carousel slide" data-ride="carousel">

                                <div class="carousel-inner" role="listbox">
                                    <div class="item active">
                                        <div style="display:flex">
                                            <div class="col-xs-offset-2 col-xs-4 padding-right-0">
                                                <p class="guest-title">Current Guest</p>
                                                <p class="guest-name">Jane Fonda</p>
                                                <p class="guest-address">1234 Stewart St.<br/>San Francisco, CA</p>
                                            </div>
                                            <div class="col-xs-4 padding-right-0">
                                                <ul class="guest-list">
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/checkout-icon.svg" class="icon"/>Check-out Dec 4</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/guest-icon.svg" class="icon"/>2 Guests</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/price-icon.svg" class="icon"/>$118 Expected</li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div style="display:flex">
                                            <div class="col-xs-offset-2 col-xs-4 padding-right-0">
                                                <p class="guest-title">Current Guest</p>
                                                <p class="guest-name">Jane Fonda</p>
                                                <p class="guest-address">1234 Stewart St.<br/>San Francisco, CA</p>
                                            </div>
                                            <div class="col-xs-4 padding-right-0">
                                                <ul class="guest-list">
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/checkout-icon.svg" class="icon"/>Check-out Dec 4</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/guest-icon.svg" class="icon"/>2 Guests</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/price-icon.svg" class="icon"/>$118 Expected</li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <!-- Controls -->
                                <a class="left carousel-control" href="#carousel-current-guest" role="button" data-slide="prev">
                                    <img class="carousel-control-img" src="<%= request.getContextPath()%>/img/icons/carousel-left.svg" />
                                </a>
                                <a class="right carousel-control" href="#carousel-current-guest" role="button" data-slide="next">
                                    <img class="carousel-control-img" src="<%= request.getContextPath()%>/img/icons/carousel-right.svg" />
                                </a>
                            </div>
                        </div>
                    </div>

                    <div class="col-xs-12">
                        <div class="guest guest-yellow">
                            <div id="carousel-upcoming-guest" class="carousel-current-guest carousel slide" data-ride="carousel">

                                <div class="carousel-inner" role="listbox">
                                    <div class="item active">
                                        <div style="display:flex">
                                            <div class="col-xs-offset-2 col-xs-4 padding-right-0">
                                                <p class="guest-title">Upcoming Guest</p>
                                                <p class="guest-name">Tim Roberton</p>
                                                <p class="guest-address">1234 Stewart St.<br/>San Francisco, CA</p>
                                            </div>
                                            <div class="col-xs-4 padding-right-0">
                                                <ul class="guest-list">
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/checkout-icon.svg" class="icon"/>Check-in Dec 6</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/guest-icon.svg" class="icon"/>2 Guests</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/price-icon.svg" class="icon"/>$118 Expected</li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div style="display:flex">
                                            <div class="col-xs-offset-2 col-xs-4 padding-right-0">
                                                <p class="guest-title">Upcoming Guest</p>
                                                <p class="guest-name">Tim Roberton</p>
                                                <p class="guest-address">1234 Stewart St.<br/>San Francisco, CA</p>
                                            </div>
                                            <div class="col-xs-4 padding-right-0">
                                                <ul class="guest-list">
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/checkout-icon.svg" class="icon"/>Check-in Dec 6</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/guest-icon.svg" class="icon"/>2 Guests</li>
                                                    <li><img src="<%= request.getContextPath()%>/img/icons/price-icon.svg" class="icon"/>$118 Expected</li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <!-- Controls -->
                                <a class="left carousel-control" href="#carousel-upcoming-guest" role="button" data-slide="prev">
                                    <img class="carousel-control-img" src="<%= request.getContextPath()%>/img/icons/carousel-left.svg" />
                                </a>
                                <a class="right carousel-control" href="#carousel-upcoming-guest" role="button" data-slide="next">
                                    <img class="carousel-control-img" src="<%= request.getContextPath()%>/img/icons/carousel-right.svg" />
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!--<div class="row">
            <div class="col-xs-5 no-padding">
                <div class="widget">
                    <h1 class="widget-title">Messages & Inquiries</h1>

                    <div class="inquiries">
                        <div class="inquiry">
                            <div class="inquiry-avatar">
                                <img src="<%= request.getContextPath()%>/img/inquiry-avatar.png"/>
                            </div>
                            <div class="inquiry-content">
                                <p>
                                    <span class="inquiry-content-author">Mark</span>
                                    <span class="inquiry-content-address">5212 Steiner St.</span>
                                </p>
                                <p>
                                    <span class="inquiry-content-time">1 Day</span>
                                </p>
                            </div>
                            <div class="inquiry-status">
                                <span>Reservation<br/>Request</span>
                            </div>
                        </div>

                        <div class="inquiry">
                            <div class="inquiry-avatar">
                                <img src="<%= request.getContextPath()%>/img/inquiry-avatar.png"/>
                            </div>
                            <div class="inquiry-content">
                                <p>
                                    <span class="inquiry-content-author">Ted</span>
                                    <span class="inquiry-content-address">5212 Steiner St.</span>
                                </p>
                                <p>
                                    <span class="inquiry-content-time">1 Day</span>
                                </p>
                            </div>
                            <div class="inquiry-status">
                                <span>Inquiry</span>
                            </div>
                        </div>

                        <div class="inquiry">
                            <div class="inquiry-avatar">
                                <img src="<%= request.getContextPath()%>/img/inquiry-avatar.png"/>
                            </div>
                            <div class="inquiry-content">
                                <p>
                                    <span class="inquiry-content-author">Sarah</span>
                                    <span class="inquiry-content-address">5212 Steiner St.</span>
                                </p>
                                <p>
                                    <span class="inquiry-content-time">3 Day</span>
                                </p>
                            </div>
                            <div class="inquiry-status">
                                <span>Reservation<br/>Request</span>
                            </div>
                        </div>

                        <div class="inquiry">
                            <div class="inquiry-avatar">
                                <img src="<%= request.getContextPath()%>/img/inquiry-avatar.png"/>
                            </div>
                            <div class="inquiry-content">
                                <p>
                                    <span class="inquiry-content-author">Sarah</span>
                                    <span class="inquiry-content-address">5212 Steiner St.</span>
                                </p>
                                <p>
                                    <span class="inquiry-content-time">4 Day</span>
                                </p>
                            </div>
                            <div class="inquiry-status">
                                <span>Inquiry</span>
                            </div>
                        </div>
                    </div>

                    <div class="widget-footer text-center">
                        <a class="widget-action" href="#">View more</a>
                    </div>
                </div>
            </div>

            <div class="col-xs-7 no-padding">
                <div style="    margin-top: -20px;" class="widget">
                    <h1 class="widget-title">Stays & Reservations <a class="widget-action" href="#">View Calendar</a></h1>

                    <div class="reservations">
                        <div class="reservation checkin">
                            <div class="reservation-avatar">
                                <img src="<%= request.getContextPath()%>/img/reservation-avatar.png"/>
                            </div>
                            <div class="reservation-content">

                                <button>Check-in</button>
                                <p>Jane Fonda</p>
                                <p class="reservation-content-date">DEC 1-4</p>
                                <p>
                                    2 Guests<br/>
                                    $318 Expected Earning
                                </p>
                            </div>
                        </div>

                        <div class="reservation">
                            <div class="reservation-avatar">
                                <img src="<%= request.getContextPath()%>/img/reservation-avatar.png"/>
                            </div>
                            <div class="reservation-content">

                                <button>Check-in</button>
                                <p>Tim Jackel</p>
                                <p class="reservation-content-date">DEC 12-13</p>
                                <p>
                                    1 Guests<br/>
                                    $125 Expected Earning
                                </p>
                            </div>
                        </div>

                        <div class="reservation">
                            <div class="reservation-avatar">
                                <img src="<%= request.getContextPath()%>/img/reservation-avatar.png"/>
                            </div>
                            <div class="reservation-content">

                                <button>Check-in</button>
                                <p>Thomas Holmes</p>
                                <p class="reservation-content-date">Dec 23 - Jan 2</p>
                                <p>
                                    5 Guests<br/>
                                    $1231 Expected Earning
                                </p>
                            </div>
                        </div>

                        <div class="reservation">
                            <div class="reservation-avatar">
                                <img src="<%= request.getContextPath()%>/img/reservation-avatar.png"/>
                            </div>
                            <div class="reservation-content">

                                <button>Check-in</button>
                                <p>Tim Jackel</p>
                                <p class="reservation-content-date">DEC 12-13</p>
                                <p>
                                    1 Guests<br/>
                                    $125 Expected Earning
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-5 no-padding">
                <div class="widget">
                    <h1 class="widget-title">Actions</h1>

                    <div class="actions">

                        <button class="btn-action btn-action-landlord">
                            <img src="<%//= request.getContextPath()%>/img/icons/btn-action-landlord.svg"/>
                            <span>LANDLORD</span>
                        </button>

                        <button class="btn-action btn-action-clean">
                            <img src="<%//= request.getContextPath()%>/img/icons/btn-action-clean.svg"/>
                            <span>CLEAN</span>
                        </button>

                        <button class="btn-action btn-action-order">
                            <img src="<%//= request.getContextPath()%>/img/icons/btn-action-order.svg"/>
                            <span>ORDER</span>
                        </button>

                        <button class="btn-action btn-action-letulet">
                            <img src="<%//= request.getContextPath()%>/img/icons/btn-action-letulet.svg"/>
                            <span>LETULET</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>-->
    </div>
</div>
<!-- /container -->

<%@ include file="inc-footer-nolinks.jsp" %>

<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/dashboard.js"></script>

<script>
    setNavbarActive("dashboard.jsp");
</script>
</body>
</html>
