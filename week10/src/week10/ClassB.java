package week10;

public class ClassB {
	// public 접근제한자는 어디에서든지 사용 가능
	ClassA c1 = new ClassA(true);
	// default 접근제한자는 같은 패키지 안에서 사용 가능
	ClassA c2 = new ClassA(10);
	// private : 같은 패키지 안이라도 호출 불가
	//ClassA c3 = new ClassA("문자열");
}
