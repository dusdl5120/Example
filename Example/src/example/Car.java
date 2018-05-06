package example;

public class Car {									// 생성자 오버로딩할 때는 매개변수의 타입, 개수, 순서가 모두 다 다른 생성자를 선언해야함
	
	String company = "현대자동차";			// company 변수는 현대자동차로 초기화가 될 것
	String model;
	String color;							// model과 color, maxSpeed는 기본값으로 초기화가 될 것 
	int maxSpeed;							// String의 기본값은 null, int의 기본값은 0
	
	Car() {    								// 매개값이 없는 생성자    ,   이 값들의 초기값을 초기화 하기 위해 생성자 만들자
		
		// 여기는 매개변수의 값도 없고 그냥 기본 생성자라 메인메소드에서 이 생성자를 호출하면 기본값이 출력됨 (company만 현대자동차, 나머진 기본값)
	}

	Car(String model) {						// model의 값만큼은 외부에서 값을 받아서 그 값으로 초기화를 하겠다
		
		//this.model = model;				// 이 메개변수의 model값을 필드의 model값에 대입
		//this(model,"은색");
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {		// model의 값과 color의 값을 외부에서 받아서 그 값으로 초기화를 하겠다 (maxSpeed만 빼고)
											// Car 객체를 생성하고자 할 때는 이 생성자를 활용을해라
		this(model, color, 300);
		//this.model = model;
		//this.color = color;
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

