<div id="landlorlsetpasswordmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-offset-1 col-xs-10 text-center">
                        <img width="100px" class="modal-logo" src="<%= request.getContextPath() %>/img/logo_red.svg"/>

                        <h2 class="modal-title">SET A PASSWORD</h2>

                        <p class="modal-description">Please set a password to explore Letulet further</p>

                            <div class="row">
                            <div class="col-xs-12">
                                <form id="landlorlsetpasswordform" onsubmit="return setLandlordPassword(this)">

                                    <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="text-left form-group required">
                                                <label class="label-xs" for="landlordPassword1">Password</label>
                                                <input name="data[Landlord][password]" type="password" autocomplete="off" class="form-control" id="landlordPassword1" required>
                                            </div>
                                        </div>

                                        <div class="col-xs-6">
                                            <div class="text-left form-group required">
                                                <label class="label-xs" for="landlordPassword2">Confirm password</label>
                                                <input name="data[Landlord][re_password]" type="password" autocomplete="off" class="form-control" id="landlordPassword2" required>
                                            </div>
                                        </div>

                                        <div style="margin-top:40px" class="col-xs-offset-2 col-xs-8 text-center">
                                            <button type="submit" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">REGISTER</button>
                                            <button type="button" class="btn btn-fullwidth btn-lg btn-black" data-dismiss="modal">CANCEL</button>
                                        </div>
                                    </div>

                                    <p style="margin: 20px 0px 0px 0px;" id="landlorlsetpasswordform-message" class="text-danger"></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->