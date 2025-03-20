package week2;

// 데이터 타입 중 오류 찾기
public class DataType3 {
	public static void main(String[] args) {
		// byte : 1byte = 8bit, -128 ~ 127까지만 사용가능함
		byte 	bData = 127;   // 수정코드 : 128 -> 127
		// char에는 음수 없음
		char 	cData = 90;    // 수정코드 : -90 -> 90  
		float   fData = 3.14f; // 수정코드 : 3.14 -> 3.14f
		long 	lData = 10000000000L;  // 수정코드 : 숫자 -> 숫자L
		// boolean은 true or false만 가능
		boolean boolD = true;           // 수정코드 : 10 -> true
		
		System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("fData = " + fData);
		System.out.println("lData = " + lData);
		System.out.println("boolD = " + boolD);
	}
}