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
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);			// 이것들의 실행결과값은 model까지는 데에터가 들어가있고, 색깔과 스피드만 기본값으로 출력
		
		
		Car car3 = new Car("자가용", "red");		// 이건 2개의 매개값을 갖고, 매개타입이 String, String인
													// Car(String model, String color) 생성자가 실행이 되고 객체가 만들어지는거임
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);			// 이것들의 실행결과값은 색깔까지는 데이터가 들어가있고, 스피드만 기본값으로 출력
		
		
		Car car4 = new Car("자가용", "red", 200);	// 이건 3개의 매개값을 갖고 매개타입이 String, String, int인
		                                          	// Car(String model, String color, int maxSpeed) 생성자가 선택이 되고 실행이 되고 객체가 만들어지는거임
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);			// 이것들의 실행결과값은 모두 외부에서 입력한 값들이 필드의 값으로 들어가있음 
		
		// 생성자 객체를 생성할 때 뒤에 괄호안에 매개변수 타입이 무엇이고, 값이 무엇이냐에 따라서
		// 밑에 생성자 만든것들 중에서 하나가 선택이 되어서 객체가 만들어지는거임
		
	}

}

