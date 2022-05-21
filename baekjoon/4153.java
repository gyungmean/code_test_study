import java.util.Scanner;
public class d024_Q4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		while(a != 0) {
			int temp;
			if(a > c) {
				if(a > b) {
					temp = a;
					a = c;
					c = temp;
				}
			}
			if(b > c) {
				if(b > a) {
					temp = b;
					b = c;
					c = temp;
				}
			}
			
			if(a* a + b * b == c * c) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		sc.close();
	}

}
