// Name: Lorenzo McDaniel
// Program: OLA2 
// Date: 09/20/20

import java.util.Arrays;
import java.util.Scanner;
public class DriverExam_McDaniel  {
	
	
	// constant that holds the minimum score to pass the test
	final static int passScore = 17;



	public static void main(String[] args) {
	// create array that holds the answers to test
	char[] keyAnswers = {'B','D','A','A','C','A','B','A','C','D','B','C','D', +
			'A','D','C','C','B','D','A'};
	
	
	// array that holds student answers (user input)
	char[] studentAnswers = new char[20];
	
	
	// variable for user input 
	Scanner input = new Scanner(System.in);
	
	
	// need to prompt the user 
	System.out.println("Enter in the student's Answers to the test , Answers must be 'A','B','C' or 'D' ");
	
	
	int count = 0; // count used with the array index
	int cnt = 1; // count used to number the input lines
	while (count < 20) {
		
		
		System.out.print("Enter student's answer for question " + cnt + ": ");
		studentAnswers[count] = input.next().charAt(0);
		
		if (studentAnswers[count] == 'A' || studentAnswers[count] == 'B' || studentAnswers[count] == 'C' || studentAnswers[count] == 'D') 
		{
			
			
			count++;
			cnt++;
			
		}
		
		else
		
		{
			
			System.out.println("WARNING Answers must be 'A','B','C' or 'D' ");
			System.out.print("Enter student answer for question " + cnt + ": ");
			studentAnswers[count] = input.next().charAt(0);
		}
		
		
	}
	
	
	boolean passed = Passed(studentAnswers, keyAnswers); // set the return value of function to variable 
	
	// print passed or failed depending on if variable is true or false
	if (passed == true)
	{
		
		System.out.println("The student passed.");
		
	}
	
	else
	{
		
		System.out.println("The student failed.");
		
	}
	
	
	
	// print correct and incorrect scores 
	
	System.out.println("correct: " + totalCorrect(studentAnswers, keyAnswers) +
			" , " + "incorrect: " + (totalIncorrect(studentAnswers, keyAnswers)));
	
	
	// set the variable array to the returning array from the questions Missed function
	int [] arr = questionsMissed(studentAnswers, keyAnswers);
	
	System.out.print("Questions Missed: ");
	
	
	// loop through the array, print the missed questions 
	count = 0;
	for (int i = 0; i < arr.length; i++) {
		
		// print items except if value is equal to 0
		if (arr[i] != 0) { 
			
			System.out.print(arr[i]+ " "); 
			
		}
		
		else
		{
			
			count++; // count the number of times "0" appears in the array 
			
		}
		
		if (count == 19) // if count is equal to 19 , all answers were correct 
		{
			
			System.out.print("0");
		}
		
	
	}
	
	}

	
	
	// function that returns true or false if student passed the exam 
	public static boolean Passed (char[] Answer, char[] Key) {
		
		// need to loop through and check if at least 17 answers are correct
		// if correct return TRUE else False
		
		int count = 0;
		for (int i = 0; i < 19; i++) {
			
			// check if arrays are equal by comparing both at same index
			if (Key[i] == Answer[i]) {
				
				count++; // if  equal, increment the count
				
			}
		
		}
		
		
		
		if (count >= passScore)
		{
			
			return true;
			
		}
		
		else
		{
			return false;
		}
		
		
	}
	
	
	// function that returns total number of correct answers
	public static int totalCorrect (char[] Answer, char[] Key) {
		
		
		int count = 0; // holds number of correct answers 
		
		for (int i = 0;i < 20; i++) {
			
			// check if arrays are equal by comparing both at same index
			if (Key[i] == Answer[i]) {
				
				count+=1; // if they equal, increment the count
				
			}
		
		}
		
		// this will return total number of correct answers 
		return count;
		
		
		
	}
	
	// function that returns number of incorrect answers 
	public static int totalIncorrect (char[] Answer, char[] Key) {
		
		
		int count = 0; // holds number of incorrect answers 
		
		for (int i = 0; i < 19; i++) {
			
			// check if arrays are not equal by comparing both at same index
			if (Key[i] != Answer[i]) {
				
				count+=1; // if they not equal, increment the count
				
			}
		
		}
		
		// this will return total number of non correct answers 
		return count;
		
	}
	
	
	// function that return the question number that student missed
	public static int [] questionsMissed (char[] Answer, char[] Key) {
		
		// array that holds num of missed questions
		int[] missedQuestions = new int[20];
		
			
			for (int i = 0; i < 19; i++) {
			
			// check if arrays are not equal by comparing both at same index
			if (Key[i] != Answer[i]) {
				
				missedQuestions[i] = i+1; // add the question number that student missed to 
										// missedQuestions array 
			}
			
		
		}
		
		return missedQuestions;
	}
	
	
}
