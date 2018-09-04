package com.letulet.utils.email;


import com.letulet.utils.Log;
import com.letulet.utils.StringUtil;
import com.letulet.utils.Validator;

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;

/* Created by stephan on 10/11/17.
 * A email templates engine, allowing to work on HTML templates
 * sent via email, without code modifications. Knows how to handle templates
 * based on current user locale.
 *
 */
public class TemplateEngine {

    private static TemplateEngine _instance;

    private Map _contentPool;

    private static final String TEMPLATES_DIR   = "templates/";
    private static final String DEFAULT_LOCALE  = "en_US";

    public static String get(String templateName, String locale) {

        if(Validator.isNull(templateName))
            throw new RuntimeException("template name can't be null");

         if(Validator.isNull(locale))
            locale = DEFAULT_LOCALE;

        return _getInstance()._get(templateName, locale);
    }

    private static TemplateEngine _getInstance() {

        if (_instance == null) {
            synchronized (TemplateEngine.class) {
                if (_instance == null) {
                    _instance = new TemplateEngine();
                }
            }
        }

        return _instance;
    }

    private TemplateEngine() {
        _contentPool = new HashMap();
    }

    private String _get(String templateName, String locale) {

        String location = _getLocation(templateName, locale);
        String content = (String)_contentPool.get(location);

        if (content == null) {
            try {
                content = StringUtil.read(getClass().getClassLoader(), location);

                _put(location, content);
            }
            catch (IOException ioe) {
                Log.error(this.getClass(), StringUtil.stackTrace(ioe));
            }
        }

        return content;
    }

    private String _getLocation(String templateName, String locale) {
        return TEMPLATES_DIR + locale + "/" + templateName;
    }

    private void _put(String location, String content) {
        _contentPool.put(location, content);
    }

}
