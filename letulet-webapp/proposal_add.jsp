<%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="com.letulet.backend.model.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<%
    Tenant _tenant = null;
    Landlord _landlord = null;

    User user =  (User)request.getSession().getAttribute("user");

    if (user instanceof Tenant) {

        _tenant =  (Tenant)user;
    }

    if (user instanceof Landlord) {

        _landlord =  (Landlord)user;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Orbirental | New Proposal</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>

<div class="proposal-add-page content">

    <span id="anchor-step1"></span>

    <%@ include file="inc-menu.jsp" %>

    <div class="container">

        <div class="row">

            <div class="col-xs-12">
                <div class="step step-with-title">

                    <div class="step-title step-background-3">
                        <div class="row">
                            <div class="col-xs-12">
                                <h1 class="title red">WELCOME TO LETULET, <%= TenantManager.getInstance().showBestProfile(_tenant)%>!</h1>
                            </div>
                            <div class="col-xs-7">
                                <p>You’re on you way to transparent hosting.<br/>Follow the three simple steps to create a powerful invitation for your landlord to allow you to host. </p>
                            </div>
                        </div>
                    </div>

                    <div class="step-content">

                        <div class="row">
                            <div class="col-xs-10">
                                <h1>STEP 1: BASIC PROPERTY INFORMATION</h1>
                                <p class="subtitle">Let’s get started by filling in the basics about your property you intend to host.</p>

                                <h2>Property Information</h2>

                                <form id="form1">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="form-group required">
                                                <label for="propertyAddress">Address</label>
                                                <input name="data[Property][address]" type="text" class="form-control" id="propertyAddress" required>
                                            </div>
                                        </div>
                                        <div class="col-xs-2">
                                            <div class="form-group">
                                                <label for="propertyApt">Apt</label>
                                                <input name="data[Property][apt]" type="text" class="form-control" id="propertyApt">
                                            </div>
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="col-xs-4">
                                            <div class="form-group required">
                                                <label for="propertyCity">City</label>
                                                <input name="data[Property][city]" type="text" class="form-control" id="propertyCity" required>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="form-group required">
                                                <label>State</label>
                                                <div data-name="data[Property][state]" class="bfh-selectbox bfh-states" data-country="US" data-state="CA" required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-4">
                                            <div class="form-group required">
                                                <label for="propertyZipcode">Zipcode</label>
                                                <input name="data[Property][zipcode]" type="text" class="form-control" id="propertyZipcode" required>
                                            </div>
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="col-xs-4">
                                            <div class="form-group">
                                                <label for="propertyBedrooms">How many bedrooms?</label>
                                                <div class="input-group input-group-number">
                                                    <span class="input-group-btn input-group-minus">
                                                        <button class="btn btn-default input-number-minus" type="button"></button>
                                                    </span>
                                                    <input name="data[Property][bedrooms]" value="" data-label="Bedroom" data-value="1" class="form-control input-number" id="propertyBedrooms">
                                                    <span class="input-group-btn input-group-plus">
                                                        <button class="btn btn-default input-number-plus" type="button"></button>
                                                    </span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="col-xs-4">
                                            <div class="form-group">
                                                <label for="propertyBathrooms">How many bathrooms?</label>
                                                <div class="input-group input-group-number">
                                                    <span class="input-group-btn input-group-minus">
                                                        <button class="btn btn-default input-number-minus" type="button"></button>
                                                    </span>
                                                    <input name="data[Property][bathrooms]" value="" data-label="Bathroom"  data-value="1" class="form-control input-number" id="propertyBathrooms" disabled>
                                                    <span class="input-group-btn input-group-plus">
                                                        <button class="btn btn-default input-number-plus" type="button"></button>
                                                    </span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                    <button type="submit" style="display:none" id="form1-submit"></button>
                                </form>

                                <span id="anchor-step2">&nbsp;</span>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="step">
                    <h1>STEP 2: PAYOUT SHARING</h1>
                    <p class="subtitle">Your Payout is the money you receive from Airbnb after each reservation. Use our payout tool to set a percentage of the payout to share with your landlord. Most tenants share around 20% with their landlords</p>
                    <h2>Determine your share</h2>

                    <form id="form2" class="form-inline form-payout">
                        <div class="form-group">
                            <span>Payout sharing example based on</span>
                            <input data-proposal-payout type="number" name="data[Proposal][payout]" class="form-control" id="payout" required>
                            <span>gross payout</span>
                        </div>

                        <div class="row" style="display: flex;align-items: center;">
                            <div class="col-xs-5">
                                <div id="chart-payout"></div>
                            </div>
                            <div class="col-xs-offset-1 col-xs-6">

                                <table class="info-payout">
                                    <tr>
                                        <th>Your Share</th>
                                        <th class="text-right">Landlord’s Share</th>
                                    </tr>
                                    <tr>
                                        <td data-proposal-tenant-amount></td>
                                        <td data-proposal-landlord-amount class="text-right"></td>
                                    </tr>
                                </table>

                                <div class="slider-wrap form-group">
                                    <input type="text" name="data[Proposal][tenant]" class="form-control" data-proposal-tenant-percentage readonly>
                                    <input type="text" id="slider-payout" class="slider" value="" data-slider-min="0" data-slider-max="100" data-slider-step="1" data-slider-value="80" data-slider-id="slider-payout" data-slider-tooltip="hide" data-slider-handle="round" />
                                    <input type="text" name="data[Proposal][landlord]" class="form-control" data-proposal-landlord-percentage readonly>
                                </div>

                                <div class="row">
                                    <div class="col-xs-8">
                                        <p class="text-sm">LetUlet collects a 3% processing fee from each Payout</p>
                                        <!--<p class="text-sm nomargin">3% LetULet fee is $<span data-proposal-landlord-fee-amount></span></p>-->
                                    </div>
                                </div>
                            </div>
                        </div>

                        <button type="submit" style="display:none" id="form2-submit"></button>
                    </form>

                    <span id="anchor-step3">&nbsp;</span>
                </div>

                <div id="step3" class="step ">
                    <h1>STEP 3: CREATE YOUR PROPOSAL</h1>
                    <p class="subtitle">Invite your landlord to let you to host your place. We’ve gotten you started with a letter identifying the opportunity for your landlord based on the information you provided.</p>

                    <h2>Review and send invitation to landlord</h2>

                    <div class="row">
                        <div class="col-xs-10">

                            <div class="view-proposal">

                                <div class="view-proposal-header">

                                    <img src="img/icons/stamp.svg" class="stamp"/>
                                    <div>
                                        <div class="col-xs-10">
                                            <h1 class="view-proposal-header-title">GROW YOUR<br/>RENTAL PROFIT</h1>
                                            <h2 class="view-proposal-header-subtitle">Your tenant wants to artner with you in the growing homesharing market help grow your revenue.</h2>
                                        </div>
                                    </div>
                                </div>

                                <div class="view-proposal-content">
                                    <p>Good news,</p>

                                    <p>Your tenant <span>Mark Henderson</span><br/> at <span>5212 Steiner Street</span>, <span>San Francisco</span>, is requesting your permission to use Letulet - a simple, flexible solution enabling tenants to successfully host short term rentals in apartment buildings.</p>

                                    <p>Owners that use Letulet are adding a revenue-generating amenity to their buildings that appeals to a growing number of renters, at no extra cost!</p>

                                    <p>With letulet, you will get to:</p>

                                    <ul>
                                        <li>Control the hosting activity by setting limits and rules</li>
                                        <li>Earn a percentage of your tenant’s hosting revenue with letulet’s easy payment feature</li>
                                        <li>Be backed by a $1 Million of insurance, at no extra cost to you</li>
                                    </ul>

                                    <p>Please consider this note from your tenants about how important using letulet is for them:</p>

                                    <form id="form3">
                                        <div class="form-group" style="margin-bottom:10px;">
                                            <label for="notes" class="sr-only"></label>
                                            <textarea rows="3" name="data[Proposal][notes]" data-toggle="popover" data-placement="bottom" type="text" class="form-control" id="notes" placeholder="Write here something personal or choose from the options to the right."></textarea>
                                        </div>
                                    </form>

                                    <p>Let us show you how.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="right-side container white-side">

        <!--<div class="follow-scroll">-->

        <div class="steps-wrapper">
            <ul class="steps">
                <li class="step-number">
                    1
                </li>
                <li class="step-number">
                    2
                </li>
                <li class="step-number">
                    3
                </li>
            </ul>
        </div>

        <div class="row">
            <div class="col-xs-offset-1 col-xs-10 text-center">

                <div class="row">
                    <div class="tip col-xs-12">

                        <img src="img/proposal-illustration-1.svg" class="illustration"/>

                        <label class="tip-title">Tips to get your landlord’s approval</label>

                        <p class="tip-info nomargin">First, it really helps to understand your lease; review any rules about guests and sub-letting.</p>

                        <a onclick="return $('#form1-submit').click();" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">NEXT</a>
                    </div>

                    <div class="tip col-xs-12">

                        <img src="img/proposal-illustration-2.svg" class="illustration"/>

                        <label class="tip-title">Tips to get your landlord’s approval</label>

                        <p class="tip-info nomargin">Your landlord is increasing risk and costs when allowing home sharing. It greatly increases your chances to get their approval if your offer to share a portion of your revenue with them.</p>

                        <button onclick="return $('#form2-submit').click();" class="btn btn-fullwidth btn-lg btn-rounded btn-red">NEXT</button>
                        <a onclick="return proposalStep.previousStep()" class="btn btn-fullwidth btn-black" href="#">BACK</a>
                    </div>

                    <div class="tip col-xs-12">

                        <img src="img/proposal-illustration-3.svg" class="illustration"/>

                        <label class="tip-title">Tips to get your landlord’s approval</label>

                        <p class="tip-info nomargin">Be willing to set occupancy limits on your guests, so there are not too many people in your place at a time. Also, share the landlord’s house rules with each guest.</p>

                        <a onclick="return openInvitationModal()" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">SEND</a>
                        <a onclick="return proposalStep.previousStep()" class="btn btn-fullwidth btn-black" href="#">BACK</a>
                    </div>
                </div>
            </div>
        </div>
        <!--</div>-->
    </div>
</div>
<!-- /container -->

<%@ include file="modal/send_invitation_congrats.jsp" %>
<%@ include file="modal/send_invitation.jsp" %>
<%@ include file="inc-footer-nolinks.jsp" %>

<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/proposal_add.js?v=0.1"></script>
</body>
</html>
