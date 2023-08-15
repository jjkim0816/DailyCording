import java.util.Scanner;

// https://developer-rabbit.tistory.com/entry/%EB%B0%B1%EC%A4%80-2830%EB%B2%88Java%EB%B9%84%ED%8A%B8%EC%97%B0%EC%82%B0%EC%9E%90-%ED%96%89%EC%84%B1-X3

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
