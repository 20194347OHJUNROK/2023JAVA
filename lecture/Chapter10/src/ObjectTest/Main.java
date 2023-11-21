package ObjectTest;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		
		System.out.println(k1.equals(k2));
		
		hashMap.put(k1, "HongGilDong");
		String value = hashMap.get(k2);
		System.out.println(value);
		

		
//		MyClass m = new MyClass();
//		System.out.println(m.toString());
		
		String str1 = new String("Hello PYTHON");
		String str2 = new String("Hello PYTHON");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		
		Object obj1 = new MyClass(1234);
		Object obj2 = new MyClass(1234);
	
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));

	}

}
