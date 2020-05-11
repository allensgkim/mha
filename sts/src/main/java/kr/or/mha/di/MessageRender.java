package kr.or.mha.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRender {
	private MessageProvider messageProvider;
	
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	public void render() {
		System.out.println(messageProvider.getMessage());
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageRender messageRender = (MessageRender) ac.getBean("messageRender");
		messageRender.render();
		
		
		
		/*
		 * MessageRender render = new MessageRender(); render.setMessageProvider(new
		 * HelloworldMessageProvider()); render.render();
		 * 
		 * render.setMessageProvider(new HiWorldMessageProvider()); render.render();
		 */
	}
}
