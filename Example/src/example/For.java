package example;

public class For {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for (i=0; i<5; i++) {
			for (j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
