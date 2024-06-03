package com.selenuimexpress.springevent.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
public class AsyncEventConfiguration {
	
	@Bean("applicationEventMulticaster")
	public SimpleApplicationEventMulticaster makeEventsAsync() {
		SimpleApplicationEventMulticaster applicationEventMulticaster = new SimpleApplicationEventMulticaster();
		applicationEventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
		return applicationEventMulticaster;
	}

}
