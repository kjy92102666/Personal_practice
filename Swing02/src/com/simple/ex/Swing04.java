package com.simple.ex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Frame�� ��� �޾Ҵ�. 02���� �� ������ �� ���� ���δ�.
public class Swing04 extends JFrame{
	JButton btn, btn1; //��ư�� Ŭ���� ����� ����. ������ Ŭ������ �����.
	JTextField tfName;
	JLabel lblName;
	private JTextField tfNameOut;
	
	public Swing04() {
		//������ �ʱ� ����
		setTitle("������01");
		setSize(400,500);	//���� ���� ũ��
		
		//������ ��ġ ����
		setLayout(null); 
		
		//������Ʈ ��ġ�� ���� ����.(��ġ, ũ��)
		

		//���ϴ� ������Ʈ ����
		//Ű���� �Է� ������Ʈ JTextFiled(�ֿܼ��� Scanner)
		lblName = new JLabel("�� �� : "); //��� ���ĵǼ� �����ٰŴ�~
		lblName.setBounds(50, 50, 100, 40);
		
		tfName = new JTextField();
		tfName.setBounds(100,50,100,40);
		//tfName.setText(getName()); //�� ����,�ʱ�ȭ.
		
		tfNameOut = new JTextField();
		tfNameOut.setBounds(100,150,100,40);
		
		//��ư ����
		btn = new JButton("������");
		btn.setBounds(100,100,100,40);//x,y,����,����
		
//		btn.addActionListener(new ActionListener() {//�������̽�, �͸�Ŭ����
//		�ַܼ� ��� ����.
//			//�Ű����� �ȿ� ���� ������ �������.
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//��ư Ŭ�� ��, ���޵Ǵ� �Լ�. e�� ���ؼ� ���޵ȴ�.
//				//Ű���� �Է� ���� �о����.
//				String name = tfName.getText(); //Text�� ��������̸�.
//				System.out.println("�̸� :" + name);
//			}
//			
//		});
		
		btn.addActionListener(new ActionListener() {//�������̽�, �͸�Ŭ����
			//�Ű����� �ȿ� ���� ������ �������.
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ư Ŭ�� ��, ���޵Ǵ� �Լ�. e�� ���ؼ� ���޵ȴ�.
				//Ű���� �Է� ���� �о����.
				String name = tfName.getText(); //Text�� ��������̸�.
				tfNameOut.setText(name);
			}
			
		});
		
		//�����ӿ� ������Ʈ ���. 
		add(btn);
		add(tfName);
		add(tfNameOut);
		add(lblName);
		
		//������ Ȱ��ȭ(������ ���̰�)
		setVisible(true); //false�� �ٲٸ� �����ص� ȭ���� �Ⱥ��δ�.
		setResizable(false); //âũ�� ����. ũ��ٲܰų�? false.
				
	}
	public static void main(String[] args) {
		Swing04 f1 = new Swing04();
		Swing04 f2 = f1;	//���� ����. ��������.
		
	}
}
