package six;

public class Composition 
{

	public static void main(String[] args) 
	{
		Info i = new Info("Anupam", "3 rappar rd", 1800, 1862);
		
		System.out.println(i.allTogether());
		
		i.increment5();
	}

}
