package com.selenuimexpress.springevent.listners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.selenuimexpress.springevent.events.ComedyCircusEvent;
import com.selenuimexpress.springevent.events.TheBigBangTheoryEvent;

@Component
public class AbhilashListner {

	public void watchBigBang(String epNo) {
		System.out.println("Abhilash : started watching the BBT : " + epNo);
		System.out.println("Abhilash : playing BBT : " + epNo);
	}

	public void watchComedyCircus(String epNo) {
		System.out.println("Abhilash : started watching the Comedy Circus : " + epNo);
		System.out.println("Abhilash : playing Comedy Circus : " + epNo);
	}

	@EventListener
	public void onApplicationEvent(TheBigBangTheoryEvent event) {
		try {
			System.out.println("Inside Abhilash Listener --> TheBigBangTheoryEvent started");
			Thread.sleep(7000);
			watchBigBang(event.getEpisodeNo());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Inside Abhilash Listener --> TheBigBangTheoryEvent stopped");
	}

	@EventListener
	public void listenToComedyEvent(ComedyCircusEvent event) {
		watchComedyCircus(event.getEpisodeNo());
	}

	// if you want to listen to multiple events you can use the array of classes
	// but you cannot access the object of that event as you can do using the method
	// parameter as above
	@EventListener(classes = { TheBigBangTheoryEvent.class, ComedyCircusEvent.class })
	public void listenToMultiple() {
		// write your code stuff here
	}

}
