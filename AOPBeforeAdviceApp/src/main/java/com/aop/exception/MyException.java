package com.aop.exception;

@SuppressWarnings("serial")
public class MyException extends Exception{
  public MyException(){}
  public MyException(String message){
	  super(message);
  }
}
