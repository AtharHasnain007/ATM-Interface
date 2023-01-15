package packing;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class optionsMenu extends Accounts{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat cashFormat = new DecimalFormat("'PKR' ###,##0.00");
	
	HashMap<Integer,Integer> data = new HashMap<>();
	
	 public void getLogin() throws IOException{
		 int x=1;
		 do {
			 try {
				 data.put(69420,2002);
				 data.put(89421,1969);
				 data.put(74583, 9003);
				 
				 System.out.println("Welcome to RAK Bank ATM!");
				 System.out.println("Enter Your Customer ID:");
				 setCustomerNumber(menuInput.nextInt());
				 
				 System.out.println("Enter Your PIN:");
				 setPin(menuInput.nextInt());
			 }
			 catch (Exception e) {
				 
				System.out.println("Invalid character(s). \n Only Numbers");
				x=2;				 
			 }
			 int cn=getCustomerNumber();
			 int pn=getPin();
			 
			 if((data.containsKey(cn)) && (data.get(cn)==pn)) {
				 getAccountType();				 
			 }
			 else
				 System.out.println("\n" + "Wrong customer ID or Pin Number");
		 }
		 while (x==1);
	 }
		 public void getAccountType() {
			 System.out.println("\nSelect the Account You want to access:");
			 System.out.println("1-Current Account");
			 System.out.println("2-Saving Account");
			 System.out.println("3-Exit");
			 
			 int select = menuInput.nextInt();
			 
			 switch(select) {
			 case 1:
				 getCurrent();
				 break;		 
			 case 2:
				 getSaving();
				 break;	 
			 case 3:
				 System.out.println("Thank you for using our ATM.");
				 break;
			 default:
				 System.out.println("Invalid choice!");
				 break;
			 }
			 
		 }
		 
	 

	public void getCurrent() {
		System.out.println("Current Account");
		System.out.println("1-Inquire Balance");
		System.out.println("2-Withdraw Funds");
		System.out.println("3-Deposit Funds");
		System.out.println("4-Exit");
		
		int select = menuInput.nextInt();
		
		switch(select) {
		case 1:
			System.out.print("Current Account Balance : " + cashFormat.format(getCurrentBalance()));
			getAccountType();
			break;
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You for using our ATM!");
			break;
		default:
			System.out.println("Invalid Entry");
			break;	
			}		
	}
	 
	public void getSaving() {
		System.out.println("Savings Account");
		System.out.println("1-Inquire Balance");
		System.out.println("2-Withdraw Funds");
		System.out.println("3-Deposit Funds");
		System.out.println("4-Exit");
		
		int select = menuInput.nextInt();
		
		switch(select) {
		case 1:
			System.out.print("Savings Account Balance : " + cashFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You for using our ATM!");
			break;
		default:
			System.out.println("Invalid Entry");
			break;	
			
		}
	
	}
	}
