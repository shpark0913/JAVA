package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		// 예상 답 : 12
		
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("y=" + y);		
		// 예상 답 : 8
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);		
		// 예상 답 : 12, 13
		
		System.out.println("--------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		// 예상 답 : 14, 14
		
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		// 예상 답 : 23, 15, 9
		
	}

}
