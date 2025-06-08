package week14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionEx {
	public static void main(String[] args) {
		// ArrayList
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("OOP");
		list.add("객체지향프로그래밍");
		
		System.out.println("리스트 총 개수 = " + list.size());
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		// Vector
		List<String> vector = new Vector<String>();
		vector.add("홍길동");
		vector.add("이순신");
		
		System.out.println();
		for(String s : vector) {
			System.out.println(s);
		}
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("apple");
		linkedList.add("melon");
		linkedList.add("banana");
		linkedList.add("apple");
		
		System.out.println();
		for (String s : linkedList) {
			System.out.println(s);
		}
		
		linkedList.remove("apple");
		System.out.println();
		for (String s : linkedList) {
			System.out.println(s);
		}
		
		System.out.println();
		//Set
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("tomato");
		set.add("kiwi");
		set.add("apple");
		set.add("melon");
		
		//iterator 반복자로 처리
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Map
		//Map
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "홍길동");
        map.put("nickname", "이순신");
        map.put("gender", "남자");
        map.put("age", "25");
        map.put("id", "admin");
        map.put("password", "1234");
		
		// key만 가져오기 => keySet()
		Set<String> key = map.keySet();
		
		for (String s : key) {
			System.out.println(s + " = " + map.get(s));
			
		}
	}
}
