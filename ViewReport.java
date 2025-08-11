package quizTest;

public class ViewReport extends AnswerCheck{
	
	public void showReport() {
		System.out.println(mark+" Correct Answer out of "+total+" Questions");
		if(percent>=60) {
			System.out.println("You Passed the Exam With "+percent+"%");
		}
		else {
			System.out.println("You Failed the Exam With "+percent+"%");
		}
	}

}
