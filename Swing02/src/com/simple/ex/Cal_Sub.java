package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cal_Sub {
//������ �ʱ⼳��, ��ġ,������Ʈ����,��ư����,������Ʈ ���,������ Ȱ��ȭ
	
	private JLabel lblName;
	private JLabel lblName1;
	private JLabel lblResultName;

	public Cal_Sub() {
		JFrame jf = new JFrame();
		//�ʱ� ����
		jf.setTitle("���� ������â ����<->");
		jf.setSize(400,500);
		
		//��ġ
		jf.setLayout(null);
		
		//������Ʈ ����
		lblName = new JLabel("���� 1: ");
		lblName.setBounds(50,5,100,40);
		lblName1 = new JLabel("���� 2: ");
		lblName1.setBounds(50,100,100,40);
		lblResultName = new JLabel("��� ");
		lblResultName.setBounds(50,150,100,40);
		
		//Ű���� �Է� ������Ʈ JTextFiled
		JTextField tfName = new JTextField();
		tfName.setBounds(100,5,100,40);
		JTextField tfName1 = new JTextField();
		tfName1.setBounds(100,100,100,40);
		
		//������� ���� �ؽ�Ʈ�ʵ����
		
		JTextField tfOutName = new JTextField();
		tfOutName.setBounds(100,150,100,40);
		
		//��ư ����
		JButton jbtn = new JButton("-");
		jbtn.setBounds(100,50,100,40);
		jbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				String name1 = tfName1.getText();
				int n = Integer.parseInt(name);
				int n1 = Integer.parseInt(name1);
				int result = n-n1;
				if(n>n1) {
					result = n-n1;
				}else if(n<n1){
					result = n1-n;
				}
				
				tfOutName.setText(result+"");
				
			}
		});
		
		//������Ʈ ���
		jf.add(jbtn);
		jf.add(lblName);
		jf.add(lblName1);
		jf.add(tfName);
		jf.add(tfName1);
		jf.add(tfOutName);
		jf.add(lblResultName);
		
		//������ Ȱ��ȭ
		jf.setVisible(true);
		jf.setResizable(false);
	}
	
	public static void main(String[] args) {
		new Cal_Sub();

		String ���� = "����";
		System.out.println(����);
		String �� = "��";
		System.out.println(��);
	}
}
