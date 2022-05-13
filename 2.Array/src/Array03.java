/*
 * 	3. ���� ���� ��
 * 
 * 	N���� ������ �Ͽ� A�� �̱�� A��� B�� �̱�� B��� ���� D���
 * 	1:����, 2:����, 3:��
 * 
 */
import java.util.Scanner;

public class Array03 {
	static String solution(int n, int a[], int b[]) {
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) 
				answer += "D";
			else if(a[i] == 1 && b[i] == 3)
				answer += "A";
			else if(a[i] == 2 && b[i] == 1)
				answer += "A";
			else if(a[i] == 3 && b[i] == 2)
				answer += "A";
			else
				answer += "B";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = input.nextInt();
		for(int i = 0; i < n; i++)
			b[i] = input.nextInt();
		for(char c : solution(n, a, b).toCharArray())
			System.out.println(c);
		input.close();
	}

}
