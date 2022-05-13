/*
 * 	8. 유효한 팰린드롬
 * 
 * 	팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 * 	문자열이 입력되면 해당 문자열이 팰린드롬이면 YES, 아니면 NO를 출력하는 프로그램
 * 	회문을 검사할 때 알파벳만 가지고 검사, 대소문자 구분 x, 알파벳 의외의 문자들은 무시
 * 
 */
import java.util.Scanner;

public class String08 {
	static String solution(String str) {
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp))
			return "YES";
		return "NO";		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(solution(str));
		input.close();
	}

}
