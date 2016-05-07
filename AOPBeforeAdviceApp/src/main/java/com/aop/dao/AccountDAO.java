package com.aop.dao;

import com.aop.exception.MyException;

public interface AccountDAO {
	void setBalance(int accno,double amt) throws MyException;
	double getBalance(int accno) throws MyException;

}
