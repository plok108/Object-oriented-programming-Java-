package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		// 3의 배수는 제외하고 더하기 
		for (int i=1; i<=100; i++)
		{
					
			if (i%3 == 0)
			{
				continue;
			}
			sum += i;
		}
		
		System.out.println("3의 배수를 제외한 합 = " + sum);
		
		int sum2 = 0;
		
		for (int j =1; j<=100; j++)
		{
			if (j%3 == 0)
			{
				sum2 += j;
			}
		}
		System.out.println("3의 배수의 합 = " + sum2);
		System.out.println("sum + sum2 = " + (sum + sum2));
	}
}
