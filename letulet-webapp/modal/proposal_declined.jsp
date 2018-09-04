<div id="proposaldeclinemodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-12 text-center">
                        <img width="100px" class="modal-logo" src="<%= request.getContextPath() %>/img/logo_red.svg"/>

                        <h2 class="modal-title">OFFER DECLINED</h2>

                        <p class="modal-description">We are sorry to see you declined your tenant’s offer to use letUlet.<br/>
                            Would you mind telling us why you decided to decline this proposal?</p>
                        <div class="row">
                            <div class="col-xs-12">
                                <form id="form-proposal-decline" onsubmit="return decline(this)">

                                    <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                                    <div class="row">
                                        <div class="col-xs-12">
                                            <div class="text-left form-group required">
                                                <label class="label-xs" for="decline"></label>
                                                <textarea name="data[Proposal][decline]" class="form-control" id="decline" placeholder="Write here your decline reasons. It means a lot to us." required></textarea>
                                            </div>
                                        </div>

                                        <div style="margin-top:40px" class="col-xs-offset-3 col-xs-6 text-center">
                                            <button type="submit" class="btn btn-fullwidth btn-lg btn-rounded btn-red" href="#">SUBMIT</button>
                                            <button type="button" class="btn btn-fullwidth btn-lg btn-black" data-dismiss="modal">CANCEL</button>
                                        </div>
                                    </div>

                                    <p style="margin: 20px 0px 0px 0px;" id="form-proposal-decline-message" class="text-danger"></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->