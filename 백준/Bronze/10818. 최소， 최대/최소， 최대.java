import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        
        int[] numberList = new int[count];
        for (int i = 0; i < count; i++) {
            numberList[i] = sc.nextInt();
        }
        sc.close();
        
		int min = 0;
		int max = 0;

		for (int i = 0; i < numberList.length; i++) {
			if (i == 0) {
				min = numberList[0];
				max = numberList[0];
				continue;
			}

			if (min >= numberList[i]) {
				min = numberList[i];
			}

			if (max < numberList[i]) {
				max = numberList[i];
			}
		}

		System.out.println(min + " " + max);
    }
}