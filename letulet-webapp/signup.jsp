<%@ page import="com.letulet.utils.WebConstants" %><%@ page import="com.letulet.utils.GetterUtil" %><%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><% response.setHeader(WebConstants.CACHE_CONTROL, WebConstants.NO_CACHE); %>
<!DOCTYPE html>
<html lang="en-us">
<head>
    <meta charset="utf-8">
    <title>Orbirental | Sign Up</title>
    <%@ include file="inc-header.jsp" %>
</head>
<body>
<style>
    .password-verdict {
        color: black;
        padding-left: 5px;
        padding-right: 5px;
    }

    .progress {
        margin-bottom: 0px;
        margin-top: 14px;
    }

    .fadeInDown {
        -webkit-animation-name: fadeInDown;
        animation-name: fadeInDown;
    }

    .animated {
        animation-duration: 1s;
        animation-fill-mode: both;
        z-index: 100;
    }

    @keyframes fadeInDown {
        0% {
            opacity: 0;
            -webkit-transform: translateY(-20px);
            -ms-transform: translateY(-20px);
            transform: translateY(-20px);
        }

        100% {
            opacity: 1;
            -webkit-transform: translateY(0);
            -ms-transform: translateY(0);
            transform: translateY(0);
        }
    }
</style>

<div id="wrap" class="container animated fadeInDown">
    <div class="page-header">
        <h2>Sign up for your LetULet account</h2>
    </div>

    <% if (request.getParameter("msg") != null) { %>
    <div id="messagecontainer" class="messagecontainer" style="">
        <div class="alert alert-danger fade in alert-dismissable">
            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
            <strong>Ooops!</strong>&nbsp;&nbsp;&nbsp;<span
                id="statusmessage">Account Creation Failed. Please try again.</span>
        </div>
    </div>
    <% } %>

    <% if (request.getParameter("user") != null && request.getParameter("user").equals("exist")) { %>
    <div id="messagecontainer" class="messagecontainer" style="">
        <div class="alert alert-danger fade in alert-dismissable">
            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
            <strong>Ooops!</strong>&nbsp;&nbsp;&nbsp;<span
                id="statusmessage">This Email is already taken.</span>
        </div>
    </div>
    <% } %>

    <div class="row">
        <% if(request.getParameter("pass") != null && request.getParameter("pass").equalsIgnoreCase("failed")) { %>
        <div class="alert alert-danger">
            <div class="error_box">
                <%= GetterUtil.get(request.getParameter("msg"), "A password with 6 characters minimum is required") %>
            </div>
        </div>
        <% } %>
        <% if(request.getParameter("email") != null && request.getParameter("email").equalsIgnoreCase("incorrect")) { %>
        <div class="alert alert-danger">
            <div class="error_box">
                <%= GetterUtil.get(request.getParameter("msg"), "The email is incorrect") %>
            </div>
        </div>
        <% } %>
        <% if(request.getParameter("pass") != null && request.getParameter("pass").equalsIgnoreCase("security")) { %>
        <div class="alert alert-danger">
            <div class="error_box">
                <%= GetterUtil.get(request.getParameter("msg"), "The password is not safe") %>
            </div>
        </div>
        <% } %>
        <div class="col-md-6 col-md-offset-3">
            <form action="<%= request.getContextPath() %>/signup_process.jsp" class="form-horizontal" role="form"
                  id="UserSignUpForm" method="post" accept-charset="utf-8">
                <div class="form-group">
                    <div class="form-group" style="margin-left:-100px;">
                        <input name="data[User][Type]" type="hidden" value="3">
                    </div>
                    <div class="col-sm-6">
                        <div class="input email required"><input placeholder="Email Address" name="data[User][email]"
                                                                 class="form-control" maxlength="55" type="email"
                                                                 id="UserEmail" required="required"/></div>
                    </div>
                </div>
                <div id="pwd-container">
                    <div class="form-group">
                        <div class="col-sm-6">
                            <div class="input password required">
                                <input placeholder="Password" name="data[User][password]"
                                       class="form-control" type="password"
                                       id="UserPassword" required="required"/>
                            </div>
                        </div>
                        <div class="pwstrength_wrap col-sm-6" style="display:none">
                            <div class="pwstrength_viewport_progress"></div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-6">
                        <div class="input password required"><input placeholder="Confirm Password"
                                                                    name="data[User][re_password]" class="form-control"
                                                                    type="password" id="UserRePassword"
                                                                    required="required"/></div>
                    </div>
                </div>

                <p class="text-error"></p>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button id="submitButton" type="submit" class="disabled btn btn-primary bn-lg">Sign up</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- /container -->
<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/pwstrength.js"></script>
<script>
    $(document).ready(function ($) {
        "use strict";
        $('#UserEmail').focus();
        $("#whoami").animate({left: '15px'},1000);

        /*
         check if password same
         */
        function checkPassSame(password, password2) {
            return password === password2;
        }

        $("#UserRePassword").on("keypress keyup keydown", function () {
            var passCheck = $(this).val();
            var pass = $("#UserPassword").val();

            if (!checkPassSame(pass, passCheck)) {
                $(this).css('border', '1px solid red');
                $('#submitButton').addClass('disabled');
            } else {
                $(this).css('border', '1px solid green');
                $('#submitButton').removeClass('disabled');
            }
        });

        $("#UserPassword").on("keypress keyup keydown", function () {
            var pass = $(this).val();

            if(pass.length >= 1) {
                $(".pwstrength_wrap").show();
            } else {
                $(".pwstrength_wrap").hide();
            }
        });

        /*
         Check strenght password
         */
        var options = {};
        options.ui = {
            container: "#pwd-container",
            showVerdictsInsideProgressBar: true,
            viewports: {
                progress: ".pwstrength_viewport_progress"
            }
        };
        options.common = {
            debug: false,
            onLoad: function () {
            }
        };

        $('input#UserPassword').pwstrength(options);

        $("#UserSignUpForm").on("submit", function () {
            var passCheck = $("#UserRePassword").val();
            var pass = $("#UserPassword").val();

            if (checkPassSame(pass, passCheck)) {
                $(".text-error")[0].innerHTML = "";
                return true;
            } else {
                $(".text-error")[0].innerHTML = "Passwords don't match.";
                return false;
            }
        });
    });

    window.onload = function () {
        if($("#messagecontainer")) {
            $("#messagecontainer").slideDown();
            setTimeout(function() {
                $("#messagecontainer").slideUp();
            }, 5000);
        }
    }
</script>
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
