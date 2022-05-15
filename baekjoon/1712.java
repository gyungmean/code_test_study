import java.util.Scanner;
public class day008_Q1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int point;
		long total = a + b;
		int income = c;
		
		if(b >= c) {
			point = -1;
		}
		else {
			point = a / (c - b) + 1;
		}
		
		System.out.println(point);
		sc.close();
	}

}
