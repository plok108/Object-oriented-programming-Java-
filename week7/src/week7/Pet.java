package week7;

public class Pet {
	// 필드 선언
	String name;
	String type;
	int age;
	String color;
	
	// 매개변수가 2개인 생성자
	Pet(String name, String type){
		this.name = name;
		this.type = type;
		this.age = 0;
		this.color = "미정";
	}
	
	// 생성자의 매개변수를 이용해서 초기화
	// 변수명은 필드명과 동일하게 하되, this.name = name으로 해라
	Pet(String name, String type, int age){
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	// 매개변수가 4개인 생성자
	Pet(String name, String type, int age, String color){
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
}
