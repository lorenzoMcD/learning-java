import java.util.Scanner;

public class Ola1 {

	
	
	public static void main(String[] args) {
		// set tax rates and declare variables for income and tax 
		double rate1 = 0.1; 
		double rate2 = 0.15; 
		double rate3 = 0.25;
		double rate4 = 0.28;
		double rate5 = 0.33;
		double rate6 = 0.35;
		double income = 0;
		double tax = 0;
		int status;
		
		
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the filing status: ");
		
		status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		
		income = input.nextInt();
		
		
		
		// create the if statements for the cases 
		
		 // Single 
		if (status == 0)
		{
			// tax brackets for single
			
			double s1 = 8350; 
			double s2 = 33950;
			double s3 = 82250;
			double s4 = 171550;
			double s5 = 372950;
			 
			
				 
			if ( income <= s1 )
			{
				
				tax = rate1 * income;
								
			}
				
			else if (income <= s2)
			{
				tax = rate1 * s1 + rate2 * (income - s1);
				
			}
			
			else if ( income <= s3)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (income - s2);
				
			}
			
			else if (income <= s4)
			{
				tax = rate1 * s1 + rate2 * (s2 - s1)  + rate3 * (s3 - s2) + 
						rate4 * (income - s3);
				
				
			}
			
			else if (income <= s5)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (income - s4);
				
			}
			
			else
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (s5 - s4) +
						rate6 * (income - s5);
			}
			
			// print data to console	
			System.out.println("Tax is " + tax );
		}
				
			
		// Married Filing Jointly
		if (status == 1)
		{
			
			// tax brackets for Married Filing Jointly
			
			double s1 = 16700; 
			double s2 = 67900;
			double s3 = 137050;
			double s4 = 208850;
			double s5 = 372950;
			 
			
				 
			if ( income <= s1 )
			{
				
				tax = rate1 * income;
								
			}
				
			else if (income <= s2)
			{
				tax = rate1 * s1 + rate2 * (income - s1);
				
			}
			
			else if ( income <= s3)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (income - s2);
				
			}
			
			else if (income <= s4)
			{
				tax = rate1 * s1 + rate2 * (s2 - s1)  + rate3 * (s3 - s2) + 
						rate4 * (income - s3);
				
				
			}
			
			else if (income <= s5)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (income - s4);
				
			}
			
			else
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (s5 - s4) +
						rate6 * (income - s5);
			}
			
			// print data to console	
			System.out.println("Tax is " + tax );
		}
			
		// Married Filing Separately
		if (status == 2)
		{
			
			// tax brackets for Married Filing Separately
			double s1 = 8350; 
			double s2 = 33950;
			double s3 = 68525;
			double s4 = 104425;
			double s5 = 186476;
			 
			
				 
			if ( income <= s1 )
			{
				
				tax = rate1 * income;
								
			}
				
			else if (income <= s2)
			{
				tax = rate1 * s1 + rate2 * (income - s1);
				
			}
			
			else if ( income <= s3)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (income - s2);
				
			}
			
			else if (income <= s4)
			{
				tax = rate1 * s1 + rate2 * (s2 - s1)  + rate3 * (s3 - s2) + 
						rate4 * (income - s3);
				
				
			}
			
			else if (income <= s5)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (income - s4);
				
			}
			
			else
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (s5 - s4) +
						rate6 * (income - s5);
			}
			
			// print data to console
			System.out.println("Tax is " + tax );
		}	
			
			
		// Head of Household
		if (status == 3)
		{
			
			// tax brackets for Head of Household
			double s1 = 11950; 
			double s2 = 45500;
			double s3 = 117450;
			double s4 = 190200;
			double s5 = 372950;
			 
			
				 
			if ( income <= s1 )
			{
				
				tax = rate1 * income;
								
			}
				
			else if (income <= s2)
			{
				tax = rate1 * s1 + rate2 * (income - s1);
				
			}
			
			else if ( income <= s3)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (income - s2);
				
			}
			
			else if (income <= s4)
			{
				tax = rate1 * s1 + rate2 * (s2 - s1)  + rate3 * (s3 - s2) + 
						rate4 * (income - s3);
				
				
			}
			
			else if (income <= s5)
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (income - s4);
				
			}
			
			else
			{
				
				tax = rate1 * s1 + rate2 * (s2 - s1) + rate3 * (s3 - s2) + 
						rate4 * (s4 - s3) + rate5 * (s5 - s4) +
						rate6 * (income - s5);
			}
			
			
			// print data to console
			System.out.println("Tax is " + tax );
		}
			
			
			
		}
		
}


