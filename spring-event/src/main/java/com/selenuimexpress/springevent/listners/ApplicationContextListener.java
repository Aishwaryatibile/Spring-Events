package com.selenuimexpress.springevent.listners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//This event we have created to listen the application context(container) event when context is initialized or refreshed
@Component
public class ApplicationContextListener  {
	
	private final Logger logger =  LoggerFactory.getLogger(ApplicationContextListener.class);

	@EventListener
	public void onContextRefreshedEvent(ContextRefreshedEvent event) {
		System.out.println("Application initialized or refreshed");
		System.out.println(event);
	}
	
	@EventListener
	public void onContextStartEvent(ContextStartedEvent event) {
		System.out.println("Application initialized with start()");
		System.out.println(event);
	}
	
	@EventListener
	public void onContextStopEvent(ContextStoppedEvent event) {
		System.out.println("Application stopped with stop()");
		System.out.println(event);
		System.out.println(event.getTimestamp());
		
	}
	
	@EventListener
	public void onContextCloseEvent(ContextClosedEvent event) {
		System.out.println("Application closed with close()");
		System.out.println(event);
	}

}
