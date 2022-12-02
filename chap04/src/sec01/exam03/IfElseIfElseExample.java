package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {

		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 90~100");
			System.out.println("등급 : A");
		} else if (score >= 80) {
			System.out.println("점수가 80~89");
			System.out.println("등급 : B");
		} else if (score >= 70) {
			System.out.println("점수가 70~79");
			System.out.println("등급 : C");
		} else {
			System.out.println("점수가 70 미만");
			System.out.println("등급 : D");
		}
		
	}

}
