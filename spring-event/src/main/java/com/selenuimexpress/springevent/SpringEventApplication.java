package com.selenuimexpress.springevent;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.selenuimexpress.springevent.publisher.ZeeCafePublisher;

@SpringBootApplication
@ComponentScan("com")
public class SpringEventApplication {

	/** 
	 * @author Aishwarya
	 * 
	 */

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringEventApplication.class, args);
		context.start();

//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		ZeeCafePublisher bean = context.getBean("zeeCafePublisher", ZeeCafePublisher.class);

		ZeeCafePublisher bean = context.getBean("zeeCafePublisher", ZeeCafePublisher.class);

		bean.streamingTheBigBangTheory("Ep-No 004");

		bean.streamingComedyCircus("Ep-No 007");

		context.stop();
		// context.close();
	}

}
