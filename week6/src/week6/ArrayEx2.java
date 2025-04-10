package week6;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		int[] score = new int[10];
		
		System.out.println("=== 랜덤 생성된 점수 배열 ===");
		int sum = 0;
		double avg = 0.0;
		
		// 배열 처리는 for 문 이용
		// 반복 횟수는 배열.length
		for (int i = 0; i<score.length; i++)
		{
			int num = (int)(Math.random() * 100);
			score[i] = num;
			System.out.printf("score[%d] = %d\n", i, score[i]);
			sum += score[i];
		}
		
		avg = (double)sum / score.length;
		
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.1f", avg);
		
	}
}
