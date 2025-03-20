package week2;

public class Variable {
	public static void main(String[] args) {
		// 자바에 기본 데이터 타입 정리
		// 직접 값을 주는 초기값 = 리터럴
		
		byte bData 		= 65;
		char cData 		= 65;
		short sData 	= 65;
		int iData 		= 65;
		long lData 		= 65;
		float fData 	= 65.12f;   // 오류가 발생하는 이유는 숫자f를 붙여야 됨
		double dData 	= 65.12;    // 여긴 오류가 안나는 이유는 기본적으로 .d가 붙여져 있기 때문에
		boolean boolData = true;
		
		System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("sData = " + sData);
		System.out.println("iData = " + iData);
		System.out.println("lData = " + lData);
		System.out.println("fData = " + fData);
		System.out.println("dData = " + dData);
		System.out.println("boolData = " + boolData);
		
	}
}