package week14;

public class BoxEx {

	public static void main(String[] args) {
		// 구체적인 데이터 타입별로 객체를 생성
		Box<String> box1 = new Box<String>();
		box1.setT("hello");
		String sval = box1.getT();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(100);
		int ival = box2.getT();

	}

}
