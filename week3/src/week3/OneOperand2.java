package week3;

public class OneOperand2 {
	public static void main(String[] args) {
		// 단항연산자 : ++, --(= 증감 연산자)
		// ++ : 자신의 값에 1을 더한다.
		int x = 10;
		int y = 10;
		int z;
		
		// ++ 기호에 위치에 따라 값이 다르게 출력된다.
		// ++ 기호가 왼쪽(앞)에 있으면 : 명령문을 실행하기 전에 1 증가
		System.out.println("++x = " + (++x));  // 연산식을 쓸때 괄호를 넣어주면 나중에 코드 확인하기 좋음
		System.out.println("++x의 x값은? = " + x);
		
		// ++ 기호가 오른쪽(뒤)에 있으면 : 명령문을 먼저 실행하고 다음 라인으로 가기 전에 1 증가
		System.out.println("x++ = " + (x++));
		System.out.println("x++의 x값은? = " + x);
		
		// x = 12
		// -- 기호 : 자신의 값을 1 감소
		
		z = x++;    // x = 12
		System.out.println("z = " + z);
		System.out.println("x = " + x);   // x = 13
		
		z = ++x + y--;  // x = 14, y = 10
		System.out.println("연산식의 값?(z) = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
