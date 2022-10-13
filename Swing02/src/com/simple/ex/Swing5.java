package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing5 extends JFrame implements ActionListener{

	private JLabel lblName;
	private JLabel lblName1;
	
	private JTextField lbltfName;
	private JTextField lbltfName1;
	private JTextField lbtfOut;
	
	private JLabel lblName2;
	private JLabel lblResult;
	
	private JButton jbtn1;
	private JButton jbtn2;
	private JButton jbtn3;
	private JButton jbtn4;

	
	//������ �ʱ� ����  >>������ ��ġ ���� >> ��ư ����>> �������ӿ� ������Ʈ ���
	public Swing5() {
		//������ �ʱ� ����
		this.setTitle("���� ������â ���� <> ");//this.�����Ȱ�.
		this.setSize(400,500);
		
		//������ ��ġ ����
		this.setLayout(null);
		
		//�Լ� ,�޼ҵ�:�����ϴ� ��� �ȿ����� �۵��ϸ� 
		
		//�����ӿ� ������Ʈ ���
		lblName = new JLabel("�� 1: ");
		lblName.setBounds(50,5,100,40);
		lblName1 = new JLabel("�� 2: ");
		lblName1.setBounds(50,100,100,40);
//		lblName2 = new JLabel("��");
//		lblName2.setBounds(50,50,100,40);
		lblResult = new JLabel("��� : ");
		lblResult.setBounds(50,150,100,40);
		
		lbltfName = new JTextField();
		lbltfName.setBounds(100,5,200,40);
		lbltfName1 = new JTextField();
		lbltfName1.setBounds(100,100,200,40);
		lbtfOut = new JTextField();
		lbtfOut.setBounds(100,150,200,40);
		
		
		//��ư ���� +
		jbtn1 = new JButton( new ImageIcon("plus (2).png") );
		jbtn1.setBounds(100,50,53,45);
		jbtn1.addActionListener(this);	
		//���⼭ this�� Swing5()Ŭ���� ��ü �ڽ��� ����Ų��.
		
		//��ư ���� -
		jbtn2 = new JButton(new ImageIcon("sub (2).png"));
		jbtn2.setBounds(155,50,53,45);
		jbtn2.addActionListener(this);
		
		//��ư ���� x
		jbtn3 = new JButton(new ImageIcon("mul (2).png"));
		jbtn3.setBounds(210,50,53,45);
		jbtn3.addActionListener(this);
		
		//��ư ���� ��
		jbtn4 = new JButton(new ImageIcon("div (2).png"));
		jbtn4.setBounds(265,50,53,45);
		jbtn4.addActionListener(this);

		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(lblName);
		add(lblName1);
		add(lbltfName);
		add(lbltfName1);
		add(lbtfOut);
		add(lblResult);
		
		//������Ȱ��ȭ
		setVisible(true);
		setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			String val1 = lbltfName.getText();
			String val2 = lbltfName1.getText();
			int result = 0;
			
			if(e.getSource() == jbtn1) {
				result = Integer.parseInt(val1) + Integer.parseInt(val2);
			}
			if(e.getSource() == jbtn2) {
				result = Integer.parseInt(val1) - Integer.parseInt(val2);
			}
			if(e.getSource() == jbtn3) {
				result = Integer.parseInt(val1) * Integer.parseInt(val2);
			}
			if(e.getSource() == jbtn4) {
				result = Integer.parseInt(val1) / Integer.parseInt(val2);
			}
			
		
			lbtfOut.setText(result + "");
		
	}
	
	
	public static void main(String[] args) {
		new Swing5();
	}

	
}
