<div class="left-side letulet-menu">

    <div class="letulet-icon">
        <img src="<%= request.getContextPath() %>/img/icons/letulet-symbol.svg" class="letulet-symbol"/>
        <img src="<%= request.getContextPath() %>/img/icons/letulet-text.svg" class="letulet-text"/>
    </div>

    <div class="menu">
        <ul>
            <li>
                <% if (user instanceof Tenant) { %>
                <a id="proposals" class="menu-link" href="<%= request.getContextPath() %>/proposals.jsp">
                    <img class="icon" src="<%= request.getContextPath() %>/img/icons/proposal.svg">AGREEMENTS
                </a>
                <% } else if (user instanceof Landlord) { %>
                <a id="proposals" class="menu-link" href="<%= request.getContextPath() %>/proposals_landlord.jsp">
                    <img class="icon" src="<%= request.getContextPath() %>/img/icons/proposal.svg">AGREEMENTS
                </a>
                <% } %>
            </li>
            <li>
                <a id="dashboard" class="menu-link" href="<%= request.getContextPath() %>/dashboard.jsp">
                    <img class="icon" src="<%= request.getContextPath() %>/img/icons/dashboard.svg">DASHBOARD
                </a>
            </li>
            <li>
                <% if (user instanceof Tenant) { %>
                <a id="banks" class="menu-link" href="<%= request.getContextPath() %>/banks_tenant.jsp">
                    <img class="icon" src="<%= request.getContextPath() %>/img/icons/bank.svg">BANK INFO
                </a>
                <% } else if (user instanceof Landlord) { %>
                <a id="banks" class="menu-link" href="<%= request.getContextPath() %>/banks_landlord.jsp">
                    <img class="icon" src="<%= request.getContextPath() %>/img/icons/bank.svg">BANK INFO
                </a>
                <% } %>
            </li>
            <li>
                <a id="settings" class="menu-link" href="<%= request.getContextPath() %>/settings.jsp">
                    <img class="icon" src="<%= request.getContextPath() %>/img/icons/settings.svg">SETTINGS
                </a>
            </li>
        </ul>
    </div>

    <div class="footer">
        <p>2017 LetULet, Inc.<br/>&copy; All rights reserved</p>
    </div>
</div>