import java.util.Scanner;

public class Main {
	public static int cnt = 0, target = 0;
	public static int[] output;
	public static boolean isOut = false;

	public static void swap(int[] arr, int a, int b) {
		cnt++;
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;

		if (cnt == target) {
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i < arr.length; i++) {
				sb.append(arr[i]);
				sb.append(" ");
			}
			System.out.println(sb.toString());
			isOut = true;
		}
	}

	public static void heapify(int[] arr, int k, int num) {
		int left = 2 * k;
		int right = 2 * k + 1;
		int smaller = -1;

		if (right <= num) {
			smaller = arr[left] < arr[right] ? left : right;
		} else if (left <= num) {
			smaller = left;
		} else {
			return;
		}

		if (arr[smaller] < arr[k]) {
			swap(arr, k, smaller);
			heapify(arr, smaller, num);
		}
	}

	public static void buildMinHeap(int[] arr, int num) {
		for (int i = num / 2; i >= 1 && !isOut; i--) {
			heapify(arr, i, num);

		}
	}

	public static void heapSort(int[] arr) {
		buildMinHeap(arr, arr.length - 1);
		for (int i = arr.length - 1; i > 1; i--) {
			swap(arr, 1, i);
			heapify(arr, 1, i - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		target = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[arraySize + 1];
		for (int i = 1; i <= arraySize; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		arr[0] = 0;
		heapSort(arr);

		if (!isOut) {
			System.out.println(-1);
		}

	}

}
