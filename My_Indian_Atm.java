package learn;
import java.util.*;
public class My_Indian_Atm 
{	
	public static void main(String[] args) 
	{
		int pin=1234;
		int balance=10000;
		int add_amount=0;
		int take_amount=0;
		String name="";
		
		Scanner scanner=new Scanner(System.in);
		//we have take an input by an user
		System.out.println("Enter your pin number");
		
		int password = scanner.nextInt();
		if(password==pin)
		{
			System.out.println("Enter your name");
			name=scanner.next();
			System.out.println("Wellcome to indian bank ATM machine " + name);
			while(true)
			{
				System.out .println("press 1 to check your balance");
				System.out .println("press 2 to add your amount");
				System.out .println("press 3 to take amount");
				System.out .println("press 4 to take recipt");
				System.out .println("press 5 to Exit");
				
				int option=scanner.nextInt();
				switch(option)
				{
				 case 1:
					System.out.println("your current balance is " + balance);
					break;
					
				 case 2:
					System.out.println("How much amount you want to add to your balance");
					add_amount=scanner.nextInt();
					System.out.println("Successfully credited");
					balance = add_amount+balance;
		             //10000 = 100 + 10000
					 //balance = 10100
					break;		
				
				 case 3:
					 System.out.println("How much money did you want to take");
					 take_amount=scanner.nextInt();
					 if(take_amount>balance)
					 {
						 System.out.println("Your balance is insufficient");
						 System.out.println("try less than your available balance");
						 
					 }
					 else
					 {
						 System.out.println("Succesfully debited");
						 balance = balance - take_amount;
						//balance =10100 = 10100 - 100
						 //balance = 10000
					 }
					 break;
					 
				 case 4:
					 System.out.println("Welcome to indian bank ATM macine");
					 System.out.println("Available balance is " + balance);
					 System.out.println("Amount deposited " + add_amount);
					 System.out.println("Amount taken " + take_amount);
					 System.out.println("thanks for coming");
					 break;
		
					 
				}
				if(option==5)
				{
					System.out.println("Thankyou");
					break;
				}
				
				
			}
		}
		else
		{
			System.out.println("invalid pin number");
		}
		
	}

}




