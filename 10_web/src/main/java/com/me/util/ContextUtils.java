package com.me.util;

import com.me.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

public class ContextUtils {

    private static AnnotationConfigApplicationContext context;
    static {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    public static WebApplicationContext getXmlContext(ServletContext sc) {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
    }

    public static AnnotationConfigApplicationContext getAnnotationContext() {
        return context;
    }

}
