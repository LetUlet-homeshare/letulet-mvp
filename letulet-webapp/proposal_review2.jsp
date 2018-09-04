<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<%
    request.setCharacterEncoding("UTF-8");

    User user =  (User)request.getSession().getAttribute("user");

    String uid = request.getParameter("uid");

    if (Validator.isNull(uid)) {

        response.getWriter().write("Invalid data.");
        return;
    }

    Agreement agreement = AgreementManager.getInstance().getAgreementByUid(uid);

    if (agreement == null) {

        response.getWriter().write("Invalid agreement.");
        return;
    }

    if (agreement.getStatus() == Agreement.Status.ACCEPTED) {

        response.getWriter().write("Agreement already accepted accepted");
        return;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Orbirental | Your Proposal</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>


<div class="proposal-review-page open">

    <div class="cover">
        <h1>WELCOME TO LETULET</h1>
    </div>

    <div class="container">

        <div class="row">
            <div class="col-xs-12">
                <div class="widget floating widget-lg widget-shadow text-center">
                    <h1 class="widget-title widget-title-center">HERE IS THE DEAL</h1>
                    <div class="row">
                        <div class="col-xs-offset-2 col-xs-8">
                            <p>Your tenant, <%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%>, at <%= agreement.getProperty().getAddress1()%>, has offered to pay you <%= agreement.getLandlordCommissionRate()%>% of their Airbnb profit.</p>
                            <p>It only takes 2 minutes to review the terms and create your free lease addendum.</p>
                        </div>
                    </div>

                    <div class="cards">
                            <div class="card">
                                <img class="card-icon floating" src="<%=request.getContextPath()%>/img/icons/bill.svg">

                                <h1 class="card-title">PROFIT SHARE</h1>
                                <p>Your tenant has offered to share:</p>
                                <p><%= agreement.getLandlordCommissionRate()%>% of their Airbnb Profit</p>
                            </div>
                            <div class="card">
                                <img class="card-icon floating" src="<%=request.getContextPath()%>/img/icons/calendar.svg">

                                <h1 class="card-title">HOSTING LIMITS</h1>

                                <% if (agreement.getProperty().getMaximumGuests() > 0 && agreement.getProperty().getMaximumReservationsPerYear() > 0) { %>
                                <p>Your hosting limits are currently set at:</p>
                                <% } else { %>
                                <p>No hosting limits</p>
                                <% } %>

                                <% if (agreement.getProperty().getMaximumGuests() > 0) { %>
                                <p>No more than <%= agreement.getProperty().getMaximumGuests()%> guest per stay</p>
                                <% } %>

                                <% if (agreement.getProperty().getMaximumReservationsPerYear() > 0) { %>
                                <p>No more than <%= agreement.getProperty().getMaximumReservationsPerYear() %> booking per month</p> <!-- TODO -->
                                <% } %>

                            </div>
                            <div class="card">
                                <img class="card-icon floating" src="<%=request.getContextPath()%>/img/icons/paper.svg">

                                <h1 class="card-title">HOUSE RULES</h1>

                                <% if (Validator.isNull(agreement.getProperty().getHouseRules())) { %>
                                <p>No house rules are currently set.</p>
                                <% } else { %>
                                <p>Your house rules are currently set as:</p>
                                <p><%= agreement.getProperty().getHouseRules()%></p>
                                <% }  %>
                            </div>
                    </div>

                    <div class="row">
                        <div class="col-xs-offset-3 col-xs-6">
                            Click to create your free lease addendum and start earning, or <a onclick="openPayout(); return false;"class="link-green" href="#">make changes</a> to finetune the deal.
                        </div>

                        <div class="col-xs-offset-4 col-xs-4 text-center">
                            <button onclick="reviewProposalModal();" class="create-addendum btn btn-lg btn-red btn-rounded btn-fullwidth">CREATE ADDENDUM</button>
                            <a onclick="showDeclineModal(); return false" href="#" class="link-black">Decline the offer</a>
                        </div>
                    </div>
                </div>

                <div id="chartspayoutmodal" class="widget widget-gray widget-lg text-center">
                    <h1 class="widget-title widget-title-center">EDIT YOUR PROFIT SHARING</h1>
                    <div class="row">
                        <div class="col-xs-offset-2 col-xs-8">
                            <p class="subtitle">Slide the bar below to change the percentage of your tenant’s Airbnb profit that will be paid to you.</p>
                            <br/>
                            <p class="subtitle">Most landlords take between 10%-20%, depending on their circumstances.</p>
                        </div>
                    </div>

                    <form id="form-payout" class="row form-inline form-payout">

                        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                        <!--<div class="form-group">
                            <span>Financial breakdown based on</span>
                            <input data-proposal-payout type="number" name="data[Proposal][payout]" class="form-control" id="payout" value="1000" required>
                            <span>gross payout (not including cleaning fee)</span>
                        </div>-->

                        <div class="col-xs-offset-3 col-xs-6">
                            <table class="info-payout">
                                <tr>
                                    <th>Your Share</th>
                                    <th class="text-right">Tenant's Share</th>
                                </tr>
                                <!--<tr>
                                    <td data-proposal-landlord-amount></td>
                                    <td data-proposal-tenant-amount class="text-right"></td>
                                </tr>-->
                            </table>

                            <div class="slider-wrap slider-invert form-group">
                                <input type="text" name="data[Proposal][landlord]" class="form-control" data-proposal-landlord-percentage readonly>
                                <input type="text" id="slider-payout" class="slider" value="" data-slider-min="0" data-slider-max="100" data-slider-step="1" data-slider-value="20" data-slider-id="slider-payout" data-slider-tooltip="hide" data-slider-handle="round" />
                                <input type="text" name="data[Proposal][tenant]" class="form-control" data-proposal-tenant-percentage readonly>
                            </div>

                            <!--<div class="row">
                                <div class="col-xs-8">
                                    <p class="text-sm">Cleaning fee is not shared with your landlord and is not included in the calculation.</p>
                                    <p class="text-sm nomargin">3% LetULet fee is $<span data-proposal-landlord-fee-amount></span></p>
                                </div>
                            </div>-->
                        </div>
                        <div class="col-xs-offset-2 col-xs-8">
                            <div id="chart-payout"></div>
                        </div>
                    </form>
                </div>

                <div id="edithosting" class="widget widget-lg text-center">
                    <h1 class="widget-title widget-title-center">EDIT YOUR HOSTING LIMITATIONS</h1>
                    <div class="row">
                        <div class="col-xs-offset-2 col-xs-8">
                            <p class="subtitle">The Hosting Limits will be added to your lease addendum and letUlet will montior the Airbnb activity verifying that your limits are being followed.</p>
                            <p>Check the boxes below to add the Hosting Limits that are right for your building</p>

                            <div class="row">
                                <div class="col-xs-offset-2 col-xs-8">
                                    <form id="form-hosting">

                                        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                                        <div class="checkbox checkbox-red checkbox-circle form-inline">
                                            <input onchange="$('#maximumGuests').prop('disabled',!this.checked);" name="data[Property][maximumGuestsCheck]" id="maximumGuestsCheck" type="checkbox" <%= (agreement.getProperty().getMaximumGuests() > 0) ? "checked" : ""%>>
                                            <label for="maximumGuestsCheck">
                                                No more than <input style="width:65px" type="number" value="<%= agreement.getProperty().getMaximumGuests()%>" name="data[Property][maximumGuests]" class="form-control input-sm" id="maximumGuests" <%= (agreement.getProperty().getMaximumGuests() > 0) ? "" : "disabled"%>> guests per stay
                                            </label>
                                        </div>

                                        <div class="checkbox checkbox-red checkbox-circle form-inline">
                                            <input onchange="$('#maximumReservationsPerYear').prop('disabled',!this.checked);" name="data[Property][maximumReservationsPerYearCheck]" id="maximumReservationsPerYearCheck" type="checkbox" <%= (agreement.getProperty().getMaximumReservationsPerYear() > 0) ? "checked" : ""%>>
                                            <label for="maximumReservationsPerYearCheck">
                                                No more than <input style="width:65px" type="number" value="<%= agreement.getProperty().getMaximumReservationsPerYear()%>" name="data[Property][maximumReservationsPerYear]" class="form-control input-sm" id="maximumReservationsPerYear" <%= (agreement.getProperty().getMaximumReservationsPerYear() > 0) ? "" : "disabled"%>> reservations per year
                                            </label>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <h1 style="    margin-top: 115px;" class="widget-title widget-title-center">EDIT YOUR HOUSE RULES</h1>
                    <div class="row">
                        <div class="col-xs-offset-2 col-xs-8">
                            <p class="subtitle">The House Rules you specify will be added to your tenant’s Airbnb listing so the guest will know them prior to making a reservation. </p>
                            <p>Type in House Rules that are important to you and your building</p>

                            <div class="row">
                                <div class="col-xs-offset-2 col-xs-8">
                                    <form id="form-rules">

                                        <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                                        <textarea name="data[Property][houseRules]" rows="4" value="<%=agreement.getProperty().getHouseRules()%>" class="rulestexarea form-control" placeholder="Write your own house rules (optional)"></textarea>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-xs-offset-4 col-xs-4 text-center">
                            <button class="create-addendum btn btn-lg btn-red btn-rounded btn-fullwidth">CREATE ADDENDUM</button>
                            <a onclick="closePayout();return false"href="#" class="link-black">Go back</a>
                        </div>
                    </div>
                </div>

                <div class="widget widget-lg widget-shadow text-center">
                    <h1 class="widget-title widget-title-center">WHY USE LETULET?</h1>
                    <div class="row">
                        <div class="col-xs-offset-2 col-xs-8">
                            <p>We provide all the tools you need to allow your long-term tenants to host short-term rentals keeping you informed, paid, and in control.</p>
                        </div>
                    </div>

                    <div class="cards">
                        <div class="card card-xs">
                            <span class="card-number">1</span>
                            <div class="card-icon-wrapper">
                                <img class="card-icon" src="<%=request.getContextPath()%>/img/icons/paper.svg">
                            </div>
                            <h1 class="card-title">Set Your Limits & Rules</h1>
                            <p>Set limits on your hosting activiy and set house rules</p>
                        </div>
                        <div class="card card-xs">
                            <span class="card-number">2</span>
                            <div class="card-icon-wrapper">
                                <img class="card-icon" src="<%=request.getContextPath()%>/img/icons/notes.svg">
                            </div>
                            <h1 class="card-title">Get Free Lease Addendum</h1>
                            <p>Get free lease addendum ensuring your terms</p>
                        </div>
                        <div class="card card-xs">
                            <span class="card-number">3</span>
                            <div class="card-icon-wrapper">
                                <img class="card-icon" src="<%=request.getContextPath()%>/img/icons/bill.svg">
                            </div>
                            <h1 class="card-title">Start Earning Revenue</h1>
                            <p>Get a share of tenants' hosting revenue</p>
                        </div>
                        <div class="card card-xs">
                            <span class="card-number">4</span>
                            <div class="card-icon-wrapper">
                                <img class="card-icon" src="<%=request.getContextPath()%>/img/icons/calendar.svg">
                            </div>
                            <h1 class="card-title">Rest<br/>Assured</h1>
                            <p>We will monitor tenant activities and ensure you are paid </p>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-xs-offset-4 col-xs-4 text-center">
                            <button onclick="openLetuletVideo()" class="btn btn-green btn-rounded">
                                <img src="<%= request.getContextPath() %>/img/lecture.png" />
                                WATCH VIDEO
                            </button>
                        </div>

                        <div class="col-xs-offset-4 col-xs-4 text-center">
                            <button onclick="reviewProposalModal();" class="create-addendum btn btn-lg btn-red btn-rounded btn-fullwidth">CREATE ADDENDUM</button>
                            <a href="#" onclick="showDeclineModal(); return false"  class="link-black">Decline the offer</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /container -->

<%@ include file="modal/review_proposal.jsp" %>
<%@ include file="modal/proposal_declined.jsp" %>
<%@ include file="modal/video.jsp" %>

<%@ include file="inc-footer-nolinks.jsp" %>
<script>
    var uid = "<%= agreement.getUID() %>";

    function openLetuletVideo() {

        $("#videomodal").modal("show");
    }

    //Autoplay video
    $('#videomodal').on('show.bs.modal', function (e) {

        var video = $('video')[0];

        if( video.paused) {
            video.play();
        }
    });

    $('#videomodal').on('hide.bs.modal', function (e) {

        var video = $('video')[0];

        if(!video.paused) {
            video.pause();
        }
    });

    window.proposalChart = new ProposalChart("chartspayoutmodal", {
        slider: $('#slider-payout'),
        chart: {
            id: "chart-payout"
        },
        viewByLandlord: true,
        landlordpercentage: <%= agreement.getLandlordCommissionRate()%>,
        payout: <%= agreement.getPayout()%>
    });

    function openPayout() {

        $(".proposal-review-page").addClass("open");
    }

    function closePayout() {

        $(".proposal-review-page").removeClass("open");
    }


    function reviewProposalModal () {

        $("#landlordreviewproposalmodal").modal("show");

        return false;
    }

    $('#landlordreviewproposalmodal').on('show.bs.modal', function (e) {

        proposalManager.getProposalByUid("<%= agreement.getUID()%>", function (data) {

            var valtextagreement = document.querySelectorAll("[val-text-agreement]");

            for (var i = 0; i < valtextagreement.length; i++) {

                valtextagreement[i].value = data.textAgreement;
            }
        });
    });

    function reviewProposal (form) {

        var _this = this;
        var data = $('#landlordreviewproposalform').serialize();

        proposalManager.signProposal(data, function (jsn) {


            if (jsn.status == "error") {

                $("#landlordreviewproposalmodal-message").empty().html(jsn.message);

                return;
            }

            $("#landlordreviewproposalmodal").modal("hide");
            $("#pairingsuccessfulmodal").modal("show");
        });

        return false;
    }

    function showDeclineModal () {

        $("#proposaldeclinemodal").modal("show");

        return false;
    }
</script>
</body>
</html>
