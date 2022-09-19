package Chapter10;
import java.util.ArrayList;

class BeforeThread extends Thread{
	public BeforeThread(String name) {
		super(name);
	}
	private void addCar() {
		System.out.println("addCar");
		JoinTest1.carList.add("그랜저");
		JoinTest1.carList.add("소나타");
		JoinTest1.carList.add("k9");
		JoinTest1.carList.add("sm7");
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName() + "실행");
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
		System.out.println(currentThread().getName() + "실행");
		ArrayList<String> carList = JoinTest1.carList;
		for(int i=0; i<carList.size(); i++) {
			System.out.println(carList.get(i));
		}
	}
}
public class JoinTest1 {
	public static ArrayList<String> carList = new ArrayList<String>();
	//join 메소드를 적용하지 않은 멀티 스레딩
	public static void main(String[] args) {
		BeforeThread beforeThread = new BeforeThread("before Thread");
		AfterThread afterThread = new AfterThread("afterThread");
		
		beforeThread.start();
		afterThread.start();
	}
}
