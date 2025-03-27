package week4;

public class Switch1 {
	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade){
		case 'A': case 'a':          // case를 어려개의 동일한 실행문을 시행 가능
			System.out.println("A 등급");
			break;
		case 'B': case 'b':
			System.out.println("B 등급");
			break;
		default:
			System.out.println("기타 등급");
		}
	}
}
