package example;

public class test3 {

	public static void main(String[] args) {

		Car car1 = new Car();						// �̰� �ؿ� Car()�����ڸ� �����ϰ� car1�̶�� ��ü�� �����ߴٴ� ��
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed); 		// �̰͵��� ���������� company�� ���� ����ְ� �������� ��� �⺻��
		
		
		Car car2 = new Car("�ڰ���");				// �Ű������� ���ڿ�(String)�̰� ���ڿ� 1���� ������ �ִ� Car(String model) �̶�� �����ڰ� ������ �Ǿ
													// Car(String model) �����ڸ� �����ϰ� ��ü�� �������
		System.out.println("car2.company : " + car1.company);
		System.out.println("car2.model : " + car1.model);
		System.out.println("car2.color : " + car1.color);
		System.out.println("car2.maxSpeed : " + car1.maxSpeed);			// �̰͵��� ���������� model������ �����Ͱ� ���ְ�, ����� ���ǵ常 �⺻������ ���
		
		
		Car car3 = new Car("�ڰ���", "red");		// �̰� 2���� �Ű����� ����, �Ű�Ÿ���� String, String��
													// Car(String model, String color) �����ڰ� ������ �ǰ� ��ü�� ��������°���
		System.out.println("car3.company : " + car1.company);
		System.out.println("car3.model : " + car1.model);
		System.out.println("car3.color : " + car1.color);
		System.out.println("car3.maxSpeed : " + car1.maxSpeed);			// �̰͵��� ���������� ��������� �����Ͱ� ���ְ�, ���ǵ常 �⺻������ ���
		
		
		Car car4 = new Car("�ڰ���", "red", 200);	// �̰� 3���� �Ű����� ���� �Ű�Ÿ���� String, String, int��
		                                          	// Car(String model, String color, int maxSpeed) �����ڰ� ������ �ǰ� ������ �ǰ� ��ü�� ��������°���
		System.out.println("car4.company : " + car1.company);
		System.out.println("car4.model : " + car1.model);
		System.out.println("car4.color : " + car1.color);
		System.out.println("car4.maxSpeed : " + car1.maxSpeed);			// �̰͵��� ���������� ��� �ܺο��� �Է��� ������ �ʵ��� ������ ������ 
		
		// ������ ��ü�� ������ �� �ڿ� ��ȣ�ȿ� �Ű����� Ÿ���� �����̰�, ���� �����̳Ŀ� ����
		// �ؿ� ������ ����͵� �߿��� �ϳ��� ������ �Ǿ ��ü�� ��������°���
		
	}

}

class Car {									// ������ �����ε��� ���� �Ű������� Ÿ��, ����, ������ ��� �� �ٸ� �����ڸ� �����ؾ���
	
	String company = "�����ڵ���";			// company ������ �����ڵ����� �ʱ�ȭ�� �� ��
	String model;
	String color;							// model�� color, maxSpeed�� �⺻������ �ʱ�ȭ�� �� �� 
	int maxSpeed;							// String�� �⺻���� null, int�� �⺻���� 0
	
	Car() {    								// �Ű����� ���� ������    ,   �� ������ �ʱⰪ�� �ʱ�ȭ �ϱ� ���� ������ ������
		
		// ����� �Ű������� ���� ���� �׳� �⺻ �����ڶ� ���θ޼ҵ忡�� �� �����ڸ� ȣ���ϸ� �⺻���� ��µ� (company�� �����ڵ���, ������ �⺻��)
	}

	Car(String model) {						// model�� ����ŭ�� �ܺο��� ���� �޾Ƽ� �� ������ �ʱ�ȭ�� �ϰڴ�
		
		this.model = model;					// �� �ް������� model���� �ʵ��� model���� ����
	}
	
	Car(String model, String color) {		// model�� ���� color�� ���� �ܺο��� �޾Ƽ� �� ������ �ʱ�ȭ�� �ϰڴ� (maxSpeed�� ����)
											// Car ��ü�� �����ϰ��� �� ���� �� �����ڸ� Ȱ�����ض�
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {		// model color maxSpeed�� �� ��� �ܺο��� ���� �޾Ƽ� �� ������ �ʱ�ȭ�� �ϰ��� �� ��
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	/*
	Car(String color, String model, int maxSpeed) {		// ���� �Ű������� ������ �ٸ��ٰ� �ؼ� �����ڿ����ε��� �� �� ����. 
														// String, String, int�� ������ ���� ������ �ȵ�.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	*/
	
}

