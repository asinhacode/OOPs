package nine;

public class Alive 
{

	public static void main(String[] args) 
	{
		Meat fish = new Meat();
		fish.eat();
		fish.why();
		printLn();

		food f = new food();
		f.eat();
		printLn();

		Vegetables v = new Vegetables();
		v.eat();
		printLn();

		// the data type can be a superclass
		food g = new Meat();
		g.eat();
		printLn();
		// g cannot access why() method

		
		// example
		food a[] = new food[3];
		a[0] = new food();
		a[1] = new Meat();
		a[2] = new Vegetables();
		
		printLn();
		// polymorphic array
		for(int i = 0; i < 3; i++)
		{
			a[i].eat();
		}



		
	}
	
	static void printLn() {
		System.out.println();
	}

}
