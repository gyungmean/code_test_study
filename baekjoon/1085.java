import java.util.Scanner;
public class d022_Q1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int d1, d2;
		if(x >= w - x) {d1 = w - x;}
		else {d1 = x;}
		
		if(y >= h - y) {d2 = h - y;}
		else {d2 = y;}
		
		int rslt;
		if(d1 >= d2) {rslt = d2;}
		else {rslt = d1;}
		System.out.println(rslt);
		sc.close();

	}
}
