package CH7;

public class Main {
	public static void main(String[] args) {
//		코드의 간결함(다향성)
		Tire tire = new KumhoTire();
		NewCar sc = new NewCar(tire);
		sc.run();
		
		tire = new HankookTire();
		sc.SetTire(tire);
		sc.run();
		

		HankookTire hTire = new HankookTire();
		Car sc2 = new Car(hTire);
		sc2.run();
		
		KumhoTire kTire = new KumhoTire();
		sc2.SetTire(kTire);
		sc2.run();
		
		
		sc.Setspeed(3);
		
		System.out.println("speed : " + sc.speed);
		} 

	}
