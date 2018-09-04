<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.GetterUtil" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.utils.email.TemplateEngine" %>
<%@ page import="com.letulet.utils.StringUtil" %>
<%@ page import="com.letulet.core.Config" %>
<%@ page import="com.letulet.utils.email.SimpleMailer" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");

    String previouspage = request.getContextPath() + "/tenantwizard2.jsp";

    try {
        Tenant user =  (Tenant)request.getSession().getAttribute("user");

        String uid = request.getParameter("data[Property][uid]");

        if (Validator.isNull(uid)) {

            response.sendRedirect(previouspage + "?msg=auth");
            return;
        }

        Property property = PropertyManager.getInstance().getPropertyByUid(uid);

        if (property == null) {

            response.sendRedirect(previouspage + "?msg=auth");
            return;
        }

        String auid = request.getParameter("data[Agreement][uid]"); //COunter offer

        Agreement agreement = null;

        if (Validator.isNull(auid)) {

            agreement = AgreementManager.getInstance().getAgreementByUid(uid);
        } else {

            agreement = AgreementManager.getInstance().createAgreement(property);
        }

        int gross = GetterUtil.getInteger(request.getParameter("data[Financial][gross]"), 0);
        int landlordShare = GetterUtil.getInteger(request.getParameter("data[Landlord][share]"), 0);
        int tenantShare = GetterUtil.getInteger(request.getParameter("data[Tenant][share]"), 0);
        double cleaningFee = GetterUtil.getDouble(request.getParameter("data[Financial][cleaningFee]"), 0);

        agreement = AgreementManager.getInstance().createAgreement(property);
        agreement.setCleaningFeeAmount(cleaningFee);
        agreement.setProperty(property);
        agreement.setStatus(Agreement.Status.NEW);
        agreement.setLandlordCommissionRate(landlordShare);
        agreement.save();

        if ((Validator.isNull(auid))) {

            //Send email to landlord
            String emailBody = TemplateEngine.get("invitation_landlord.html", "en_US");
            emailBody = StringUtil.replace(
                    emailBody,
                    new String[] {"[$REVIEW_PROPOSAL_URL$]"},
                    new String[] {Config.get("base.url") + "landlord_contract_review.jsp?uid=" + agreement.getUID()});

            SimpleMailer.getInstance().spawnThreadAndSend(Config.getAsString("mailer.smtp.replyto") , "cedric.raudin@gmail.com",
                    "You received a counter offer!", emailBody, null);

            response.sendRedirect(request.getContextPath() + "/");
            return;
        }

        response.sendRedirect(request.getContextPath() + "/tenantwizard3.jsp?id=" + agreement.getID());

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
     }
%>