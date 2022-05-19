import java.util.Scanner;
public class day007_Q2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			k++;
			int[][] apt = new int[k][n];
			
			int a = 1;
			for(int j = 0; j < k; j++) {
				apt[j][0] = 1;
			}
			for(int j = 0; j < n; j++) {
				apt[0][j] = a++;
			}
			
			int answer = apt[k - 1][n - 1];
			if(answer == 0) {
				answer = calc(apt, k - 1, n - 1);
			}
			
			System.out.println(answer);
		}
		sc.close();
	}
	
	public static int calc(int [][] apt, int k, int n) {
		if(apt[k - 1][n] == 0) {apt[k - 1][n] = calc(apt, k - 1, n);}
		if(apt[k][n - 1] == 0) {apt[k][n - 1] = calc(apt, k, n - 1);}
		
		return apt[k - 1][n] + apt[k][n - 1];
	}

}
