package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cal_4chik extends JFrame{
	JButton btn;
	private JLabel lblName;
	private JLabel lblName1;
	private JTextField lbltfName;
	private JTextField lbltfName1;
	private JTextField lbtfOut;
	private JLabel lblName2;
	private JLabel lblResult;
	
	
	//������ �ʱ� ����  >>������ ��ġ ���� >> ��ư ����>> �������ӿ� ������Ʈ ���
	public Cal_4chik() {
		//������ �ʱ� ����
		setTitle("���� ������â ���� <> ");
		setSize(400,500);
		
		//������ ��ġ ����
		setLayout(null);
		
		
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
				JButton jbtn1 = new JButton("+");
				jbtn1.setBounds(100,50,50,40);
				jbtn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String val1 = lbltfName.getText();
						String val2 = lbltfName1.getText();
						
						float n1 = Float.parseFloat(val1);
						float n2 = Float.parseFloat(val2);
						if(n1>n2) {
							float result = n1+n2;
							lbtfOut.setText(result+"");
						}else if(n1<n2) {
							float result = n2+n1;
							lbtfOut.setText(result+"");
							
						}
						
					}
				});
				//��ư ���� -
				JButton jbtn2 = new JButton("-");
				jbtn2.setBounds(150,50,50,40);
				jbtn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String val1 = lbltfName.getText();
						String val2 = lbltfName1.getText();
						
						float n1 = Float.parseFloat(val1);
						float n2 = Float.parseFloat(val2);
						if(n1>n2) {
							float result = n1-n2;
							lbtfOut.setText(result+"");
						}else if(n1<n2) {
							float result = n2-n1;
							lbtfOut.setText(result+"");
							
						}
						
					}
				});
				//��ư ���� x
				JButton jbtn3 = new JButton("X");
				jbtn3.setBounds(200,50,50,40);
				jbtn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String val1 = lbltfName.getText();
						String val2 = lbltfName1.getText();
						
						float n1 = Float.parseFloat(val1);
						float n2 = Float.parseFloat(val2);
						if(n1>n2) {
							float result = n1*n2;
							lbtfOut.setText(result+"");
						}else if(n1<n2) {
							float result = n2*n1;
							lbtfOut.setText(result+"");
							
						}
						
					}
				});
				
				//��ư ���� ��
				JButton jbtn4 = new JButton("��");
				jbtn4.setBounds(250,50,50,40);
				jbtn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String val1 = lbltfName.getText();
						String val2 = lbltfName1.getText();
						double result = 0.0;
						//float n1 = Float.parseFloat(val1);
						float n2 = Float.parseFloat(val2);
						if(n2 != 0) {
							result = Float.parseFloat(val1) / (double)n2;
						}
						lbtfOut.setText(result + "");
					}
				});

		
		
		
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
	
	public static void main(String[] args) {
		new Cal_4chik();
	}
}
