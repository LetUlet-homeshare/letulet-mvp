<div id="signinmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-12 text-center">
                        <img width="100px" class="modal-logo" src="<%= request.getContextPath() %>/img/logo_red.svg"/>

                        <h2 class="modal-title">WELCOME TO LETULET</h2>

                        <p class="modal-description">Hooray! We are glad you decided to proceed. Register now and start hosting on Airbnb.</p>

                        <div class="row">
                            <div class="col-xs-offset-2 col-xs-8">
                                <form id="signinform" onsubmit="return signLandlord(this)">

                                    <div class="form-group required">
                                        <label class="sr-only" for="email"></label>
                                        <input name="data[Landlord][email]" placeholder="Email"  type="email" class="form-control" id="email" required>
                                    </div>

                                    <div class="text-left form-group required">
                                        <label class="sr-only" for="password"></label>
                                        <input name="data[Landlord][password]" placeholder="Password" type="password" autocomplete="off" class="form-control" id="password" required>
                                    </div>

                                    <div class="form-group required">
                                        <label class="sr-only" for="firstName"></label>
                                        <input name="data[Landlord][firstName]" placeholder="First Name" type="text" autocomplete="off" class="form-control" id="firstName" required>
                                    </div>

                                    <div class="form-group required">
                                        <label class="sr-only" for="lastName"></label>
                                        <input name="data[Landlord][lastName]" placeholder="Last Name"  type="text" autocomplete="off" class="form-control" id="lastName" required>
                                    </div>

                                    <div class="text-center">
                                        <button type="submit" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">REGISTER</button>
                                        <button type="button" class="btn btn-fullwidth btn-lg btn-black" data-dismiss="modal">CANCEL</button>
                                    </div>

                                    <p style="margin: 20px 0px 0px 0px;" id="signinform-message" class="text-danger"></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->