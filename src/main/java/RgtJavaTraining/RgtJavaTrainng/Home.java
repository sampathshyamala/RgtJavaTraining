package RgtJavaTraining.RgtJavaTrainng;


import java.util.Scanner;

public class Home extends UserData{
		
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int choice;
		   User user= new User();
		   Login login =new Login();
		 do {
	         System.out.println("Welcome to the ATM Home");
	         System.out.println("1. Create An New Account");
	         System.out.println("2. Login");
	         System.out.println("3. Pin Change");
	         System.out.println("4. Exit");
	         System.out.println("5. List of Users in Bank");
	         System.out.print("Choose an option: ");
	         choice = scanner.nextInt();
	      
	         switch (choice) {
	             case 1:
	                 System.out.println("Create an account: ");
	                 user.createAccount();
	                 break;
	             case 2:
	                 System.out.print("Login Your Account: $");
	                 login.loginUser();
	                 break;
	             case 3:
	                 System.out.print("Pin Change: $");
	                 break;
	             case 4:
	                    System.out.println("you successfully Exit ");
	                    break;
	             case 5:
	                    System.out.println("Here is the list of users in our bank ");
	                    System.out.println(useridaccountNameinfo);
	                    break;
	             default:
	                 System.out.println("Invalid option. Please try again.");
	         }

	         System.out.println();

	     } while (choice != 4);

	     scanner.close();
	 }
			
}
