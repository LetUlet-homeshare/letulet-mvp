<%@ page import="com.letulet.utils.email.SimpleMailer" %>
<%@ page import="com.letulet.core.Config" %><%

    SimpleMailer.getInstance().spawnThreadAndSend(Config.getAsString("mailer.smtp.replyto") , "cedric.raudin@gmail.com",
            "Partner with your tenant and earn extra income!", "body", null);
%>