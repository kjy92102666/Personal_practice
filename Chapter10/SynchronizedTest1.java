package Chapter10;

class EasyTicket implements Runnable{
	int ticketNum = 10;	//잔여 좌석
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			getTicket();
		}
	}
	
	
	public void getTicket() {
		ticketNum -= 1;
		if(ticketNum <= 0) {
			System.out.print(Thread.currentThread().getName() + ", ");
			
			System.out.println("잔여 좌석이 없습니다.");
			return;
		}
		System.out.print(Thread.currentThread().getName() + ", ");
		System.out.println("현재 잔여 좌석은 " + ticketNum + "좌석입니다.");
	}
	
}



public class SynchronizedTest1 {
//동기화 작업을 해 주지 않은 경우
	public static void main(String[] args) {
		EasyTicket et = new EasyTicket();
		Thread et1 = new Thread(et,"ticketConsumer1");
		Thread et2 = new Thread(et,"ticketConsumer2");
		et1.start();
		et2.start();
	}
	
}
