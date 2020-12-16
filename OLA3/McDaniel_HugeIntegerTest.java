// Name: Lorenzo McDaniel
// Program: OLA3 
// Date: 10/12/20

import java.util.*;
public class McDaniel_HugeIntegerTest {

	public static void main(String[] args)
	   {
		   Scanner input = new Scanner(System.in);
		   //String str1;
		   //String str2;
	      HugeInteger integer1 = new HugeInteger();
	      HugeInteger integer2 = new HugeInteger();
	      System.out.println("Enter first HugeInteger: ");
	      integer1.Input(input.nextLine());
	      System.out.println("Enter second HugeInteger: ");
	      integer2.Input(input.nextLine());
	      System.out.println("HugeInteger1 " + integer1);
	      System.out.println("HugeInteger2 " + integer2);
	      HugeInteger result;
	      // add two HugeIntegers
	      result = integer1.Add(integer2);
	      System.out.println ("Add result" + result);
	      // subtract two HugeIntegers
	      result = integer1.Subtract(integer2);
	      System.out.println ("Subtract result" + result);
	      //result = integer1.multiply(integer2);
	      //System.out.println ("Subtract result" + result);
	      // compare two HugeIntegers
	    
	      System.out.println (  "HugeInteger 1 is zero: " +  integer1.IsZero());
	      System.out.println ( "HugeInteger 2 is zero: " + integer2.IsZero());
	      System.out.println (
	         "HugeInteger 1 is equal to HugeInteger 2: " + integer1.IsEqualTo(integer2));
	      System.out.println (
	         "HugeInteger 1 is not equal to HugeInteger 2:" + integer1.IsNotEqualTo(integer2));
	      System.out.println (
	         "HugeInteger 1 is greater than HugeInteger 2: " + integer1.IsGreaterThan(integer2));
	      System.out.println (
	         "HugeInteger 1 is less than HugeInteger 2:" +  integer1.IsLessThan(integer2));
	      System.out.println (
	         "HugeInteger 1 is greater than or equal to HugeInteger 2: " + integer1.IsGreaterThanOrEqualTo(integer2));
	      System.out.println ( "HugeInteger 1 is less than or equal to HugeInteger 2: " + integer1.IsLessThanOrEqualTo(integer2));
	 
	   }
}

