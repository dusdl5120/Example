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
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);			// �̰͵��� ���������� model������ �����Ͱ� ���ְ�, ����� ���ǵ常 �⺻������ ���
		
		
		Car car3 = new Car("�ڰ���", "red");		// �̰� 2���� �Ű����� ����, �Ű�Ÿ���� String, String��
													// Car(String model, String color) �����ڰ� ������ �ǰ� ��ü�� ��������°���
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);			// �̰͵��� ���������� ��������� �����Ͱ� ���ְ�, ���ǵ常 �⺻������ ���
		
		
		Car car4 = new Car("�ڰ���", "red", 200);	// �̰� 3���� �Ű����� ���� �Ű�Ÿ���� String, String, int��
		                                          	// Car(String model, String color, int maxSpeed) �����ڰ� ������ �ǰ� ������ �ǰ� ��ü�� ��������°���
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);			// �̰͵��� ���������� ��� �ܺο��� �Է��� ������ �ʵ��� ������ ������ 
		
		// ������ ��ü�� ������ �� �ڿ� ��ȣ�ȿ� �Ű����� Ÿ���� �����̰�, ���� �����̳Ŀ� ����
		// �ؿ� ������ ����͵� �߿��� �ϳ��� ������ �Ǿ ��ü�� ��������°���
		
	}

}

