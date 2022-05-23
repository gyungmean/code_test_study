import java.util.Scanner;
public class d019_Q1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[] prime = new int[N + 1];
		
		for(int i = 2; i <= N; i++) {
			prime[i] = i;
		}//0°ú 1Àº ¼Ò¼ö°¡ ¾Æ´Ï´Ù.
		
		for(int i = 2; i <= N; i++) {
			if(prime[i] == 0) {continue;}
			for(int j = 2 * i; j <= N; j += i ) {
				prime[j] = 0;
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(prime[i] != 0) {
				System.out.println(prime[i]);
			}
		}

		sc.close();
	}

}
