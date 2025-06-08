package week14;

public class PrintClass2Ex {
	// 제네릭 타입 파라미터 => 구체적인 클래스 타입으로 지정, 클래스만 됨
	public static void main(String[] args) {
		PrintClass2<Integer> pc2 = new PrintClass2<Integer>();
		pc2.printValue(100);
		
		PrintClass2<String> pc3 = new PrintClass2<String>();
		pc3.printValue("홍길동");
		
		PrintClass2<Boolean> pc4 = new PrintClass2<>();
		pc4.printValue(true);
	}
	
}
