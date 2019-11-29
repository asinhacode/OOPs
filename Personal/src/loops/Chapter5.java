/**
 * Questions 5.11 to the end
 */
package loops;

import java.util.Scanner;

public class Chapter5 {

	private static int minimum = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter a number:\t");
		
		int test = Integer.parseInt(a.next());
		
		while(test != -1000)
		{
			findSmallest(test);
			System.out.println("Enter a number:\t");
			
			test = Integer.parseInt(a.next());
		}
		
		System.out.println("Minimum:\t" + minimum);
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
	public static int findSmallest(int test) {
		
		if(minimum > test)
		{
			minimum = test;
		}
		
		return minimum;
	}

}
