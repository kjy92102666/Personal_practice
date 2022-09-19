package Chapter10;

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			try {
				System.out.print(Thread.currentThread().getName());
				Thread.sleep(10);
				for(int j=1; j<=i; j++) {
					System.out.print("$");
				}
				System.out.println();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2, "myThread2");
		thread.start();
		
	}
}
