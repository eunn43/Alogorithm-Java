/*
 * 	9.격자판 최대합
 * 
 * 	N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 구하는 프로그램
 * 
 */
import java.util.Scanner;

public class Array09 {
	static int solution(int n, int arr[][]) {
		int answer = Integer.MIN_VALUE;
		int sum_row, sum_col;
		for(int i = 0; i < n; i++) {
			sum_row=sum_col=0;
			for(int j = 0; j < n; j++) {
				sum_row += arr[i][j];
				sum_col += arr[j][i];
			}
			answer = Math.max(answer, sum_row);
			answer = Math.max(answer, sum_col);
		}
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n -i -1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
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
