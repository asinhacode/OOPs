package two;

import java.util.Arrays;
import java.util.Random;

public class Loops
{

	public static void main(String[] args)
	{
		// doWhile(10);
		
		// frequency(9, 250);
		
		int[] s = {1, 2, 3, 4, 5};
		
		// enhanced(s);
		
		add5(s);
		
		
	}
	
	/**
	 * adds 5 to each element in the array
	 *
	 * 
	 * !!PASS BY REFERENCE!!
	 * 
	 * @param s
	 */
	 static void add5(int[] s) 
	 {
		
		 for(int i = 0; i < s.length; i++)
		 {
			 s[i] += 5;
		 }
		 
		 System.out.println(Arrays.toString(s));
		
	}

	/**
	 * return the sum of array using enhanced loop
	 * @param a
	 */
	static void enhanced(int[] a)
	{
		int sum = 0;
		
		for(int i: a)
		{
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	static void frequency(int size, int repeat)
	{
		/*
		 * face of the dice : size
		 * 
		 * ++frequency[r.nextInt(size)]; increments the value of current index
		 * 
		 * suppose r.nextInt(size) = 3; increases the value stored there by 1
		 */
		Random r = new Random();
		
		int frequency[] = new int[size];
		
		for(int i = 0; i < repeat; i++)
		{
			++frequency[r.nextInt(size)];
		}
		
		for(int i = 0; i < frequency.length; i++)
		{
			System.out.println(i + "\t" + frequency[i]);

		}
		
	}
	static void doWhile(int count)
	{

		int starter = 0;
		
		do 
		{
			System.out.println(starter);
			starter++;
		}
		
		while(starter < count ); // notice the ;
	}

	static void comment() {
		System.out.println("Notice ; at the end of while !!");

	}
}
