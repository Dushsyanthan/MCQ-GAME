package quizTest;
import java.util.Scanner;

public class AnswerCheck extends Questions{
	static Scanner inp=new Scanner(System.in);
	public void answerCheck() {
		for(int i=0;i<ques.length;i++) {
			System.out.println(ques[i]);
			char an=inp.next().charAt(0);
			if(ans[i].equals((an+"").toUpperCase())) {
				mark++;
			}
		}
		percent=(mark*100)/total;
	}

}
