import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumValue = sc.nextInt();
		sc.nextLine();
		String sString = sc.nextLine();
		sc.close();

		int[] nArr = new int[n];
		String[] sArr = sString.split(" ");
		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.parseInt(sArr[i]);
		}

		int i = 0;
		while (i < nArr.length) {
			int sum = 0;
			for (int j = i; j < nArr.length; j++) {
				sum += nArr[j];
				if (sum == sumValue) {
					result++;
					break;
				} else if (sum > sumValue) {
					break;
				}
			}

			i++;
		}

		System.out.println(result);
	}
}