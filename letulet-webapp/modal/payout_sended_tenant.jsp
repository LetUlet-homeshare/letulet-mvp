<div id="payoutsendedtenantmodal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <div class="row">

                    <div class="col-xs-offset-1 col-xs-10 text-center">
                        <img width="100px" class="modal-logo" src="<%= request.getContextPath() %>/img/logo_red.svg"/>

                        <h2 class="modal-title">CONGRATULATIONS</h2>

                        <p class="modal-description">Your <b>counter offer</b> is now on its way! Please keep an eye out for our status emails!</p>

                        <div class="row">
                            <div class="col-xs-offset-2 col-xs-8">
                                <div class="row">
                                    <div style="margin-top:40px" class="col-xs-offset-2 col-xs-8 text-center">
                                        <button onclick="goToDashboard()" type="button" class="btn btn-fullwidth btn-lg btn-rounded btn-red"  href="#">GREAT</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->