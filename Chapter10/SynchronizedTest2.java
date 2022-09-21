package Chapter10;

class EasyTicket1 implements Runnable{
	int ticketNum = 10; 	//�ܿ� �¼�
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}getTicket();
		}
	}
	
	public synchronized void getTicket() {	//getTicket() ����ȭ�۾��ϴ� �Լ�
		ticketNum -= 1;
		if(ticketNum <= 0) {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("�ܿ� �¼��� �����ϴ�.");
			return;
		}
		System.out.print(Thread.currentThread().getName() + ", ");
		System.out.println("���� �ܿ� �¼��� " + ticketNum + "�¼� �Դϴ�.");
	}
	
	
}


public class SynchronizedTest2 {
	//����ȭ �۾��� ������ ���� ���
	public static void main(String[] args) {
		EasyTicket1 et = new EasyTicket1();
		Thread et1 = new Thread(et, "ticketConsumer1");
		Thread et2 = new Thread(et, "ticketConsumer2");
		et1.start();
		et2.start();
		
	}
}
