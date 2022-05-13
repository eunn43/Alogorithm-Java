/*
 * 	5. 소수(에라토스테네스 체)
 * 
 * 	자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램
 * 	에라토스테네스 체  : 소수를 발견하면 카운트를 한 뒤 해당 소수의 배수를 제외시킴
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
