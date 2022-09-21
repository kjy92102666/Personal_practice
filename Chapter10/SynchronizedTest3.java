package Chapter10;

class DressingRoomThread implements Runnable{
	@Override
	public void run() {
		synchronized (this) {//초기화 블록에서 DRT객체에 동기화를 처리하고 있다. 
			//이렇게 되면 하나의 스레드에서 DRT클래스에 정의되어 있는 작업을 수행 할 때 
			//다른 스레드는 절대 DRT의 작업을 수행할 수 없다.
			for(int i=5; i>=1; i--) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.print(Thread.currentThread().getName());
				System.out.println("dressing 종료 " + (i*10) + "초 전....");
			}
			System.out.println(Thread.currentThread().getName() + "dressing 완료.");
		}
	}
	
}


public class SynchronizedTest3 {
 //동기화 코드 블록 사용
	public static void main(String[] args) {
		DressingRoomThread dr = new DressingRoomThread();
		
		Thread t1 = new Thread(dr, "첫 번쨰 손님");
		Thread t2 = new Thread(dr, "두 번쨰 손님");
		
		t1.start();
		t2.start();
	}
}
