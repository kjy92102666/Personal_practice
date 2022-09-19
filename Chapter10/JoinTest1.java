package Chapter10;
import java.util.ArrayList;

class BeforeThread extends Thread{
	public BeforeThread(String name) {
		super(name);
	}
	private void addCar() {
		System.out.println("addCar");
		JoinTest1.carList.add("�׷���");
		JoinTest1.carList.add("�ҳ�Ÿ");
		JoinTest1.carList.add("k9");
		JoinTest1.carList.add("sm7");
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName() + "����");
		try {sleep(1000);}catch(InterruptedException e) {
			e.printStackTrace();
		}
			addCar();
	}
}

class AfterThread extends Thread{
	public AfterThread(String name) {
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
public class JoinTest1 {
	public static ArrayList<String> carList = new ArrayList<String>();
	//join �޼ҵ带 �������� ���� ��Ƽ ������
	public static void main(String[] args) {
		BeforeThread beforeThread = new BeforeThread("before Thread");
		AfterThread afterThread = new AfterThread("afterThread");
		
		beforeThread.start();
		afterThread.start();
	}
}
