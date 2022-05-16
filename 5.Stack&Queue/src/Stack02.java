/*
 * 	2. ��ȣ��������
 * 
 * 	�Էµ� ���ڿ����� �Ұ�ȣ () ���̿� �����ϴ� ��� ���ڸ� �����ϰ� ���� ���ڸ� ����ϴ� ���α׷�
 * 
 */
import java.util.Scanner;
import java.util.Stack;

public class Stack02 {
	static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')')
				while(stack.pop() != '(');
			else
				stack.push(x);
		}
		for(int i = 0; i < stack.size(); i++)
			answer += stack.get(i);
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(solution(str));
		input.close();
	}

}
