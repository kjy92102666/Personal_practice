package Chapter10.ThreadRunner;
import java.util.Scanner;

public class RunnerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("林磊 荐 : ");
		int runner = sc.nextInt(); 		//按眉 积己
		for(int i=1; i<= runner; i++) {
			Thread running = new Runner(i+"锅");
			running.start();
		}
	}
	
	
}
