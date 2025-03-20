package week2;

public class PersonInfo {
	public static void main(String[] args) {
		String name = "정태완";
		int age = 23;
		double height = 176.5;
		char gender = 'M';
		boolean is_Student = true;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("성별 : %c\n", gender);
		System.out.println("학생 여부 : " + is_Student);
	}
}