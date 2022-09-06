package BJ;

import java.util.Scanner;

public class BJ24262시간복잡도 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("1");
		System.out.println("0");
	}
}
/*시간복잡도
 * o(1) = 일정한 복잡도 입력값이 증가해도 시간 안늘어나고 즉시 출력가능
 * o(log n) = 매번 숫자를 제시 할 때 마다 경우의 수가 절반 줆 ex 이분탐색 bst
 * o(n) = 입력값 증가함에 따라 같은 비율로 시간 증가 ex for문
 * o(n2) = 입력값이 증가 하면 시간이 제곱수 비율로 증가됨 ex 2중 for문
 * o(2n)= 기하급수적 복잡도 ex 재귀함수
 * 위 문제는 코드가 수행횟수 1번 하면 종료 되고 즉시 값이 나오므로 1 , 0이 출력
 * MenOfPassion(A[], n) {
    i = ⌊n / 2⌋;
    return A[i]; # 코드1
}
 */
