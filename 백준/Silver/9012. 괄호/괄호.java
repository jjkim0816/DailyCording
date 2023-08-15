import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		String[] brackets = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			brackets[i] = sc.nextLine();
		}
		sc.close();

		for (String bracket : brackets) {

			st.clear();
			boolean checkFlag = true;

			for (String br : bracket.split("")) {
				if (br.equals("("))
					st.push(br);
				else if (br.equals(")")) {
					if (!st.isEmpty())
						st.pop();
					else {
						checkFlag = false;
						break;
					}
				}
			}

			if (checkFlag && st.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}
