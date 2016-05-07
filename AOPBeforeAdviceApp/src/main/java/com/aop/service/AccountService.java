package com.aop.service;

import com.aop.exception.MyException;

public interface AccountService {
	boolean deposit(int accno,double amt) throws MyException;
	boolean withdraw(int accno,double amt) throws MyException;

}
