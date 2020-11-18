package com.spring.demo.aop;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	
	public void addAccount()
	{
		System.out.println("Doing DB work");
	}
	
	public List<Account> findAccounts()
	{
		System.out.println("Dao method called");
		return null;
	}

}
