package week10;

// default
class AirLine {
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반비행합니다.");
	}
	
	public void takeoff() {
		System.out.println("이륙합니다.");
	}
}

public class AirCraft extends AirLine {
	
	@Override
	public void fly() {
		System.out.println("여객기 비행입니다.");
	}
	
	public static void main(String[] args) {
		AirCraft ac = new AirCraft();
		ac.takeoff();
		ac.fly();
		ac.land();
	}
	
}
