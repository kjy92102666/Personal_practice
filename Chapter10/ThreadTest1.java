package Chapter10;

class MyThread extends Thread{

	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			try {
				System.out.print(currentThread().getName());
				sleep(10);		//10�̸��� ���� ������ �����ϴ� �κ�.
				
				for(int j=1; j<=i; j++) {
					System.out.print("$");
				}
				System.out.println();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(currentThread().getName().hashCode());
		}
	}

}

public class ThreadTest1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread1");
		myThread.start();//myThread�� �����ϴ� �κ�. start()ȣ���, 
		//����callstack�Ҵ�-Runnable-������ �����ٷ��� ���� ���ý�, Running����->�ش� ������ run()�޼ҵ� ����
	}
}




