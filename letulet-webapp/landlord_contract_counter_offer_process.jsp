<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.utils.email.TemplateEngine" %>
<%@ page import="com.letulet.utils.StringUtil" %>
<%@ page import="com.letulet.core.Config" %>
<%@ page import="com.letulet.utils.email.SimpleMailer" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");

    String previouspage = request.getContextPath() + "/landlord_contract_counter_offer.jsp";

    try {
        Tenant user =  (Tenant)request.getSession().getAttribute("user");

        String uid = request.getParameter("data[Agreement][uid]");

        if (Validator.isNull(uid)) {

            response.sendRedirect(previouspage + "?msg=auth");
            return;
        }

        Agreement agreement = AgreementManager.getInstance().getAgreementByUid(uid);

        if (agreement == null) {

            response.sendRedirect(previouspage + "?msg=auth");
            return;
        }

        int gross = GetterUtil.getInteger(request.getParameter("data[Financial][gross]"), 0);
        int landlordShare = GetterUtil.getInteger(request.getParameter("data[Landlord][share]"), 0);
        int tenantShare = GetterUtil.getInteger(request.getParameter("data[Tenant][share]"), 0);
        double hostingCost = GetterUtil.getDouble(request.getParameter("data[Financial][hostingCost]"), 0);

        agreement.setLandlordCommissionRate(landlordShare);
        agreement.save();

        //Send email to Tenant
        String emailBody = TemplateEngine.get("counter_offer.html", "en_US");
        emailBody = StringUtil.replace(
                emailBody,
                new String[] {"[$COUNTER_OFFER_URL$]"},
                new String[] {Config.get("base.url") + "tenantwizard2.jsp?auid=" + agreement.getUID()});

        SimpleMailer.getInstance().spawnThreadAndSend(Config.getAsString("mailer.smtp.replyto") , "cedric.raudin@gmail.com",
                "Partner with your tenant and earn extra income!", emailBody, null);

        response.sendRedirect(request.getContextPath() + "/landlord_contract_counter_sent.jsp");

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
    }
%>