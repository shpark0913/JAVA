package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실수값 저장
//		float var1 = 3.14;  // 컴파일 에러
		float var1 = 3.14f;
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		
		// e 사용하기
		double var3 = 3e6;
		double var4 = 2e-3;
		float var5 = 3e6f;
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
