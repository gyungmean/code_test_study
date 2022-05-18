import java.util.Scanner;
public class d010_Q5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int time = 0;
		for(int i = 0; i < word.length(); i++) {
			int w = word.charAt(i);
			if(w <= 79) {
				time += (w - 65) / 3 + 3;
			}
			else {
				if(w == 80 || w == 81 || w == 82 || w == 83) {
					time += 8;
				}
				else if(w == 84 || w == 85 || w == 86) {
					time += 9;
				}
				else {
					time += 10;
				}
			}
		}
		System.out.println(time);
		sc.close();
	}

}
