package com.simple.ex;
import javax.swing.JButton;
import javax.swing.JFrame;

//��ü�� Frame�� �������.
public class Swing02 {
	
	
	public static void main(String[] args) {
		JButton btn, btn1; //��ư�� Ŭ���� ����� ����. ������ Ŭ������ �����.
		
		JFrame win = new JFrame(); 
		
		//������ �ʱ� ����
		win.setTitle("������01");
		win.setSize(400,500);	//���� ���� ũ��
		
		//������ ��ġ ����
		win.setLayout(null); 
		
		//������Ʈ ��ġ�� ���� ����.(��ġ, ũ��)
		
		
		//���ϴ� ������Ʈ ����
		//��ư ����
		btn = new JButton("������");
		btn.setBounds(100,100,100,40);//x,y,����,����
		
		btn1 = new JButton("������2");
		btn1.setBounds(210,100,100,40);
		
		//�����ӿ� ������Ʈ ���. 
		win.add(btn);
		win.add(btn1);
		
		//������ Ȱ��ȭ(������ ���̰�)
		win.setVisible(true); //false�� �ٲٸ� �����ص� ȭ���� �Ⱥ��δ�.
		win.setResizable(false); //âũ�� ����. ũ��ٲܰų�? false.
		
		
		
	}
}
