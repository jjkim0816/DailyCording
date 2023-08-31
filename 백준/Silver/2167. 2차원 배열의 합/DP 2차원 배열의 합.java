import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();			// 배열의 크기(행) 1~300
		int M = scan.nextInt();			// 배열의 크기(열) 1~300
		
		// 2차원 배열 생성
		int [][]arr = new int[N+1][M+1];
		int [][]dp = new int[N+1][M+1];
		
		// i, j를 1부터 시작
		for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=M; j++)
			{
				arr[i][j] = scan.nextInt();	// 각 2차원 배열의 행, 열에 값 입력받기
				
				// 각각 행(i)별로 합을 구한다.
				// dp[1][4] => dp[1][1] ~ dp[1][4]까지의 합
				dp[i][j] = arr[i][j] + dp[i][j-1];	
			}
		}
		
		int K = scan.nextInt();			// 합을 구할 부분의 개수(1~10000)
		int []sum = new int[K];			// K수만큼 합 구할 배열
		for(int k=0; k < K; k++)
		{
			// arr[i][j] ~ arr[x][y] 합 구하기
			// 각 K마다 입력받기(K가 3일경우 합3개를 구해야 함)
			int i, j, x, y;
			i = scan.nextInt();
			j = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
			
			// i, x => 행이므로 행을 기준으로 판별
			for(int row = i; row <= x; row++)
			{
				sum[k] += dp[row][y] - dp[row][j-1];
			}
		}
		
		// K개의 줄에 순서대로 배열의 합 출력
		for(int i=0; i<sum.length; i++)
		{
			System.out.println(sum[i]);
		}
		scan.close();
	}

}
