package packing;

import java.text.DecimalFormat;
import java.util.*;

public class Accounts {
	
	private int customerNumber;
	private int pin;
	private double currentBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat cashFormat = new DecimalFormat("'PKR' ###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPin(int pin) {
		this.pin = pin;
		return pin;
	}
	
	public int getPin() {
		return pin;
	}
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCurrentWithdraw(double amount) {
		currentBalance = (currentBalance-amount);
		return currentBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance-amount);
		return savingBalance;
	}
	
	public double calcCurrentDeposit(double amount) {
		currentBalance = (currentBalance+amount);
		return currentBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance+amount);
		return savingBalance;
	}
	
	public void getCurrentWithdrawInput() {
		System.out.println("Enter Withdrawal amount : ");
		double amount = input.nextDouble();
		
		if((currentBalance-amount)>=0) {
			calcCurrentWithdraw(amount);
			System.out.print("Transaction Succesful ! \n Remaining Account Balance : "
					+ cashFormat.format(currentBalance));
		}
		else
			System.out.println("Transaction Unsuccesful ! \n Insuficcient Funds.");		
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Enter Withdrawal amount : ");
		double amount = input.nextDouble();
		
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.print("Transaction Succesful ! \n Remaining Account Balance : "
					+ cashFormat.format(savingBalance));
		}
		else
			System.out.println("Transaction Unsuccesful ! \n Insuficcient Funds.");		
	}
	
	public void getCurrentDepositInput() {
		System.out.println("Enter Deposit amount : ");
		double amount = input.nextDouble();
		
		if((currentBalance+amount)>=0) {
			calcCurrentDeposit(amount);
			System.out.print("Transaction Succesful ! \n New Account Balance : "
					+ cashFormat.format(currentBalance));
		}
		else
			System.out.println("Transaction Unsuccesful ! \n Balance cannot be negative.");		
	}
	
	public void getSavingDepositInput() {
		System.out.println("Enter Deposit amount : ");
		double amount = input.nextDouble();
		
		if((savingBalance+amount)>=0) {
			calcSavingDeposit(amount);
			System.out.print("Transaction Succesful ! \n New Account Balance : "
					+ cashFormat.format(savingBalance));
		}
		else
			System.out.println("Transaction Unsuccesful ! \n Balance cannot be negative.");		
	}
	

		

}
