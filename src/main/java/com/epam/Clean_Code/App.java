package com.epam.Clean_Code;

import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class App 
{
    private static final Logger logger=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner scanner= new Scanner(System.in);
    	logger.info("1.Calculate Simple Interest.\n" +
    					  "2.Calculate Compound Interest.\n" +
   						  "3.Calculate House Construction Cost.\n" +
   					  	  "Enter Your Choice: ");
   		int choice = scanner.nextInt();
   		switch(choice)
   		{
   			case 1:
   				logger.info("\nAmount after Simple Interest is\n" +Logic.input(choice));
   				break;
   			case 2: 
   				logger.info("\nAmount after Compound Interest is \n"+ Logic.input(choice));
    			break;
    		case 3:
    			logger.info("Your total cost will be INR " + Logic.costOfConstruction() +"\n\n" );
   				break;
    		default:
    			logger.info("\nPlease enter correct choice! \n");
   		}
    	scanner.close();
    	logger.info("Program Ended..... \n");
    }
}

