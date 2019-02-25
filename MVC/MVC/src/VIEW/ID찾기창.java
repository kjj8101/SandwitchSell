package VIEW;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import MODEL.DAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ID찾기창 extends JFrame {
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private java.awt.Image img;
	DAO dao = new DAO();
	private JButton button;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ID찾기창();
	}

	/**
	 * Create the application.
	 */
	public ID찾기창() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField(){
			{setBorder(null);}
			{setOpaque( false ) ; }
      public void paintComponent(Graphics g){
          g.drawImage(img,0,0,null);      
          super.paintComponent(g);
      }
		};
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(143, 271, 344, 29);
		contentPane.add(textField);
		
		textField_1 = new JTextField(){
			{setBorder(null);}
			{setOpaque( false ) ; }
      public void paintComponent(Graphics g){
          g.drawImage(img,0,0,null);      
          super.paintComponent(g);
      }
		};
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(143, 323, 344, 29);
		contentPane.add(textField_1);
		
		JButton btnId = new JButton();
		btnId.setIcon(new ImageIcon("Image\\ID찾기버튼.PNG"));
		btnId.setContentAreaFilled(false);
		btnId.setBorderPainted(false);
		btnId.setFocusPainted(false);
		btnId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=dao.FindID(textField.getText(),textField_1.getText());
				if(s!=null) {
				JOptionPane.showMessageDialog(null,"회원님의 ID는 "+s+"입니다.");
				textField_1.setText("");
				textField.setText("");
				}else {
					JOptionPane.showMessageDialog(null,"회원정보가 존재하지 않습니다.");
				}
			}
		});
		btnId.setForeground(Color.BLACK);
		btnId.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
		btnId.setBackground(Color.WHITE);
		btnId.setBounds(103, 455, 181, 49);
		contentPane.add(btnId);
		
		button = new JButton();
		button.setIcon(new ImageIcon("Image\\닫기버튼.png"));
		button.setForeground(Color.BLACK);
		button.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBackground(Color.WHITE);
		button.setBounds(322, 455, 181, 49);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Image\\ID찾기배경.jpg"));
		lblNewLabel.setBounds(0, 0, 579, 598);
		contentPane.add(lblNewLabel);
		setVisible(true);
	}

}
