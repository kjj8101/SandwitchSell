package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class 사용자페이지 {
	 static String id=null;
   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	   new 사용자페이지(id);
   }

   /**
    * Create the application.
    */
   public 사용자페이지(String id)
   {
	  this.id=id;
      frame = new JFrame();
      frame.setBounds(100, 100, 707, 527);
     // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("New button");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		new 사용자회원조회창(id);
      	}
      });
      btnNewButton.setFocusPainted(false);
      btnNewButton.setBorderPainted(false);
      btnNewButton.setContentAreaFilled(false);
      btnNewButton.setIcon(new ImageIcon("Image\\손님회원정보아이콘.png"));
      btnNewButton.setBounds(171, 174, 105, 136);
      frame.getContentPane().add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("New button");
      btnNewButton_1.setFocusPainted(false);
      btnNewButton_1.setBorderPainted(false);
      btnNewButton_1.setContentAreaFilled(false);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
        	 new 사용자주문조회창(id);
         }
      });
      btnNewButton_1.setIcon(new ImageIcon("Image\\손님주문조회아이콘.png"));
      btnNewButton_1.setBounds(414, 169, 105, 146);
      frame.getContentPane().add(btnNewButton_1);
      
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setIcon(new ImageIcon("Image\\사용자페이지배경.png"));
      lblNewLabel.setBounds(0, 0, 690, 489);
      frame.getContentPane().add(lblNewLabel);
      frame.setVisible(true);
   }
}