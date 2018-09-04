<%@ page import="com.letulet.backend.model.*" %><%@ page import="com.letulet.utils.WebConstants" %>
<%@ page import="org.apache.commons.fileupload.FileItem" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="java.util.List" %>
<%@ page import="com.letulet.core.Config" %>
<%@ page import="java.io.*" %>
<%@ page import="org.apache.commons.fileupload.FileUploadException" %>
<%@ page import="com.letulet.utils.Validator" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %><%

    request.setCharacterEncoding("UTF-8");
    String loginPage = request.getContextPath() + "/settings.jsp";
    String url = null;

    try {
        User user =  (User)request.getSession().getAttribute("user");
        Tenant tenant = null;
        Landlord landlord = null;

        //File
        try {

            List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
            String photoDir = Config.getAsString("photo.dir");
            String photoURL = Config.getAsString("photo.url");

            for (FileItem item : items) {

                if (item.getFieldName().equals("data[User][firstName]")) {

                    String firstName = item.getString();

                    if (user instanceof Landlord) {

                        landlord =  (Landlord)user;

                        landlord.setFirstName(firstName);
                        landlord.save();
                    }

                    if (user instanceof Tenant) {

                        tenant =  (Tenant)user;

                        tenant.setFirstName(firstName);
                        tenant.save();
                    }
                }

                if (item.getFieldName().equals("data[User][lastName]")) {

                    String lastName = item.getString();

                    if (user instanceof Landlord) {

                        landlord =  (Landlord)user;

                        landlord.setLastName(lastName);
                        landlord.save();
                    }

                    if (user instanceof Tenant) {

                        tenant =  (Tenant)user;

                        tenant.setLastName(lastName);
                        tenant.save();
                    }
                }

                if (item.getFieldName().equals("file") && Validator.isNotNull(item.getName())) {

                    url = null;
                    String path = null;

                    String filename = item.getName();

                    String[] parts = filename.split("\\.");
                    String extension = parts[parts.length - 1];

                    //Replace the filename by a uuid
                    filename = java.util.UUID.randomUUID().toString();
                    filename = filename + "." + extension;
                    path = photoDir + filename;

                    //Download the file to Orbirental
                    InputStream content = item.getInputStream();

                    FileOutputStream fout = new FileOutputStream(path);
                    BufferedOutputStream bout = new BufferedOutputStream(fout);
                    BufferedInputStream bin = new BufferedInputStream(content);
                    byte buf[] = new byte[2048];
                    while ((bin.read(buf)) != -1) {
                        bout.write(buf);
                    }
                    bout.close();
                    bin.close();

                    url = photoURL + filename;

                    if (user instanceof Landlord) {

                        landlord.setPictureURL(url);
                        landlord.save();
                    }

                    if (user instanceof Tenant) {

                        tenant.setPictureURL(url);
                        tenant.save();
                    }
                }
            }
        } catch (FileUploadException e) {

            e.printStackTrace();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    response.sendRedirect(loginPage);
%>
