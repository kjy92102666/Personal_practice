package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//BMI>=18.5 : ��ü�� // 18.5~22.9 : ���� // 23.0 ~ 24.9 : ��ü�� // 25.0 ~ : ��
//���� 
//������ �ʱ� ����  >>������ ��ġ ���� >> (������Ʈ ��ġ ����. ��ġ,ũ��>> ���ϴ� ������Ʈ ����) >> 
//��ư ����>>�������ӿ� ������Ʈ ��� >> ������Ȱ��ȭ
public class BMISwing extends JFrame implements ActionListener{

	JButton calBtn;
	
	private JLabel lblheight;
	private JLabel lblweight;
	private JLabel lblResult;
	private JTextField lbltfheight;
	private JTextField lbltfweight;
	private JTextField lbltfResult;

	
	

	public BMISwing() {
		//�ʱ� ����
		this.setTitle("�񸸵� ����(BMI����) ���α׷�");
		this.setSize(400,500);
		
		//��ġ ����
		this.setLayout(null);
		
		//�����ӿ� ������Ʈ ���
		lblheight = new JLabel("���� ");
		lblheight.setBounds(50,20,100,40);
		lblweight = new JLabel("������ ");
		lblweight.setBounds(50,80,100,40);
		lblResult = new JLabel("BMI ���� ����");
		lblResult.setBounds(50,200,100,40);
		
		lbltfheight = new JTextField();
		lbltfheight.setBounds(150,20,100,40);
		lbltfweight = new JTextField();
		lbltfweight.setBounds(150,80,100,40);
		lbltfResult = new JTextField();
		lbltfResult.setBounds(150,200,100,40);
		
		
		//��ư ����
		JButton calBtn = new JButton("����ϱ�");
		//���� ���� ������ ���� ���庸��!
		calBtn.setBounds(150,140,100,40);
		calBtn.addActionListener(this);
		
		//��ư ���
		this.add(lblheight);
		this.add(lblweight);
		this.add(calBtn);
		
		this.add(lbltfheight);
		this.add(lbltfweight);
		this.add(lbltfResult);
		
		this.add(lblResult);
		
		//������ Ȱ��ȭ
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String var1 = lbltfheight.getText();
		String var2 = lbltfweight.getText();
		Double v1 = Double.parseDouble(var1);
		Double v2 = Double.parseDouble(var2);
		
		String str = "";
		Double result = 0.0;
		
		if(e.getSource() == calBtn) {
			
			result =Math.round(v2 / ((v1/100)*(v1/100))*100)/100.0;
			if( (result > 0) && (result <=18.5) ) {
				str = "��ü��.";
			}else if( (result>18.5) && (result <= 22.9) ) {
				str = "���� .";
			}else if( (result>22.9) && (result <= 24.9)) {
				str = "��ü��.";
			}else {
				str = "�� .";
			}
			
		}
		
		lbltfResult.setText(result + "" + str);

	}
	
	
	public static void main(String[] args) {
		new BMISwing();
	}

}