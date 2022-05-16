/*
 * 	11. 임시반장 정하기
 * 
 * 	N명 학생의 1학년부터 5학년 까지의 반이 입력된다
 * 	같은 반이었던 사람이 가장 많은 학생이 임시 반장이 된다 
 * 	임시반장으로 정해진 학생의 번호를 구하는 프로그램
 * 	
 */
import java.util.Scanner;

public class Array11 {
	static int solution(int n, int arr[][]) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) {
			int cnt = 0;
			for(int j = 1; j <= n; j++) {
				for(int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(max < cnt) {
				max=cnt;
				answer = i;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[][] = new int[n+1][6];
		for(int i = 1; i <= n; i++)
			for(int j = 1; j < 6; j++)
				arr[i][j] = input.nextInt();
		System.out.println(solution(n, arr));
		input.close();
	}

}
