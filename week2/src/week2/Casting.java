package week2;

public class Casting {
	public static void main(String[] args) {
		int iData = 65;  			// int = 4byte
		char cData = (char)iData; 	// char = byte
		System.out.println(cData);
		
		long lData = 500; 			// long = 8byte
		iData = (int)lData;
		System.out.println(iData);
		
		double dData = 3.14; 		// double = 8byte
		iData = (int)dData;
		System.out.println(iData);
		
		// Casting 하기 전에 데이터 손실 확인
		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.println(bValue); // 데이터 손실이 일어나서 이상한 값이 나오는 것
		
		// 데이터 손실 해결법 : 형 변환 시 메모리 범위를 파악할 수 있음
		if (iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue;
		} else {
			System.out.println("Casting 하고자 하는 변수의 값을 확인하세요.\n범위를 확인하세요.");
		}
	}
}