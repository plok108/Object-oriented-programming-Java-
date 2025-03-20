package week2;

public class DataType2 {
	public static void main(String[] args) {
		// char 데이터 타입 => 정수값을 저장  | 문자는 따옴표 한개로 사용한다.
		// char 데이터 타입은 음수가 없음  | 즉 char 타입 : 음수 X
		char cData1 = 'A';      // 문자 리터럴 직접 저장
		char cData2 = 65;       // 10진수로 저장
		char cData3 = '\u0041'; // 16진수로 저장
		System.out.println("cData1 = " + cData1);
		System.out.println("cData2 = " + cData2);
		System.out.println("cData3 = " + cData3);
		
		System.out.println();
		char cData4 = '가';     
		char cData5 = 44032;   
		char cData6 = '\uac00'; 
		System.out.println("cData4 = " + cData4);
		System.out.println("cData5 = " + cData5);
		System.out.println("cData6 = " + cData6);
		
		System.out.println();
		char cData7 = 'B';     
		char cData8 = '하';    
		char cData9 = '&';    
		System.out.println("cData7 = " + cData7);
		System.out.println("cData8 = " + cData8);
		System.out.println("cData9 = " + cData9);
		
		System.out.println();
		// char 타입 변수에 유니코드 값을 알고 싶으면 int 타입에 대입
		int cData10 = cData7 + cData9;
		// 여기서 오류발생 이유 : 대입연산자를 쓰기에 양쪽 자료형이 다르기 때문 | 해결법 : 캐스팅 방법 사용 (캐스팅을 사용하면 강제로 넣을 수 있음)
		char cData11 = (char)(cData7 + cData9);   
		System.out.println("cData10 = " + cData10);
		System.out.println("cData11 = " + cData11);
	}
}