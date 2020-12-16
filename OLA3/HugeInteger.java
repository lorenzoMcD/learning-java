import java.math.BigInteger;
import java.util.Arrays;

public class HugeInteger
{
   private final int DIGITS = 40;
   private int[] integer;// array containing the integer
   private boolean positive; // whether the integer is positive

   // parameterless constructor
   public HugeInteger()
   {
      
	   integer = new int[DIGITS];
	   positive = true;
	   
	   
   } 

   // Convert a string to HugeInteger
   public void Input(String inputstring)
   {
	   
	   
	 char[] integerChar = inputstring.toCharArray();
	 

	 // need to protect against negative value
	 
	 if (integerChar[0] == '-')
	 {
		 
		 positive = false; 
	 
		 // if the first char in integerChar is negative then skip over first index 
	 
		 for(int i = 1; i < integerChar.length; i++ )
		 {
			   

			integer[i] = Integer.parseInt(String.valueOf(inputstring.charAt(i))); 
				 
				   
		 }
		 
		 
	 }
	 
	 else // integer is positive
	 {
		
		 // add numbers to integer array and don't skip first i in index
		 for(int i = 0; i < integerChar.length; i++ )
		 {
			   

			integer[i] = Integer.parseInt(String.valueOf(inputstring.charAt(i))); 

				   
		 }
		  

	 }
	 
   } 

   // add two HugeIntegers
   public HugeInteger Add(HugeInteger addValue)
   {
	   
	   // need to also check against the negative value here
	   
	   if (positive == true && addValue.positive == true && IsZero() == false && addValue.IsZero() == false)
	   {
		   
		   return AddPositives(addValue);
		   
		   
	   }
	   
	   else if (positive == false && addValue.positive == true && IsZero() == false && addValue.IsZero() == false) // if this is false 
	   {
		   
		   
		   String num ="-"; // add the negative char to string first 
			 
		   
		   for (int i = 1; i < integer.length; i++)
			{ 
				num+= String.valueOf(integer[i]);
				  
			}
		   
		   
		   String num2 ="";
			  
		   for (int i = 0; i < addValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(addValue.integer[i]);
				  
		   }
		   
		  
		   String n; // used to delete 0's after end of huge integer 
		   String n2;
			  
			n = num.replaceAll("0+$", "");
			  
			n2 = num2.replaceAll("0+$", "");
			  
			BigInteger b = new BigInteger(n);
			BigInteger c = new BigInteger(n2);   
			BigInteger g = b.add(c);
			    
			HugeInteger r = new HugeInteger();
			  
			r.Input(g.toString());
			
			 return r;	 
			
			
	   }
	   
	   
	   
	   else if( positive == true && addValue.positive== false && IsZero() == false && addValue.IsZero() == false)
	   {
		   
		   
		   String num ="";
			 
		   for (int i = 0; i < integer.length; i++)
			{ 
				num+= String.valueOf(integer[i]);
				  
			}
		   
		   
		   
		   String num2 ="-";
			  
		   for (int i = 1; i < addValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(addValue.integer[i]);
				  
		   }
		   

			 String n; // used to delete 0's after end of huge integer 
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			 BigInteger g = b.add(c);
			 
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(g.toString());
			  
			 return r;	  
		   
	   }
	   
	   else if( positive == false && addValue.positive== false && IsZero() == false && addValue.IsZero() == false) // both values are false...
	   {
		   
		  
		   String num ="-";
			 
		   for (int i = 1; i < integer.length; i++)
			{ 
				num+= String.valueOf(integer[i]);
				  
			}
			 
	 
		   String num2 ="-";
			  
		   for (int i = 1; i < addValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(addValue.integer[i]);
				  
		   }

			 String n; // used to delete 0's after end of huge integer 
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			 BigInteger g = b.add(c);
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(g.toString());
			  
			 return r;	  
	   }
	   
	   
	   else if( IsZero() == false && addValue.IsZero() == false)  // if both values are zeros
	   {
		
		   
		   HugeInteger r = new HugeInteger();
			  
		   String g = "0";
		   
		   r.Input(g);
			  
		   return r;
		   	   
	   }
	   
	   else if(  IsZero() == true && addValue.IsZero() == false)
	   {
		   
		   
		   String num2 ="";
			  
		   for (int i = 0; i < addValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(addValue.integer[i]);
				  
		   }

			 String n; // used to delete 0's after end of huge integer 
			 String n2;
			  
			 n = "0";
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 
			 BigInteger c = new BigInteger(n2);
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(c.toString());
			  
			 return r;	
		   
	   }
	   
	   else if(  IsZero() == false && addValue.IsZero() == true)
	   {
		   
		   
		   String num ="";
			  
		   for (int i = 0; i < integer.length; i++)
		   { 
			   num+= String.valueOf(integer[i]);
				  
		   }

			 String n; // used to delete 0's after end of huge integer 
			
 
			 n = num.replaceAll("0+$", "");
			  
 
			 BigInteger c = new BigInteger(n);
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(c.toString());
			  
			 return r;

	   }
	   
	   else
		   
		   
	   {
		   	HugeInteger r = new HugeInteger();
			  
		   	
		     String n = "0";
			
		     r.Input(n.toString());
			  
			 return r;
	   }
		   
		   
		   
		   
		   
		   
	   
	  
   }

