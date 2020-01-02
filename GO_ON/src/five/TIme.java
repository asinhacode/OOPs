package five;

public class TIme 
{

	public static void main(String[] args) 
	{
		System.out.println(value(250));
	}
	
	static String value(int value)
	{
		return String.format("%01d", value);
	}

}
