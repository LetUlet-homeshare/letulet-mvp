<%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="com.letulet.backend.model.Tenant" %>
<%@ page import="com.letulet.backend.model.Landlord" %>
<%@ page import="com.letulet.backend.model.User" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.db.SettingManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%
    request.setCharacterEncoding("UTF-8");

    Landlord landlord = null;
    Tenant tenant = null;
    User user =  (User)request.getSession().getAttribute("user");

    Setting settings = SettingManager.getInstance().getSetting(user);

    if (settings == null) {

        settings = SettingManager.getInstance().createSetting(user);
    }

    if (user instanceof Landlord) {

        landlord =  (Landlord)user;
    }

    if (user instanceof Tenant) {

        tenant =  (Tenant)user;
    }
%><!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Letulet | Settings</title>
    <%@ include file="inc-header.jsp" %>

    <style>
        input[type="file"] {
            display: none;
        }
    </style>
</head>
<body>

<div class="dashboard-page content">

    <%@ include file="inc-menu.jsp" %>

    <div class="container container-space">

        <%@ include file="inc-navbar.jsp" %>

            <div class="col-xs-5 ">
                <div class="widget">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="setting">
                                <h1 class="setting-title">Profile</h1>

                                <div class="row">
                                    <form method="POST" enctype="multipart/form-data" action="<%= request.getContextPath()%>/employee_process.jsp">

                                        <div class="col-xs-5">
                                            <div class="picture-wrapper">
                                                <img id="file-preview" class="profile-picture" src="<%=userPictureURL %>" alt="user"/>

                                                <label for="file-upload" class="btn-upload"></label>
                                                <input name="file" id="file-upload" type="file"/>
                                            </div>
                                        </div>

                                        <div class="col-xs-6">

                                            <div class="form-group required">
                                                <label class="label-xs" for="userFirstName">First Name</label>
                                                <% if (landlord != null) { %>
                                                <input name="data[User][firstName]" type="text" class="input-sm form-control" id="userFirstName" value="<%= (Validator.isNotNull(landlord.getFirstName())) ? landlord.getFirstName() : "" %>" required>
                                                <% } %>

                                                <% if (tenant != null) { %>
                                                <input name="data[User][firstName]" type="text" class="input-sm form-control" id="userFirstName" value="<%= (Validator.isNotNull(tenant.getFirstName())) ? tenant.getFirstName() : "" %>" required>
                                                <% } %>
                                            </div>

                                            <div class="form-group required">
                                                <label class="label-xs" for="userLastName">Last Name</label>
                                                <% if (landlord != null) { %>
                                                <input name="data[User][lastName]" type="text" class="input-sm form-control" id="userLastName" value="<%= (Validator.isNotNull(landlord.getLastName())) ? landlord.getLastName() : "" %>" required>
                                                <% } %>

                                                <% if (tenant != null) { %>
                                                <input name="data[User][lastName]" type="text" class="input-sm form-control" id="userLastName" value="<%= (Validator.isNotNull(tenant.getLastName())) ? tenant.getLastName() : "" %>" required>
                                                <% } %>
                                            </div>

                                            <div class="form-group required">
                                                <label class="label-xs" for="userEmail">Email</label>

                                                <% if (landlord != null) { %>
                                                <input disabled name="data[User][email]" type="text" class="input-sm form-control" id="userEmail" value="<%= (Validator.isNotNull(landlord.getEmail())) ? landlord.getEmail() : "" %>" required>
                                                <% } %>

                                                <% if (tenant != null) { %>
                                                <input disabled name="data[User][email]" type="text" class="input-sm form-control" id="userEmail" value="<%= (Validator.isNotNull(tenant.getLastName())) ? tenant.getEmail() : "" %>" required>
                                                <% } %>
                                            </div>
                                        </div>

                                        <div class="col-xs-offset-3 col-xs-6 text-center">
                                            <br/>

                                            <button class="btn btn-fullwidth btn-lg btn-rounded btn-red" type="submit">SAVE</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-5">
                <div class="widget">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="setting">
                                <h1 class="setting-title">Notifications</h1>

                                <div class="setting-rows">
                                    <div class="form">
                                        <div class="setting-row">
                                            <label>Email Notifications</label>

                                            <div>
                                                <input onchange="updateSettings('emailNotifications', this.checked)" type='checkbox' class='ios8-switch' id='checkbox-1' name="data[Setting][emailNotifications]" <%= settings.getEmailNotifications() ? "checked" : ""%>>
                                                <label for='checkbox-1'></label>
                                            </div>
                                        </div>
                                        <div class="setting-row">
                                            <label>SMS Notifications</label>

                                            <div>
                                                <input onchange="updateSettings('smsNotifications', this.checked)" type='checkbox' class='ios8-switch' id='checkbox-2' name="data[Setting][smsNotifications]" <%= settings.getSMSNotifications() ? "checked" : ""%>>
                                                <label for='checkbox-2'></label>
                                            </div>
                                        </div>
                                        <div class="setting-row">
                                            <label>Agreement Status</label>
                                            <div>
                                                <input onchange="updateSettings('agreementStatus', this.checked)" type='checkbox' class='ios8-switch' id='checkbox-3' name="data[Setting][agreementStatus]" <%= settings.getAgreementStatus() ? "checked" : ""%>>
                                                <label for='checkbox-3'></label>
                                            </div>
                                        </div>
                                        <div class="setting-row">
                                            <label>New Message</label>
                                            <div>
                                                <input onchange="updateSettings('newMessage', this.checked)" type='checkbox' class='ios8-switch' id='checkbox-4' name="data[Setting][newMessage]" <%= settings.getNewMessage() ? "checked" : ""%>>
                                                <label for='checkbox-4'></label>
                                            </div>
                                        </div>
                                        <div class="setting-row">
                                            <label>New Deposit</label>
                                            <div>
                                                <input onchange="updateSettings('newDeposit', this.checked)" type='checkbox' class='ios8-switch' id='checkbox-5' name="data[Setting][newDeposit]" <%= settings.getNewDeposit() ? "checked" : ""%>>
                                                <label for='checkbox-5'></label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-5">
                <div style="margin-top:-55px"  class="widget">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="setting">
                                <h1 class="setting-title">Security</h1>

                                <form style="margin-bottom:20px;" id="form1">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="form-group required">
                                                <label for="userCurrentPassword">Current Password</label>
                                                <input name="data[User][password]" type="password" class="form-control" id="userCurrentPassword" required>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="form-group required">
                                                <label for="userNewPassword">New Password</label>
                                                <input name="data[User][newpassword]" type="password"  class="form-control" id="userNewPassword" required>
                                            </div>
                                        </div>

                                        <div class="col-xs-offset-6 col-xs-6" style="margin-top:10px;">
                                            <button type="submit" class="btn btn-fullwidth btn-lg btn-rounded btn-red" type="submit">Save</button>
                                        </div>
                                    </div>
                                </form>

                                <br/>

                                <div class="setting-rows">
                                    <div class="setting-row">
                                        <label>Stay Logged In</label>
                                        <div>
                                            <input onchange="updateSettings('stayLoggedIn', this.checked)" type='checkbox' class='ios8-switch' id='checkbox-6' name="data[Setting][stayLoggedIn]" <%= settings.getStayLoggedIn() ? "checked" : ""%>>
                                            <label for='checkbox-6'></label>
                                        </div>
                                    </div>
                                    <div class="setting-row">
                                        <label>SMS Verification</label>
                                        <div>
                                            <input onchange="updateSettings('smsVerification', this.checked)" type='checkbox' class='ios8-switch' id='checkbox-7' name="data[Setting][smsVerification]" <%= settings.getSMSVerification() ? "checked" : ""%>>
                                            <label for='checkbox-7'></label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-5 ">
                <div class="widget">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="setting">
                                <h1 class="setting-title">About Letulet</h1>

                                <div class="setting-rows">
                                    <div class="setting-row">
                                        <label>Terms and Conditions</label>

                                        <% if (landlord != null) { %>
                                        <a style="width: 80px;" href="<%=request.getContextPath()%>/static/terms_landlord.jsp" class="btn btn-red btn-rounded">View</a>
                                        <% } else { %>
                                        <a style="width: 80px;" href="<%=request.getContextPath()%>/static/terms_tenant.jsp" class="btn btn-red btn-rounded">View</a>
                                        <% } %>
                                    </div>
                                    <div class="setting-row">
                                        <label>Privacy Policy</label>
                                        <a style="width: 80px;" class="btn btn-red btn-rounded">View</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!--<div class="right-side">

    </div>-->
</div>
<!-- /container -->

<%@ include file="inc-footer-nolinks.jsp" %>

<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/settings.js"></script>

</body>
</html>
