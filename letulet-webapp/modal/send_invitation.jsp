<div id="sendinvitationmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-offset-1 col-xs-10 text-center">
                        <img width="100px" class="modal-logo" src="<%= request.getContextPath() %>/img/logo_red.svg"/>

                        <h2 class="modal-title">SEND INVITATION</h2>

                        <p class="modal-description">Congratulations! Your proposal is now ready to be sent. We will let you know once the email has been delivered.</p>

                        <div class="row">
                            <div class="col-xs-offset-2 col-xs-8">
                                <form id="form4" onsubmit="return sendInvitation(this)">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="text-left form-group required">
                                                <label class="label-xs" for="landlordEmail1">Landlord Email</label>
                                                <input name="data[Landlord][email]" type="email" autocomplete="off" class="form-control" id="landlordEmail1" required>
                                            </div>
                                        </div>

                                        <div class="col-xs-6">
                                            <div class="text-left form-group required">
                                                <label class="label-xs" for="landlordEmail2">Confirm Email</label>
                                                <input name="data[Landlord][re_email]" type="email" autocomplete="off" class="form-control" id="landlordEmail2" required>
                                            </div>
                                        </div>

                                        <div style="margin-top:40px" class="col-xs-offset-3 col-xs-6 text-center">
                                            <button type="submit" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">SEND</button>
                                            <button type="button" class="btn btn-fullwidth btn-lg btn-black" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>

                                    <p style="    margin: 20px 0px 0px 0px;" id="form4-message" class="text-danger"></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->