   // add two positive HugeIntegers
   private HugeInteger AddPositives(HugeInteger addValue)
   {
	   
	   
	   String num ="";
		 
	   for (int i = 0; i < integer.length; i++)
		{ 
			
		   
		   
		   if (i < FindFirstNonZeroPosition())  //   1 want to only add 
			  {
				  
				 // don't add anything 
				  
			  }
			  
		else
			  {
				  // add stuff to our numbers string 
			
				num+= String.valueOf(integer[i]);

			  }
		   
			  
		}
		 
 
	   String num2 ="";
		  
	   for (int i = 0; i < addValue.integer.length; i++)
	   { 
		  
		   
		   
		   if (i < FindFirstNonZeroPosition())  //   1 want to only add 
			  {
				  
				 // don't add anything 
				  
			  }
			  
		else
			  {
				  // add stuff to our numbers string 
				  
			  	num2+= String.valueOf(addValue.integer[i]);
			  
			  }
		   
		   
		 
			  
	   }

		 String n; // used to delete 0's after end of huge integer 
		 String n2;
		
			 
		n = num.replaceAll("0+$", "");
		n2 = num2.replaceAll("0+$", "");

		BigInteger b = new BigInteger(n);
		BigInteger c = new BigInteger(n2);
			   
		BigInteger g = b.add(c);
			 
			 
			 
			 
			 
		HugeInteger r = new HugeInteger();
			  
		r.Input(g.toString());
			  
		return r;
			 
			 
}
		 	 

