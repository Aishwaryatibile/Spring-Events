package com.selenuimexpress.springevent.listners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.selenuimexpress.springevent.events.TheBigBangTheoryEvent;
@Component
public class PrathamListner {
	
	public void watchBigBang(String epNo) {
		System.out.println("Pratham : started watching the BBT : "+epNo);
		System.out.println("Pratham : playing BBT : "+epNo);
	}
	
	@EventListener
	public void onApplicationEvent(TheBigBangTheoryEvent event) {
		watchBigBang(event.getEpisodeNo());
	}

}
