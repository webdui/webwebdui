//实现注册和登陆
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login implements ActionListener{
	JFrame frame1 =new JFrame("初始界面");
	JButton button00 =new JButton("注册");
	JButton button01 =new JButton("登录");
	JFrame frame =new JFrame("注册界面");  //建立注册窗口
	JLabel label1=new JLabel("用户名");
	JTextField textfield1=new JTextField("");
	JLabel label2=new JLabel("密码");
	JTextField textfield2=new JTextField("");
	JButton button =new JButton("提交");
	JFrame frame2 =new JFrame("注册结果");
	JLabel label3=new JLabel("注册成功，请登录");
	JButton button2 =new JButton("登录");
	JFrame frame3 =new JFrame("登录界面");
	JTextField textfield3=new JTextField("");
	JTextField textfield4=new JTextField("");
	JButton button3 =new JButton("提交");
	Login(){ 
		frame1.setLayout(new GridLayout(2,1));//布局管理器，令每个元素占据一行，2行1列
		frame1.add(button00); 
		frame1.add(button01); 
		frame1.setBounds(10, 10, 300, 200);  //设置窗口大小
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension framesize = frame1.getSize(); 
		int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
		int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
		frame1.setLocation(x,y);  //令窗口居中显示
		frame1.setVisible(true); //令窗口可见
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //令窗口的关闭按钮有效
		button00.addActionListener(this);
		button01.addActionListener(this);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button00){  //注册
			frame.setLayout(new GridLayout(5,1));//布局管理器，令每个元素占据一行，5行1列
			frame.add(label1);
			frame.add(textfield1);
			frame.add(label2);
			frame.add(textfield2);
			frame.add(button);    //在窗口中加入所有元素
			frame.setBounds(10, 10, 300, 200);  //设置窗口大小
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension framesize = frame.getSize(); 
			int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
			int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
			frame.setLocation(x,y);  //令窗口居中显示
			frame.setVisible(true); //令窗口可见
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //令窗口的关闭按钮有效
		}
		if(e.getSource()==button){  //注册结果
			System.out.println("注册成功，请登录");
			frame2.add(button2); 
			frame2.setLayout(new GridLayout(2,1));//布局管理器，令每个元素占据一行，1行1列
			frame2.add(label3);
			frame2.setBounds(10, 10, 300, 200);  //设置窗口大小
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension framesize = frame2.getSize(); 
			int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
			int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
			frame2.setLocation(x,y);  //令窗口居中显示
			frame2.setVisible(true); //令窗口可见
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //令窗口的关闭按钮有效
		}
		if(e.getSource()==button2 || e.getSource()==button01){   //登录
			
			frame3.setLayout(new GridLayout(5,1));//布局管理器，令每个元素占据一行，5行1列
			frame3.add(label1);
			frame3.add(textfield3);
			frame3.add(label2);
			frame3.add(textfield4);
			frame3.add(button3);    //在窗口中加入所有元素
			frame3.setBounds(10, 10, 300, 200);  //设置窗口大小
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension framesize = frame3.getSize(); 
			int x = (int)screensize.getWidth()/2 - (int)framesize.getWidth()/2; 
			int y = (int)screensize.getHeight()/2 - (int)framesize.getHeight()/2; 
			frame3.setLocation(x,y);  //令窗口居中显示
			frame3.setVisible(true); //令窗口可见
			frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //令窗口的关闭按钮有效
		}
		if(e.getSource()==button3){  //登录结果
			if(textfield3.equals(textfield1) && textfield4.equals(textfield2)){
				System.out.println("欢迎来到在线社团！");
			}
			else{
				System.out.println(textfield3);
				System.out.println(textfield1);
				System.out.println("密码错误，请重新登陆");
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
