import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();
		String input = "";
		int result = 0;

		do {
			input = sc.next();
			queue.offer(input);
		} while (!input.equals("="));
		sc.close();

		while (!queue.isEmpty()) {
			String tmp = queue.poll();
			if (tmp.equals("=")) {
				break;
			}

			switch (tmp) {
			case "+":
				result += Integer.parseInt(queue.poll());
				break;
			case "-":
				result -= Integer.parseInt(queue.poll());
				break;
			case "*":
				result *= Integer.parseInt(queue.poll());
				break;
			case "/":
				result /= Integer.parseInt(queue.poll());
				break;
			default:
				result = Integer.parseInt(tmp);
			}
		}

		System.out.println(result);
	}

}
