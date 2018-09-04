<%@ page import="com.letulet.backend.model.User" %><%@ page import="com.letulet.backend.model.UserManager" %><%@ page import="com.letulet.utils.HashPasswordUtil" %><%@ page import="com.letulet.utils.email.TemplateEngine" %><%@ page import="com.letulet.utils.StringUtil" %><%@ page import="com.letulet.utils.email.SimpleMailer" %><%@ page import="com.letulet.core.Config" %><%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    try {

            User user = UserManager.getInstance().getUserByEmail("tenant@gmail.com");
            if(user != null) {
                user.setHashedPassword(HashPasswordUtil.hash("letulet"));
                user.save();
            } else {
                return;
            }
    } catch (Exception e) {
        e.printStackTrace();
        return;
    }
%>