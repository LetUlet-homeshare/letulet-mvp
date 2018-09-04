<!DOCTYPE html>
<html lang="en-us">
  <head>
    <title>Orbirental | Log In</title>
    <%@ include file="inc-header.jsp" %>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/assets/css/signin.css" />
    <style>
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

        body {
            padding-top:0;
        }
    </style>
  </head>
  <body>
    <!-- Fixed navbar -->
    <div class="navbar navbar-branded navbar-default" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a href="/">
              <%@ include file="inc-header.jsp" %>
          </a>
        </div>
        <p class="navbar-text"></p>
        <div class="navbar-collapse collapse">

        </div><!--/.nav-collapse -->
      </div>
    </div>

    <div id="wrap" class="container">
        <% if(request.getParameter("msg") != null) { %>
        <div id="messagecontainer" class="messagecontainer" style="">
            <% if(request.getParameter("msg").equalsIgnoreCase("2")) { %>
            <div class="alert alert-success fade in alert-dismissable">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                <strong>Hooray!</strong>&nbsp;&nbsp;&nbsp;<span id="statusmessage">Your password has been reset successfully. Please log in.</span>
            </div>
            <% } %>
            <% if(request.getParameter("msg").equalsIgnoreCase("auth")) { %>
            <div class="alert alert-danger fade in alert-dismissable">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                <strong>Oops!</strong>&nbsp;&nbsp;&nbsp;<span id="statusmessage">Your credentials are wrong.</span>
            </div>
            <% } %>
        </div>
        <% }   %>

        <div class="loginscreen animated fadeInDown">
            <form action="<%= request.getContextPath() %>/login_process2.jsp" class="form-signin" role="form" id="UserLoginForm" method="post" accept-charset="utf-8">
                <h2 class="form-signin-heading">Please sign in</h2>

                <div class="input email required">
                    <input name="data[User][email]" class="form-control" placeholder="Email address" maxlength="55" type="email" id="UserEmail" required="required"/>
                </div>

                <div class="input password required">
                    <input name="data[User][password]" class="form-control" placeholder="Password" type="password" id="UserPassword" required="required"/>
                </div>

                <div class="input checkbox">
                    <div class="checkbox">
                        <label for="UserRememberMe">
                        <input type="checkbox" name="data[User][rememberMe]" value="true" id="UserRememberMe" checked/> Remember me</label>
                    </div>
                </div>
                
                <button type="submit" class="btn btn-lg btn-primary btn-block">Sign in</button>
                
                <p class="text-right">
                    <a href="<%= request.getContextPath() %>/signup.jsp?pl=MONTHLY_STARTER">Not signed up yet?</a>
                </p>

                <p class="text-right">
                    <a href="<%= request.getContextPath() %>/lostpassword.jsp">Forgot your password?</a>
                </p>

                <!-- webbot  bot="HTMLMarkup" startspan -->
                <!-- GeoTrust QuickSSL [tm] Smart  Icon tag. Do not edit. -->
                <!--<script language="javascript" type="text/javascript" src="//smarticon.geotrust.com/si.js"></script>-->
                <!-- end  GeoTrust Smart Icon tag -->

                <!-- webbot  bot="HTMLMarkup" endspan -->
            </form>
        </div>
    </div> <!-- /container -->

    <script type="text/javascript">jQuery(function(){jQuery('#UserEmail').focus()});</script>

    <%@ include file="inc-footer-nolinks.jsp" %>

    <script>
        function hideMessagePanel(){
            $("#messagecontainer").slideUp();
        }

        window.onload = function() {
            $("#messagecontainer").slideDown();
            setTimeout('hideMessagePanel()', 5000);
        }
    </script>
  </body>
</html>
