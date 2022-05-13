/*
 * 	8. ��ȿ�� �Ӹ����
 * 
 * 	�Ӹ���� : �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ�
 * 	���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� YES, �ƴϸ� NO�� ����ϴ� ���α׷�
 * 	ȸ���� �˻��� �� ���ĺ��� ������ �˻�, ��ҹ��� ���� x, ���ĺ� �ǿ��� ���ڵ��� ����
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
