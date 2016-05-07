package com.aop.service;

import com.aop.dao.AccountDAO;
import com.aop.exception.MyException;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
    public AccountServiceImpl(){}
    public AccountServiceImpl(AccountDAO ad){
    	accountDAO=ad;
    }//constructor
    
	@Override
	public boolean deposit(int accno, double amt) throws MyException {
		// TODO Auto-generated method stub
		System.out.println("in the deposit method");
		double bal=accountDAO.getBalance(accno);
		bal+=amt;
		accountDAO.setBalance(accno, bal);
		return true;
	}

	@Override
	public boolean withdraw(int accno, double amt) throws MyException {
		System.out.println("in withdraw method");
		double bal=accountDAO.getBalance(accno);
		bal-=amt;
		if(bal>=1000){
			accountDAO.setBalance(accno, bal);
			return true;
		}
		return false;
	
	}

}
