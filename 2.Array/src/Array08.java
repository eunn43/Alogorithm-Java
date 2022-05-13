/*
 * 	8. 등수구하기
 * 
 * 	N명의 학생의 점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램
 * 
 */
import java.util.Scanner;

public class Array08 {
	static int[] solution(int n, int arr[]) {
		int answer[] = new int[n];
		for(int i = 0; i < n; i++ ) {
			int cnt = 1;
			for(int j = 0; j < n; j++) {
				if(arr[j] > arr[i])
					cnt++;
			}
			answer[i] = cnt;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = input.nextInt();
		for(int x : solution(n, arr))
			System.out.print(x + " ");
		input.close();
	}

}
