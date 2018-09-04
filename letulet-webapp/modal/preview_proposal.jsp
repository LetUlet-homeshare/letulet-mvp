<div id="previewproposalmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog  modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-offset-1 col-xs-10 text-center">

                        <% if (__jspName.equals("proposals.jsp")) { %>
                        <h2 class="modal-title">VIEW AGREEMENT</h2>
                        <p class="modal-description">Here is your full agreement</p>
                        <% } else { %>
                        <h2 class="modal-title">PREVIEW AGREEMENT</h2>
                        <p class="modal-description">Here is how the agreement looks like so far. Changes you make on the wizard will reflect the agreement</p>
                        <% } %>

                        <div class="row">
                            <div class="col-xs-12">
                                <form id="landlordreviewproposalform">

                                    <!--<input name="data[Agreement][uid]" type="hidden" value="<%//= agreement.getUID()%>">-->

                                    <div class="row">
                                        <div class="col-xs-12">
                                            <div class="text-left form-group required">
                                                <label class="label-xs sr-only" for="proposalReview"></label>
                                                <textarea name="data[Proposal][review]" rows="9" class="form-control" id="proposalReview" val-text-agreement required></textarea>
                                            </div>
                                        </div>

                                        <div class="col-xs-4 col-xs-offset-4 text-center">
                                            <button type="submit" class="btn btn-fullwidth btn-rounded btn-red" data-dismiss="modal">DONE</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->