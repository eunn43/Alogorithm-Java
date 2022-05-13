/*
 * 	8. ������ϱ�
 * 
 * 	N���� �л��� ������ �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷�
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
