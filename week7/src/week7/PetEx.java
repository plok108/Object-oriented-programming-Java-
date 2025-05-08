package week7;

public class PetEx {
	public static void main(String[] args) {
		Pet mypet = new Pet("바둑이", "강아지", 3);
		
		System.out.println("< 애완동물 정보 >");
		System.out.println("이름 : " + mypet.name);
		System.out.println("종류 : " + mypet.type);
		System.out.println("나이 : " + mypet.age + "살");
		
		Pet mypet1 = new Pet("초코", "고양이");
		
		System.out.println("< 첫번째 애완동물 >");
		System.out.println("이름 : " + mypet1.name);
		System.out.println("종류 : " + mypet1.type);
		System.out.println("나이 : " + mypet1.age + "살");
		System.out.println("색상 : " + mypet1.color);
		
		Pet mypet2 = new Pet("구름", "강아지", 2, "흰색");
		
		System.out.println("< 두번째 애완동물 >");
		System.out.println("이름 : " + mypet2.name);
		System.out.println("종류 : " + mypet2.type);
		System.out.println("나이 : " + mypet2.age + "살");
		System.out.println("색상 : " + mypet2.color);
		
	}
}
