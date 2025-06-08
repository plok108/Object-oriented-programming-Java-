package week12;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 구현 클래스를 이용해서 구현 객체 생성
		Audio audio = new Audio();
		TV tv  = new TV();
		
		
		// 생성된 구현 객체를 이용해서 메소드 호출
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		
		System.out.println("---");
		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);
		tv.setMute(false);
		tv.turnOff();
		
		// 인터페이스 다중 구현 객체
		SmartTV smart = new SmartTV();
		
		
		
		System.out.println("리모컨의 최대 볼륨 : " + RemoteControl.MAX_VALUE);
		System.out.println("리모컨의 최대 볼륨 : " + RemoteControl.MIN_VALUE);
		
		RemoteControl.changeBattery();
		
		System.out.println("\n-- 인터페이스의 다형성 -- \n");
		// 인터페이스 변수 <= 구현객체
		RemoteControl[] rc = new RemoteControl[3];
		rc[0] = audio;
		rc[1] = tv;
		rc[2] = smart;
		
		for(RemoteControl r : rc) {
			r.turnOn();
			r.setVolume(3);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
			System.out.println("---\n");
			
		}
		
	}

}
