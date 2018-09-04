<%@ page import="java.util.Date" %><%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page import="com.letulet.backend.db.SettingManager" %>
<%@ page contentType="text/json; charset=UTF-8" pageEncoding="utf-8" %><%
    request.setCharacterEncoding("UTF-8");

    JSONObject json = new JSONObject();

    try {
        User user =  (User)request.getSession().getAttribute("user");

        if(user != null){

            json.put("status", "success");
            %><%= json.toString() %><%
            return;
        }

        String username = request.getParameter("data[User][email]");
        String password = request.getParameter("data[User][password]");

        if (Validator.isNull(username) || Validator.isNull(username)) {

            json.put("message", "Invalid data.");
            json.put("status", "error");
%><%= json.toString() %><%
            return;
        }

        user = UserManager.getInstance().getUserByEmail(username);

        if(user != null && UserManager.getInstance().authenticate(user, password)) {       // user logging in

            request.getSession().setAttribute(WebConstants.USER_KEY, user);
            user.setLastLogin(new Date());
            user.setIsActive(true);
            user.save();

            Setting setting = SettingManager.getInstance().getSetting(user);

            if (setting != null) {

                if (setting.getStayLoggedIn()) {

                    Cookie loginCookie = new Cookie("letulet", String.valueOf(user.getHashedEmail()));
                    loginCookie.setPath("/");
                    loginCookie.setMaxAge(31536000);
                    response.addCookie(loginCookie);
                }
            }
        } else {

            json.put("message", "Invalid user.");
            json.put("status", "error");
%><%= json.toString() %><%
            return;
        }
    } catch (Exception e) {

        json.put("message", "An error occured.");
        json.put("status", "error");
    }
%><%= json.toString() %>
