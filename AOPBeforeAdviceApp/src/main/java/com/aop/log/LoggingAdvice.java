package com.aop.log;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAdvice  implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging Advice applied for :"+method.getName());
		Logger logger=Logger.getGlobal();
		logger.info("Method :"+method.getName()+"invoked with "+args.length+"arguments");
		
	}//before

}//class
