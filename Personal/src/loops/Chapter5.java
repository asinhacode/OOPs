/**
 * Questions 5.11 to the end
 */
package loops;

import java.util.Scanner;

public class Chapter5 {

	private static int minimum = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) {
		
		
		/*
		 * System.out.println("Enter a number:\t");
		 * 
		 * int test = Integer.parseInt(scan().next());
		 * 
		 * findSmallest(test);
		 */
		
		//oddProduct();
		
		System.out.println(factorial(20));
		
	}
	
	/**
	 * Find the smallest amongst the data
	 * 
	 * set min to POSITIVE infinity
	 * 
	 * continue loop till not a number
	 * 
	 * check if min < input
	 * 
	 * once loop terminates print the minimum
	 * @return
	 */
	
	public static void findSmallest(int test) {

		while(test != -1000)
		{
			if(minimum > test)
			{
				minimum = test;
			}			
			System.out.println("Enter a number:\t");
			
			test = Integer.parseInt(scan().next());
		}
		
		System.out.println("Minimum:\t" + minimum);
		
		
	}
	
	/**
	 * Product of numbers between 1 and 15
	 * @return
	 */
	
	public static void oddProduct() {
		
		int product = 1;
		
		for(int i = 2; i < 16; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
				product *= i;

				System.out.println("Product: " + product);
			}
			
		}
		
	}
	
	public static long factorial(long number) {
		
		
		if(number == 0) {
			return 1;
		}
		
		else {
			return number * factorial(number - 1);
		}
	}
	
	/**
	 * Calculate compound interest for 5, 6, 7, 8, 9%
	 * 
	 * @return
	 */
	
	public static void compound(double principle) {
		
		for(int i = 5; i < 11; i++)
		{
			double finalAmount = principle * Math.pow((1 + (i / 100)), (i - 4));
			
			System.out.println(finalAmount);
		}
	}
	
	public static Scanner scan() {
		Scanner a = new Scanner(System.in);
		return a;
	}
	
	

}
