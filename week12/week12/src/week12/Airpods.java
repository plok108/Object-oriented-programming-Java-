package week12;

public class Airpods implements EarPhone{
	public Airpods() {
		System.out.println("\n새로 구입한 Apple AirPods 연결");
	}
	
	
	@Override
	public void play() {
		System.out.println("Apple Airpods 음악 재생 중~");
	}
	
	@Override
	public void stop() {
		System.out.println("Apple Airpods 음악을 중지합니다.");
	}
}
