import java.util.Scanner;
public class d017_Q1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int number = sc.nextInt();
			if(number == 1) {continue;}
			if(check(number)) {count++;}
		}
		System.out.println(count);
		sc.close();

	}
	
	public static boolean check(int n) {
		int i = 2;
		while(i < n) {
			if(n % i++ == 0) {
				return false;
			}
		}
		return true;
	}

}
