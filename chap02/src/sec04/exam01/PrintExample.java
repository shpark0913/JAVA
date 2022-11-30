package sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {

		int value = 123;
		
		//예상 답 : 123
		System.out.printf("상품의 가격:%d원\n", value);
		
		//예상 답 : ___123
		System.out.printf("상품의 가격:%6d원\n", value);
		
		//예상 답 : 123___
		System.out.printf("상품의 가격:%-6d원\n", value);
		
		//예상 답 : 000123
		System.out.printf("상품의 가격:%06d원\n", value);
		
		//예상 답 : 정수 / 소수점 이상 7자리, 소수점 이하 2자리, 공백은 좌측 여백
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		//예상 답 : _____1 | 홍길동_______ | ________도적
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
