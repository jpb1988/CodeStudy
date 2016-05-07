package com.aop.dao;

import com.aop.exception.MyException;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public void setBalance(int accno, double amt) throws MyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getBalance(int accno) throws MyException {
		// TODO Auto-generated method stub
		return 5000;
	}

}
