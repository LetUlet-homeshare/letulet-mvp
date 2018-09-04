<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.GetterUtil" %><%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");

    String previouspage = request.getContextPath() + "/tenantwizard1.jsp";

    try {
        Tenant user =  (Tenant)request.getSession().getAttribute("user");

        String email = request.getParameter("data[Landloard][email]");
        String firstname = request.getParameter("data[Landloard][firstname]");
        String lastname = request.getParameter("data[Landloard][lastname]");

        String address = request.getParameter("data[Wizard][address]");
        String address2 = request.getParameter("data[Wizard][address2]");
        String zipcode = request.getParameter("data[Wizard][zipcode]");
        String city = request.getParameter("data[Wizard][city]");
        String state = request.getParameter("data[Wizard][state]");
        int bedrooms = GetterUtil.getInteger(request.getParameter("data[Wizard][bedrooms]"), 0);
        int bathrooms = GetterUtil.getInteger(request.getParameter("data[Wizard][bathrooms]"), 0);

        Landlord landlord = LandlordManager.getInstance().createLandlord(email, "");
        landlord.setFirstName(firstname);
        landlord.setLastName(lastname);
        landlord.save();

        Property property = PropertyManager.getInstance().createProperty();
        property.setAddress1(address);
        property.setAddress2(address2);
        property.setZipCode(zipcode);
        property.setCity(city);
        property.setState(state);
        property.setTenant(user);
        property.setLandlord(landlord);
        property.setBedrooms(bedrooms);
        property.setBathrooms(bathrooms);
        property.save();

        response.sendRedirect(request.getContextPath() + "/tenantwizard2.jsp?uid=" + property.getUID());

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
     }
%>