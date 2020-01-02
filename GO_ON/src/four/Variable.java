package four;

/**
 * FInd the maximum from VARIABLE length arguments
 * @author anupamsinha
 *
 */
public class Variable 
{

	public static void main(String[] args) 
	{
		System.out.println("Maximum: " + findMax(100000,2,3,400,3,2,5,1,7876));
		System.out.println("Minimum: " + findMin(100000,-2,3,400,3,2,5,1,7876));

	}
	
	// variable length argument
	static int findMax(int ...value)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i : value)
		{
			max = Math.max(max, i);
		}
		
		return max;
	}
	
	// find the minimum
	static int findMin(int ...variable)
	{
		int min = Integer.MAX_VALUE;
		
		for(int j : variable)
		{
			min = Math.min(min, j);
		}
		
		return min;
	}

}
