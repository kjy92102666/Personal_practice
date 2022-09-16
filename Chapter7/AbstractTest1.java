package Chapter7;

 abstract class AbstractClass {
	//변수 선언
	int age;
	
	//구현된 메소드
	void generalMethod() {
		System.out.println("일반 메소드");
	}
	
	//추상 메소드
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{
	@Override
	void abstractMethod() {
		System.out.println("추상 메소드 구현");
	}
}
public class AbstractTest1{
	//추상 클래스로 객체 생성하기
	
	public static void main(String[] args) {
		//추상클래스로 객체 생성
		//AbstractClass ac = new AbstractClass();
		
		//자식 클래스로 객체 생성
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	}
}
