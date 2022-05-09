import java.util.Scanner;
public class d023_Q3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] rec = new int[4][2];
		for(int i = 0; i < 3; i++) {
			rec[i][0] = sc.nextInt();
			rec[i][1] = sc.nextInt();
		}
		
		if(rec[0][0] == rec[1][0]) {
			rec[3][0] = rec[2][0];
		}
		else if(rec[1][0] == rec[2][0]) {
			rec[3][0] = rec[0][0];
		}
		else {
			rec[3][0] = rec[1][0];
		}
		
		if(rec[0][1] == rec[1][1]) {
			rec[3][1] = rec[2][1];
		}
		else if(rec[1][1] == rec[2][1]) {
			rec[3][1] = rec[0][1];
		}
		else {
			rec[3][1] = rec[1][1];
		}
		
		System.out.println(rec[3][0] + " " + rec[3][1]);
		sc.close();
	}

}
