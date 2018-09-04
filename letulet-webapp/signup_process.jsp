<%@ page import="javax.mail.internet.AddressException" %><%@ page import="javax.mail.internet.InternetAddress" %><%@ page import="com.letulet.utils.CookieUtil" %><%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.WebConstants" %><%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");
    String previouspage = request.getContextPath() + "/signup.jsp";

    try {
        User user =  (User)request.getSession().getAttribute("user");

        if(user != null){
            response.sendRedirect(request.getContextPath() + "dashboard.jsp");
            return;
        } else {
            String email = request.getParameter("data[User][email]");
            String password = request.getParameter("data[User][password]");
            String password2 = request.getParameter("data[User][re_password]");
            String userType = request.getParameter("data[User][Type]");

            /*
                Check if email user already exist
             */
            User userInDb = UserManager.getInstance().getUserByEmail(email);
            if(userInDb != null) {
                response.sendRedirect(previouspage + "?user=exist");
                return;
            }

            /*
            Check password
             */
            if(password.length() < 6) {
                response.sendRedirect(previouspage + "?pass=failed");
                return;
            }

            if (password.equals(email) || password.equals("password")) {
                response.sendRedirect(previouspage + "?pass=security");
                return;
            }

            /*
            Check email
             */
            if(!isValidEmailAddress(email) || email.contains("yopmail.com") || email.contains("maildrop.cc") || email.contains("mailinator.com")) {
                response.sendRedirect(previouspage + "?email=incorrect");
                return;
            }


            if(email != null && password !=null && password2 != null && userType != null){

                user = TenantManager.getInstance().createTenant(email, password);

                /*
                if(userType.equalsIgnoreCase("1")) {
                    user = OwnerManager.getInstance().createOwner(email, password);
                } else if(userType.equalsIgnoreCase("2") || userType.equalsIgnoreCase("3")) {
                    user = AgencyManager.getInstance().createEmployee(email, password);
                }  else {
                    response.getWriter().write("No valid user type was provided");
                    return;
                }
                */

                request.getSession().setAttribute(WebConstants.USER_KEY, user);
                response.sendRedirect(request.getContextPath() + "/dashboard.jsp");

                /*
                if(userType.equalsIgnoreCase("1")) {
                    response.sendRedirect(request.getContextPath() + "/dashboard_owner.jsp");
                } else if(userType.equalsIgnoreCase("2") || userType.equalsIgnoreCase("3")) {
                    response.sendRedirect(request.getContextPath() + "/signup_agency.jsp?he=" + user.getHashedEmail());
                }*/

                return;

            } else {
                response.sendRedirect(previouspage + "?msg=auth");
            }
        }

    } catch (Exception e) {
        e.printStackTrace();
        response.sendRedirect(previouspage + "?msg=auth");
     }
%>

<%!
    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }
%>