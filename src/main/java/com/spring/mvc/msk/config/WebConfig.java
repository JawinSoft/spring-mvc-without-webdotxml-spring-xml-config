package com.spring.mvc.msk.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class WebConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
       
    	//Case 1
    	XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");
        
         ServletRegistration.Dynamic registration1 = container.addServlet("dispatcher", new DispatcherServlet(appContext));
        registration1.setLoadOnStartup(1);
        registration1.addMapping("*.in");
        
        
    }
}