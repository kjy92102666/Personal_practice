package Chapter10;

class ImportantThread1 extends Thread{
	public ImportantThread1(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=15; i++) {
			System.out.println(currentThread().getName());
		}
	}

}

class NotImportantThread1 extends Thread{
	public NotImportantThread1 (String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=15; i++) {
			System.out.println(currentThread().getName());
		}
	}
	
}


public class PriorityTest2 {
	public static void main(String[] args) {
		ImportantThread1 it = new ImportantThread1("중요한 작업");
		NotImportantThread1 nit = new NotImportantThread1("중요하지 않은 작업");
		it.setPriority(Thread.MAX_PRIORITY);	//최소 우선순위, 값은 1
		nit.setPriority(Thread.MIN_PRIORITY);	//최대 우선순위, 값은 10
		//static int NORM_PRIORITY 중간 우선순위. 우선순위를 지정하지 않았을 떄의 기본값. 값은 5
		nit.start();
		it.start();
		
	}
}
