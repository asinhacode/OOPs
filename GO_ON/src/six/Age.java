package six;

public class Age 
{
	private int birthYear;
	private int currentYear;
	
	public Age(int birth, int current)
	{
		birthYear = birth;
		currentYear = current;
	}
	
	public int yourAge() {
		return currentYear - birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
}
