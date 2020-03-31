package com.rtpl.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("spring.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Question question=(Question)factory.getBean("question");  
	    question.displayInfo();  
	      
	}  
}
