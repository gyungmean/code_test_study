import java.util.Scanner;
public class d020_Q4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0) {
			int rslt = find_prime(n);
			System.out.println(rslt);
			n = sc.nextInt();
		}
		sc.close();

	}
	
	public static int find_prime(int n) {
		int[] prime = new int[2 * n + 1];
		for(int i = 2; i <= 2 * n; i++) {
			prime[i] = i;
		}
		
		for(int i = 2; i <= 2 * n; i++) {
			if(prime[i] == 0) {continue;}
			for(int j = 2 * i; j <= 2 * n; j += i) {
				prime[j] = 0;
			}
		}
		
		int count = 0;
		for(int i = n + 1; i <= 2 * n ; i++) {
			if(prime[i] != 0) {count++;}
		}
		return count;
	}

}
