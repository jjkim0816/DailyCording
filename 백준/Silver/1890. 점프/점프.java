import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		long[][] dp = new long[size + 1][size + 1];

		dp[1][1] = 1;

		for (int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= size; j++) {
				int moveLength = Integer.parseInt(st.nextToken());

				if (dp[i][j] >= 1 && moveLength != 0) {
					if (j + moveLength <= size) {
						dp[i][j + moveLength] += dp[i][j];
					}

					if (i + moveLength <= size) {
						dp[i + moveLength][j] += dp[i][j];
					}
				}
			}
		}

		System.out.println(dp[size][size]);
	}

}