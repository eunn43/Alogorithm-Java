/*
 * 	7. �������
 * 
 * 	1�̸� ���� ����, 0�̸� Ʋ�� �����̴�. �������� ������ 1���� �������� �ٴ´�.
 * 	�� ���� ����ϴ� ���α׷�
 * 	
 */
import java.util.Scanner;

public class Array07 {
	static int solution(int n, int arr[]) {
		int answer = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			}
			else
				cnt = 0;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = input.nextInt();
		System.out.println(solution(n, arr));
		input.close();
	}

}
