package Chapter6;

public class Student2 extends Person2{
	String schoolKind;
	int grade;
	
	@Override
	public void sleep() {
		System.out.println("학생들의 수면 스타일은 규칙적이다.");
	}
	
	void study() {
		System.out.println("공부를 한다.");
	}
}
