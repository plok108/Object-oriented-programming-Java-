package week5;

public class ForGugu2 {
	public static void main(String[] args) {
		// 2~9 단 출력
		// 바깥쪽 for 문 : 단의 반복
		// 안쪽 for 문 : 1~9까지의 반복
		for (int i = 2; i<=9; i++)
		{
			System.out.println("===============");
			System.out.println("구구단 : " + i + "단");
			System.out.println("===============");
			for (int j=1; j<=9; j++)   // 단의 반복
			{
				int sum = i * j;
				System.out.printf("%d x %d = %d\n", i, j, sum);
			}
		}
	}
}
