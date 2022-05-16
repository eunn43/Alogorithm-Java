/*
 * 	1. 올바른 괄호
 * 
 * 	올바른 괄호이면 YES, 올바르지 않으면 NO를 출력
 * 
 */
import java.util.Scanner;
import java.util.Stack;

public class Stack01 {
	static String solution(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(')
				stack.push(str.charAt(i));
			else if(str.charAt(i) == ')') {
				if(stack.isEmpty())
					return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty())
			return "NO";
		return "YES";
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(solution(str));
		input.close();
	}

}
