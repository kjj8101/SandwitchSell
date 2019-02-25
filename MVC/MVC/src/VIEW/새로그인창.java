package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import MODEL.DAO;
import com.sun.prism.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 새로그인창 extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   private JPasswordField textField_1;
   private JButton btnNewButton;
   private java.awt.Image img;
   DAO dao=new DAO();
   private JLabel label;
   private JLabel label_2;
   private JLabel label_3;
   private JLabel label_4;
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	   new 새로그인창();
   }

   /**
    * Create the frame.
    */
   public 새로그인창() {
	
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 597, 545);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      label = new JLabel("혹시 아이디가 없으신가요?");
      label.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		if(e.getSource().equals(label)) {
      			new 회원가입();
      		}
      	}
      });
      label.setFont(new Font("나눔고딕 Light", Font.PLAIN, 16));
      label.setForeground(Color.WHITE);
      label.setHorizontalAlignment(SwingConstants.CENTER);
      label.setBounds(138, 432, 317, 29);
      contentPane.add(label);

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
      textField.setBounds(158, 265, 329, 29);
      contentPane.add(textField);

      textField_1 = new JPasswordField(){
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
      textField_1.setBounds(158, 316, 329, 29);
      contentPane.add(textField_1);

      btnNewButton = new JButton("");
      btnNewButton.setContentAreaFilled(false);
      btnNewButton.setBorderPainted(false);
      btnNewButton.setFocusPainted(false);
      btnNewButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent a) {
				if(a.getSource().equals(btnNewButton)) {
					//결과값은 TRUE/FALSE로 로그인여부를 체크
				/* 1. 오라클 연결
				 * 2. 로그인
				 * 3.
				 */						
				if(!(dao.getConn()==null)) { //연결됫을때 .
					if(dao.login(textField.getText(),textField_1.getText())) {//정상연결됫을때
						if(!dao.IsAdmin(textField.getText())){ 
						new 사용자주문창(textField.getText());
						setVisible(false);
						}
						else {
						new 관리자창();
						setVisible(false);
						}

					}else {
						JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 맞지 않습니다."); 
					}
					
				}
		}
			}
      });
      btnNewButton.setIcon(new ImageIcon(
            "Image\\로그인버튼.png"));
      btnNewButton.setBounds(205, 390, 187, 47);
      contentPane.add(btnNewButton);
      
      JLabel label_1 = new JLabel("아이디");
      label_1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent arg0) {
      		new ID찾기창();
      	}
      });
      label_1.setBounds(173, 467, 44, 29);
      contentPane.add(label_1);
      
      label_2 = new JLabel("또는");
      label_2.setBounds(218, 467, 35, 29);
      contentPane.add(label_2);
      
      label_3 = new JLabel("비밀번호");
      label_3.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		new PW찾기창();
      	}
      });
      label_3.setBounds(253, 467, 60, 29);
      contentPane.add(label_3);
      
      label_4 = new JLabel("를 잊어버리셨나요?");
      label_4.setBounds(308, 467, 116, 29);
      contentPane.add(label_4);

      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setIcon(new ImageIcon(
            "Image\\로그인창.jpg"));
      lblNewLabel.setBounds(0, 0, 579, 504);
      contentPane.add(lblNewLabel);
      	setVisible(true);
   }
}