   // subtract two HugeIntegers
   public HugeInteger Subtract(HugeInteger subtractValue)
   {
 // need to also check against the negative value here

	   
	   if (positive == true && subtractValue.positive == true && IsZero() == false && subtractValue.IsZero() == false)
	   {
		   
		   return SubtractPositives(subtractValue);
		   
		   
	   }
	   
	   else if (positive == false && subtractValue.positive == true && IsZero() == false && subtractValue.IsZero() == false) // if this is false 
	   {
		   
		   
		   String num ="-"; // add the negative char to string first 
			 
		   
		   for (int i = 1; i < integer.length; i++)
			{ 
				num+= String.valueOf(integer[i]);
				  
			}
		   
		   
		   String num2 ="";
			  
		   for (int i = 0; i < subtractValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(subtractValue.integer[i]);
				  
		   }
		   
		  
		   String n; // used to delete 0's after end of huge integer 
		   String n2;
			  
			n = num.replaceAll("0+$", "");
			  
			n2 = num2.replaceAll("0+$", "");
			  
			BigInteger b = new BigInteger(n);
			BigInteger c = new BigInteger(n2);   
			BigInteger g = b.subtract(c);
			    
			HugeInteger r = new HugeInteger();
			  
			r.Input(g.toString());
			
			 return r;	 
			
			
	   }
	   
	   
	   
	   else if( positive == true && subtractValue.positive== false && IsZero() == false && subtractValue.IsZero() == false)
	   {
		   
		   
		   String num ="";
			 
		   for (int i = 0; i < integer.length; i++)
			{ 
				num+= String.valueOf(integer[i]);
				  
			}
		   
		   
		   
		   String num2 ="-";
			  
		   for (int i = 1; i < subtractValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(subtractValue.integer[i]);
				  
		   }
		   

			 String n; // used to delete 0's after end of huge integer 
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			 BigInteger g = b.subtract(c);
			 
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(g.toString());
			  
			 return r;	  
		   
	   }
	   
	   else if( positive == false && subtractValue.positive== false && IsZero() == false && subtractValue.IsZero() == false) // both values are false...
	   {
		   
		  
		   String num ="-";
			 
		   for (int i = 1; i < integer.length; i++)
			{ 
				num+= String.valueOf(integer[i]);
				  
			}
			 
	 
		   String num2 ="-";
			  
		   for (int i = 1; i < subtractValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(subtractValue.integer[i]);
				  
		   }

			 String n; // used to delete 0's after end of huge integer 
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			 BigInteger g = b.subtract(c);
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(g.toString());
			  
			 return r;	  
	   }
	   
	   
	   else if( IsZero() == false && subtractValue.IsZero() == false)  // if both values are zeros
	   {
		
		   
		   HugeInteger r = new HugeInteger();
			  
		   String g = "0";
		   
		   r.Input(g);
			  
		   return r;
		   	   
	   }
	   
	   else if(  IsZero() == true && subtractValue.IsZero() == false)
	   {
		   
		   
		   String num2 ="";
			  
		   for (int i = 0; i < subtractValue.integer.length; i++)
		   { 
			   num2+= String.valueOf(subtractValue.integer[i]);
				  
		   }

			 String n; // used to delete 0's after end of huge integer 
			 String n2;
			  
			 n = "0";
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 
			 BigInteger c = new BigInteger(n2);
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(c.toString());
			  
			 return r;	
		   
	   }
	   
	   else if(  IsZero() == false && subtractValue.IsZero() == true)
	   {
		   
		   
		   String num ="";
			  
		   for (int i = 0; i < integer.length; i++)
		   { 
			   num+= String.valueOf(integer[i]);
				  
		   }

			 String n; // used to delete 0's after end of huge integer 
			
 
			 n = num.replaceAll("0+$", "");
			  
 
			 BigInteger c = new BigInteger(n);
			 HugeInteger r = new HugeInteger();
			  
			 r.Input(c.toString());
			  
			 return r;

	   }
	   
	   else
		   
		   
	   {
		   	HugeInteger r = new HugeInteger();
			  
		   	
		     String n = "0";
			
		     r.Input(n.toString());
			  
			 return r;
	   }
		   
		   
		   
		   
		   
	   
   } 

   
   // subtract two positive HugeIntegers
   private HugeInteger SubtractPositives(HugeInteger subtractValue)
   {
	   String num ="";
		 
	   for (int i = 0; i < integer.length; i++)
		{ 
			num+= String.valueOf(integer[i]);
			  
		}
		 
 
	   String num2 ="";
		  
	   for (int i = 0; i < subtractValue.integer.length; i++)
	   { 
		   num2+= String.valueOf(subtractValue.integer[i]);
			  
	   }

		 String n; // used to delete 0's after end of huge integer 
		 String n2;
		  
		
		 
		
			 
		n = num.replaceAll("0+$", "");
			  
		n2 = num2.replaceAll("0+$", "");
			 
			 
		BigInteger b = new BigInteger(n);
		BigInteger c = new BigInteger(n2);
			   
		BigInteger g = b.subtract(c); 
		HugeInteger r = new HugeInteger();
			  
		if (g.floatValue() < 0)
		{
				 
			g = g.multiply(new BigInteger("-1"));
				
			r.Input(g.toString());
				 
			r.positive = false;
				 
			return r;
				 
			 }
			 
		else
		{
				 
			r.Input(g.toString());
				 
				  
			 return r;
				 
		}
			 
	}
	   
	   

