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
				sleep(10);		//10미리초 동안 실행을 중지하는 부분.
				
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
		myThread.start();//myThread를 시작하는 부분. start()호출시, 
		//새로callstack할당-Runnable-스레드 스케줄러에 의해 선택시, Running상태->해당 스레드 run()메소드 실행
	}
}




