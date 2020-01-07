package ten;

public class AnimalList 
{
	private Animal[] a = new Animal[5];
	
	int i = 0;
	
	public void add(Animal b)
	{
		if(i < a.length)
		{
			a[i] = b;
			b.noise(); // polymorphism!!!
			i++;
		}
	}
}
