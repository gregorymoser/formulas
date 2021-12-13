import java.util.Scanner;

public class PowersOfTwo {
	
	private int n;
	
	public PowersOfTwo() {
	
	}
	
	int powers0f2(int n) {
		if (n < 1) {
			return 0;
		} else if (n == 1) {
			System.out.println("1");
			return 1;
		} else {
			int prev = powers0f2(n / 2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PowersOfTwo p1 = new PowersOfTwo();
		p1.powers0f2(n);
	}
}
