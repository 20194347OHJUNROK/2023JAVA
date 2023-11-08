package Test;

public class Main {
	public static void main(String[] args) 
	{
		A a = new A();
		A.B b = a.new B();
		A.C c = new A.C();
		
		A.memberA = 20;  
//		A클래스에서 static으로 memberA를 선언해줬기때문에 A.memberA로 바로 사용 가능
		System.out.println(A.memberA);
		
		//class에 붙는 static과 멤버에 붙는 static의 의미 차이
		//클래스의 멤버(필드, 메서드)에 붙는 static키워드는 정적으로 메모리를 할당하므로 객체 생성 없이도 사용 가능하다는 의미
		//클래스에 붙는 static은 외부 클래스의 객체 생성없이 내부 클래스의 객체를 생성할 수 있다는 의미
//		→ 외부 클래스의 멤버 중 객체 생성 없이 바로 사용할 수 있는 정적(static)멤버만 정적 내부 클래스에서 사용할 수 있다
	}

}
