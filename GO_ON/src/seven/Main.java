package seven;

import java.util.EnumSet;

public class Main 
{

	public static void main(String[] args) 
	{
		
		// no need to instantiate
		// .values is a method
		// p prints the name of the constant
		
		for(People p : People.values())
		{
			System.out.printf("%s\t%s\t%d\n", p, p.getAffection(), p.getAge());
		}
		
		System.out.println();
		
		// using EnumSet you can specify a range of constants instead of the entire constant.
		
		for(People p : EnumSet.range(People.Eve, People.Jesus))
		{
			System.out.printf("%s\t%s\t%d\n", p, p.getAffection(), p.getAge());

		}
	}

}
