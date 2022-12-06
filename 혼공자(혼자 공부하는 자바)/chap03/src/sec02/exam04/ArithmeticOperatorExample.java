package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println(result1);
		// 예상 답 : 7
		
		int result2 = v1 - v2;
		System.out.println(result2);
		// 예상 답 : 3
		
		int result3 = v1 * v2;
		System.out.println(result3);
		// 예상 답 : 10
		
		int result4 = v1 / v2;
		System.out.println(result4);
		// 예상 답 : 2
		
		int result5 = v1 % v2;
		System.out.println(result5);
		// 예상 답 : 1
		
		double result6 = (double) v1 / v2;
		System.out.println(result6);
		// 예상 답 : 2.5
	}

}
