<%
    String uri = request.getRequestURI();
    String pageName = uri.substring(uri.lastIndexOf("/")+1);
%><nav class="navbar navbar-letulet">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<%= request.getContextPath()%>/static/index.jsp">
                <img class="logo" src="<%= request.getContextPath() %>/img/logo.png" alt="letulet"/>
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li class="<%=pageName.contains("missions.jsp") ? "active" : ""%>"><a href="<%= request.getContextPath() %>/static/missions.jsp">Our mission</a></li>
                <li class="<%=pageName.contains("tenant.jsp") ? "active" : ""%>"><a href="<%= request.getContextPath() %>/static/tenant.jsp">Tenants</a></li>
                <li class="<%=pageName.contains("landlord.jsp") ? "active" : ""%>"><a href="<%= request.getContextPath() %>/static/landlord.jsp">Landlords</a></li>
                <li class="nohover">
                    <button onclick="$('#loginmodal').modal('show');" type="button" class="btn btn-rounded btn-green navbar-btn">LOGIN</button>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div>
</nav>