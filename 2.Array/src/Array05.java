/*
 * 	5. �Ҽ�(�����佺�׳׽� ü)
 * 
 * 	�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷�
 * 	�����佺�׳׽� ü  : �Ҽ��� �߰��ϸ� ī��Ʈ�� �� �� �ش� �Ҽ��� ����� ���ܽ�Ŵ
 * 
 */
import java.util.Scanner;

public class Array05 {
	static int solution(int n) {
		int answer = 0;
		int ch[] = new int[n+1];
		for(int i = 2; i <= n; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j = i; j <= n; j = j + i)
					ch[j] = 1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(solution(n));
		input.close();
	}

}
