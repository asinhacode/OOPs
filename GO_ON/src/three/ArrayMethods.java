package three;

public class ArrayMethods {

	private int[][] twoD;
	
	public ArrayMethods(int row, int column)
	{
		twoD = new int[row][column];
	}
	
	public int[][] getTwoD() {
		return twoD;
	}

	public void setTwoD(int[][] twoD) {
		this.twoD = twoD;
	}

	// create a 2 d array with the specs provided
	 int[][] createArray(int row, int column)
	{
		twoD = new int[row][column];
		return twoD;
	}
	
	 int[][] addValues(int twoD[][])
	{
		for(int i = 0; i < twoD.length; i++)
		{
			for(int j = 0, k = 1; j < twoD[i].length; j++, k++)
			{
				twoD[i][j] = k;
			}
		}
		
		return twoD;
	}
	
	 void displayInfo(int twoD[][])
	{
		// how many rows
		System.out.println("How many rows: " + twoD.length);
				
		// how many elements in row 0
		System.out.println("Row 0: " + twoD[0].length);
		System.out.println("Row 1: " + twoD[1].length);
	}
	
	// prints content of each row
	 void displayArray(int twoD[][]) 
	{
		for(int i = 0; i < twoD.length; i++)
		{
			for(int j = 0; j < twoD[i].length; j++)
			{
				System.out.print(twoD[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
