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

public class PW찾기창 extends JFrame {
   private JPanel contentPane;
   private JFrame frame;
   private JTextField textField;
   private JTextField textField_1;
   private java.awt.Image img;
   DAO dao = new DAO();
   private JTextField textField_2;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      new PW찾기창();
   }

   /**
    * Create the application.
    */
   public PW찾기창() {
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
      textField.setBounds(143, 263, 344, 29);
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
      textField_1.setBounds(143, 315, 344, 29);
      contentPane.add(textField_1);
      textField_2 = new JTextField(){
          {setBorder(null);}
          {setOpaque( false ) ; }
       public void paintComponent(Graphics g){
           g.drawImage(img,0,0,null);      
           super.paintComponent(g);
       }
      };
      textField_2.setForeground(Color.WHITE);
      textField_2.setFont(new Font("굴림", Font.PLAIN, 20));
      textField_2.setColumns(10);
      textField_2.setBounds(143, 369, 344, 29);
      contentPane.add(textField_2);
      
      JButton btnId = new JButton("");
      btnId.setContentAreaFilled(false);
      btnId.setBorderPainted(false);
      btnId.setFocusPainted(false);
      btnId.setIcon(new ImageIcon("Image\\PW찾기버튼.png"));
      btnId.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            String s=dao.FindPW(textField.getText(),textField_1.getText(),textField_2.getText());
            if(s!=null) {
            JOptionPane.showMessageDialog(null,"회원님의 PW는 "+s+"입니다.");
            textField_1.setText("");
            textField_2.setText("");
            textField.setText("");
            }else {
               JOptionPane.showMessageDialog(null,"회원정보가 존재하지 않습니다.");
            }
         }
      });
      btnId.setForeground(Color.BLACK);
      btnId.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
      btnId.setBackground(Color.WHITE);
      btnId.setBounds(199, 465, 177, 55);
      contentPane.add(btnId);
      
     
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setIcon(new ImageIcon("Image\\PW찾기배경.jpg"));
      lblNewLabel.setBounds(0, 0, 579, 598);
      contentPane.add(lblNewLabel);
      setVisible(true);
   }
}