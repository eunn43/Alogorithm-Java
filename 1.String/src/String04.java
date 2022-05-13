/*
 * 	4. 단어 뒤집기
 * 
 * 	N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class String04 {
	static ArrayList<String> solution(String arr[]) {
		ArrayList<String> answer = new ArrayList<>();
		for(String s : arr) {
			String tmp = new StringBuilder(s).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	static ArrayList<String> solution2(String arr[]) {
		ArrayList<String> answer = new ArrayList<>();
		for(String s : arr) {
			char c[] = s.toCharArray();
			for(int i = 0; i < c.length/2; i++) {
				char tmp = c[i];
				c[i] = c[c.length - i - 1];
				c[c.length - i - 1] = tmp;
			}
			answer.add(String.valueOf(c));
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String arr[] = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.next();
		}
		for(String s : solution(arr)) {
			System.out.println(s);
		}
		input.close();
	}

}
