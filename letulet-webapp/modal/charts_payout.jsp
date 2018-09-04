<div id="chartspayoutmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">
                    <div class="col-xs-12">
                        <h2 class="modal-title">COUNTER OFFER</h2>

                        <p class="modal-description">Use our widget below to create your counter offer. The proposed break-down is what most tenants are comfortable with to accept in rental agreement.<br/>Mark Henderson, 5212 Steiner St. #110, San Francisco, is offering to share 20% Airbnb revenue with you. If you wish to change your share's percentage, use calculator below to propose accepted payout.</p>

                        <form id="form-payout" class="form-inline form-payout">

                            <input name="data[Agreement][uid]" type="hidden" value="<%= agreement.getUID()%>">

                            <div class="form-group">
                                <span>Financial breakdown based on</span>
                                <input data-proposal-payout type="number" name="data[Proposal][payout]" class="form-control" id="payout" value="1000" required>
                                <span>gross payout (not including cleaning fee)</span>
                            </div>

                            <div class="row" style="display: flex;align-items: center;">
                                <div class="col-xs-5">
                                    <div id="chart-payout"></div>
                                </div>
                                <div class="col-xs-offset-1 col-xs-6">

                                    <table class="info-payout">
                                        <tr>
                                            <th>Your Share</th>
                                            <th class="text-right">Tenant's Share</th>
                                        </tr>
                                        <tr>
                                            <td data-proposal-landlord-amount></td>
                                            <td data-proposal-tenant-amount class="text-right"></td>
                                        </tr>
                                    </table>

                                    <div class="slider-wrap slider-invert form-group">
                                        <input type="text" name="data[Proposal][landlord]" class="form-control" data-proposal-landlord-percentage readonly>
                                        <input type="text" id="slider-payout" class="slider" value="" data-slider-min="0" data-slider-max="100" data-slider-step="1" data-slider-value="20" data-slider-id="slider-payout" data-slider-tooltip="hide" data-slider-handle="round" />
                                        <input type="text" name="data[Proposal][tenant]" class="form-control" data-proposal-tenant-percentage readonly>
                                    </div>

                                    <div class="row">
                                        <div class="col-xs-8">
                                            <p class="text-sm">Cleaning fee is not shared with your landlord and is not included in the calculation.</p>
                                            <p class="text-sm nomargin">3% LetULet fee is $<span data-proposal-landlord-fee-amount></span></p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="text-right">
                                <div style="margin-top:40px" class="btn-group">
                                    <button type="button" style="width:140px" class="btn btn-lg btn-black" data-dismiss="modal">CANCEL</button>
                                    <button type="submit" style="width:140px" class="btn btn-lg btn-rounded btn-red" href="#">SEND</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div id="content-chartspayoutmodal-popover" style="display: none">
    <div>
        <h2 class="red">WAIT</h2>

        <p>
            We have found that 25% or less will increase the chance of tenant participation
        </p>
    </div>
</div>