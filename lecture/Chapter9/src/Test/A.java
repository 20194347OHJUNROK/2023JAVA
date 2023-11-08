package Test;

public class A {
	
	static int memberA = 10;
	int field1 = 10;
	static int field2 = 20;
	
	B b = new B();
	C c = new C();
	
	//static B b1 = new B(); X
	static C c1 = new C();
	void method1() 
	{
		B b = new B();
		C c = new C();
	}
	
	static void method2() {}
	A(){System.out.println("A instance is generated.");}
	
	
//인스턴스 클래스는 바깥 클래스의 변수, 메소드, 정적 변수, 정적 메소드 모두 접근이 가능
	class B 
	{
		
		void method() 
		{
			field1 = 30;
			method1();
			field2 = 40;
			method2();
		}
	}
	
//	static 클래스는 바깥 클래스의 static 외에는 접근이 불가
	static class C
	{
		
		void method()
		{
			//field1 = 30;
			//method1();
			field2 = 40;
			method2();
		}
	}

	
}