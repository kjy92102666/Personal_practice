package Chapter10;
import java.util.ArrayList;

class BeforeThread1 extends Thread{
	public BeforeThread1 (String name) {
		super(name);
	}
	
	private void addCar() {
		System.out.println("addCar");
		JoinTest1.carList.add("�׷���");
		JoinTest1.carList.add("�Ÿ");
		JoinTest1.carList.add("K9");
		JoinTest1.carList.add("SM7");

	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName()+"����");
		try{
			sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		addCar();
	}
	
}

class AfterThread1 extends Thread{
	public AfterThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName() + "����");
		ArrayList<String> carList = JoinTest1.carList;
		for(int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i));
		}
	}
	
	
}



public class JoinTest2 {
	public static ArrayList<String> carList = new ArrayList<String>();
	//Join ����� ������ ��Ƽ ������
	public static void main(String[] args) {
		
		System.out.println("afterThread ȣ��Ǵ� ��ġ Ȯ���ϰ� ��� ���� �ϱ�.");
		BeforeThread1 beforeThread = new BeforeThread1("beforeThread");
		AfterThread1 afterThread = new AfterThread1("afterThread");
		beforeThread.start();
		try {
			beforeThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		afterThread.start();
	}
	
}
