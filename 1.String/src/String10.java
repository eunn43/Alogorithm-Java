/*
 * 	10. ���� ª�� ���ڰŸ�
 * 
 * 	�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷�
 * 
 */
import java.util.Scanner;

public class String10 {
	static int[] solution(String str, char c) {
		int pos = 100;
		int arr[] = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				arr[i] = 0;
				pos = 0;
			}
			else
				arr[i] = ++pos;
		}
		pos = 100;
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == c)
				pos = 0;
			else {
				++pos;
				if(arr[i] > pos)
					arr[i] = pos;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char c = input.next().charAt(0);
		for(int n : solution(str, c)) {
			System.out.print(n + " ");
		}
		System.out.println();
		input.close();
	}

}
