package Chapter10.ThreadRunner;
import java.util.Scanner;

public class RunnerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주자 수 : ");
		int runner = sc.nextInt(); 		//객체 생성
		for(int i=1; i<= runner; i++) {
			Thread running = new Runner(i+"번");
			running.start();
		}
	}
	
	
}
