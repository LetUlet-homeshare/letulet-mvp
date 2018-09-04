<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.model.Agreement" %>
<%@ page import="com.letulet.backend.model.AgreementManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");

    String previouspage = request.getContextPath() + "/landlord_contract_review.jsp";


    try {

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

        String _informme = request.getParameter("data[Landlord][informme]");
        String _onlyvip = request.getParameter("data[Landlord][onlyvip]");
        String _nopets = request.getParameter("data[Landlord][nopets]");
        String customcompliance = request.getParameter("data[Landlord][customcompliance]");
        String _cleanyourself = request.getParameter("data[Landlord][cleanyourself]");
        String _lockdoor = request.getParameter("data[Landlord][lockdoor]");
        String _nosmoking = request.getParameter("data[Landlord][nosmoking]");
        String customrules = request.getParameter("data[Landlord][customrules]");
        String insuredname = request.getParameter("data[Landlord][insuredname]");

        boolean informeme = Validator.isNotNull(_informme) && _informme.equals("on");
        boolean onlyvip = Validator.isNotNull(_onlyvip) && _informme.equals("on");
        boolean nopets = Validator.isNotNull(_nopets) && _informme.equals("on");
        boolean cleanyourself = Validator.isNotNull(_cleanyourself) && _informme.equals("on");
        boolean lockdoor = Validator.isNotNull(_lockdoor) && _informme.equals("on");
        boolean nosmoking = Validator.isNotNull(_nosmoking) && _informme.equals("on");

        agreement.setStatus(Agreement.Status.ACCEPTED);
        agreement.save();

        response.sendRedirect(request.getContextPath() + "/landlord_contract_accepted.jsp");

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
    }
%>