<%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="com.letulet.backend.model.Tenant" %>
<%@ page import="com.letulet.backend.model.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<%
    request.setCharacterEncoding("UTF-8");

    Tenant tenant = null;
    User user =  (User)request.getSession().getAttribute("user");

    if (user instanceof Tenant) {

        tenant =  (Tenant)user;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Letulet | Dashboard</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body ng-controller="AppController" ng-app="letulet">

<div class="dashboard-page content">

    <%@ include file="inc-menu.jsp" %>

    <div ng-controller="TenantDashboardController" class="container container-space">

        <%@ include file="inc-navbar.jsp" %>

        <div class="row">

            <div class="col-xs-12">

                <div class="flex">
                    <div class="flex align-center col-xs-6">
                        <form id="form1">
                            <div class="form-group margin-bottom-0 required">
                                <select ng-change="refreshUI()" ng-model="property" data-style="btn-style-1" class="selectpicker2">
                                    <option ng-repeat="_property in properties" ng-value="_property">{{_property.name}}</option>
                                </select>
                            </div>
                        </form>

                        <button class="btn btn-light btn-with-icon btn-link btn-black">
                            <img src="<%= request.getContextPath() %>/img/icons/download.png" />
                            Download Report
                        </button>
                    </div>

                    <div class="col-xs-6">
                        <!--<div class="flex flex-end">
                                <button id="btn-action-landlord" class="btn-action btn-action-landlord">
                                    <img src="<%//= request.getContextPath()%>/img/icons/btn-action-keycafe.svg"/>
                                    <span>KEYCAFE</span>
                                </button>

                                <button id="btn-action-clean" class="btn-action btn-action-clean">
                                    <img src="<%//= request.getContextPath()%>/img/icons/btn-action-clean.svg"/>
                                    <span>CLEAN</span>
                                </button>

                                <button id="btn-action-order" class="btn-action btn-action-order">
                                    <img src="<%//= request.getContextPath()%>/img/icons/btn-action-order.svg"/>
                                    <span>ORDER</span>
                                </button>

                                <button id="btn-action-letulet" class="btn-action btn-action-letulet">
                                    <img src="<%//= request.getContextPath()%>/img/icons/btn-action-letulet.svg"/>
                                    <span>LETULET</span>
                                </button>
                            </div>-->
                    </div>

                    <!-- Action content -->
                    <!--<div id="content-action-landlord" class="popover-style-2" style="display: none">
                            <div class="action-popover">
                                <div class="action-popover-header">
                                    <button class="btn-action btn-action-landlord">
                                        <img src="<%//= request.getContextPath()%>/img/icons/btn-action-keycafe.svg"/>
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
                                        <img src="<%//= request.getContextPath()%>/img/icons/btn-action-order.svg"/>
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
                                        <img src="<%//= request.getContextPath()%>/img/icons/btn-action-letulet.svg"/>
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
                    </div>-->
                </div>


                <div class="clearfix"></div>

                <div class="col-xs-5">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="statistic statistic-green">
                                <p><span class="statistic-number">$ <span ng-bind="property.statistics.YTD.amount"></span></span> <span class="statistic-legend">YTD</span></p>
                                <p class="statistic-legend">From <span ng-bind="property.statistics.YTD.guests"></span> Guests</p>
                            </div>
                        </div>

                        <div class="col-xs-12">
                            <div class="statistic statistic-green">
                                <p><span class="statistic-number">$ <span ng-bind="property.statistics.MTD.amount"></span></span> <span class="statistic-legend">MTD</span></p>
                                <p class="statistic-legend">From <span ng-bind="property.statistics.MTD.guests"></span> Guests</p>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-xs-7">
                    <div class="widget">
                        <h1 class="widget-title">Homeshare Revenue</h1>
                        <div ng-include="'views/charts/homesharerevenue.html'"></div>
                    </div>
                </div>
            </div>

            <div class="col-xs-12">
                <div class="col-xs-7">
                    <div ng-include="'views/properties/widget/calendar.html'"></div>
                </div>

                <div class="col-xs-5">
                    <div class="row">
                        <div class="col-xs-12">
                            <div ng-include="'views/properties/widget/currentGuest.html'"></div>
                        </div>

                        <div class="col-xs-12">
                            <div ng-include="'views/properties/widget/nextGuest.html'"></div>
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
                                    <img src="<%//= request.getContextPath()%>/img/reservation-avatar.png"/>
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
                                    <img src="<%//= request.getContextPath()%>/img/reservation-avatar.png"/>
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
                                    <img src="<%//= request.getContextPath()%>/img/reservation-avatar.png"/>
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
                                    <img src="<%//= request.getContextPath()%>/img/reservation-avatar.png"/>
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


