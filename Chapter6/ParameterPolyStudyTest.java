package Chapter6;

class PersonInfo2{
	void showSleepingType (Person2 person) {
		if(person instanceof Student2) {	//instanceOf �����ڴ� ��ü�� � Ŭ��������, � Ŭ������ ��ӹ޾Ҵ��� Ȯ���ϴµ� ����ϴ� ������
			Student2 student = (Student2)person;
			student.study();
		}
		person.sleep();
	}
}

public class ParameterPolyStudyTest {
	//������ �׽�Ʈ
	public static void main(String[] args) {
		PersonInfo2 pf = new PersonInfo2();
		Person2 person = new Person2();				//����� ���� 10�ð� �ܴ�.
		Salaryman2 salaryman = new Salaryman2();	//�������� �Ϲ������� 7�ð��� �ܴ�.
		Student2 student = new Student2();			//�л����� ���� ��Ÿ���� ��Ģ���̴�.
		President2 president = new President2();	//������� �׻� ���� �ð��� �����ϴ�.
		
		pf.showSleepingType(person);
		pf.showSleepingType(salaryman);
		pf.showSleepingType(student);
		pf.showSleepingType(president);
	}
}
