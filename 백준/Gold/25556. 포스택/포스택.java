import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] nStr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		sc.close();

		Stack<Integer>[] stack = new Stack[4];
		boolean isCheck = false;

		for (int i = 0; i < stack.length; i++) {
			stack[i] = new Stack<Integer>();
			stack[i].push(0);
		}

		for (int i = 0; i < n; i++) {
			isCheck = false;
			for (int j = 0; j < stack.length; j++) {
				if (stack[j].peek() < nStr[i]) {
					stack[j].push(nStr[i]);
					isCheck = true;
					break;
				}
			}
		}

		if (isCheck) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
