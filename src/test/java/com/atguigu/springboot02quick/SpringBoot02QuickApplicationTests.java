package com.atguigu.springboot02quick;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02QuickApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private Person person;
	@Autowired
	ApplicationContext ioc;

	@Test
	public void getHelloService(){
		Boolean b = ioc.containsBean("getHelloService");
		System.out.println(b);
	}

	@Test
	public void contextLoads() {
		logger.trace("这是trace");
		logger.debug("这是debug");
		System.out.println("spring默认输出info级别的日志");
		logger.info("这是info");
		logger.warn("这是warn");
		logger.error("这是error");
		System.out.println("---" + person);
	}


}
