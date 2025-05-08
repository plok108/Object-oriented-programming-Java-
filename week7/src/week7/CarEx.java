package week7;

public class CarEx {
	public static void main(String[] args) {
		// 객체 생성
		// Car() : 생성자
		Car mycar = new Car();
		
		// 필드 값 읽기
		// 필드값은 반드시 객체명을 통해서 접근
		System.out.println("제조회사:" + mycar.company);
		System.out.println("모델:" + mycar.model);
		System.out.println("색상:" + mycar.color);
		System.out.println("최고속도:" + mycar.maxSpeed);
		System.out.println("현재속도:" + mycar.speed);
		
		// 필드값 변경
		mycar.speed = 100;
		System.out.println("현재속도:" + mycar.speed);
		
		// 다른 객체 생성
		Car yourcar = new Car();
		System.out.println("yourcar");
		System.out.println("제조회사:" + yourcar.company);
		System.out.println("모델:" + yourcar.model);
		System.out.println("색상:" + yourcar.color);
		System.out.println("최고속도:" + yourcar.maxSpeed);
		System.out.println("현재속도:" + yourcar.speed);
		
		// 매개변수를 이용한 객체 생성
		Car mycar2 = new Car("그랜저","white", 300);
		
		System.out.println("제조회사:" + mycar2.company);
		System.out.println("모델:" + mycar2.model);
		System.out.println("색상:" + mycar2.color);
		System.out.println("최고속도:" + mycar2.maxSpeed);
		System.out.println("현재속도:" + mycar2.speed);
		
		Car yourcar2 = new Car("소나타","black", 250); // 만들때 초기값을 설정할 수 있음
		System.out.println("yourcar2");
		System.out.println("제조회사:" + yourcar2.company);
		System.out.println("모델:" + yourcar2.model);
		System.out.println("색상:" + yourcar2.color);
		System.out.println("최고속도:" + yourcar2.maxSpeed);
		System.out.println("현재속도:" + yourcar2.speed);
	}
}
