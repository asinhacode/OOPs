package ten;

public class Main {

	public static void main(String[] args) 
	{
		DogList dl = new DogList();
		Dog d = new Dog();
		dl.add(d);
		dl.add(d);
		dl.add(d);
		dl.add(d);
		
		AnimalList al = new AnimalList();
		al.add(d);
		Fish f = new Fish();
		al.add(f);
		al.add(f);
		al.add(d);

	}

}
