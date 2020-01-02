package seven;

public enum People {
	Adam("no love", 900),
	Eve ("no love", 800),
	Abel("love", 100),
	Cain("no love", 800),
	Moses("love", 100),
	Pharaoh("no love", 100),
	Job("love", 800),
	Abraham("love", 500),
	Noah("love", 500),
	Samuel("love", 300),
	Saul("no love", 100),
	Jonathan("love", 70),
	Jesus("love", 33);

	
	private final String affection;
	private final int    age;
	
	People(String aff, int a)
	{
		affection = aff;
		age = a;
	}

	public String getAffection() {
		return affection;
	}

	public int getAge() {
		return age;
	}
	
	
}
