package utils;

import java.util.List;

import com.app.cms.CustomerAccount;

import custom_exceptions.CustomerException;
import java.util.Scanner;


public class AccountUtils {
	
	// LOCATE ACCOUNT WITH EMAIL
	public static CustomerAccount  findAccount(String email,
			List<CustomerAccount> acctList)
			throws CustomerException {
		//Another method of contains but used to access a particular element
		CustomerAccount acct = new CustomerAccount(email);
		//System.out.println(acct);
		int index = acctList.indexOf(acct);
		//System.out.println(index);
		if (index == -1)
			throw new CustomerException("INVALID EMAIL\nAccount not found");
	
		return acctList.get(index);
			
	}
	
	// LOCATE ACCOUNT WITH EMAIL AND PASSWORD
	public static CustomerAccount findAccNdPass(String email, String password,
			List<CustomerAccount> ctLt) throws CustomerException 
	{
		CustomerAccount account=findAccount(email,ctLt);
		int index = ctLt.indexOf(account);
		if (!ctLt.get(index).getPassword().equals(password))
			throw new CustomerException("LOGIN FAILED\nPassword not matched!!!");
		return ctLt.get(index);
	}
	
	// CHANGE PASSWORD
	public static CustomerAccount changePass(String email, String password,
			Scanner newPass,
			List<CustomerAccount> ctLt) throws CustomerException
	{	
		CustomerAccount account=findAccNdPass(email, password, ctLt);
		System.out.println("Enter New Password: ");
		account.setPassword(newPass.next());
		
		return account;
	}
	
	// LOCATE ACCOUNT WITH EMAIL AND PASSWORD
		public static void  findAccountNdRemove(String email,String pass, 
				List<CustomerAccount> ctLt) throws CustomerException 
		{
			CustomerAccount account=findAccNdPass(email,pass,ctLt);
			//int index = ctLt.indexOf(account);
			//ctLt.remove(index);
			account.setSub();
			
		}
}