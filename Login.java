//ʵ��ע��͵�½
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login implements ActionListener{
	JFrame frame1 =new JFrame("��ʼ����");
	JButton button00 =new JButton("ע��");
	JButton button01 =new JButton("��¼");
	JFrame frame =new JFrame("ע�����");  //����ע�ᴰ��
	JLabel label1=new JLabel("�û���");
	JTextField textfield1=new JTextField("");
	JLabel label2=new JLabel("����");
	JTextField textfield2=new JTextField("");
	JButton button =new JButton("�ύ");
	JFrame frame2 =new JFrame("ע����");
	JLabel label3=new JLabel("ע��ɹ������¼");
	JButton button2 =new JButton("��¼");
	JFrame frame3 =new JFrame("��¼����");
	JTextField textfield3=new JTextField("");
	JTextField textfield4=new JTextField("");
	JButton button3 =new JButton("�ύ");
	Login(){ 
		frame1.setLayout(new GridLayout(2,1));//���ֹ���������ÿ��Ԫ��ռ��һ�У�2��1��
		frame1.add(button00); 
		frame1.add(button01); 
		frame1.setBounds(10, 10, 300, 200);  //���ô��ڴ�С
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension framesize = frame1.getSize(); 
		int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
		int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
		frame1.setLocation(x,y);  //��ھ�����ʾ
		frame1.setVisible(true); //��ڿɼ�
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��ڵĹرհ�ť��Ч
		button00.addActionListener(this);
		button01.addActionListener(this);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button00){  //ע��
			frame.setLayout(new GridLayout(5,1));//���ֹ���������ÿ��Ԫ��ռ��һ�У�5��1��
			frame.add(label1);
			frame.add(textfield1);
			frame.add(label2);
			frame.add(textfield2);
			frame.add(button);    //�ڴ����м�������Ԫ��
			frame.setBounds(10, 10, 300, 200);  //���ô��ڴ�С
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension framesize = frame.getSize(); 
			int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
			int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
			frame.setLocation(x,y);  //��ھ�����ʾ
			frame.setVisible(true); //��ڿɼ�
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��ڵĹرհ�ť��Ч
		}
		if(e.getSource()==button){  //ע����
			System.out.println("ע��ɹ������¼");
			frame2.add(button2); 
			frame2.setLayout(new GridLayout(2,1));//���ֹ���������ÿ��Ԫ��ռ��һ�У�1��1��
			frame2.add(label3);
			frame2.setBounds(10, 10, 300, 200);  //���ô��ڴ�С
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension framesize = frame2.getSize(); 
			int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
			int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
			frame2.setLocation(x,y);  //��ھ�����ʾ
			frame2.setVisible(true); //��ڿɼ�
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��ڵĹرհ�ť��Ч
		}
		if(e.getSource()==button2 || e.getSource()==button01){   //��¼
			
			frame3.setLayout(new GridLayout(5,1));//���ֹ���������ÿ��Ԫ��ռ��һ�У�5��1��
			frame3.add(label1);
			frame3.add(textfield3);
			frame3.add(label2);
			frame3.add(textfield4);
			frame3.add(button3);    //�ڴ����м�������Ԫ��
			frame3.setBounds(10, 10, 300, 200);  //���ô��ڴ�С
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension framesize = frame3.getSize(); 
			int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
			int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
			frame3.setLocation(x,y);  //��ھ�����ʾ
			frame3.setVisible(true); //��ڿɼ�
			frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��ڵĹرհ�ť��Ч
		}
		if(e.getSource()==button3){  //��¼���
			if(textfield3.equals(textfield1) && textfield4.equals(textfield2)){
				System.out.println("��ӭ�����������ţ�");
			}
			else{
				System.out.println(textfield3);
				System.out.println(textfield1);
				System.out.println("������������µ�½");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l=new Login();
		
	}

}
