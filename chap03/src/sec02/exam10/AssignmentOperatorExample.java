package sec02.exam10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {

		int result = 0;
		result += 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 3;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 3;
		System.out.println(result);
		// 예상 답안 : 10, 5, 15, 3, 0
	}

}
