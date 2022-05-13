/*
 * 	6. ������ �Ҽ�
 * 
 * 	N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷�
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Array06 {
	static boolean isPrime(int num) {
		if(num == 1)
			return false;
		for(int i = 2; i < num / 2; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	static ArrayList<Integer> solution(int n, int arr[]) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				res = res * 10 + tmp % 10;
				tmp /= 10;
			}
			if(isPrime(res))
				answer.add(res);
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = input.nextInt();
		for(int x : solution(n, arr))
			System.out.print(x + " ");
		input.close();
	}

}
