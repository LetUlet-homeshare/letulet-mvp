<div id="landlordreviewproposalmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog  modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-12 text-center">
                        <h2 class="modal-title">ONE CLICK AWAY</h2>

                        <p class="modal-description">Great! You are just one click away from earning extra revenue on this property. Please review and sign the lease addendum that we prepared for you and your tenant, and we will take care of the rest!</p>

                            <div class="row">
                            <div class="col-xs-12">
                                <form id="landlordreviewproposalform" onsubmit="return reviewProposal(this)">

                                    <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                                    <div class="row">
                                        <div class="col-xs-12">
                                            <div class="text-left form-group required">
                                                <label class="label-xs sr-only" for="proposalReview"></label>
                                                <textarea name="data[Proposal][review]" rows="9" class="form-control" id="proposalReview" required val-text-agreement></textarea>
                                            </div>
                                        </div>

                                        <br/>

                                        <div class="col-xs-7">
                                            <div class="text-left form-group required">
                                                <label class="label-xs sr-only" for="landlordSignature"></label>
                                                <input name="data[Landlord][signature]" type="text" autocomplete="off" placeholder="Type your full name here" class="form-control" id="landlordSignature" required>
                                            </div>
                                        </div>

                                        <div class="col-xs-5">
                                            <div class="text-left form-group required">
                                                <label class="label-xs sr-only" for="landlordSignatureDate"></label>
                                                <input name="data[Landlord][signatureDate]" type="text" autocomplete="off" placeholder="Type your full name here" class="form-control" id="landlordSignatureDate" required>
                                            </div>
                                        </div>
                                    </div>

                                    <div style="display: flex;justify-content: center;" class="row">
                                        <div class="col-xs-5 text-center">
                                            <button type="submit" class="btn btn-lg btn-rounded btn-green" href="#">SIGN THE LEAD ADDENDUM</button>
                                        </div>
                                    </div>

                                    <p style="margin: 20px 0px 0px 0px;" id="landlordreviewproposalmodal-message" class="text-danger"></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->