package sec03.exam05;

public class OperaionsPromotionExample {

	public static void main(String[] args) {
		/*  Question) 1/2의 연산 결과가 0.5이면 좋겠다!
		 자바에서 정수 연산의 결과는 정수
		 따라서 x / y 의 연산 결과는 0.5가 아니라 0.0이 된다.
		 0.0을 double 타입 변수에 저장하므로 0.0이 되는 것
		 */
		int x = 1; int y = 2;
		double result = (x / y);
		System.out.println(result);
		
		// sol1
		int x2 = 1;
		int y2 = 2;
		double result2 = (double) x2 / y2;
		System.out.println(result2);
		
		// sol2
		int x3 = 1;
		int y3 = 2;
		double result3 = x3 / (double) y3;
		System.out.println(result3);
		
		// sol3
		int x4 = 1;
		int y4 = 2;
		double result4 = (double) x4 / (double) y4;
		System.out.println(result4);
		
		// CAUTION!
		int x5 = 1;
		int y5 = 2;
		double result5 = (double) (x5 / y5);
		System.out.println(result5);
		
		// practice
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;
		int intValue2 = byteValue1 + byteValue2;
		System.out.println(intValue2);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int charValue3 = charValue1 + charValue2;
		System.out.println(charValue3);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x6 = 1;
		int y6 = 2;
		double result6 = (double) x / y;
		System.out.println(result6);
		
		
	}

}
