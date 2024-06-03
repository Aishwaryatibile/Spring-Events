package com.selenuimexpress.springevent.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.selenuimexpress.springevent.events.ComedyCircusEvent;
import com.selenuimexpress.springevent.events.TheBigBangTheoryEvent;

@Component
public class ZeeCafePublisher {
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void streamingTheBigBangTheory(String EpNo) {
		System.out.println("Zee cafe : starting BBT "+EpNo);
		
		applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(EpNo));
		
	}
	
	public void streamingComedyCircus(String epNo) {
		System.out.println("Zee cafe : starting Comedy Circus "+epNo);
		
		applicationEventPublisher.publishEvent(new ComedyCircusEvent(epNo));
	}

}
