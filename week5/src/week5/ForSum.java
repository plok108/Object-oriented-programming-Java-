package week5;

public class ForSum {
	public static void main(String[] args) {
		// 1 ~ 100까지의 합을 구하기
		// 누적 변수 => 초기화 필수
		int sum = 0;
		for (int i = 0; i<=100; i++)
		{
			//sum = sum + i;
			sum +=  i;
		}
		System.out.println("1 ~ 100까지 합 : " + sum);
	}
}
