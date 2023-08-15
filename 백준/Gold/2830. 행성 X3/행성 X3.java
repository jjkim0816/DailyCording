import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int[] names = new int[num];

		int[] count = new int[20];
		long sum = 0;

		for (int i = 0; i < num; i++) {
			names[i] = sc.nextInt();
			sc.nextLine();
		}

		sc.close();

		for (int i = 0; i < num; i++) {
			int name = names[i];
			int index = 0;
			while (name > 0) {
				count[index++] += name % 2;
				name /= 2;
			}
		}

		for (int i = 19; i >= 0; i--) {
			sum += (long) count[i] * (num - count[i]);
			sum <<= 1;
		}
		sum >>= 1;

		System.out.println(sum);
	}

}