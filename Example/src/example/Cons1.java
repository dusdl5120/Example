package example;

public class Cons1 {

	public static void main(String[] args) {

		Computer com = new Computer();
		
		int[] values1 = {1,2,3};
		int res = com.sum1(values1);
		System.out.println(res);
		
		int res2 = com.sum1(new int[] {1,2,3,4,5} );
		System.out.println(res2);
		
		int res3 = com.sum2(1,2,3);
		System.out.println(res3);
		
		int res4 = com.sum2(1,2,3,4,5);
		System.out.println(res4);
		    
		
	}
}

class Computer {
	
	int sum1(int[] values) {
		
		int sum=0;
		
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}

	int sum2(int ... values) {
		int sum = 0;
		
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
}