<!DOCTYPE html>
<html lang="en-us">
  <head>
    <title>LetULet | Retrieve Password</title>
    <%@ include file="inc-header.jsp" %>
  </head>
  <body>
    <%@ include file="inc-navbar-branded.jsp" %>
    <div id="wrap" class="container">
    <div class="page-header">
	    <h2>Request a new password</h2>
    </div>
        <div class="row" class="text-center">
            <% if(request.getParameter("msg") != null) { %>
            <div id="messagecontainer" class="messagecontainer" style="">
                <% if(request.getParameter("msg").equalsIgnoreCase("1")) { %>
                <div class="alert alert-danger fade in alert-dismissable">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                    <strong>Oups!</strong>&nbsp;&nbsp;&nbsp;<span id="statusmessage">Email not found</span>
                </div>
                <% } %>
            </div>
            <script>
                function hideMessagePanel(){
                    $("#messagecontainer").slideUp();
                }

                window.onload = function() {
                    $("#messagecontainer").slideDown();
                    setTimeout('hideMessagePanel()', 5000);
                }
            </script>
            <% }   %>
        </div>

    <div class="row">
	<div class="col-md-6 col-md-offset-3">
		<form action="<%= request.getContextPath() %>/lostpassword_process.jsp" class="form-signin" role="form" id="UserLoginForm" method="post" accept-charset="utf-8">
            <div class="form-group">
                <label for="UserEmail" class="col-sm-2 control-label"></label>
                  <div class="col-sm-5"><div class="input email required"><input name="data[User][email]" placeholder="Your Email address" class="form-control" maxlength="55" type="email" id="UserEmail" required="required"/></div></div>	  </div>
             <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10"><br/>
	      <button type="submit" class="btn btn-primary bn-lg">Submit</button>
	    </div>
	  </div>
	  </form>	</div>
    </div>    </div> <!-- /container -->

    <script type="text/javascript">jQuery(function(){jQuery('#UserEmail').focus()});</script>
    <%@ include file="inc-footer-nolinks.jsp" %>
  </body>
</html>
