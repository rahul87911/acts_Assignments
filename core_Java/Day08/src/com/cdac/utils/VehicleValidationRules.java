package com.cdac.utils;
import java.time.LocalDate;

import com.cdac.exception_handler.*;


public class VehicleValidationRules {

	
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static final LocalDate DATE;
	public static final String ENGINE1;
	public static final String ENGINE2;
	public static final String ENGINE3;
	
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
		DATE = LocalDate.now();
		ENGINE1="PETROL";
		ENGINE2="CNG";
		ENGINE3="EV";		
	}

	
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too low !!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high , FATAL !!!!");
	}
	
	public static void validateFueltype(String type) throws FuelTypeNotSupportedException{
	      if(type.equalsIgnoreCase(ENGINE1) || type.equalsIgnoreCase(ENGINE2) || type.equalsIgnoreCase(ENGINE3))
	      {
	    	  System.out.println("Valid Engine Type");
	      }
	      else
	    	  throw new FuelTypeNotSupportedException("This type of Engine is not supported !");
		
	}
	
	public static void validateLisence(LocalDate date) throws LiscenceOutOfDateException
	{
      		if(date != DATE)
      		{
      			throw new LiscenceOutOfDateException("Lisence is Expired on "+date);
      		}
	}
}
