<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.GetterUtil" %><%@ page import="com.letulet.utils.email.TemplateEngine" %><%@ page import="com.letulet.utils.StringUtil" %><%@ page import="com.letulet.utils.email.SimpleMailer" %><%@ page import="com.letulet.core.Config" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");

    String previouspage = request.getContextPath() + "/tenantwizard3.jsp";

    try {
        Tenant user =  (Tenant)request.getSession().getAttribute("user");

        String notes = request.getParameter("data[Tenant][notes]");
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

        agreement.setPersonalContent(notes);
        agreement.save();

        //Send email to landlord
        String emailBody = TemplateEngine.get("invitation_landlord.html", "en_US");
        emailBody = StringUtil.replace(
                emailBody,
                new String[] {"[$REVIEW_PROPOSAL_URL$]"},
                new String[] {Config.get("base.url") + "landlord_contract_review.jsp?uid=" + agreement.getUID()});

        SimpleMailer.getInstance().spawnThreadAndSend(Config.getAsString("mailer.smtp.replyto") , "cedric.raudin@gmail.com",
                "Partner with your tenant and earn extra income!", emailBody, null);

            response.sendRedirect(request.getContextPath() + "/tenantwizard4.jsp");

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
     }
%>