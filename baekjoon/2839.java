import java.util.Scanner;
public class Q2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		int rslt = -1;
		int count = 0;
		
		if(n % 5 == 0) {
			rslt = n / 5;
		}
		else if(n > 5) {// 5이하중에서 3을 제외하면 답이 -1이기 때문에
			while(n > 0) {
				if(n % 5 == 0) {
					n -= 5;
					count++;
				}
				else if(n % 3 == 0) {
					n -= 3;
					count++;
				}
				else {
					n -= 5;
					count++;
				}
				if(n < 3) {break;}
			}
			if(n == 0) {rslt = count;}
		}
		else if(n == 3) {rslt = 1;}
		
		System.out.println(rslt);
		
		sc.close();
	}
}
