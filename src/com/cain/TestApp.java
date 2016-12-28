package com.cain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cain.service.AccountService;

public class TestApp {

	@Test
	public void test01(){
		String xmlpath ="applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
		AccountService service = (AccountService) applicationContext.getBean("accountService");
		service.transfer("jack", "rose", 1000);
	}
}
