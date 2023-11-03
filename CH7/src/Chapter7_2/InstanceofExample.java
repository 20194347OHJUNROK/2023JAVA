package Chapter7_2;

public class InstanceofExample {
	public static void method1(Parent2 parent) {
		
		if(parent instanceof Child2) 
		{
			Child2 child = (Child2) parent;
			System.out.println("method1 - Child2로 변환 성공");
		} 
		else 
		{
			System.out.println("method1 - Child2로 변환되지 않음");
		}
	}
//--------------------------------------------------------------------------------------	
	
	public static void method2(Parent2 parent) 
	{
		// ClassCastException이 발생할 가능성이 있음
		Child2 child = (Child2) parent;
		System.out.println("method2 - Child2로 변환 성공");
	}
	
	public static void main(String[] args) 
	{
		Parent2 parentA = new Child2();
		method1(parentA);
		method2(parentA);
		
		Parent2 parentB = new Parent2();
//		예외 발생
		method1(parentB); 
		method2(parentB); 
	}
}
