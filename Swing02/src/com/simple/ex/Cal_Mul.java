package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cal_Mul{
	
	JFrame win = new JFrame();
	private JTextField lbltfName;
	private JLabel lblName;
	private JLabel lblName1;
	private JTextField lbltfName1;
	private JTextField lblftOut;
	private JLabel lblResult;
	public Cal_Mul() {
		//윈도우 초기설정
		win.setTitle("가상 윈도우창 계산기 <*>");
		win.setSize(400, 500);
		
		//배치설정
		win.setLayout(null);
		
		//컴포넌트 생성
		lblName = new JLabel("숫자 1: ");
		lblName.setBounds(50,50,100,40);
		lblName1 = new JLabel("숫자 2: ");
		lblName1.setBounds(50,100,100,40);
		lblResult = new JLabel("결과 : ");
		lblResult.setBounds(50,200,100,40);
		
		lbltfName = new JTextField();
		lbltfName.setBounds(100,50,100,40);
		lbltfName1 = new JTextField();
		lbltfName1.setBounds(100,100,100,40);
		
		lblftOut = new JTextField();
		lblftOut.setBounds(100,200,100,40);
		
		
		//버튼생성
		JButton jbtn = new JButton("X");
		jbtn.setBounds(100,150,60,40);
		jbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cal = lbltfName.getText();
				String cal1 = lbltfName1.getText();
				int n = Integer.parseInt(cal);
				int n1 = Integer.parseInt(cal1);
				int result = n*n1;
				
				lblftOut.setText(result+"");
			}
		});
		
		
		//프레임에 컴포넌트 등록
		win.add(lblName);
		win.add(lblName1);
		win.add(lbltfName);
		win.add(lbltfName1);
		win.add(lblResult);
		win.add(lblftOut);
		win.add(jbtn);
		
		//윈도우 활성화
		win.setVisible(true);
		win.setResizable(false);
		
	}
	
	
	
	public static void main(String[] args) {
		new Cal_Mul();
	}
}
