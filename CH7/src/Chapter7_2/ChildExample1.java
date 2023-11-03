package Chapter7_2;

public class ChildExample1 {
	public static void main(String[] args) {
		  Child1 child = new Child1();

		  Parent1 parent = child;

		  parent.method1();

		  parent.method2();

		  //parent.method3(); 호출 불가능
	}
}
