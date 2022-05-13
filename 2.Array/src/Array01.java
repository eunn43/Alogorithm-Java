/*
 * 	1. 큰 수 출력하기
 * 
 * 	N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램
 *  첫 번째 수는 무조건 출력
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Array01 {
	static ArrayList<Integer> solution(int n, int arr[]) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(arr[0]);
		for(int i = 1; i < n; i++) {
			if (arr[i] > arr[i-1])
				answer.add(arr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		for(int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
		input.close();
	}

}
