package kr.co.itcen.springcontainer.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import kr.co.itcen.springcontainer.user.User;

public class ContainerTest {

	public static void main(String[] args) {
		//testBeanFactory();
		testApplicationContext();
	}
	
	public static void testBeanFactory() {
		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext01.xml"));
		User user = bf1.getBean(User.class);
		System.out.println(user);
		
		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext02.xml"));
		user = bf2.getBean(User.class);
		System.out.println(user);
	}
	
	public static void testApplicationContext() {
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("config/user/applicationContext01.xml");
		User user = appCtxt.getBean(User.class);
		System.out.println(user);
	}
	
}
