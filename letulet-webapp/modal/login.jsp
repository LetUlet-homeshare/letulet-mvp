<div id="loginmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-12 text-center">
                        <img width="100px" class="modal-logo" src="<%= request.getContextPath() %>/img/logo_red.svg"/>

                        <h2 class="modal-title">Log In</h2>

                        <div class="row">
                            <div class="col-xs-offset-2 col-xs-8">
                                <form id="loginform" onsubmit="return login(this)">

                                    <div class="form-group required">
                                        <label class="sr-only" for="email"></label>
                                        <input name="data[User][email]" placeholder="Email"  type="email" class="form-control" id="email" required>
                                    </div>

                                    <div class="text-left form-group required">
                                        <label class="sr-only" for="password"></label>
                                        <input name="data[User][password]" placeholder="Password" type="password" autocomplete="off" class="form-control" id="password" required>
                                    </div>

                                    <div class="text-center">
                                        <button type="submit" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">LOG IN</button>
                                        <button type="button" class="btn btn-fullwidth btn-lg btn-black" data-dismiss="modal">CANCEL</button>
                                    </div>

                                    <p style="margin: 20px 0px 0px 0px;" id="loginform-message" class="text-danger"></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<script>
  function login (form) {

      $("#loginform-message").empty();

      var data = $(form).serialize();

      userManager.login(data, function (data) {

          if (data.status == "error") {

              $("#loginform-message").html(data.message);
              return;
          }

          if (data.status == "success") {

              window.location = "../dashboard.jsp";
          }
      });

      return false;
  }
</script>