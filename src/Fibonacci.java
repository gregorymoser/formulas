import java.util.Scanner;

public class Fibonacci {

	private int n;

	public Fibonacci() {
	}

	public Fibonacci(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void allFib(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + ": " + fib(i));
		}
	}

	public int fib(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Fibonacci f1 = new Fibonacci(n);
		f1.allFib(n);
		
	}
}
