import java.util.Scanner;
public class d012_Q1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 1;
		int b = 1;
		int count = 1;
		while(count < x) {
			if(a == 1) {
				if(b % 2 != 0) {
					b++;
					count++;
					continue;
				}
			}
			
			if(b == 1) {
				if(a % 2 == 0) {
					a++;
					count++;
					continue;
				}
			}
			
			if((a + b) % 2 == 0) {
				a--;
				b++;
				count++;
			}
			else {
				a++;
				b--;
				count++;	
			}
		}
		System.out.println(a + "/" + b);
		sc.close();

	}

}
