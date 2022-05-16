/*
 * 	11. �ӽù��� ���ϱ�
 * 
 * 	N�� �л��� 1�г���� 5�г� ������ ���� �Էµȴ�
 * 	���� ���̾��� ����� ���� ���� �л��� �ӽ� ������ �ȴ� 
 * 	�ӽù������� ������ �л��� ��ȣ�� ���ϴ� ���α׷�
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
