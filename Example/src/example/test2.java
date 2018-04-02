package example;

public class test2 {

	public static void main(String[] args) {
		
		Gas gas = new Gas();
		
		gas.setGas(10);
		
		boolean gasState = gas.isLeftGas();
		
		if(gasState) {						// 얘가 참이면   즉 , 연료가 있으면
			System.out.println("출발");     // 실행해라
			gas.run();
		}
		
		if (gas.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없음");
		}else {
			System.out.println("gas를 주입하라");
		}
		
	}

}

class Gas {

	int gas;
	
	void setGas(int gas) {		// 이건 연료주입
		this.gas = gas;
		
	}
	
	boolean isLeftGas() {						// 이건 연료있냐 없냐
		
		if (gas == 0) {
			System.out.println("gas가 없다");
			return false;
		}
		
		System.out.println("gas가 있다.");
		return true;
	}
		
	void run() { 	// 달리는 동작이다		// 
		
		while(true) {		// 무한반복
			if (gas > 0) {		// 가스가 있으면
				System.out.println("달린다" + "gas잔량은 " + gas);	
				gas--;
			}else {
				System.out.println("멈춘다. " + "gas잔량은 " + gas);
				return;
			}
		}
		
	}
	
	
}
