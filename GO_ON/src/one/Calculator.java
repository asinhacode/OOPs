package one;

public class Calculator 

{

	public static void main(String[] args) 
	{
		String shakespear = "To be or not to be, that is the question.";
		System.out.println(shakespear);
		
		if(shakespear.length() < 15)
		{
			System.out.println("All that glitters is not gold");
		}
		
		else
		{
			System.out.println("All the world's a stage,\n" + 
					"\n" + 
					"And all the men and women merely players:\n" + 
					"\n" + 
					"They have their exits and their entrances;\n" + 
					"\n" + 
					"And one man in his time plays many parts.");
		}
	}

}
