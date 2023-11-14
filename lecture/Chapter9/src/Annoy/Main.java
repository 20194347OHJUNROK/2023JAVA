package Annoy;

public class Main {

	public static void main(String[] args) {
		
		Main m = new Main();
		
//		m.TestMethod(new Child()); 
		m.TestMethod(new Parent()
		{
			void method() 
			{
				System.out.println("I am a child");
			}
		});//익명객체 정의하는 방식
		
		RemoteControl r = new RemoteControl()
		{
			public void TurnOn() 
			{
				System.out.println("전원이 켜졌습니다");
			}
		};
		r.TurnOn();
		
	}	
		
		void TestMethod(Parent p) {
			p.method();
		}
	
	
	
	void TestMethod(Parent p) {
		p.method();
	}
	//-----------------------------------------------------------------------------------------------
	
		// TODO Auto-generated method stub
	Parent p = new Parent() 
	{
		public void method() 
		{
			System.out.println("I am a new child");
		}
	}; // 익명 객체를 정의한 것
	
	p.method();
}

	
//	
//	void method2() {
////		class Child2 extends Parent{
////			void method() {
////				System.out.println("I am child");
////			}
//	}
//		Parent p = new Parent() {
//			void method() {
//				System.out.println("I am a new child");
//			}
//		};
//		p.method();

