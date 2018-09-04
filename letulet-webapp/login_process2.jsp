<%@ page import="java.util.Date" %><%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.WebConstants" %><%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");
    String loginPage = request.getContextPath() + "/login.jsp";

    try {
        User user =  (User)request.getSession().getAttribute("user");


        if(user != null){
            response.sendRedirect(request.getContextPath() + "/dashboard.jsp");
            return;
        } else {
            String username = request.getParameter("data[User][email]");
            String password = request.getParameter("data[User][password]");
            if(username != null){
                user = UserManager.getInstance().getUserByEmail(username);

                if(user != null && UserManager.getInstance().authenticate(user, password)) {       // user logging in

                    request.getSession().setAttribute(WebConstants.USER_KEY, user);
                    user.setLastLogin(new Date());
                    user.setIsActive(true);
                    user.save();

                    String[] rememberMe = request.getParameterValues("data[User][rememberMe]");
            		if(rememberMe != null && rememberMe[0].equals("true")) {

                        //Cookie loginCookie = new Cookie("crosspollinate", String.valueOf(user.getID()));
                        Cookie loginCookie = new Cookie("letulet", String.valueOf(user.getHashedEmail()));
                        loginCookie.setPath("/");
                        loginCookie.setMaxAge(31536000);
                        response.addCookie(loginCookie);
                    }

                    response.sendRedirect(request.getContextPath()  + "/dashboard.jsp");

                } else {
                    response.sendRedirect(loginPage + "?msg=auth");
                    return;
                }
            } else {
                response.getWriter().write("Please provide an email and password.");
                return;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
