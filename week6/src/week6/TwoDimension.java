package week6;

public class TwoDimension {
	public static void main(String[] args) {
		// int [행][열]
		int[][] math = new int[2][3]; // row, colums
		// 2차원 배열을 => 중첩 for 문
		for (int i = 0; i < math.length; i++)
		{
			// 바깥 for : 행의 반복
			for(int j = 0; j < math[i].length; j++) 
			{
				// 안쪽 for : 열의 반복
				System.out.printf("math[%d][%d] = %d\n", i, j, math[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] eng = new int[2][];  // 2차원 배열은 앞에 있는 행을 가지고 생성하므로 가능하다.
		eng[0] = new int[2];         // 행마다 열의 갯수를 다르게 할 수 있다.
		eng[1] = new int[3];
		
		for (int i = 0; i < eng.length; i++)
		{
			// 바깥 for : 행의 반복
			for(int j = 0; j < eng[i].length; j++) 
			{
				// 안쪽 for : 열의 반복
				System.out.printf("eng[%d][%d] = %d\n", i, j, eng[i][j]);
			}
		}
	}
}
