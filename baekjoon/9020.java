import java.util.Scanner;
public class d021_Q9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int a = n / 2;
			int b = n / 2;
			
			while(true) {
				if(check_prime(a) && check_prime(n - a)) {
					System.out.println(a + " " + b);
					break;
				}
				else {
					a--;
					b++;
				}
			}
		}
		sc.close();
	}
	
	public static boolean check_prime(int n) {
		int i = 2;
		while(i <= Math.sqrt(n)) {
			if(n % i++ == 0) {return false;}
		}
		return true;
	}

}
