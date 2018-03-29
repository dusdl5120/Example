package example;

public class test4 {

	public static void main(String[] args) {

		Ship Ship1 = new Ship();										
		
		System.out.println("Ship1.company : " + Ship1.company);
		System.out.println("Ship1.model : " + Ship1.model);
		System.out.println("Ship1.color : " + Ship1.color);
		System.out.println("Ship1.maxSpeed : " + Ship1.maxSpeed); 		
		
		
		Car Ship2 = new Car("자가용");				
		
		System.out.println("Ship2.company : " + Ship2.company);
		System.out.println("Ship2.model : " + Ship2.model);
		System.out.println("Ship2.color : " + Ship2.color);
		System.out.println("Ship2.maxSpeed : " + Ship2.maxSpeed);			
		
		
		Car Ship3 = new Car("자가용", "red");		
		
		System.out.println("Ship3.company : " + Ship3.company);
		System.out.println("Ship3.model : " + Ship3.model);
		System.out.println("Ship3.color : " + Ship3.color);
		System.out.println("Ship3.maxSpeed : " + Ship3.maxSpeed);		
		
		
		Car Ship4 = new Car("자가용", "red", 200);	
		
		System.out.println("Ship4.company : " + Ship4.company);
		System.out.println("Ship4.model : " + Ship4.model);
		System.out.println("Ship4.color : " + Ship4.color);
		System.out.println("Ship4.maxSpeed : " + Ship4.maxSpeed);			
		
	}

}

class Ship {								// 앞에 Car 클래스를 더 간단하게 코딩하는 방법
											// 한 패키지 않에 같은 이름으로 클래스명을 지정할 수 없어서 일단 Ship으로 표현함
	
	String company = "현대자동차";			
	String model;
	String color;							 
	int maxSpeed;							
	
	Ship() {    							
		
		
	}

	Ship(String model) {								// 초기화 내용을 한 생성자에 몰아서 작성 ( 맨 밑에 매개변수 3개짜리)
														// 그니까 초기화 내용이 비슷한 애들을 한 생성자에 몰아서 작성하는거랴 ㅋㅋ
		
		// System.out.println("Car model이 실행");		// this()생성자를 사용하기 전에 다른 실행문이 와버리면 에러가 남 (x)
		this(model, null, 0);							// 고로 this()생성자를 사용하려면 무조건 첫줄에 와야함
		// System.out.println("Car model이 실행");		// 얘는 OK.		
		
														// 위에 있는 코드가 원래 (예를들어)
		
		// this.model = model;							 
		// this.color = "은색";							  
		// this.maxSpeed = 250;							
														// 이거다. 줄여쓰면 저렇게 위에 한줄. this(model, null, 0);
														// 각기 다른 생성자를 만들때 (매개변수 1개, 2개, 3개짜리) 똑같이 저렇게 세줄씩 적어야 하는데 
														// 그럼 중복이 많아지고 하니까 this를 써서 중복방지 !!
														// this.model = model은 외부의 값을 가져와서 필드값에 넣어주고,
														// this.color의 초기값을 은색으로, speed값의 초기값을 250으로 지정.
														// 한줄로 줄여쓰는게 속도면에 있어서도 효과적
		
														// 이때 model은 매개변수로 model을 받으니까 this옆에 model 고대로 써주고, 나머지는 외부에서 값을 가져와야하는건데
														// 값을 가져올수 없으니까 기본값으로 null (String은 기본값이 null이니까), 0 (int의 기본형은 0이니까)으로 적어준다는 의미
	}
	
	Ship(String model, String color) {					// 위에 변수가 4개가 있다. 근데 company는 초기값을 현대자동차로 줬기 때문에 얘는 일단 패스
														// 이것도 역시 model과 color를 외부(매개변수를 뜻하는듯)에서 값을 받으니까 this옆에 고대로 값을 넣어주고
		this(model, color, 0);							// speed값은 외부에서 값을 못가져오니까 기본값으로 그냥 0으로.
														// 만약 this()생성자를 사용하는데 매개변수의 값이 맞지 않는다. 그럼 오류남
														// this() 생성자를 호출하려면 그에 맞는 매개변수의 타입과 개수, 값을 잘 맞춰야 함 
	}

	Ship(String model, String color, int maxSpeed) {	// 만약에 매개변수 1개짜리 생성자에서 이 매개변수 3개짜리 생성자를 호출하고 싶으면
														// this(model, null, 0); 보면 this하고 ()안에 매개변수 3개들어있는 것을 확인할 수 있쥐
		this.model = model;								// 저 this안에 매개변수 3개의 값들을 요 옆에 매개변수 3개짜리 매개변수의 값들을 지정해주면 되는거임
		this.color = color;								// 이게 뭔소린고 하니~
		this.maxSpeed = maxSpeed;						// this(model, null, 0);  model -> String model, null -> String color,  0 -> int maxSpeed
														// 매개변수 3개짜리의 타입과 순서에 맞춰서 this(string model값, string color값, int maxSpeed값) 넣으려는값 집어넣기

													
		// 만약 new Car ("자가용")을 한다고 하면 얘는 Ship()의 매개변수 1개짜리를 호출하는게 맞지만 얘가 this()생성자를 사용하니까 this() 생성자를 호출하는거
		// 그래서 this() 생성자는 고로 매개변수 3개짜리니까 결론은 
		
		// this.model = model;	
		// this.color = color;		
		// this.maxSpeed = maxSpeed;	
		// 이렇게 세줄을 실행을 한번 하고 
		
		// 그다음에 매개변수 1개짜리 생성자인 
		
		// this(model, null, 0);      <- 얘를 
		// 이렇게 초기화 한다는 것. 
		
		
		

						
	}	
}

