package SynchTest;

public class User2 extends Thread {
	private calculator cal;
	
	public void setCalculator(calculator cal) 
	{
		this.setName("User2"); //Thread에서 온거
		this.cal = cal;
	}
	
	public void run() 
	{cal.setMemory(50);}
	
}
