package exam3;
import CheolMan.Car;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.SetSpeed(20);	
		System.out.println("Car speed is " + car1.speed);
//		System.out.println("Car position is " + car1.positionX);
//		System.out.println("Number of Cars is" + car1.numOfCars);
		
		
		Calculator cal = new Calculator();
		System.out.println("6 - 3 is " + Calculator.minus(6, 3));
		
		
//		Calculator.SetColor("Blue");
		cal.SetColor("Blue");
		
		Main main = new Main();
		main.sayHi();
	}	
	
	void sayHi() 
	{
		System.out.println("Hi");
	}
}
