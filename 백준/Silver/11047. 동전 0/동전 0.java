import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coinCnt = sc.nextInt();
		int price = sc.nextInt();
		sc.nextLine();

		int[] coins = new int[coinCnt];

		for (int i = 0; i < coinCnt; i++) {
			coins[i] = sc.nextInt();
			sc.nextLine();
		}
		sc.close();

		coins = Arrays.stream(coins).filter(data -> data <= price).map(data -> data).toArray();

		int change = price;
		int cnt = 0;
		for (int i = coins.length - 1; i >= 0; i--) {
			if (change < coins[i]) {
				continue;
			}

			int q = change / coins[i];
			change %= coins[i];
			cnt += q;
		}

		System.out.println(cnt);

	}

}
