package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//������ �ʱ� ����  >>������ ��ġ ���� >> ���ϴ� ������Ʈ ����>> ��ư ����>>�������ӿ� ������Ʈ ��� >>������ Ȱ��ȭ
public class Cal_Add extends JFrame{

	private JLabel lblName;
	private JTextField tfName;
	private JTextField tfNameOut;
	private JLabel lblName1;
	private JTextField tfName1;
	private JLabel lblNameR;


	public Cal_Add() {
		
		//������ �ʱ� ����. �����ڿ��ٰ� ������!
		setTitle("���� ������â ���� <+>");
		setSize(400,500);//x,y
		
		
		//������ ��ġ ����
		setLayout(null);
		
		//���ϴ� ������Ʈ ����
		lblName = new JLabel("�� 1 : ");
		lblName.setBounds(50,50,100,40);
		tfName = new JTextField(); 		 //JTextField ==Scanner();
		tfName.setBounds(100,50,100,40);
		
		lblName1 = new JLabel("�� 2 : ");
		lblName1.setBounds(50,150,100,40);
		tfName1 = new JTextField(); 
		tfName1.setBounds(100,150,100,40);
		
		
		lblNameR = new JLabel("��� : ");
		lblNameR.setBounds(50,200,100,40);
		tfNameOut = new JTextField();
		tfNameOut.setBounds(100,200,100,40);
		
		
		//��ư ����
		JButton btn = new JButton("+");
		btn.setBounds(100,100,100,40);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				int n = Integer.parseInt(name);
				String name1 = tfName1.getText();
				int n1 = Integer.parseInt(name1);
				int result = n+n1;
				tfNameOut.setText(result+"");
				//tfNameOut.setText(n+n1); String���� �޾ƿ;� �ؼ� ����.
				
			}
		});
		
		//�����ӿ� ������Ʈ ���
		add(btn);
		
		add(lblName);
		add(lblName1);
		add(tfName);
		add(tfName1);
		add(tfNameOut);
		add(lblNameR);
		
		
		//������ Ȱ��ȭ(������ ���̰�)
		setVisible(true); 		//false�� �ٲٸ� �����ص� ȭ��x
		setResizable(false);	//âũ�� ����. ũ�� �ٲܰŸ� true
	}
	
	
	public static void main(String[] args) {
		new Cal_Add();
	}
}
