package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.cms.CustomerAccount;
import com.app.cms.PlanType;

import custom_exceptions.CustomerException;

import static utils.AccountUtils.*;


public class AccountValidations {
	// Account creation validation pending
	public static CustomerAccount validateSignUp( String firstName,
			String lastName, String email, String password,
			double regAmt, String dob, String plan,List<CustomerAccount> cktLst)
	throws CustomerException,IllegalArgumentException
	{
		PlanType type =  validatePlanType(plan);
		validateRegBalChk(type,regAmt);
		validateEmail(email,cktLst);
		validatePass(password,cktLst);
		return new CustomerAccount( firstName, lastName,  email,  password,
				 regAmt,  LocalDate.parse(dob), type);
	}
	

	// VALIDATE ACCT TYPE
	public static PlanType validatePlanType(String planTp) throws IllegalArgumentException
	{
		return PlanType.valueOf(planTp.toUpperCase());
	}
	
	// VALIDATE REGISTRATION BALANCE WITH CHARGES
	
	public static void validateRegBalChk(PlanType type, double regBal) throws CustomerException
	{
		if(regBal < type.getCharges())
			throw new CustomerException("Insufficient Balance for Registration!!!");
	}
	
	// VALIDATE EMAIL
	public static void  validateEmail(String emailAdd,List<CustomerAccount> cktLst)
			throws CustomerException
	{
		CustomerAccount email = new CustomerAccount(emailAdd);
		
		// VALIDATE DUPLICATE EMAIL
		if(cktLst.contains(email))
			throw new CustomerException("Email Id already Exists.");
		
		// Contains @
		
		int atIndex = emailAdd.indexOf('@');
	    if (atIndex < 0) {
	    	throw new CustomerException("Email Id does not contain '@'.");
	    }

	    // Check for valid TLD (.com, .org, or .net)
	    
	    String domain = emailAdd.substring(atIndex +1);
	    if (!domain.endsWith(".com") && !domain.endsWith(".org") && !domain.endsWith(".net")) {
	    	throw new CustomerException("Email Id does not ends with .com, .org, or .net !!!");
	    }
	    
		
	}
	
	// VALIDATE PASSWORD
	public static void validatePass(String pass,List<CustomerAccount> cktLst)
		throws CustomerException
	{
		if(!pass.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*]).{8,20})"))
			throw new CustomerException("Password did not meet required conditions.\nPassword Should have 1 lowercase letter, 1 uppercase letter, 1 number, and be at least 8 characters long");
	}
	
	// LOGIN CREDENTIALS VALIDATION
	public static CustomerAccount  validateCredentials(String email, String password,
			List<CustomerAccount> ctLt)
		throws CustomerException
	{
		CustomerAccount account=findAccNdPass(email,password,ctLt);
		return account;
	}
	
	// DISPLAY A PARTICULAR ACCOUNT 
	public static CustomerAccount  validatefindAccount(String email,
			List<CustomerAccount> ctLt)
		throws CustomerException
	{
		CustomerAccount account=findAccount(email,ctLt);
		return account;
	}
	
	//	CHANGE PASSWORD
	public static CustomerAccount  validateCgPass(String email, String password,
			Scanner newPass,	List<CustomerAccount> ctLt)
		throws CustomerException
	{
		CustomerAccount account=changePass(email,password,newPass,ctLt);
		return account;
	}
	
	// UNSUBSCRIBE ACCOUNT
	public static void  validateAccRm(String email, String pass, List<CustomerAccount> ctLt)
		throws CustomerException
	{
		findAccountNdRemove(email,pass,ctLt);
		
	} 
	
	
}
