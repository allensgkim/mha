package com.shi.pms.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MessageRender {
	
	private MessageProvider messageProvider;

	
	public MessageRender() {
		System.out.println("aaaa-----------------");
	}
	
	public void setMessageProvider(MessageProvider messageProvider) {
		System.out.println(messageProvider.getMessage());
	}


	public static void main(String[] args) {
		System.out.println("----");
		/*
		 * MessageRender render = new MessageRender(); render.setMessageProvider(new
		 * HelloworldMessageProvider()); render.render();
		 * 
		 * render.setMessageProvider(new HiWorldMessageProvider()); render.render();
		 */
	}
}
