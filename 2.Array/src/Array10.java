/*
 * 	10. ���츮
 * 
 * 	N*N�����ǿ� ���̰� �����ִ�. �� �������� ���� �� �����¿� ���ں��� ū ���ڴ� ���츮 �����̴�
 * 	���츮 ������ �� �� �ִ��� �˾Ƴ��� ���α׷�
 * 
 */
import java.util.Scanner;

public class Array10 {
	
	static int solution(int n, int arr[][]) {
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx < 0 || ny < 0 || nx == n || ny == n)
						continue;
					if(arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag)
					answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = input.nextInt();
		System.out.println(solution(n, arr));
		input.close();
	}

}
