<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %><%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>LetULet | Sign Up</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>
<%@ include file="inc-navbar-branded.jsp" %>

<div id="wrap" class="container animated fadeInDown">

    <form action="<%= request.getContextPath() %>/tenantwizard1_process.jsp" class="form-horizontal" role="form" id="UserSignUpForm" method="post" accept-charset="utf-8">
        <div class="col-md-6 col-md-offset-3">

            <div class="page-header">
                <h3>What is your property information?</h3>
            </div>

            <div class="form-group">
                <div class="form-group">
                </div>
                <div class="col-sm-6">
                    <div class="input email required"><input placeholder="Address" name="data[Wizard][address]"
                                                             class="form-control" maxlength="55" type="text"
                                                             id="Address" required="required"/></div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required">
                        <input placeholder="Appartment Number" name="data[Wizard][address2]"
                               class="form-control" type="text"
                               id="Address2" required="required"/>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required"><input placeholder="Zip Code"
                                                                name="data[Wizard][zipcode]" class="form-control"
                                                                type="test" id="zipcode"
                                                                required="required"/></div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required"><input placeholder="City"
                                                                name="data[Wizard][city]" class="form-control"
                                                                type="test" id="city"
                                                                required="required"/></div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required"><input placeholder="State"
                                                       name="data[Wizard][state]" class="form-control"
                                                       type="test" id="state"
                                                       required="required"/></div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required"><input placeholder="Bedrooms"
                                                       name="data[Wizard][bedrooms]" class="form-control"
                                                       type="text" id="bedrooms"
                                                       required="required"/></div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required"><input placeholder="Bathrooms"
                                                       name="data[Wizard][bathrooms]" class="form-control"
                                                       type="text" id="bathrooms"
                                                       required="required"/></div>
                </div>
            </div>

            <div class="page-header">
                <h3>What is your landlord information?</h3>
            </div>

            <div class="form-group">

                <div class="col-sm-6">
                    <div class="input email required"><input placeholder="Email Address" name="data[Landloard][email]"
                                                                                     class="form-control" maxlength="55" type="email"
                                                                                     id="UserEmail" required="required"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required"><input placeholder="First Name"
                                                                name="data[Landloard][firstname]" class="form-control"
                                                                type="test" id="firstname"
                                                                required="required"/></div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-6">
                    <div class="input required"><input placeholder="Last Name"
                                                                name="data[Landloard][lastname]" class="form-control"
                                                                type="test" id="lastname"
                                                                required="required"/></div>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button id="submitButton" type="submit" class="btn btn-primary bn-lg">CONTINUE</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
