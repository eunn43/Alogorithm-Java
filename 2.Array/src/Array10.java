/*
 * 	10. 봉우리
 * 
 * 	N*N격자판에 높이가 쓰여있다. 각 격자판의 숫자 중 상하좌우 숫자보다 큰 숫자는 봉우리 지역이다
 * 	봉우리 지역이 몇 개 있는지 알아내는 프로그램
 * 
 */
import java.util.Scanner;

public class Array10 {
	
	static int solution(int n, int arr[][]) {
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx < 0 || ny < 0 || nx == n || ny == n)
						continue;
					if(arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag)
					answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = input.nextInt();
		System.out.println(solution(n, arr));
		input.close();
	}

}
