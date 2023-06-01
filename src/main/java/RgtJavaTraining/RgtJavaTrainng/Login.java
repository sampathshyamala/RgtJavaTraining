package RgtJavaTraining.RgtJavaTrainng;


public  class Login extends UserData{
	
	
	public  void loginUser()
	{
  
		System.out.println("Enter userid :");
		int enteredid=scanner.nextInt();
		System.out.println("Enter Pin :");
		int enteredPin=scanner.nextInt();
	
		if (useridpininfo.get(enteredid).equals(enteredPin))
		{
			System.out.println("your Userid and Pin matched,Your are sucessfully loggined");
			   ATM atm = new ATM(enteredid);
		        int choice;

		        do {
		            System.out.println("Hi "+ useridaccountNameinfo.get(enteredid) + " Welcome to the Simple ATM");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Deposit");
		            System.out.println("3. Withdraw");
		            System.out.println("4. LogOut");
		            System.out.print("Choose an option: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Current balance: $" + atm.checkBalance(enteredid));
		                    break;
		                case 2:
		                    System.out.print("Enter deposit amount: $");
		                    double depositAmount = scanner.nextDouble();
		                    atm.deposit(enteredid,depositAmount);
		                    break;
		                case 3:
		                    System.out.print("Enter withdrawal amount: $");
		                    double withdrawalAmount = scanner.nextDouble();
		                    atm.withdraw(enteredid,withdrawalAmount);
		                    break;
		                case 4:
		                    System.out.println("you successfully logged out! ");
		                    break;
		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }

		            System.out.println();

		        } while (choice != 4);
		       System.out.println("******** ThankYou Goodbye ! ************");
		    }
		}
	}

class ATM extends UserData{
    private double balance;

    public ATM(int uid) {
    	balance=useridBalanceinfo.get(uid);
    	useridBalanceinfo.put(uid, balance);
    }

    public double checkBalance(int uid) {
        return useridBalanceinfo.get(uid);
    }

    public void deposit( int uid ,double amount) {
        if (amount > 0) {
        	
        	balance += amount;
            useridBalanceinfo.put(uid, balance);
            System.out.println("Deposit successful! Your current balance is : " + balance );
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int uid ,double amount) {
        if (amount > useridBalanceinfo.get(uid)) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
        	balance=useridBalanceinfo.get(uid);
            balance -= amount;
            useridBalanceinfo.put(uid, balance);
            System.out.println("Withdrawal successful! Your current balance is : "+ balance);
        }
    }
}