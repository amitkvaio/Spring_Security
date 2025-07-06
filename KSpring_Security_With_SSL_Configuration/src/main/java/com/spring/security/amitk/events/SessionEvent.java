package com.spring.security.amitk.events;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionEvent implements HttpSessionListener {

	private static final Logger logger = LoggerFactory.getLogger(SessionEvent.class);
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		logger.info("**********🛑 Session destroyed: {}*****************", se.getSession().getId());
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		 logger.info("**************** ✅ Session created: {}******************", se.getSession().getId());
	}
}
