<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.Agreement" %>
<%@ page import="com.letulet.backend.model.AgreementManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");

    String previouspage = request.getContextPath() + "/landlord_contract_declined.jsp";

    try {

        String declinedreason = request.getParameter("data[Landlord][declinedreason]");
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

        agreement.setPersonalContent(declinedreason);
        agreement.save();

        response.sendRedirect(request.getContextPath() + "/");

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
    }
%>