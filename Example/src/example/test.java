package example;

public class test {

	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		cl.powerOn(); 
		
		int sum = cl.plus(15, 20);
		System.out.println(sum);		// 리턴값을 받아야 하기 때문에 두개의 값을 하나의 변수에 담아서 그 변수를 호출.
		
		byte x = 20;
		byte y = 4;
		double dev2 = cl.devide(x, y);
		System.out.println(dev2);
		
		double dev = cl.devide(50, 20);
		System.out.println(dev); 

	}

}

class Calculator {
	
	void powerOn() {
		System.out.println("전원을 켠다");	
	}

	int plus(int x, int y) {		
		
		int result = x + y;			// 이 결과의 값을 result에 대입
		return result;
		
	}
	
	double devide(int x, int y) {
		
		double result = (double)x / (double)y;
		return result;
		
	}
	
	
}
