<%@ page import="org.json.*" %>
<%@ page import="com.letulet.core.Config" %>
<%@ page import="com.letulet.utils.email.SimpleMailer" %>
<%@ page import="com.letulet.utils.Log" %>
<%@ page import="com.letulet.backend.model.PropertyManager" %><%
    JSONObject jsn = new JSONObject();

    String email = request.getParameter("email");
    String to = "mark@letulet.com";
    String cc = "admin@letulet.com";

    try {

        Log.info(PropertyManager.class, "New email: " + email);

        String body = "A User wants to know more: " + email;

        SimpleMailer.getInstance().spawnThreadAndSend(Config.getAsString("mailer.smtp.replyto"), "LetULet", to,
                "New email received", body, cc, null, Config.getAsString("mailer.smtp.replyto"));
    } catch (Exception e) {
        e.printStackTrace();
    }
%><%= jsn.toString() %>