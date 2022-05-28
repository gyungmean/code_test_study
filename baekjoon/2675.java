import java.util.Scanner;
public class d011_Q2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			String P = makeString(R, S);
			System.out.println(P);
		}
		sc.close();

	}
	
	public static String makeString(int r, String s) {
		String p = "";
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < r; j++) {
				p += s.charAt(i);
			}
		}
		return p;
	}

}
