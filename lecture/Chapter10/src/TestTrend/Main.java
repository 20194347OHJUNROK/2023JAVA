package TestTrend;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		(1)
////		DongTest 클래스를 통한 접근
////		DongTest dong = new DongTest();		
//		
//// 		추상 클래스를 통한 접근
////		Runnable dong = new DongTest();
////		Thread thread = new Thread(dong);
//		
//		
//		Thread thread = new Thread(new Runnable() {
//				public void run() 
//		{
//			for(int i=0; i<10; i++) {
//			System.out.println("Dong");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			}
//		}
//		}
//		);
//		
		
		
//		(2)
//		Thread thread = new DongThread();
		Thread thread = new Thread() {
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
			
		};
		thread.start();
		
		
		
//	------------------------------------------------------------------------------	
		for(int i=0; i<10; i++)
		{
			System.out.println("Ding");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
