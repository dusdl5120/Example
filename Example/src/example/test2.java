package example;

public class test2 {

	public static void main(String[] args) {
		
		Gas gas = new Gas();
		
		gas.setGas(10);
		
		boolean gasState = gas.isLeftGas();
		
		if(gasState) {						// �갡 ���̸�   �� , ���ᰡ ������
			System.out.println("���");     // �����ض�
			gas.run();
		}
		
		if (gas.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 ����");
		}else {
			System.out.println("gas�� �����϶�");
		}
		
	}

}

class Gas {

	int gas;
	
	void setGas(int gas) {		// �̰� ��������
		this.gas = gas;
		
	}
	
	boolean isLeftGas() {						// �̰� �����ֳ� ����
		
		if (gas == 0) {
			System.out.println("gas�� ����");
			return false;
		}
		
		System.out.println("gas�� �ִ�.");
		return true;
	}
		
	void run() { 	// �޸��� �����̴�		// 
		
		while(true) {		// ���ѹݺ�
			if (gas > 0) {		// ������ ������
				System.out.println("�޸���" + "gas�ܷ��� " + gas);	
				gas--;
			}else {
				System.out.println("�����. " + "gas�ܷ��� " + gas);
				return;
			}
		}
		
	}
	
	
}
