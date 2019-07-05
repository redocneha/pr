package com.sapient.pe.client;
import java.util.Scanner;
import com.sapient.pe.model.Address;
import com.sapient.pe.model.CurrentAccount;
import com.sapient.pe.model.Employee;
import com.sapient.pe.model.SalariedAccount;
import com.sapient.pe.model.SavingAccount;
import com.sapient.pe.model.SupAccount;


public class Client {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Choose any action");
		
		boolean b=false;
		int d=0;
		do
		{
			
		
			System.out.println("enter the type of account \n 1.Salaried \n 2.Saving \n 3.Current\n");
			int c=sc.nextInt();
			
			System.out.println("Enter the city name");
			String city=sc.next();
			System.out.println("Enter the city PIN");
			int pin=sc.nextInt();
			Address adr=new Address(city,pin);
			System.out.println("Enter the Employee name");
			String name=sc.next();
			
			System.out.println("Enter the salary");
		     int salary=sc.nextInt();
					   
						Employee emp=new Employee(name,salary,adr);
						switch(c) {
					case 1: 
						SalariedAccount sa= new SalariedAccount(emp);
					    f(sa);
					    System.out.println("do u want to continue y(1) no (0)");
						d=sc.nextInt();
					    break;
					    
					case 2:
						
						SavingAccount sav=new SavingAccount(emp);
					 f(sav);
					 System.out.println("do u want to continue y(1) no (0)");
						d=sc.nextInt();
						break;
					
				   case 3:
					    
					    CurrentAccount ca=new CurrentAccount(emp);
					   
					    f(ca);
					    System.out.println("do u want to continue y(1) no (0)");
						d=sc.nextInt();
					    break;
		
			
			}}while(d==1);
		}

	private static void f(SupAccount sa) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
	
		int d=0;
		do {
			System.out.println("view\n 2.deposit\n3.withdraw");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			double hg=sa.checkBalance();
			System.out.println("account balance"+hg);
			System.out.println("do u want to continue y(1) no (0)");
			
			d=sc.nextInt();
			break;
		case 2:
			System.out.println("enter the amount to be deposited");
			double dep=sc.nextInt();
			sa.deposit(dep);
			System.out.println("do u want to continue y(1) no (0)");
			d=sc.nextInt();
			break;
		case 3:
			System.out.println("enter the amount to be withdraw");
			double am=sc.nextInt();
			sa.withdraw(am);
			System.out.println("do u want to continue y(1) no (0)");
			d=sc.nextInt();
			break;
	}}while(d==1);
	
		
		
	 
	}


		
		
		
		
	

	
	}


