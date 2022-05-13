/*
 * 	2. 보이는 학생
 * 
 * 	N명의 학생이 일렬로 서 있을 때, 서 있는 학생의 키가 앞에서부터 순서대로 주어진다
 * 	맨 앞의 선생님이 볼 수 있는 학생의 수를 구하는 프로그램
 * 	앞에 서 있는 학생보다 크면 보이고 작거나 같으면 보이지 x
 * 
 */
import java.util.Scanner;

public class Array02 {
	static int solution(int n, int arr[]) {
		int answer = 1;
		int max = arr[0];
		
		for(int i = 1; i < n; i++) {
			if (arr[i] > max) {
				answer++;
				max = arr[i];
			}
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
		System.out.println(solution(n, arr));
		input.close();
	}

}
