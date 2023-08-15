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
			boolean isClear = true;

			for (String br : bracket.split("")) {
				if (br.equals("("))
					st.push(br);
				else if (br.equals(")")) {
					if (!st.isEmpty())
						st.pop();
					else {
						isClear = false;
					}
				}
			}

			if (st.size() != 0 || !isClear)
				System.out.println("NO");
			else
				System.out.println("YES");

		}
	}
}