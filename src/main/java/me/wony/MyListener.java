package me.wony;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context init");
		sce.getServletContext().setAttribute("name", "sungwon");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
