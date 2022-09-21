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
	//우선순위를 적용하지 않는 멀티 스레딩
	public static void main(String[] args) {
		ImportantThread it = new ImportantThread("중요한 작업");
		NotImportantThread nit = new NotImportantThread("중요 하지 않은 작업 ");
		nit.start();
		it.start();
	}
	
}
