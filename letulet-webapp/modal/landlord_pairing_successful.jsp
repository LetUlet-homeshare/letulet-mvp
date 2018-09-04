<div id="pairingsuccessfulmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-12 text-center">
                        <img width="100px" class="modal-logo" src="<%= request.getContextPath() %>/img/logo_red.svg"/>

                        <h2 class="modal-title">PAIRING SUCCESSFUL</h2>

                        <p class="modal-description">Congratultations! Your partnership with <%= TenantManager.getInstance().showBestProfile(agreement.getProperty().getTenant())%> is now active. We have sent your partnership acceptance letter to the tenant. From now on, you will receive <%=agreement.getLandlordCommissionRate() %>% earnings from your tenants net revenue.</p>

                        <div class="row">
                            <div class="col-xs-offset-2 col-xs-8">
                                <button onclick="goToDashboard()" type="button" class="btn btn-fullwidth btn-lg btn-red" data-dismiss="modal">PROCEED TO DASHBOARD</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->