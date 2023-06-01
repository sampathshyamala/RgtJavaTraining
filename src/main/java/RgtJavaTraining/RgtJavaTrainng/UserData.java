package RgtJavaTraining.RgtJavaTrainng;


import java.util.Map;
import java.util.Scanner;

public class UserData {

	
	
	public static int userid;
	public static long accountNumber;
	public static int accountPin;
	public  String accountName;
	public  static double initialDeposit;
	
	public static  Map<Integer,Integer> useridpininfo ;
	public  static Map<Integer,Long> useridaccountnumberinfo; 
	public static   Map<Integer,String> useridaccountNameinfo; 
	public static   Map<Integer,Double> useridBalanceinfo; 
	public  Scanner scanner = new Scanner(System.in);
}
