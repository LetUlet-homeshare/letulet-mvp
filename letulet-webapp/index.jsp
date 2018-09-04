<!DOCTYPE html>
<html lang="en-us">
<head>
    <title>LetULet</title>
    <%@ include file="inc-header.jsp" %>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/assets/css/splash.css" />
</head>

<body>
    <div class="splash">
        <img class="logo" src="<%= request.getContextPath() %>/img/logo.png" alt="letulet"/>

        <div class="container">
            <div class="splash-container ">
                <div class="row">
                    <div class="col-xs-offset-1 col-xs-10 col-sm-offset-0 col-sm-12 col-md-12 col-lg-12">
                        <h1 class="hidden-xs hidden-sm splash-title">
                            EMPOWERING TENANT<br/>HOME SHARING
                        </h1>
                        <h1 class="hidden-lg hidden-md splash-title">
                            EMPOWERING<br/>TENANT<br/>HOME SHARING
                        </h1>

                        <p class="text-center hidden-xs splash-subtitle">where tenants have permission,<br/>and landlords have peace of mind</p>
                        <p class="text-center hidden-lg hidden-sm hidden-md splash-subtitle">where tenants have permission, and landlords have peace of mind</p>

                        <form id="splashform" class="form-inline text-center">
                            <div class="form-group">
                                <label class="sr-only" for="emailInput">Email address</label>
                                <input type="email" class="form-control" id="emailInput" placeholder="YOUR EMAIL HERE" required>
                            </div>
                            <button type="submit" class="btn btn-default">GET ACCESS</button>
                        </form>

                        <p id="splashformsuccess" class="text-center splash-message" style="display:none;">Thank you !</p>
                    </div>
                </div>
            </div>

            <div class="splash-footer-container">
                <div class="row footer">
                    <div class=" col-xs-12 text-center">
                        <img class="footer-logo" src="<%= request.getContextPath() %>/img/logo.png" alt="letulet"/>
                        <p class="">2017 LetULet, Inc. &copy; All rights reserved</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

<script>
    var $form = $("#splashform");
    var $formmsg = $("#splashformsuccess");

    function displayFormSuccess() {

        $($form).hide();
        $($formmsg).show().addClass("doFadeIn");
    }

    $(document).ready(function() {

        $($form).on("submit", function (e) {

            e.preventDefault();

            var email = $("#emailInput").val();

            $.ajax({
                url: "newsletter_process.jsp",
                method: "POST",
                data: {
                    email: email
                }
            })
            .always(function( data ) {

                displayFormSuccess();
            });

            return false;
        });
    })
</script>
</html>
