package Chapter6;

public class Salaryman2 extends Person2 {
	private String department;
	int x = 20;
	
	@Override
	public void sleep() {
		System.out.println("직장인은 일반적으로 7시간을 잔다.");
	}
}
