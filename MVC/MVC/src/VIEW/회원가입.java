package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.sun.corba.se.pept.transport.Connection;

import MODEL.DAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;

public class 회원가입 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	Image img=new ImageIcon("Image/textboxBackground.png").getImage();
	java.sql.Connection conn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	DAO dao= new DAO();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			new 회원가입();
	}

	/**
	 * Create the frame.
	 */
	public 회원가입() {

		//setDefaultCloseOperation(.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 722);
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
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setForeground(Color.white);
		textField.setBounds(182, 255, 274, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField(){
			{setBorder(null);}
			{setOpaque( false ) ; }
        public void paintComponent(Graphics g){
            g.drawImage(img,0,0,null);      
            super.paintComponent(g);
        }
		};
		textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_1.setForeground(Color.white);
		textField_1.setColumns(10);
		textField_1.setBounds(182, 305, 274, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField(){
			{setBorder(null);}
			{setOpaque( false ) ; }
        public void paintComponent(Graphics g){
            g.drawImage(img,0,0,null);      
            super.paintComponent(g);
        }
		};
		textField_2.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_2.setForeground(Color.white);
		textField_2.setColumns(10);
		textField_2.setBounds(182, 357, 274, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField(){
			{setBorder(null);}
			{setOpaque( false ) ; }
        public void paintComponent(Graphics g){
            g.drawImage(img,0,0,null);      
            super.paintComponent(g);
        }
		};
		textField_3.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_3.setForeground(Color.white);
		textField_3.setColumns(10);
		textField_3.setBounds(182, 408, 274, 29);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField(){
			{setBorder(null);}
			{setOpaque( false ) ; }
        public void paintComponent(Graphics g){
            g.drawImage(img,0,0,null);      
            super.paintComponent(g);
        }
		};
		textField_4.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_4.setForeground(Color.white);
		textField_4.setColumns(10);
		textField_4.setBounds(182, 460, 274, 29);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setIcon(new ImageIcon("Image\\회원가입버튼.png"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource().equals(btnNewButton)) {
					conn=dao.getConn();
					String sql="select id from member where id=?";					
					try {
						pst=((java.sql.Connection) conn).prepareStatement(sql);
						pst.setString(1,textField.getText());
						ResultSet rs=pst.executeQuery();
						if(rs.next()) {
								JOptionPane.showMessageDialog(null,"아이디가 존재합니다.");		
								pst=((java.sql.Connection) conn).prepareStatement("Commit");
								pst.executeUpdate();
						}else if(textField.getText().equals("")||textField_1.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null,"정보를 입력해주세요");
						}else {
							//ID PW 이름 주소 연락처 ISdmin
							sql="insert into member values(?,?,?,?,?,0)";
							pst=conn.prepareStatement(sql);					
							pst.setString(1,textField.getText() );
							pst.setString(2,textField_1.getText() );
							pst.setString(3,textField_2.getText() );
							pst.setString(4,textField_3.getText() );
							pst.setString(5,textField_4.getText() );
							pst.executeUpdate();
							pst=conn.prepareStatement("Commit");
							JOptionPane.showMessageDialog(null,"회원가입 완료");
							setDefaultCloseOperation(EXIT_ON_CLOSE);
							setVisible(false);
							
						
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
				//-----------------------------------------------------------------�����غ�
	
	

					
				dao.close();
				
			}
		});
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setIcon(new ImageIcon("Image\\닫기버튼.png"));
		button.setForeground(Color.BLACK);
		button.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
		button.setBackground(Color.WHITE);
		button.setBounds(298, 556, 146, 52);
		contentPane.add(button);
		btnNewButton.setBounds(127, 556, 150, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-11, 10, 579, 683);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("Image\\회원가입배경.jpg"));
		contentPane.add(lblNewLabel);
		setVisible(true);
	}
}
