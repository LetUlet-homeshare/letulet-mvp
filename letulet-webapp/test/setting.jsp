<%@ page import="com.letulet.backend.model.Setting" %>
<%@ page import="com.letulet.backend.db.SettingManager" %>
<%@ page import="com.letulet.backend.model.User" %><%

    User user =  (User)request.getSession().getAttribute("user");

    Setting settings = SettingManager.getInstance().getSetting(user);

    if (settings == null) {

        settings = SettingManager.getInstance().createSetting(user);
    }
%><%= user.getID()%>