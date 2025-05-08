package package1;

import week10.ClassA;

public class ClassC {
	// 패키지가 다르면 반드시 import 해야됨
	// public : 패키지가 달라도 호출 가능
	ClassA c1 = new ClassA(true);
	
	// default : 패키지 달라지만 호출 불가
	//ClassA c2 = new ClassA(10);
	
	// private : 같은 클래스 안에서만 호출 가능
	//ClassA c3 = new ClassA("문자열");
}
