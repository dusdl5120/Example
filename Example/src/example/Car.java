package example;

public class Car {									// ������ �����ε��� ���� �Ű������� Ÿ��, ����, ������ ��� �� �ٸ� �����ڸ� �����ؾ���
	
	String company = "�����ڵ���";			// company ������ �����ڵ����� �ʱ�ȭ�� �� ��
	String model;
	String color;							// model�� color, maxSpeed�� �⺻������ �ʱ�ȭ�� �� �� 
	int maxSpeed;							// String�� �⺻���� null, int�� �⺻���� 0
	
	Car() {    								// �Ű����� ���� ������    ,   �� ������ �ʱⰪ�� �ʱ�ȭ �ϱ� ���� ������ ������
		
		// ����� �Ű������� ���� ���� �׳� �⺻ �����ڶ� ���θ޼ҵ忡�� �� �����ڸ� ȣ���ϸ� �⺻���� ��µ� (company�� �����ڵ���, ������ �⺻��)
	}

	Car(String model) {						// model�� ����ŭ�� �ܺο��� ���� �޾Ƽ� �� ������ �ʱ�ȭ�� �ϰڴ�
		
		//this.model = model;				// �� �ް������� model���� �ʵ��� model���� ����
		//this(model,"����");
		this(model, "����", 250);
	}
	
	Car(String model, String color) {		// model�� ���� color�� ���� �ܺο��� �޾Ƽ� �� ������ �ʱ�ȭ�� �ϰڴ� (maxSpeed�� ����)
											// Car ��ü�� �����ϰ��� �� ���� �� �����ڸ� Ȱ�����ض�
		this(model, color, 300);
		//this.model = model;
		//this.color = color;
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

