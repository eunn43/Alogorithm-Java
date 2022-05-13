/*
 * 	2. ���̴� �л�
 * 
 * 	N���� �л��� �Ϸķ� �� ���� ��, �� �ִ� �л��� Ű�� �տ������� ������� �־�����
 * 	�� ���� �������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷�
 * 	�տ� �� �ִ� �л����� ũ�� ���̰� �۰ų� ������ ������ x
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
