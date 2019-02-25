package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import MODEL.DAO;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;

public class 관리자매출창 {

	private JFrame frame;
	DAO dao=new DAO();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	new  관리자매출창();	
	}

	/**
	 * Create the application.
	 */
	public 관리자매출창() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 335);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String a=dao.ManagerSum();
		JLabel lblNewLabel_1 = new JLabel(a+"원");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(0, 63, 295, 80);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Image\\관리자매출배경.jpg"));
		lblNewLabel.setBounds(0, 10, 434, 286);
		frame.getContentPane().add(lblNewLabel);
		
		frame.setVisible(true);
	}

}
