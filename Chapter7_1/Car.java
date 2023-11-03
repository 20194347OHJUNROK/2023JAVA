package Chapter7_1;

public class Car {
	public int speed;
	
	public void speedUp() 
	{
		speed += 1;
	}		
	
	// final 메소드 : 상속할 수 없는 클래스
	public final void stop() 
	{
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
