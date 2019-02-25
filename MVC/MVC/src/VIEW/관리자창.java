package VIEW;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 관리자창 extends JFrame {
	private  JFrame frame;

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	  new 관리자창();
         
   }

   /**
    * Create the frame.
    */
   public 관리자창() {
	   frame = new JFrame();
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 707, 531);
      contentPane = new JPanel();
      contentPane.setBackground(Color.WHITE);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnNewButton = new JButton("");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		if(e.getSource().equals(btnNewButton)) {
      			new 관리자사용자조회창();
      		}
      	}
      	
      });
      btnNewButton.setIcon(new ImageIcon("Image\\사용자정보조회.png"));
      btnNewButton.setContentAreaFilled(false);
      btnNewButton.setBorderPainted(false);
      btnNewButton.setFocusPainted(false);
      btnNewButton.setBounds(75, 110, 252, 137);
      contentPane.add(btnNewButton);
      
      JButton button = new JButton("");
      button.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		if(e.getSource().equals(button)) {
     			 new 관리자주문조회창();
     			 
     		}
      	}
      });
      button.setIcon(new ImageIcon("Image\\주문내역조회.png"));
      button.setFocusPainted(false);
      button.setContentAreaFilled(false);
      button.setBorderPainted(false);
      button.setBounds(363, 110, 252, 137);
      contentPane.add(button);
      
      JButton button_1 = new JButton("");
      button_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		if(e.getSource().equals(button_1)) {
      			 new 관리자재고창();
      			
      		}
      	}
      });
      button_1.setIcon(new ImageIcon("Image\\재고조회수정.png"));
      button_1.setFocusPainted(false);
      button_1.setContentAreaFilled(false);
      button_1.setBorderPainted(false);
      button_1.setBounds(75, 274, 252, 137);
      contentPane.add(button_1);
      
      JButton button_2 = new JButton("");
      button_2.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		if(e.getSource().equals(button_2)) {
      			new 관리자매출창();
      		}
      	}
      });
      button_2.setIcon(new ImageIcon("Image\\매출조회.png"));
      button_2.setFocusPainted(false);
      button_2.setContentAreaFilled(false);
      button_2.setBorderPainted(false);
      button_2.setBounds(363, 274, 252, 137);
      contentPane.add(button_2);
      
      JLabel label = new JLabel("로그아웃");
      label.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent arg0) {
      		new 새로그인창();
      		dispose();
      	}
      });
      label.setBounds(563, 57, 61, 24);
      contentPane.add(label);
      
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setIcon(new ImageIcon("Image\\관리자페이지배경.jpg"));
      lblNewLabel.setBounds(0, 0, 700, 491);
      contentPane.add(lblNewLabel);
      setVisible(true);
   }
}