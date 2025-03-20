package week3;

public class ScoreCalculator {
	public static void main(String[] args) {
		int score = 50;
		// println 사용
		//System.out.println("초기 점수: " + score);
		//score += 10;
		//System.out.println("정답 보너스 (+10): " + score);
		//score -= 5;
		//System.out.println("오답 감점 (-5): " + score);
		//score *= 2;
		//System.out.println("오답 감점 (x2): " + score);
		//System.out.println("추가 점수 (+1): " + ++score);
		//System.out.println("감점 (-1): " + --score);
		//System.out.println("최종 점수 : " + score);
		
		// printf 사용할때
		System.out.printf("초기 점수: %d\n", score);
		score += 10;
		System.out.printf("정답 보너스 (+10): %d\n", score);
		score -= 5;
		System.out.printf("오답 감점 (-5): %d\n", score);
		score *= 2;
		System.out.printf("오답 감점 (x2): %d\n", score);
		++score;
		System.out.printf("추가 점수 (+1): %d\n", score);
		score--;
		System.out.printf("감점 (-1): %d\n", score);
		System.out.printf("최종 점수 : %d\n", score);
	
	}
}
