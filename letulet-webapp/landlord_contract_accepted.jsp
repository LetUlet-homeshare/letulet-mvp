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

    <div class="col-md-6 col-md-offset-3">

        <div class="page-header">
            <h3>Congratulations !! Your invitation with [XXXXXXXX] is now active.</h3>
        </div>

        <p>Lorem ipsum....</p>
        <p>Download your partnership agreement by <a href="#">logging in to your dashboard</a>.</p>
        <p>Don't have an account? <a href="<%= request.getContextPath() %>/signup.jsp">Create your account now</a>.</p>
        <a id="submitButton" href="<%= request.getContextPath() %>/login.jsp" class="btn btn-primary bn-lg">LOG IN TO DASHBOARD</a>
    </div>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
