package VIEW;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import MODEL.DAO;

import java.awt.Color;

public class 사용자회원조회창 {
	Image img=new ImageIcon("Image/TEXTField3.png").getImage();
   private JFrame frame;
   private static String id=null;
   private JTextField label_2 ;
   private JTextField label_3;
   DAO dao=new DAO();
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	   new 사용자회원조회창(id);
   }
   

   /**
    * Create the application.
    */
   public 사용자회원조회창(String s) {
      frame = new JFrame();
      String []member=dao.SelectMemberState(s);
      frame.setBounds(100, 100, 704, 534);
      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);      
      JButton btnNewButton = new JButton("수정");
      btnNewButton.setContentAreaFilled(false);
      btnNewButton.setFocusPainted(false);
      btnNewButton.setBorder(null);
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 //회원정보수정
        	 dao.MemberUpdate(id,label_2.getText(),label_3.getText());
         }
      });
      btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uD68C\uC6D0\uC815\uBCF4\uC218\uC815\uBC84\uD2BC \uC0AC\uBCF8.png"));
      btnNewButton.setBounds(290, 433, 111, 28);
      frame.getContentPane().add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("");
      btnNewButton_1.setContentAreaFilled(false);
      btnNewButton_1.setFocusPainted(false);
      btnNewButton_1.setBorder(null);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 
         }
      });
      btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\close \uC0AC\uBCF8.png"));
      btnNewButton_1.setBounds(626, 30, 27, 28);
      frame.getContentPane().add(btnNewButton_1);
      
      JLabel lblNewLabel_1 = new JLabel(member[0]);
      lblNewLabel_1.setBounds(289, 90, 57, 15);
      frame.getContentPane().add(lblNewLabel_1);
      
      JLabel label = new JLabel((member[1]));
      label.setBounds(289, 135, 309, 15);
      frame.getContentPane().add(label);
      
      JLabel label_1 = new JLabel(member[2]);
      label_1.setBounds(289, 205, 341, 15);
      frame.getContentPane().add(label_1);
      
     label_2 = new JTextField(member[3]);
      label_2.setBounds(289, 246, 341, 28);
      frame.getContentPane().add(label_2);
      
       label_3 = new JTextField(member[4]);
      label_3.setBounds(290, 334, 340, 28);
      frame.getContentPane().add(label_3);
      
      JLabel lblNewLabel = new JLabel();
      lblNewLabel.setIcon(new ImageIcon("Image\\사진.png"));
      lblNewLabel.setBounds(0, 0, 826, 494);      
      
      frame.getContentPane().add(lblNewLabel);
      frame.setVisible(true);
   }
}