package example;

public class test {

	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		cl.powerOn(); 
		
		int sum = cl.plus(15, 20);
		System.out.println(sum);		// ���ϰ��� �޾ƾ� �ϱ� ������ �ΰ��� ���� �ϳ��� ������ ��Ƽ� �� ������ ȣ��.
		
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
		System.out.println("������ �Ҵ�");	
	}

	int plus(int x, int y) {		
		
		int result = x + y;			// �� ����� ���� result�� ����
		return result;
		
	}
	
	double devide(int x, int y) {
		
		double result = (double)x / (double)y;
		return result;
		
	}
	
	
}
