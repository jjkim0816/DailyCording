import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		sc.nextLine();
		int h = sc.nextInt();
		sc.close();
		
		long answer = 1L;
		
		for (int i = 0; i < n - 1; i++) {
			answer = (answer * m) % 1000000007;
		}
		
		System.out.println(answer);
	}

}
