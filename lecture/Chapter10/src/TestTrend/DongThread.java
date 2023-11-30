package TestTrend;

// (2) Thread 하위 클래스로부터 생성
public class DongThread extends Thread{
	public void run() 
	{
		for(int i=0; i<10; i++) {
		System.out.println("Dong");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
