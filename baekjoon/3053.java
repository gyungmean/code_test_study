import java.util.Scanner;
public class d025_Q3053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		double u = R * R * Math.PI;
		double t = 2 * R * R;
		System.out.println(u);
		System.out.println(t);
		sc.close();
	}
}
