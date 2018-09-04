package com.letulet.backend.channel.airbnb.api.rest;


import com.letulet.utils.Log;
import com.letulet.utils.StringPool;
import com.letulet.utils.Validator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookingServlet extends HttpServlet {

    private static final long serialVersionUID = 13L;

    public void init() throws ServletException {
        super.init();
    }

    private static final String JSP_PATH            = "/channels/airbnb/booking/";
    public static final String CONFIRMATION_CODE    = "CONFIRMATION_CODE";

    public static final String SUCCESS = "{ \"succeed\" : true }";
    public static final String FAILURE = "{ \"succeed\" : false, \"failure_code\": null }";

    protected void service(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {

        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE");
        super.service(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher(JSP_PATH + "booking_get.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
         req.getRequestDispatcher(JSP_PATH + "booking_post.jsp").forward(req, resp);
    }

    // http://stackoverflow.com/questions/23886941/http-status-405-jsps-only-permit-get-post-or-head
    // problem was fixed by putting isErrorPage="true" into the PUT and DELETE JSP directives
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String confirmationCode = getConfirmationCode(req.getPathInfo());
        Log.info(BookingServlet.class, "ConfirmationCode = " + confirmationCode);
        if(Validator.isNotNull(confirmationCode)) {
            req.setAttribute(CONFIRMATION_CODE, confirmationCode);
        }

        req.getRequestDispatcher(JSP_PATH + "booking_put.jsp").forward(req, resp);

    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String confirmationCode = getConfirmationCode(req.getPathInfo());
        Log.info(BookingServlet.class, "ConfirmationCode = " + confirmationCode);
        if(Validator.isNotNull(confirmationCode)) {
            req.setAttribute(CONFIRMATION_CODE, confirmationCode);
        }

        req.getRequestDispatcher(JSP_PATH + "booking_delete.jsp").forward(req, resp);
     }


    public String getConfirmationCode(String path) {

        String confirmationCode = path.substring(path.lastIndexOf(StringPool.FORWARD_SLASH) + 1, path.length());
System.out.println(">>> conf code PATH = " + confirmationCode);
        if(Validator.isNotNull(confirmationCode)) {
            return confirmationCode;
        }

        return null;
    }

}
