package com.simple.ex;
import javax.swing.JButton;
import javax.swing.JFrame;

//Frame�� ��� �޾Ҵ�. 02���� �� ������ �� ���� ���δ�.
public class Swing03 extends JFrame{
	JButton btn, btn1; //��ư�� Ŭ���� ����� ����. ������ Ŭ������ �����.
	
	public Swing03() {
		//������ �ʱ� ����
				setTitle("������01");
				setSize(400,500);	//���� ���� ũ��
				
				//������ ��ġ ����
				setLayout(null); 
				
				//������Ʈ ��ġ�� ���� ����.(��ġ, ũ��)
				
				
				//���ϴ� ������Ʈ ����
				//��ư ����
				btn = new JButton("������");
				btn.setBounds(100,100,100,40);//x,y,����,����
				
				btn1 = new JButton("������2");
				btn1.setBounds(210,100,100,40);
				
				//�����ӿ� ������Ʈ ���. 
				add(btn);
				add(btn1);
				
				//������ Ȱ��ȭ(������ ���̰�)
				setVisible(true); //false�� �ٲٸ� �����ص� ȭ���� �Ⱥ��δ�.
				setResizable(false); //âũ�� ����. ũ��ٲܰų�? false.
				
	}
	public static void main(String[] args) {
		Swing03 f1 = new Swing03();
		Swing03 f2 = f1;
		
		
		
	
	}
}
