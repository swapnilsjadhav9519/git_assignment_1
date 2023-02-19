
package staragile;
import java.util.Scanner;
import org.junit.*;

public class newcalc
{
		      
		 public static int add(int x , int y)
		        {
			 
		        	return x+y ;
		        	
		        }
		  
		 public static int sub(int x , int y)
	        {
	        	return x-y ;
	        	
	        }
		 
		 public static int mul(int x , int y)
	        {
	        	return x*y ;
	        	
	        }
		 	
		 public static int div(int x , int y)
	        {			 
	        	return x/y ;
	        	
	        }
		 
		 
		 public static void main(String[] args) 
		   { 
			 
			    System.out.println("******************************* ");
				System.out.println("Welcome to swapnil's Calculator ");
				System.out.println("******************************* ");
		        
				Scanner scn = new Scanner(System.in);  
		 
		      
		       System.out.println("Enter the value of x:");
		        int x = scn.nextInt();
		        System.out.println("Enter the value of y:");
		        int y = scn.nextInt();
			              
            System.out.println("Addition of x and y is = " + newcalc.add(x,y) );
	        System.out.println("Subtraction of x and y is = " + newcalc.sub(x,y) );
	        System.out.println("Multiplication of x and y is = " + newcalc.mul(x,y) );
	        System.out.println("Division of x and y is = " + newcalc.div(x,y) );
	    
		        
      	    }  
	
}
