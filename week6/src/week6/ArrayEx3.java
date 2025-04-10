package week6;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		// 배열 복사 방법
		// 배열은 한 번 생성하면 크기 변경이 불가능
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[7];
		
		for (int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[i];
			//System.out.printf("%d", arr2[i]);
		}
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.printf("%d", arr2[i]);
		}
		
		System.out.println();
		// System.arraycopy() 이용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.printf("%d", arr2[i]);
		}
		
		System.out.println();
		// Arrays 클래스 이용 (조금 더 간단함)
		arr2 = Arrays.copyOf(arr1, 7);
		
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.printf("%d", arr2[i]);
		}
	}
}
