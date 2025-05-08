package week5;

public class BreakEx {
	public static void main(String[] args) {
		
		
		while (true)
		{
			// 반복이 언제 끝날지 모르는 경우
			int num = (int)(Math.random() * 10);
			
			System.out.println("랜덤숫자 : " + num);
			
			if (num == 7)
			{
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
}
