package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch (grade) {
		case 'A':
		case 'a': 
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		case 'C':
		case 'c':
			System.out.println("손님");
			
		}
		
	}

}
