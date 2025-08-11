package quizTest;

public class McqTest extends ViewReport {
	
	public static void main(String[] args) {
		new McqTest().start();
	}
	public void start() {
		System.out.println("=".repeat(80));
		answerCheck();
		System.out.println("=".repeat(80));
		showReport();
		System.out.println("=".repeat(80));
	}
	
}
