package RgtJavaTraining.RgtJavaTrainng;

import java.util.Random;
import java.util.HashMap;


public class User extends UserData {
	
	
	public User() {
		// TODO Auto-generated constructor stub
		
		useridpininfo =new HashMap<Integer, Integer>();
		 useridaccountnumberinfo= new HashMap<Integer, Long>(); 
		 useridaccountNameinfo= new HashMap<Integer, String>(); 
		 useridBalanceinfo= new HashMap<Integer, Double>(); 
	}
	
	public  void createAccount()
	{
		System.out.println("Enter userName :");
		accountName=scanner.next();
		System.out.println("Enter userid :");
		userid=scanner.nextInt();
		System.out.println("Set Pin :");
		 accountPin=  scanner.nextInt();
		 Random random = new Random();
		 accountNumber= random.nextLong(1000000000);
		 useridpininfo.put(userid,accountPin);
		 useridaccountnumberinfo.put(userid,accountNumber);
		 useridaccountNameinfo.put(userid,accountName);
		
		System.out.println("Your details verifed successfully and your Acount created ! ");
	
		System.out.println("Please deposit intital ammount :");
		initialDeposit=scanner.nextDouble();
		useridBalanceinfo.put(userid,initialDeposit);
		System.out.println("your inital amount deposited ,Please try to login your Account with Userid and Pin check your balance!");
	}
	
	public  void userPinChange()
	{
		System.out.println("Enter userName :");
		String userName=scanner.next();
		System.out.println("Enter userid :");
		int userid=scanner.nextInt();
		System.out.println("Enter your  Pin :");
		 int accountPin=  scanner.nextInt();
		 Random random = new Random();
		 accountNumber= random.nextLong(1000000000);
		 useridpininfo.put(userid,accountPin);
		 useridaccountnumberinfo.put(userid,accountNumber);
		 useridaccountNameinfo.put(userid,accountName);
		
		System.out.println("Your details verifed successfully and your Acount created ! ");
		System.out.println("Please try to login your Account with Userid and Pin ");
	
	}
	
}
	
