package Chapter6;

public class President2 extends Person2{
	int salary;
	String nation;
	
	@Override
	public void sleep() {
		System.out.println("대통령은 항상 수면 시간이 부족하다.");
	}
}
