package chap06;

public class Car {
	//field
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	int speed;
	//생성자
	Car(){
		
	}
	Car(String model){
		this(model,"은색",250); //맨 마지막 생성지 호출
	}
	Car(String model,String color){
		this(model,color,250);
	}
	Car(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
