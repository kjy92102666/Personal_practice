package Chapter10.ThreadRunner;
import java.util.Scanner;

public class RunnerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� : ");
		int runner = sc.nextInt(); 		//��ü ����
		for(int i=1; i<= runner; i++) {
			Thread running = new Runner(i+"��");
			running.start();
		}
	}
	
	
}
