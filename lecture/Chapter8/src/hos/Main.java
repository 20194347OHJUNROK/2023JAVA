package hos;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Pet p1 = new Dog("BACKHO", 25);
		Pet p2 = new Cat("NABI", 3);
		//Pet p3 = new Pet("CBH);
		
		m.ShowOwner(p1);
		m.TestCry(p1);
		m.TestRunSpeed(p1);
		
		m.ShowOwner(p2);
		m.TestCry(p2);
		m.TestRunSpeed(p2);
	}
	
	void ShowOwner(Pet p) 
	{
		System.out.println("Owner's name is " + p.OwnerName());
	}
	
	void TestCry(Pet p) 
	{
		p.Cry();
	}
	
	void TestRunSpeed(Pet p) 
	{
		if(p instanceof Dog) 
		{
			Dog d = (Dog)p;
			System.out.println("Run speed is " + d.RunSpeed());
		}
		else if(p instanceof Cat)
		{
			Cat c =(Cat)p;
			System.out.println("Jumpig Height is " + c.JumpigHeight());
		}
		System.out.println("----------------------------------------------------------");
	}

}