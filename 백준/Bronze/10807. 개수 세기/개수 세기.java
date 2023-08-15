import java.util.Arrays;
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

		System.out.println(Arrays.stream(numbers).filter(data -> data == findNum).count());
	}

}
