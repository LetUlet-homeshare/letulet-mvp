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
            <h3>Congratulations !! Your invitation is sent.</h3>
        </div>

        <button id="submitButton" type="button" class="btn btn-primary bn-lg">LOG IN TO DASHBOARD</button>
    </div>
</div>

<!-- /container -->
<%@ include file="inc-footer-nolinks.jsp" %>
</body>
</html>
