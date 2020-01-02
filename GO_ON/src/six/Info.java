package six;

public class Info {

	public String name;
	public String address;
	
	public Age min; 
	
	public Info(String n, String a, int b, int c)
	{
		name = n;
		address = a;
		min = new Age(b,c);
	}
	
	public String allTogether()
	{
		return "Name: " + name + "\n" + "Address: \"" + address + "\"\n" + "Age: " + min.yourAge()+ " years old.";
	}
	
	public void increment5()
	{
		for(int i = min.getBirthYear(); i <= min.getCurrentYear(); i += 5)
		{
			System.out.println(i);
		}
	}
}
