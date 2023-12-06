package SynchTest;

public class User1 extends Thread {
	private calculator cal;
	
	public void setCalculator(calculator cal) 
	{
		this.setName("User1"); //Thread에서 온거
		this.cal = cal;
	}
	
	public void run() 
	{cal.setMemory(100);}
}