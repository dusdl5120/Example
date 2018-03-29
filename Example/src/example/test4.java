package example;

public class test4 {

	public static void main(String[] args) {

		Ship Ship1 = new Ship();										
		
		System.out.println("Ship1.company : " + Ship1.company);
		System.out.println("Ship1.model : " + Ship1.model);
		System.out.println("Ship1.color : " + Ship1.color);
		System.out.println("Ship1.maxSpeed : " + Ship1.maxSpeed); 		
		
		
		Car Ship2 = new Car("�ڰ���");				
		
		System.out.println("Ship2.company : " + Ship2.company);
		System.out.println("Ship2.model : " + Ship2.model);
		System.out.println("Ship2.color : " + Ship2.color);
		System.out.println("Ship2.maxSpeed : " + Ship2.maxSpeed);			
		
		
		Car Ship3 = new Car("�ڰ���", "red");		
		
		System.out.println("Ship3.company : " + Ship3.company);
		System.out.println("Ship3.model : " + Ship3.model);
		System.out.println("Ship3.color : " + Ship3.color);
		System.out.println("Ship3.maxSpeed : " + Ship3.maxSpeed);		
		
		
		Car Ship4 = new Car("�ڰ���", "red", 200);	
		
		System.out.println("Ship4.company : " + Ship4.company);
		System.out.println("Ship4.model : " + Ship4.model);
		System.out.println("Ship4.color : " + Ship4.color);
		System.out.println("Ship4.maxSpeed : " + Ship4.maxSpeed);			
		
	}

}

class Ship {								// �տ� Car Ŭ������ �� �����ϰ� �ڵ��ϴ� ���
											// �� ��Ű�� �ʿ� ���� �̸����� Ŭ�������� ������ �� ��� �ϴ� Ship���� ǥ����
	
	String company = "�����ڵ���";			
	String model;
	String color;							 
	int maxSpeed;							
	
	Ship() {    							
		
		
	}

	Ship(String model) {								// �ʱ�ȭ ������ �� �����ڿ� ���Ƽ� �ۼ� ( �� �ؿ� �Ű����� 3��¥��)
														// �״ϱ� �ʱ�ȭ ������ ����� �ֵ��� �� �����ڿ� ���Ƽ� �ۼ��ϴ°ŷ� ����
		
		// System.out.println("Car model�� ����");		// this()�����ڸ� ����ϱ� ���� �ٸ� ���๮�� �͹����� ������ �� (x)
		this(model, null, 0);							// ��� this()�����ڸ� ����Ϸ��� ������ ù�ٿ� �;���
		// System.out.println("Car model�� ����");		// ��� OK.		
		
														// ���� �ִ� �ڵ尡 ���� (�������)
		
		// this.model = model;							 
		// this.color = "����";							  
		// this.maxSpeed = 250;							
														// �̰Ŵ�. �ٿ����� ������ ���� ����. this(model, null, 0);
														// ���� �ٸ� �����ڸ� ���鶧 (�Ű����� 1��, 2��, 3��¥��) �Ȱ��� ������ ���پ� ����� �ϴµ� 
														// �׷� �ߺ��� �������� �ϴϱ� this�� �Ἥ �ߺ����� !!
														// this.model = model�� �ܺ��� ���� �����ͼ� �ʵ尪�� �־��ְ�,
														// this.color�� �ʱⰪ�� ��������, speed���� �ʱⰪ�� 250���� ����.
														// ���ٷ� �ٿ����°� �ӵ��鿡 �־�� ȿ����
		
														// �̶� model�� �Ű������� model�� �����ϱ� this���� model ���� ���ְ�, �������� �ܺο��� ���� �����;��ϴ°ǵ�
														// ���� �����ü� �����ϱ� �⺻������ null (String�� �⺻���� null�̴ϱ�), 0 (int�� �⺻���� 0�̴ϱ�)���� �����شٴ� �ǹ�
	}
	
	Ship(String model, String color) {					// ���� ������ 4���� �ִ�. �ٵ� company�� �ʱⰪ�� �����ڵ����� ��� ������ ��� �ϴ� �н�
														// �̰͵� ���� model�� color�� �ܺ�(�Ű������� ���ϴµ�)���� ���� �����ϱ� this���� ���� ���� �־��ְ�
		this(model, color, 0);							// speed���� �ܺο��� ���� ���������ϱ� �⺻������ �׳� 0����.
														// ���� this()�����ڸ� ����ϴµ� �Ű������� ���� ���� �ʴ´�. �׷� ������
														// this() �����ڸ� ȣ���Ϸ��� �׿� �´� �Ű������� Ÿ�԰� ����, ���� �� ����� �� 
	}

	Ship(String model, String color, int maxSpeed) {	// ���࿡ �Ű����� 1��¥�� �����ڿ��� �� �Ű����� 3��¥�� �����ڸ� ȣ���ϰ� ������
														// this(model, null, 0); ���� this�ϰ� ()�ȿ� �Ű����� 3������ִ� ���� Ȯ���� �� ����
		this.model = model;								// �� this�ȿ� �Ű����� 3���� ������ �� ���� �Ű����� 3��¥�� �Ű������� ������ �������ָ� �Ǵ°���
		this.color = color;								// �̰� ���Ҹ��� �ϴ�~
		this.maxSpeed = maxSpeed;						// this(model, null, 0);  model -> String model, null -> String color,  0 -> int maxSpeed
														// �Ű����� 3��¥���� Ÿ�԰� ������ ���缭 this(string model��, string color��, int maxSpeed��) �������°� ����ֱ�

													
		// ���� new Car ("�ڰ���")�� �Ѵٰ� �ϸ� ��� Ship()�� �Ű����� 1��¥���� ȣ���ϴ°� ������ �갡 this()�����ڸ� ����ϴϱ� this() �����ڸ� ȣ���ϴ°�
		// �׷��� this() �����ڴ� ��� �Ű����� 3��¥���ϱ� ����� 
		
		// this.model = model;	
		// this.color = color;		
		// this.maxSpeed = maxSpeed;	
		// �̷��� ������ ������ �ѹ� �ϰ� 
		
		// �״����� �Ű����� 1��¥�� �������� 
		
		// this(model, null, 0);      <- �긦 
		// �̷��� �ʱ�ȭ �Ѵٴ� ��. 
		
		
		

						
	}	
}

