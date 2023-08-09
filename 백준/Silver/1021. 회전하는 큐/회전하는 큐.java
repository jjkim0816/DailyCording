import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int addCountFor2And3 = 0;

		int queueN = sc.nextInt();
		int getN = sc.nextInt();
		int[] seq = new int[getN];
		for (int i = 0; i < getN; i++) {
			seq[i] = sc.nextInt();
		}
		sc.close();

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i <= queueN; i++) {
			list.offerLast(i);
		}

		for (int i = 0; i < getN; i++) {
			int target_idx = list.indexOf(seq[i]);
			int half_idx;

			if (list.size() % 2 == 0) {
				half_idx = list.size() / 2 - 1;
			} else {
				half_idx = list.size() / 2;
			}

			if (target_idx <= half_idx) {
				for (int j = 0; j < target_idx; j++) {
					int temp = list.pollFirst();
					list.offerLast(temp);
					addCountFor2And3++;
				}
			} else {
				for (int j = 0; j < list.size() - target_idx; j++) {
					int temp = list.pollLast();
					list.offerFirst(temp);
					addCountFor2And3++;
				}
			}
			list.pollFirst();
		}

		System.out.println(addCountFor2And3);
	}

}
