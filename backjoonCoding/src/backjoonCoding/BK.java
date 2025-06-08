package backjoonCoding;

import java.util.Scanner;

public class BK {
    public static void main(String[] args) {
        int a, b, c;
    	Scanner a1 = new Scanner(System.in);
    	Scanner b1 = new Scanner(System.in);
    	Scanner c1 = new Scanner(System.in);
        a = a1.nextInt();
        b = b1.nextInt();
        c = c1.nextInt();
        
        System.out.println(((a + b) % c));
        System.out.println(((a % c) + (b%c)) % c);
        System.out.println(((a * b) % c));
        System.out.println(((a % c) * (b % c)) % c);
    }
}
