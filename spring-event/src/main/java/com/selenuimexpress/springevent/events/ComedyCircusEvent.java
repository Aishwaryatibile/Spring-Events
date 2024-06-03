package com.selenuimexpress.springevent.events;

//we have created the custom event here
public class ComedyCircusEvent {
	
	private String EpisodeNo;

	public ComedyCircusEvent(String episodeNo) {
		EpisodeNo = episodeNo;
	}

	public String getEpisodeNo() {
		return EpisodeNo;
	}
	
	

}
