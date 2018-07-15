package com.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/*
 * Spring requires Spring JAR/Libraries and JDK Libraries to run an Spring based application 
 * We need a driver class to run Spring container class
 * */
public class Test {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student=(Student)factory.getBean("studentbean"); /*Reading From XML File*/
		student.displayInfo();
	}
}
