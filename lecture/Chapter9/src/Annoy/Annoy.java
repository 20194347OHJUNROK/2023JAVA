package Annoy;

public class Annoy {
	int filed = 1;
	
	
	void method(final int arg1, int arg2) {
		final int var1 = 2;
		int var2 = 3;
		
		arg1 = 4; 
//		final때문에 오류
		
		arg2 = 5;
		
		var1 = 6; 
//		final때문에 오류
		
		var2 = 7;

		Calculator c = new Calculator() 
		{
			public int sum() 
			{
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		
		System.out.println(c.sum());
	}
}
