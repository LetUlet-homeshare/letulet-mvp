<%@ page import="javax.servlet.http.Cookie" %><%@ page contentType="text/html;charset=UTF-8" language="java" %><%

    request.getSession().removeAttribute("user");
    request.getSession().invalidate();

    javax.servlet.http.Cookie cookie = getCookie(request, "letulet");

    if (cookie != null) {
        cookie.setMaxAge(0);    // should expire cookie now
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    response.sendRedirect(request.getContextPath() + "/static/index.jsp");
    return;

%><%!

    public static Cookie getCookie(HttpServletRequest request, String name) {

    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals(name)) {
                return cookies[i];
            }
        }
    }

    return null;
}
%>