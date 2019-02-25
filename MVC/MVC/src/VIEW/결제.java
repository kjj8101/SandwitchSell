package VIEW;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.DropMode;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 결제 {

   private JFrame frame;
   private JTextField textField;
   private CardLayout  cards=new CardLayout();
   private JCheckBox jch;
   private static String price=null;
   private static DefaultTableModel model;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	   new 결제(price,model);
   }

   /**
    * Create the application.
    */
   public 결제(String p,DefaultTableModel m){
	  this.model=m;
	  this.price=p;
      ButtonGroup group = new ButtonGroup();
         frame = new JFrame();
         frame.setBounds(100, 100, 1008, 739);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setLayout(null);
        
         Container con = frame.getContentPane();
      frame.getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("");
      btnNewButton.setContentAreaFilled(false);
      btnNewButton.setBorderPainted(false);
      btnNewButton.setFocusPainted(false);
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		if(e.getSource().equals(btnNewButton)){
      			if(jch.isSelected()==true){
      				JOptionPane.showMessageDialog(null, "주문이 완료되었습니다.\n주문목록은 마이페이지에서 확인해주세요."); 
      				frame.dispose();
      			}else {
      				JOptionPane.showMessageDialog(null, "체크박스에 동의 해주세요"); 
      			}
      		}
      		
      		//결제됫다는 메세지 뜨고 종료시키기.
      	}
      });
      
      JLabel label_1 = new JLabel("최종결제금액");
      label_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 40));
      label_1.setBounds(112, 468, 248, 41);
      frame.getContentPane().add(label_1);
      
      JLabel lblNewLabel_4 = new JLabel("");
      lblNewLabel_4.setIcon(new ImageIcon("Image\\결제이미지1.png"));
      lblNewLabel_4.setBounds(170, 143, 190, 122);
      frame.getContentPane().add(lblNewLabel_4);
      
      JLabel label_3 = new JLabel(p);
      label_3.setHorizontalAlignment(SwingConstants.RIGHT);
      label_3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 40));
      label_3.setBounds(210, 468, 362, 41);
      frame.getContentPane().add(label_3);
      
      JLabel lblNewLabel_5 = new JLabel("");
      lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
      lblNewLabel_5.setIcon(new ImageIcon("Image\\밑줄이미지2.png"));
      lblNewLabel_5.setBounds(82, 431, 800, 15);
      frame.getContentPane().add(lblNewLabel_5);
      btnNewButton.setIcon(new ImageIcon("Image\\결제이미지2.png"));
      btnNewButton.setBounds(392, 590, 166, 60);
      frame.getContentPane().add(btnNewButton);
      
      JLabel lblNewLabel_1 = new JLabel("");
      lblNewLabel_1.setIcon(new ImageIcon("Image\\결제이미지3.png"));
      lblNewLabel_1.setBounds(657, 414, 223, 160);
      frame.getContentPane().add(lblNewLabel_1);
      
      JLabel label = new JLabel("결제수단");
      label.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
      label.setBounds(79, 168, 129, 65);
      frame.getContentPane().add(label);
      
      JPanel panel = new JPanel();
      panel.setBounds(97, 320, 305, 90);
      frame.getContentPane().add(panel);
      panel.setLayout(cards);
    
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.WHITE);
      panel_1.setForeground(Color.WHITE);
      panel.add(panel_1, "name_113795086771016");
      panel_1.setLayout(null);
     
      JPanel panel_2 = new JPanel();
      panel_2.setBackground(Color.WHITE);
      
      panel.add(panel_2, "name_113799957518460");
      
   
      JRadioButton  rb1 = new JRadioButton("무통장입금"); 
      rb1.setBackground(Color.WHITE);
      rb1.setSelected(true);
      rb1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(rb1)) {
                 panel.removeAll();
                  panel.add(panel_1);
                  panel.repaint();
                  panel.revalidate();
               
            }
         }
      });
      rb1.setLocation(97, 277);
      rb1.setSize(97, 29);
      JRadioButton  rb2 = new JRadioButton("현장결제"); 
      rb2.setBackground(Color.WHITE);
      rb2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(rb2)) {
               panel.removeAll();
                panel.add(panel_2);
                panel.repaint();
                panel.revalidate();
               
            }
         }
      });
      rb2.setLocation(198, 272);
      rb2.setSize(88, 39);


        group.add(rb1);  group.add(rb2);
        frame.getContentPane().add(rb1);
        frame.getContentPane().add(rb2);
      
     
      
      
      jch = new JCheckBox("\uACB0\uC81C\uC815\uBCF4\uB97C \uD655\uC778\uD558\uC600\uC73C\uBA70, \uAD6C\uB9E4\uC9C4\uD589\uC5D0 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
      jch.setBackground(Color.WHITE);
      jch.setForeground(Color.BLACK);
      jch.setFont(new Font("나눔고딕", Font.PLAIN, 14));
      jch.setBounds(320, 531, 319, 25);
      frame.getContentPane().add(jch);
      
      JLabel lblNewLabel_2 = new JLabel("");
      lblNewLabel_2.setIcon(new ImageIcon("Image\\결제이미지4.png"));
      lblNewLabel_2.setBounds(0, 0, 998, 707);
      frame.getContentPane().add(lblNewLabel_2);
      
     
      
      JComboBox comboBox = new JComboBox();
      comboBox.setBounds(147, 19, 146, 23);
      panel_1.add(comboBox);
      comboBox.setFont(new Font("나눔고딕", Font.PLAIN, 14));
      comboBox.setEditable(true);
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC120\uD0DD \uD574\uC8FC\uC138\uC694", "\uB18D\uD611", "\uAD6D\uBBFC\uC740\uD589", "\uC2E0\uD55C\uC740\uD589", "\uC6B0\uB9AC\uC740\uD589", "\uAE30\uC5C5\uC740\uD589"}));
      comboBox.setToolTipText("");
      
      JLabel lblNewLabel = new JLabel("\uC785\uAE08\uC740\uD589");
      lblNewLabel.setBounds(36, 22, 52, 17);
      panel_1.add(lblNewLabel);
      lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 14));
      
      JLabel lblNewLabel_3 = new JLabel("\uC785\uAE08\uC790\uBA85");
      lblNewLabel_3.setBounds(36, 49, 52, 17);
      panel_1.add(lblNewLabel_3);
      lblNewLabel_3.setForeground(Color.BLACK);
      lblNewLabel_3.setBackground(Color.BLACK);
      lblNewLabel_3.setFont(new Font("나눔고딕", Font.PLAIN, 14));
      
      textField = new JTextField();
      textField.setBounds(147, 48, 146, 20);
      panel_1.add(textField);
      textField.setFont(new Font("나눔고딕", Font.PLAIN, 12));
      textField.setBackground(Color.WHITE);
      textField.setColumns(10);
      frame.setVisible(true);
      
   }
   private static void addPopup(Component component, final JPopupMenu popup) {
      component.addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            if (e.isPopupTrigger()) {
               showMenu(e);
            }
         }
         public void mouseReleased(MouseEvent e) {
            if (e.isPopupTrigger()) {
               showMenu(e);
            }
         }
         private void showMenu(MouseEvent e) {
            popup.show(e.getComponent(), e.getX(), e.getY());
         }
      });
   }
}