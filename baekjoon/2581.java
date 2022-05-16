import java.util.Scanner;
public class d018_Q2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[] prime = find_prime(M, N);
		int min = prime[0];
		int sum = sum(prime);
		
		if(min == 0) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}
	
	public static boolean check(int n) {
		int i = 2;
		if(n == 0 || n == 1) {return false;}
		while(i < n) {
			if(n % i++ == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] find_prime(int m, int n) {
		int[] p = new int[n - m + 1];
		int index = 0;
		
		while(m <= n) {
			if(check(m)) {
				p[index++] = m;
			}
			m++;
		}
		
		return p;
	}
	
	public static int sum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
