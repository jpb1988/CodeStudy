package com.aop.BeforeAdviceApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.AccountService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
    	@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("MyBeans.xml");
    	AccountService as=(AccountService) context.getBean("accountServices");
        System.out.println(as.getClass().getInterfaces() [1] );
        System.out.println( as.withdraw(1, 1000) );
        System.out.println(  "\n");
        System.out.println( as.deposit(1, 2000) );
   
    }
}
