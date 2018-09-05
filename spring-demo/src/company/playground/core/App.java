package company.playground.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IMessage message = context.getBean("message", IMessage.class);
		
		message.Send("Hello");
		
		context.close();
	}

}
