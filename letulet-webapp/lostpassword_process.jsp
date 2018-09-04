<%@ page import="com.letulet.backend.model.User" %><%@ page import="com.orbirental.utils.PasswordGenerator" %><%@ page import="com.letulet.backend.model.UserManager" %><%@ page import="com.letulet.utils.HashPasswordUtil" %><%@ page import="com.letulet.utils.email.TemplateEngine" %><%@ page import="com.letulet.utils.StringUtil" %><%@ page import="com.letulet.utils.email.SimpleMailer" %><%@ page import="com.letulet.core.Config" %><%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

   String previouspage = request.getContextPath() + "/lostpassword.jsp";
    String loginpage = request.getContextPath() + "/login.jsp";

    try {
        String email = request.getParameter("data[User][email]");

        if(email != null){

            User user = UserManager.getInstance().getUserByEmail(email);
            if(user != null) {
                String newPassword = PasswordGenerator.getPassword(8);
                user.setHashedPassword(HashPasswordUtil.hash(newPassword));
                user.save();

                String emailBody = TemplateEngine.get(TEMPLATE_LOST_PASSWORD, "en_US");
                emailBody = StringUtil.replace(
                        emailBody,
                        new String[]{"[$PASSWORD$]"},
                        new String[]{newPassword});

                SimpleMailer.getInstance().spawnThreadAndSend(Config.getAsString("mailer.smtp.replyto") , email,
                                    "Orbirental Password Assistance", emailBody, null);

                response.sendRedirect(loginpage + "?msg=2");
                return;
            } else {
                response.sendRedirect(previouspage + "?msg=1");
                return;
            }
        } else {
            response.getWriter().print("No email provided");
            return;
        }

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
        return;
     }
 %><%!
    final static String TEMPLATE_LOST_PASSWORD = "lost_password.html";
 %>