   // find first non-zero position of HugeInteger
   private int FindFirstNonZeroPosition()
   {
	
	   // need to loop through array to find first non zero position
	   
	   
	   int index = -1;
	   
	   for (int i = 0; i < integer.length; i++)
		{ 
		
		   
		   if (integer[i] != 0)
		   {
			   index = i;
			   
			   break; // will break the loop on first occurrence of non zero position
			   
		   }
			  
		}
	   
	   
	   return index;
	   
	   
	   
   }


  
 

   // get string representation of HugeInteger
   public String toString()
   {
	   
	   // need to check if positive or negative
	   
	   if (positive == true)
	   {
		   String num = "+";
			  // need to print char array to screen
			  
			  
			  int size = integer.length;
			  
			  for (int i = 0; i < size; i++)
			  {
				  
				  
				  // if numbers is something like 009 need to push the non zero number up 
				  // so don't add the leading zeros to our string 
				  
				  if (i < FindFirstNonZeroPosition())  
				  {
					  
					 // don't add anything 
					  
				  }
				  
				  else
				  {
					  // add stuff to our numbers string 
					  
					  num+= integer[i];
				  }
				  
				  
			  }
			  
			 
			  String n;
			  
			if (IsZero() == false)
			{
				
			
				n = num.replaceAll("0+$", "");
				
			}
			  
			else
			{
			
				 n =  "0";
				
			}
			
			return n;
 
	   }
	   
	   else  // positive is false , the big integer is negative
	   {
		   
		   
		   String num = "-";
			  // need to print char array to screen
			  
			  
			  int size = integer.length;
			  
			  for (int i = 1; i < size; i++)
			  {
				  num+= integer[i];
				   
				  
			  }
			  
			  String n = num.replaceAll("0+$", "");
			  
			  return n;
		   
		   
	   }
	 
   }

  
   // test if two HugeIntegers are equal
   public boolean IsEqualTo(HugeInteger compareValue)
   {
	   
	   if (positive == true && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false)
	   {
		   
		   String num ="";
			 
			 for (int i = 0; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="";
			  for (int i = 0; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() == c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		  
		   String num ="-";
			 
			 for (int i = 1; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="-";
			  for (int i = 1; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() == c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (IsZero() == true && compareValue.IsZero() == true )
		   
	   {
		   
		   
		   return true;
		   
		   
	   }
	   
	   else
		   
	   {
		   
		   
		   
		   return false;
		   
		   
	   }
	   
	   
   } 

   // test if two HugeIntegers are not equal
   public boolean IsNotEqualTo(HugeInteger compareValue)
   {
	   
	   if (positive == true && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false)
	   {
		   
		   String num ="";
			 
			 for (int i = 0; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="";
			  for (int i = 0; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() != c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		  
		   String num ="-";
			 
			 for (int i = 1; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="-";
			  for (int i = 1; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() != c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (IsZero() == true && compareValue.IsZero() == true )
		   
	   {
		   
		   
		   return false;
		   
		   
	   }
	   
	   else
		   
	   {
		   
		   
		   
		   return true;
		   
		   
	   }
	   
   } 

   
   // test if one HugeInteger is greater than another
   public boolean IsGreaterThan(HugeInteger compareValue)
   {
	   if (positive == true && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false)
	   {
		   
		   String num ="";
			 
			 for (int i = 0; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="";
			  for (int i = 0; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() > c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		  
		   String num ="-";
			 
			 for (int i = 1; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="-";
			  for (int i = 1; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() > c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   else if (positive == false && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return false;
		   
	   }
	   
	   else if (positive == true && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return true;
		   
	   }
	   else if (IsZero() == true && compareValue.IsZero() == true )
		   
	   {
		   
		   
		   return false;
		   
		   
	   }
	   
	   else
		   
	   {
		   
		   
		   
		   return true;
		   
		   
	   }
		 
	   
	   
   }

   // test if one HugeInteger is less than another
   public boolean IsLessThan(HugeInteger compareValue)
   {
//
	   if (positive == true && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false)
	   {
		   
		   String num ="";
			 
			 for (int i = 0; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="";
			  for (int i = 0; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() < c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		  
		   String num ="-";
			 
			 for (int i = 1; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="-";
			  for (int i = 1; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() < c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return true;
		   
	   }
	   
	   else if (positive == true && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return false;
		   
	   }
	   
	   
	   
	   else if (IsZero() == true && compareValue.IsZero() == true )
		   
	   {
		   
		   
		   return false;
		   
		   
	   }
	   
	   else
		   
	   {
		   
		   
		   
		   return true;
		   
		   
	   }
	   
	   
   }

   // test if one HugeInteger is greater than or equal to another
   public boolean IsGreaterThanOrEqualTo(HugeInteger compareValue)
   {
	   
	   if (positive == true && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false)
	   {
		   
		   String num ="";
			 
			 for (int i = 0; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="";
			  for (int i = 0; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			 
			 			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() >= c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		  
		   String num ="-";
			 
			 for (int i = 1; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="-";
			  for (int i = 1; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() >= c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   
	   else if (positive == false && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return false;
		   
	   }
	   
	   else if (positive == true && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return true;
		   
	   }
	   
	   else if (IsZero() == true && compareValue.IsZero() == true )
		   
	   {
		   
		   
		   return true;
		   
		   
	   }
	   
	   else
		   
	   {
		   
		   
		   
		   return false;
		   
		   
	   }
	   
		  
      
   }

   // test if one HugeInteger is less than or equal to another
   public boolean IsLessThanOrEqualTo(HugeInteger compareValue)
   {
	   
	   if (positive == true && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false)
	   {
		   
		   String num ="";
			 
			 for (int i = 0; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="";
			  for (int i = 0; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() <= c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		  
		   String num ="-";
			 
			 for (int i = 1; i < integer.length; i++)
			  {
				 
				 
				num+= String.valueOf(integer[i]);
				  
			  }
			 

			 String num2 ="-";
			  for (int i = 1; i < compareValue.integer.length; i++)
			  {
				 
				 
				num2+= String.valueOf(compareValue.integer[i]);
				  
			  }

			 String n;
			 String n2;
			  
			 n = num.replaceAll("0+$", "");
			  
			 n2 = num2.replaceAll("0+$", "");
			  
			  
			 BigInteger b = new BigInteger(n);
			 BigInteger c = new BigInteger(n2);
			   
			  
			  if (b.floatValue() <= c.floatValue())
			  {
				  return true;
			  }
			  else
			  {
				  return false;
			  }
			  
		   
	   }
	   
	   else if (positive == false && compareValue.positive == true &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return true;
		   
	   }
	   
	   else if (positive == true && compareValue.positive == false &&  IsZero() == false && compareValue.IsZero() == false )
	   {
		   
		   return false;
		   
	   }
	   
	   else if (IsZero() == true && compareValue.IsZero() == true )
		   
	   {
		   
		   
		   return true;
		   
		   
	   }
	   
	   else
		   
	   {
		   
		   
		   
		   return false;
		   
		   
	   }
	   
		  
	   
	   
   } 
  


   
   //test if one HugeInteger is zero
  public boolean IsZero()
   {
	  
	  
	  // should check if the string is entire 0's 
	  if (positive == true)
	  {
		  
		  
		  int num = 0;
			 
		  for (int i = 0; i < integer.length; i++)
		  {
				 
			if (integer[i] == 0)
			{
				num+=1;
			}
				 
		  }

			 
		 if (num == 40) // there are 40 zeros in input string
		 {
			 
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	  
	  
	  }
		  
	  
	  else // number is negative so need to skip over the first index
	  {
		    
		  int num = 0;
			 
		  for (int i = 1; i < integer.length; i++)
		  {
				 
			if (integer[i] == 0)
			{
				num+=1;
			}
				 
		  }

			 
		 if (num == 39) // // check the count against 38 since we skipped over the first index.
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		  
		  
	  }
	  
 }
	  
	  	 
	
   }
	   
      
  




