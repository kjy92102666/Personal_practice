package Chapter7;

 abstract class AbstractClass {
	//���� ����
	int age;
	
	//������ �޼ҵ�
	void generalMethod() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
	
	//�߻� �޼ҵ�
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{
	@Override
	void abstractMethod() {
		System.out.println("�߻� �޼ҵ� ����");
	}
}
public class AbstractTest1{
	//�߻� Ŭ������ ��ü �����ϱ�
	
	public static void main(String[] args) {
		//�߻�Ŭ������ ��ü ����
		//AbstractClass ac = new AbstractClass();
		
		//�ڽ� Ŭ������ ��ü ����
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	}
}
