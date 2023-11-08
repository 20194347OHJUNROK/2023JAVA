package Animal;

public class Main {
	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		Dog d = new Dog();
		
		
		h.SetPatient(d);
		h.CheckSound();
		h.CheckSmell();
		
		Store s = new Store();
		s.SetItem(d);
		s.CheckPrice();
		
		
	}
}
