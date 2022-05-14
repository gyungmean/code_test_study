import java.util.Scanner;
public class Q2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int day = 0;
		
		if((V - B) % (A - B) == 0) {
			day = (V - B) / (A - B);
		}
		else {
			day = (V - B) / (A - B) + 1;
		}
		
		System.out.println(day);
		sc.close();
	}

}
