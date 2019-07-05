package com.sapient.pe.model;

public class SupAccount {
	
	private final long   accountId;
	private double accountBalance;

	private static double minaccountBalance ;
	private static long accountIdCounter = 100;
	
	 private final Employee emp;
	 public SupAccount(Employee emp)
		{
		this.accountId = ++accountIdCounter;
		this.emp=emp;

		}
	public long getAccountId() {
		return accountId;
	}
	
  public void deposit(double dep) {
	  
  }
  public void withdraw(double dep) {}

	public double checkBalance() {return 0;}
	
	public String getName() {
		
		return emp.getName();
	}


	


	}

