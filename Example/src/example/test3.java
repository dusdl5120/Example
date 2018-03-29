package example;

public class test3 {

	public static void main(String[] args) {

		Car car1 = new Car();						// 이건 밑에 Car()생성자를 실행하고 car1이라는 객체를 생성했다는 말
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed); 		// 이것들의 실행결과값은 company만 값이 들어있고 나머지는 모두 기본값
		
		
		Car car2 = new Car("자가용");				// 매개변수가 문자열(String)이고 문자열 1개를 가지고 있는 Car(String model) 이라는 생성자가 선택이 되어서
													// Car(String model) 생성자를 실행하고 객체를 만든거임
		System.out.println("car2.company : " + car1.company);
		System.out.println("car2.model : " + car1.model);
		System.out.println("car2.color : " + car1.color);
		System.out.println("car2.maxSpeed : " + car1.maxSpeed);			// 이것들의 실행결과값은 model까지는 데에터가 들어가있고, 색깔과 스피드만 기본값으로 출력
		
		
		Car car3 = new Car("자가용", "red");		// 이건 2개의 매개값을 갖고, 매개타입이 String, String인
													// Car(String model, String color) 생성자가 실행이 되고 객체가 만들어지는거임
		System.out.println("car3.company : " + car1.company);
		System.out.println("car3.model : " + car1.model);
		System.out.println("car3.color : " + car1.color);
		System.out.println("car3.maxSpeed : " + car1.maxSpeed);			// 이것들의 실행결과값은 색깔까지는 데이터가 들어가있고, 스피드만 기본값으로 출력
		
		
		Car car4 = new Car("자가용", "red", 200);	// 이건 3개의 매개값을 갖고 매개타입이 String, String, int인
		                                          	// Car(String model, String color, int maxSpeed) 생성자가 선택이 되고 실행이 되고 객체가 만들어지는거임
		System.out.println("car4.company : " + car1.company);
		System.out.println("car4.model : " + car1.model);
		System.out.println("car4.color : " + car1.color);
		System.out.println("car4.maxSpeed : " + car1.maxSpeed);			// 이것들의 실행결과값은 모두 외부에서 입력한 값들이 필드의 값으로 들어가있음 
		
		// 생성자 객체를 생성할 때 뒤에 괄호안에 매개변수 타입이 무엇이고, 값이 무엇이냐에 따라서
		// 밑에 생성자 만든것들 중에서 하나가 선택이 되어서 객체가 만들어지는거임
		
	}

}

class Car {									// 생성자 오버로딩할 때는 매개변수의 타입, 개수, 순서가 모두 다 다른 생성자를 선언해야함
	
	String company = "현대자동차";			// company 변수는 현대자동차로 초기화가 될 것
	String model;
	String color;							// model과 color, maxSpeed는 기본값으로 초기화가 될 것 
	int maxSpeed;							// String의 기본값은 null, int의 기본값은 0
	
	Car() {    								// 매개값이 없는 생성자    ,   이 값들의 초기값을 초기화 하기 위해 생성자 만들자
		
		// 여기는 매개변수의 값도 없고 그냥 기본 생성자라 메인메소드에서 이 생성자를 호출하면 기본값이 출력됨 (company만 현대자동차, 나머진 기본값)
	}

	Car(String model) {						// model의 값만큼은 외부에서 값을 받아서 그 값으로 초기화를 하겠다
		
		this.model = model;					// 이 메개변수의 model값을 필드의 model값에 대입
	}
	
	Car(String model, String color) {		// model의 값과 color의 값을 외부에서 받아서 그 값으로 초기화를 하겠다 (maxSpeed만 빼고)
											// Car 객체를 생성하고자 할 때는 이 생성자를 활용을해라
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {		// model color maxSpeed의 값 모두 외부에서 값을 받아서 그 값으로 초기화를 하고자 할 때
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	/*
	Car(String color, String model, int maxSpeed) {		// 위와 매개변수의 순서가 다르다고 해서 생성자오버로딩이 될 수 없다. 
														// String, String, int의 순서가 같이 때문에 안됨.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	*/
	
}

