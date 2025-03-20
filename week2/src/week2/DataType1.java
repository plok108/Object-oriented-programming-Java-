package week2;

public class DataType1 {
	public static void main(String[] args) {
		// 실수 데이터 타입
		// 실수 리터럴 저장
		
		float 	fValue = 3.14f;
		double  dValue = 3.14;   // 실수 리터럴은 기본값이 double 이다
		
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		
		// 실수의 정밀도 테스트
		fValue = 0.1234567890123456789f;
		dValue = 0.1234567890123456789;
		
		// 실수의 값을 출력할 때 바이트가 달라서 출력되는 값이 다르기에 이걸 잘 생각하고 코드를 짜야됨
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		
		// e 사용하기 (수학에 나오는 e랑 같은 개념)
		int iData = 4500000;
		float fData = 3e7f;    // e는 10의 지수부분
		double dData1 = 3e7;
		double dData2 = 3e-7;
		
		System.out.println("iData = " + iData);
		System.out.println("fData = " + fData);
		System.out.println("dData1 = " + dData1);
		System.out.println("dData2 = " + dData2);
		
		System.out.println();
		System.out.printf("iData = %d\n", iData);
		System.out.printf("fData = %f\n", fData);
		System.out.printf("dData1 = %f\n", dData1);
		System.out.printf("dData2 = %f\n", dData2);
		System.out.println();
		System.out.printf("fData = %.4f\n", fData);
		System.out.printf("dData1 = %.2f\n", dData1); 
		System.out.printf("dData2 = %10.8f\n", dData2);  // 전체 10자리 중 8자리가 소수점 이하 (소수점도 자리수에 포함)
	}
}