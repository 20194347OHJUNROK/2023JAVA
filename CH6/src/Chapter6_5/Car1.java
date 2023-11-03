package Chapter6_5;

public class Car1 {
	//필드
	String model;
	int speed;
	
	//생성자
	Car1(String model) 
	{this.model = model;}

	
	//메소드
	void setSpeed(int speed) 
	{this.speed = speed;}
	
	void run() 
	{
		for(int i=10; i<=50; i+=10) 
		{
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	}	
}
