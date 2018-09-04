package com.letulet.membership;

import com.letulet.backend.model.User;
import com.letulet.backend.model.UserManager;
import com.letulet.utils.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by stephan on 09/11/17.
 */
public class AuthenticationFilter implements Filter {

    public static final String INDEX_PAGE       = "login.jsp";
    public static final String LETULET_LOGIN  = "letulet";

    public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
System.out.println(">>>>>>>>>>>>>>>> in --------- recoverProfileFromCookie");
		if(httpRequest.getSession().getAttribute(WebConstants.USER_KEY) == null) {
            // try to recover the session from cookie
            if(!recoverProfileFromCookie(httpRequest)) {
                request.setAttribute(WebConstants.REQUIRE_LOGIN, "t");
                request.getRequestDispatcher(INDEX_PAGE).forward(request, response);

                // set the target URL to redirect to after loging
                String referer = httpRequest.getHeader("referer");
System.out.println(">>>>>>>>>>>>>>>> REFERER: " + referer);
                if(Validator.isNotNull(referer)) {
                    httpRequest.getSession().setAttribute(WebConstants.REFERER_URL, referer);
                }

                return;
            }
        }
System.out.println(">>>>>>>>>>>>>>>> recoverProfileFromCookie WORKED !!");
        // pass the request/response on
		filterChain.doFilter(request, response);
	}


    public void init(FilterConfig filterConfig) throws ServletException {

	}

   // implement remember me
   private boolean recoverProfileFromCookie(HttpServletRequest httpServletRequest){

       String userHashedEmail = GetterUtil.getString(CookieUtil.get(httpServletRequest.getCookies(), LETULET_LOGIN));
System.out.println(">>>>>>>>>>>>>>>> recoverProfileFromCookie " + userHashedEmail);
       if (Validator.isNotNull(userHashedEmail)) {
			try {
                User user = UserManager.getInstance().getUserByHashedEmail(userHashedEmail);
                httpServletRequest.getSession().setAttribute(WebConstants.USER_KEY, user);
			    return true;
			} catch (Exception e) {
				Log.error(AuthenticationFilter.class, "Exception reading login cookie", e);
			}
		}
		return false;
	}
}

