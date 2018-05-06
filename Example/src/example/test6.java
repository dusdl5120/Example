package example;

public class test6 {

	public static void main(String[] args) {
		
		double res1 = 10 * 10 * Calcul.pi;
		int res2 = Calcul.plus(10, 20);
		int res3 = Calcul.minus(40, 30);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		
	}

}


class Calcul {
	
	static double pi = 3.14;
	
	static int plus (int x, int y) {
		return x + y;
	}
	
	static int minus (int x, int y) {
		return x - y;
	}
	
}