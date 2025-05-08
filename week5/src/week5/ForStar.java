package week5;

public class ForStar {
	public static void main(String[] args) {
		// 1 ~ 1 사이의 랜덤 숫자 생성
		int num = (int)(Math.random() * 10 + 1);   // math.random은 실수만 반환해줌
		
		System.err.println("랜덤숫자 : " + num);
		System.out.println();
		
		for (int i = 1; i<=num; i++)
		{ // 별표 출력
			System.out.print("★");
		}
		
	}
}
