package Chapter10;

class ImportantThread extends Thread{
	
	public ImportantThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=1; i<=15; i++) {
			System.out.println(currentThread().getName());
		}
	}
	
}

class NotImportantThread extends Thread{
	
	public NotImportantThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=1; i<=15; i++) {
			System.out.println(currentThread().getName());
		}
	}
	
}

public class PriorityTest1{
	//�켱������ �������� �ʴ� ��Ƽ ������
	public static void main(String[] args) {
		ImportantThread it = new ImportantThread("�߿��� �۾�");
		NotImportantThread nit = new NotImportantThread("�߿� ���� ���� �۾� ");
		nit.start();
		it.start();
	}
	
}
