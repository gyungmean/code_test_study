import java.util.Scanner; public class d009_Q1316 {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int count = 0;		for(int i = 0; i < n; i++) {			String word = sc.next();			if(check(word) == true) {				count++;			}		}				System.out.println(count);		sc.close();	}		public static boolean check(String w) {		boolean[] group = new boolean[26];		for(int i = 0; i < w.length() - 1; i++) {			group[w.charAt(i) - 97] = true;			if(w.charAt(i) == w.charAt(i + 1)) {				continue;			}			if(group[w.charAt(i + 1) - 97] == true) {				return false;			}		}				return true;				}}

© 20


