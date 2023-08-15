import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCnt = sc.nextInt();
		sc.nextLine();
		int[] numbers = new int[numCnt];
		IntStream.range(0, numCnt).forEach(idx -> numbers[idx] = sc.nextInt());
		sc.nextLine();
		int findNum = sc.nextInt();
		sc.close();

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < numCnt; i++) {
			Integer count = hm.get(numbers[i]);
			if (count != null) {
				count++;
				hm.put(numbers[i], count);
			} else {
				hm.put(numbers[i], 1);
			}
		}

		if (hm.get(findNum) == null)
			System.out.println(0);
		else
			System.out.println(hm.get(findNum));
	}
}