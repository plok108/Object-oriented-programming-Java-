package week5;

public class ContinueEx {
	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++)
		{
			// 짝수만 출력
			// 홀수면 생략
			if (i%2 != 0)   // 홀수인 경우
			{
				continue;
			}
			System.out.println(i);
			
		}
	}
}
