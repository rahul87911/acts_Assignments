package tester;


import static java.time.LocalDate.parse;

import java.util.*;


import com.app.cms.CustomerAccount;
import com.app.cms.PlanType;
import static utils.AccountValidations.*;


public class CustomerApp {
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			List<CustomerAccount> cstLst = new  ArrayList<>();
			
			//Temp Data
		
			//cstLst.add(new CustomerAccount( "a1", "b1", "a1@gmail", "bpass", 20000, parse("1999-01-21"), PlanType.valueOf(("Gold").toUpperCase()) ));
			
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("\n"
						+ "Press 1 to Create Account\n"
						+ "Press 2 to Display All Customer Account Details\n"
						+ "Press 3 to Login\n"
						+ "Press 4 to Display Customer Account Summary by Email address\n"
						+ "Press 5 to Change Password\n"
						+ "Press 6 to Unsubscribe any Account\n"
						+ ""
						+ "Press 0 to Exit");
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter Customer Details: FirstName, LastName, Email Address, "
								+ "Password, Registration Amount, DOB(YYYY-MM-DD), Plan");
						
						CustomerAccount account = validateSignUp( sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble(),sc.next(),sc.next(),cstLst);
						
						cstLst.add(account);
						System.out.println("Account Created");
						break;
					case 2:
						for(CustomerAccount a: cstLst)
							System.out.println(a);
						break;
					case 3: 
						System.out.println("Enter Email and Password: ");
						account=validateCredentials(sc.next(),sc.next(),cstLst);
						System.out.println("LOGIN SUCCESSFUL");
						System.out.println(account);
						break;
					case 4:
						System.out.println("Enter Email to locate in the List: ");
						account=validatefindAccount(sc.next(),cstLst);
						System.out.println(account);	
						break;
					case 5: 
						System.out.println("Enter Email and Password: ");
						account=validateCgPass(sc.next(),sc.next(),sc,cstLst);
						System.out.println("PASSWORD UPDATED!");
						System.out.println(account);						
						break;
					case 6:
						System.out.println("Enter Email and Password to unsubscribe: ");
						validateAccRm(sc.next(),sc.next(),cstLst);
						System.out.println("Account Unsubscribed!!!");	
						break;
					case 0: 
						System.out.println("Have a good day!!!");
						exit=true;
						break;
						
					}
				}catch(Exception e)
				{
					sc.nextLine();
					System.out.println(e);
					System.out.println("Pls retry ...");
				}
			}
		}
	}
}
