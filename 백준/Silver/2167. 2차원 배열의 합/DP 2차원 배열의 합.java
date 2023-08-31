import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// DP를 사용하지 않고 풀기
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n + 1][m + 1];
		int[][] dp = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = arr[i][j] + dp[i][j - 1];
			}
		}

		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int[] sum = new int[k];
		for (int t = 0; t < k; t++) {
			int i = 0, j = 0, x = 0, y = 0;
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			for (int row = i; row <= x; row++) {
				sum[t] += dp[row][y] - dp[row][j - 1];
			}
		}

		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
	}

}
