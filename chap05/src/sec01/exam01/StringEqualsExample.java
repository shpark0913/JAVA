package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVar1 = "박시현";
		String strVar2 = "박시현";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1, strVar2는 참조가 같다");
		} else {
			System.out.println("strVar1, strVar2는 참조가 다르다");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1, strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("박시현");
		String strVar4 = new String("박시현");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3, strVar4는 참조가 같다");
		} else {
			System.out.println("strVar3, strVar4는 참조가 다르다");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3, strVar4는 문자열이 같음");
		}
	}	

}
