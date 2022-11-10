
package ATM;
import java.util.Scanner;

public class ATMExample {
public static void main(String[] args) {
	int balance = 100000;
	int withdraw;
	int deposit;
	Scanner sc=new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Automated Teller Machine");
		System.out.println("Choose 1 for withdraw");
		System.out.println("Choose 2 for deposit");
		System.out.println("Choose 3 for check balance");
		System.out.println("Choose 4 for EXIT");
		System.out.println("Choose the operation you want to perform");
		
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("Enter money to be withdrawn: ");
			withdraw=sc.nextInt();
			if (balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("Please collect your money");
			}
			else {
				System.out.println("Insufficient Balance");
			}
			System.out.println("");
			break;
			case 2:
			System.out.println("Enter money to be deposited :");
			deposit=sc.nextInt();
			
			balance =balance +deposit;
			System.out.println("Your money has been Sucessfully deposited");
			System.out.println("");
			break;
			case 3:
				System.out.println("Balance : "+balance);
				System.out.println("");
				break;
			case 4:
			System.exit(0);
		}
	}
	
}
}
