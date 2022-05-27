import java.util.Scanner;
import java.math.BigInteger;
public class Q11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger input = new BigInteger(sc.next());
		
		BigInteger total = new BigInteger("0");
		for(int i = 0; i < n; i++) {
			total = total.add(input.remainder(BigInteger.valueOf(10)));
			input = input.divide(BigInteger.valueOf(10));
			
		}
		System.out.println(total);
		sc.close();
	}

}
