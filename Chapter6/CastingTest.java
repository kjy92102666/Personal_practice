package Chapter6;

public class CastingTest {
	public static void main(String[] args) {
		President1 president1 = new President1();
		
		Person1 person1 = president1;
		President1 president2 = (President1)person1;
		Person1 person2 = new Person1();
		President1 president3 = (President1)person1;
		
		
		System.out.println(person1);
		
		//형제 관계의 클래스 타입끼리 캐스팅
		//Student1 student = (Student1)president2;
	}
}


/*
		Person1
		l
President1  -   Salaryman1
	l
Student1


*/