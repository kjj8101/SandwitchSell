package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import MODEL.DAO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 사용자주문조회창2 {

	private JFrame frame;
	private static String id=null;
	DAO dao=new DAO();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {new 사용자주문조회창2(id);
	}

	/**
	 * Create the application.
	 */
	public 사용자주문조회창2(String n) {
		this.id=n;
		frame = new JFrame();
		frame.setBounds(100, 100, 686, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String[]data =new String [6];
		data=dao.ConsumerView(n);
		JLabel lblNewLabel = new JLabel(data[0]);
		lblNewLabel.setBounds(234, 63, 371, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel(data[1]);
		label_1.setBounds(234, 106, 373, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel(data[2]);
		label_2.setBounds(234, 149, 368, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel(data[3]);
		label_3.setBounds(234, 191, 369, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel(data[4]);
		label_4.setBounds(234, 280, 354, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel(data[5]);
		label_5.setBounds(234, 322, 365, 15);
		frame.getContentPane().add(label_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new 사용자페이지(id);
			}
		});
		
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(319, 383, 35, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\주문내역배경.png"));
		label.setBounds(0, 0, 672, 451);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
	}
}
