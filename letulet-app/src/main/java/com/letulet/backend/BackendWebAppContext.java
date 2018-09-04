package com.letulet.backend;

import com.letulet.backend.db.Initializer;
import com.letulet.utils.Log;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by stephan on 10/11/17.
 * Listens to application events. Used to initialize or shutdown the back-end components.
 *
 */
public class BackendWebAppContext implements ServletContextListener {



	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	public void contextInitialized (ServletContextEvent event) {

		Log.info(this.getClass(), "LetULet - Backend Context initialized 3: " + event.getServletContext().getServletContextName() + ", path: "
                + event.getServletContext().getContextPath());

        Initializer.init();


    }

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	public void contextDestroyed (ServletContextEvent event) {

		Log.info(this.getClass(), "LetULet - Backend context destroyed: " + event.getServletContext ().getServletContextName ());

	}
}
