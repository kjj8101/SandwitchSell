package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.sun.beans.editors.IntegerEditor;
import com.sun.glass.ui.CommonDialogs.Type;

import MODEL.Cart;
import MODEL.DAO;

import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.Icon;

public class 사용자주문창 {
	private DefaultTableModel model;
	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private int sum=0;
	private static String Id=null;
	DAO dao=new DAO();
	

	/**
	 * Launch the application.
	 */

	public static void main(String args[]) {
		사용자주문창 t = new 사용자주문창(Id);
	}

	/**
	 * Create the application.
	 */
	public 사용자주문창(String text) {
		this.Id=text;
		Cart c= new Cart();
		c.AddCartItem("물건", 100);
		frame = new JFrame();
		frame.setBounds(200, 0, 1227, 974);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setLayout(null);
		 
		 JButton btnNewButton_2 = new JButton("");
		 btnNewButton_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		if(arg0.getSource().equals(btnNewButton_2)) {
		 		new 사용자페이지(Id);
		 		}
		 	}
		 });
		 btnNewButton_2.setBounds(828, 27, 189, 38);
		 frame.getContentPane().add(btnNewButton_2);
		 btnNewButton_2.setContentAreaFilled(false);
		 btnNewButton_2.setBorderPainted(false);
		 btnNewButton_2.setFocusPainted(false);
		 btnNewButton_2.setIcon(new ImageIcon("Image\\마이페이지버튼이미지.png"));
		 
		 JLabel label_74 = new JLabel("");
		 label_74.setIcon(new ImageIcon("Image\\장바구니로고.png"));
		 label_74.setBounds(79, 620, 490, 38);
		 frame.getContentPane().add(label_74);
		 
		 JButton button_27 = new JButton("");
		 button_27.setIcon(new ImageIcon("Image\\로그아웃.png"));
		 button_27.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new 새로그인창();
		 		frame.dispose();
		 	}
		 });
		 button_27.setBounds(1029, 27, 155, 38);
		 frame.getContentPane().add(button_27);
		 
		 JLabel lblNewLabel_7 = new JLabel(Id+"님 환영합니다.");
		 lblNewLabel_7.setBounds(65, 27, 382, 27);
		 lblNewLabel_7.setFont(new Font("나눔명조 ExtraBold", Font.PLAIN, 20));
		 lblNewLabel_7.setForeground(Color.WHITE);
		 frame.getContentPane().add(lblNewLabel_7);
		 JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);
		 tabbedPane.setBounds(55, 71, 1129, 515);
	     // tabbedPane.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	      tabbedPane.setBackground(new Color(255, 255, 255));
	      frame.getContentPane().add(tabbedPane);
	      
	      JPanel panel_0 = new JPanel();
	      panel_0.setBackground(new Color(255, 255, 255));
	      tabbedPane.addTab("기본메뉴", new ImageIcon("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\KakaoTalk_20180730_152204314.png"), panel_0, null);
	      panel_0.setLayout(null);
	      JButton oder_lostbeef = new JButton("  담기");
	      oder_lostbeef.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      oder_lostbeef.setContentAreaFilled(false);
	      oder_lostbeef.setBorderPainted(false);
	      oder_lostbeef.setFocusPainted(false);
	      oder_lostbeef.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      oder_lostbeef.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="로스트비프";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,"로스트비프",3500});//담길 데이터
			//ㄴ	table.updateUI();		
	      		
				textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      
	      JLabel label_10 = new JLabel("햄 샌드위치");
	      label_10.setHorizontalAlignment(SwingConstants.CENTER);
	      label_10.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_10.setBounds(96, 401, 97, 23);
	      panel_0.add(label_10);
	      
	      JLabel label_8 = new JLabel("에그마요");
	      label_8.setHorizontalAlignment(SwingConstants.CENTER);
	      label_8.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_8.setBounds(851, 147, 86, 23);
	      panel_0.add(label_8);
	      
	      JLabel label_6 = new JLabel("스테이크&치즈");
	      label_6.setHorizontalAlignment(SwingConstants.CENTER);
	      label_6.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_6.setBounds(580, 147, 136, 23);
	      panel_0.add(label_6);
	      
	      JLabel label = new JLabel("로스트 치킨");
	      label.setHorizontalAlignment(SwingConstants.CENTER);
	      label.setBounds(344, 149, 97, 23);
	      panel_0.add(label);
	      label.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      oder_lostbeef.setBounds(96, 187, 111, 29);
	      panel_0.add(oder_lostbeef);
	      
	      JLabel lblNewLabel_3 = new JLabel("로스트 비프");
	      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel_3.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      lblNewLabel_3.setBounds(96, 149, 97, 23);
	      panel_0.add(lblNewLabel_3);
	      
	      JLabel lblNewLabel_2 = new JLabel("");
	      lblNewLabel_2.setIcon(new ImageIcon("Image\\음식 사진\\로스트비프.png"));
	      lblNewLabel_2.setBounds(41, 16, 200, 137);
	      panel_0.add(lblNewLabel_2);
	      
	      JPanel panel = new JPanel();
	      panel.setBackground(Color.WHITE);
	      panel.setBounds(38, 15, 200, 137);
	      panel_0.add(panel);
	      
	      JLabel lblNewLabel_5 = new JLabel("");
	      lblNewLabel_5.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      lblNewLabel_5.setBounds(41, 175, 200, 13);
	      panel_0.add(lblNewLabel_5);
	      
	      JButton button_1 = new JButton("  담기");
	      button_1.setBounds(341, 187, 111, 29);
	      panel_0.add(button_1);//로스트치킨
	      button_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="로스트치킨";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,"로스트치킨",3500});//담길 데이터
				//ㄴ	table.updateUI();		
		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      	
	      });
	      button_1.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_1.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_1.setFocusPainted(false);
	      button_1.setContentAreaFilled(false);
	      button_1.setBorderPainted(false);
	      
	      JLabel label_1 = new JLabel("");
	      label_1.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_1.setBounds(292, 175, 200, 13);
	      panel_0.add(label_1);
	      
	      JLabel label_3 = new JLabel("");
	      label_3.setIcon(new ImageIcon("Image\\음식 사진\\에그마요.png"));
	      label_3.setBounds(790, 18, 200, 135);
	      panel_0.add(label_3);
	      
	      JLabel label_2 = new JLabel("");
	      label_2.setIcon(new ImageIcon("Image\\음식 사진\\스테이크&치즈.png"));
	      label_2.setBounds(545, 16, 200, 135);
	      panel_0.add(label_2);
	      
	      JLabel lblNewLabel_4 = new JLabel("");
	      lblNewLabel_4.setBounds(292, 18, 200, 135);
	      panel_0.add(lblNewLabel_4);
	      lblNewLabel_4.setIcon(new ImageIcon("Image\\음식 사진\\로스트치킨.png"));
	      
	      JLabel label_4 = new JLabel("");
	      label_4.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_4.setBounds(537, 173, 200, 13);
	      panel_0.add(label_4);
	      
	      JLabel label_5 = new JLabel("");
	      label_5.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_5.setBounds(790, 173, 200, 13);
	      panel_0.add(label_5);
	      
	      JButton button = new JButton("  담기");//스테이크앤치즈
	      button.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="스테이크&치즈";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,"스테이크&치즈",4500});//담길 데이터
				//ㄴ	table.updateUI();		
		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button.setFocusPainted(false);
	      button.setContentAreaFilled(false);
	      button.setBorderPainted(false);
	      button.setBounds(590, 185, 111, 29);
	      panel_0.add(button);
	      
	      JButton button_2 = new JButton("  담기");//에그마요
	      button_2.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="에그마요";
	      		//System.out.println(c.amount(model, name));
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,"에그마요",3200});//담길 데이터
				//ㄴ	table.updateUI();		
		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_2.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_2.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_2.setFocusPainted(false);
	      button_2.setContentAreaFilled(false);
	      button_2.setBorderPainted(false);
	      button_2.setBounds(847, 187, 111, 29);
	      panel_0.add(button_2);
	      
	      JLabel label_9 = new JLabel("");
	      label_9.setIcon(new ImageIcon("Image\\음식 사진\\햄.png"));
	      label_9.setBounds(41, 282, 200, 135);
	      panel_0.add(label_9);
	      
	      JLabel label_11 = new JLabel("");
	      label_11.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_11.setBounds(41, 427, 200, 13);
	      panel_0.add(label_11);
	      
	      JButton button_3 = new JButton("  담기");//햄샌드위치
	      
	       button_3.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       	       			
	       		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,"햄샌드위치",3200});//담길 데이터
	       		
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	       	}
	       });
	       button_3.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	       button_3.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	       button_3.setFocusPainted(false);
	       button_3.setContentAreaFilled(false);
	       button_3.setBorderPainted(false);
	       button_3.setBounds(93, 439, 111, 29);
	       panel_0.add(button_3);
	       
	       JLabel label_53 = new JLabel("서프웨이 미트볼");
	       label_53.setHorizontalAlignment(SwingConstants.CENTER);
	       label_53.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	       label_53.setBounds(325, 401, 148, 23);
	       panel_0.add(label_53);
	       
	       JLabel label_54 = new JLabel("");
	       label_54.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	       label_54.setBounds(292, 427, 200, 13);
	       panel_0.add(label_54);
	       
	       JButton button_18 = new JButton("  담기");
	       button_18.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		String name="서프웨이 미트볼";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,3700});//담길 데이터
				//ㄴ	table.updateUI();		
		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	       	}
	       });
	       button_18.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	       button_18.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	       button_18.setFocusPainted(false);
	       button_18.setContentAreaFilled(false);
	       button_18.setBorderPainted(false);
	       button_18.setBounds(341, 439, 111, 29);
	       panel_0.add(button_18);
	       
	       JButton button_19 = new JButton("  담기");
	       button_19.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		String name="치킨 베이컨 랜치";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,4200});//담길 데이터
				//ㄴ	table.updateUI();		
		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	       	}
	       });
	       button_19.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	       button_19.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	       button_19.setFocusPainted(false);
	       button_19.setContentAreaFilled(false);
	       button_19.setBorderPainted(false);
	       button_19.setBounds(580, 437, 111, 29);
	       panel_0.add(button_19);
	       
	       JLabel label_55 = new JLabel("");
	       label_55.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	       label_55.setBounds(537, 425, 200, 13);
	       panel_0.add(label_55);
	       
	       JLabel label_56 = new JLabel("치킨 베이컨 랜치");
	       label_56.setHorizontalAlignment(SwingConstants.CENTER);
	       label_56.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	       label_56.setBounds(580, 399, 136, 23);
	       panel_0.add(label_56);
	       
	       JLabel label_59 = new JLabel("서프웨이 클럽");
	       label_59.setHorizontalAlignment(SwingConstants.CENTER);
	       label_59.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	       label_59.setBounds(836, 399, 122, 23);
	       panel_0.add(label_59);
	       
	       JLabel label_60 = new JLabel("");
	       label_60.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	       label_60.setBounds(790, 425, 200, 13);
	       panel_0.add(label_60);
	       
	       JButton button_20 = new JButton("  담기");
	       button_20.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		String name="서프웨이 클럽";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,"서프웨이 클럽",4200});//담길 데이터
				//ㄴ	table.updateUI();		
		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	       	}
	       });
	       button_20.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	       button_20.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	       button_20.setFocusPainted(false);
	       button_20.setContentAreaFilled(false);
	       button_20.setBorderPainted(false);
	       button_20.setBounds(847, 437, 111, 29);
	       panel_0.add(button_20);
	       
	       JLabel label_58 = new JLabel("");
	       label_58.setIcon(new ImageIcon("Image\\음식 사진\\서프웨이 클럽.png"));
	       label_58.setBounds(790, 266, 200, 135);
	       panel_0.add(label_58);
	       
	       JLabel label_52 = new JLabel("");
	       label_52.setIcon(new ImageIcon("Image\\음식 사진\\미트볼.png"));
	       label_52.setBounds(292, 270, 200, 135);
	       panel_0.add(label_52);
	       
	       JLabel label_57 = new JLabel("");
	       label_57.setIcon(new ImageIcon("Image\\음식 사진\\치킨 베이컨 랜치.png"));
	       label_57.setBounds(537, 268, 200, 135);
	       panel_0.add(label_57);
	      
	      
	    
	      JPanel panel_1 =new JPanel();
	      panel_1.setBackground(new Color(255, 255, 255));
	      tabbedPane.addTab("빵", (Icon) null, panel_1, null);
	      tabbedPane.setDisabledIconAt(1, new ImageIcon("Image\\탭이미지x.png"));
	      tabbedPane.setBackgroundAt(1, Color.WHITE);
	      panel_1.setLayout(null);
	      
	      
	      
	      
	      JLabel label_13 = new JLabel("파마산 오레가노");
	      label_13.setHorizontalAlignment(SwingConstants.CENTER);
	      label_13.setBounds(61, 143, 141, 24);
	      label_13.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      panel_1.add(label_13);
	      
	      JLabel label_12 = new JLabel("");
	      label_12.setBounds(22, 20, 200, 150);
	      label_12.setIcon(new ImageIcon("Image\\음식 사진\\파마산 오레가노.png"));
	      panel_1.add(label_12);
	      
	      JButton button_4 = new JButton("  담기"); //파마산 오레가노
	      button_4.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="파마산 오레가노";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		
		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_4.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_4.setBounds(68, 192, 105, 25);
	      button_4.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_4.setFocusPainted(false);
	      button_4.setContentAreaFilled(false);
	      button_4.setBorderPainted(false);
	      panel_1.add(button_4);
	      
	      JLabel lblNewLabel_6 = new JLabel("");
	      lblNewLabel_6.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      lblNewLabel_6.setBounds(22, 176, 180, 15);
	      panel_1.add(lblNewLabel_6);
	      
	      JLabel label_14 = new JLabel("");
	      label_14.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_14.setBounds(281, 178, 180, 15);
	      panel_1.add(label_14);
	      
	      JButton button_5 = new JButton("  담기");//화이트
	      button_5.addActionListener(new ActionListener() {
	    	  
	      	public void actionPerformed(ActionEvent e) {
	      	 	String name="화이트";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_5.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_5.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_5.setFocusPainted(false);
	      button_5.setContentAreaFilled(false);
	      button_5.setBorderPainted(false);
	      button_5.setBounds(327, 194, 105, 25);
	      panel_1.add(button_5);
	      
	      JLabel label_15 = new JLabel("화이트");
	      label_15.setHorizontalAlignment(SwingConstants.CENTER);
	      label_15.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_15.setBounds(314, 145, 141, 24);
	      panel_1.add(label_15);
	      
	      JLabel label_16 = new JLabel("");
	      label_16.setIcon(new ImageIcon("Image\\음식 사진\\화이트.png"));
	      label_16.setBounds(279, 22, 200, 150);
	      panel_1.add(label_16);
	      
	      JLabel label_18 = new JLabel("허니오트");
	      label_18.setHorizontalAlignment(SwingConstants.CENTER);
	      label_18.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_18.setBounds(568, 145, 141, 24);
	      panel_1.add(label_18);
	      
	      JLabel label_17 = new JLabel("");
	      label_17.setIcon(new ImageIcon("Image\\음식 사진\\허니오트.png"));
	      label_17.setBounds(537, 19, 200, 150);
	      panel_1.add(label_17);
	      
	      JLabel label_19 = new JLabel("");
	      label_19.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_19.setBounds(547, 178, 180, 15);
	      panel_1.add(label_19);
	      
	      JButton button_6 = new JButton("  담기");
	      button_6.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="허니오트";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_6.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_6.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_6.setFocusPainted(false);
	      button_6.setContentAreaFilled(false);
	      button_6.setBorderPainted(false);
	      button_6.setBounds(585, 195, 105, 25);
	      panel_1.add(button_6);
	      
	      JLabel label_21 = new JLabel("위트");
	      label_21.setHorizontalAlignment(SwingConstants.CENTER);
	      label_21.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_21.setBounds(823, 142, 141, 24);
	      panel_1.add(label_21);
	      
	      JLabel label_20 = new JLabel("");
	      label_20.setIcon(new ImageIcon("Image\\음식 사진\\위트.png"));
	      label_20.setBounds(789, 19, 200, 150);
	      panel_1.add(label_20);
	      
	      JLabel label_22 = new JLabel("");
	      label_22.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_22.setBounds(799, 175, 180, 15);
	      panel_1.add(label_22);
	      
	      JButton button_7 = new JButton("  담기");
	      button_7.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="위트";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_7.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_7.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_7.setFocusPainted(false);
	      button_7.setContentAreaFilled(false);
	      button_7.setBorderPainted(false);
	      button_7.setBounds(843, 192, 105, 25);
	      panel_1.add(button_7);
	      
	      JLabel label_47 = new JLabel("하티");
	      label_47.setHorizontalAlignment(SwingConstants.CENTER);
	      label_47.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_47.setBounds(61, 383, 141, 24);
	      panel_1.add(label_47);
	      
	      JLabel label_48 = new JLabel("");
	      label_48.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_48.setBounds(22, 416, 180, 15);
	      panel_1.add(label_48);
	      
	      JButton button_16 = new JButton("  담기");
	      button_16.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="하티";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_16.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_16.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_16.setFocusPainted(false);
	      button_16.setContentAreaFilled(false);
	      button_16.setBorderPainted(false);
	      button_16.setBounds(68, 432, 105, 25);
	      panel_1.add(button_16);
	      
	      JLabel label_50 = new JLabel("플랫 브레드");
	      label_50.setHorizontalAlignment(SwingConstants.CENTER);
	      label_50.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_50.setBounds(318, 385, 141, 24);
	      panel_1.add(label_50);
	      
	      JLabel label_51 = new JLabel("");
	      label_51.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_51.setBounds(279, 418, 180, 15);
	      panel_1.add(label_51);
	      
	      JButton button_17 = new JButton("  담기");
	      button_17.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="플렛 브래드";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_17.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_17.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_17.setFocusPainted(false);
	      button_17.setContentAreaFilled(false);
	      button_17.setBorderPainted(false);
	      button_17.setBounds(325, 434, 105, 25);
	      panel_1.add(button_17);
	      
	      JLabel label_46 = new JLabel("");
	      label_46.setIcon(new ImageIcon("image\\음식 사진\\하티.png"));
	      label_46.setBounds(22, 257, 200, 150);
	      panel_1.add(label_46);
	      
	      JLabel label_49 = new JLabel("");
	      label_49.setIcon(new ImageIcon("image\\음식 사진\\플렛브레드.png"));
	      label_49.setBounds(279, 262, 200, 150);
	      panel_1.add(label_49);
	      
	      JPanel panel_2 = new JPanel();
	      panel_2.setBackground(new Color(255, 255, 255));
	      tabbedPane.addTab("토핑1", new ImageIcon("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\KakaoTalk_20180730_152207074.png"), panel_2, null);
	      panel_2.setLayout(null);
	      
	      JLabel lblbacon = new JLabel("베이컨");
	      lblbacon.setHorizontalAlignment(SwingConstants.CENTER);
	      lblbacon.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      lblbacon.setBounds(48, 140, 141, 24);
	      panel_2.add(lblbacon);
	      
	      JLabel label_23 = new JLabel("");
	      label_23.setBounds(24, 10, 200, 150);
	      label_23.setIcon(new ImageIcon("Image\\음식 사진\\베이컨.png"));
	      panel_2.add(label_23);
	      
	      JLabel label_24 = new JLabel("");
	      label_24.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_24.setBounds(24, 174, 180, 15);
	      panel_2.add(label_24);
	      
	      JButton button_8 = new JButton("  담기");
	      button_8.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="베이컨";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,800});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_8.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_8.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_8.setFocusPainted(false);
	      button_8.setContentAreaFilled(false);
	      button_8.setBorderPainted(false);
	      button_8.setBounds(64, 187, 105, 25);
	      panel_2.add(button_8);
	      
	      JLabel label_32 = new JLabel("슈레드 치즈");
	      label_32.setHorizontalAlignment(SwingConstants.CENTER);
	      label_32.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_32.setBounds(298, 140, 141, 24);
	      panel_2.add(label_32);
	      
	      JLabel label_33 = new JLabel("");
	      label_33.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_33.setBounds(274, 174, 180, 15);
	      panel_2.add(label_33);
	      
	      JButton button_9 = new JButton("  담기");
	      button_9.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="슈레드 치즈";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,700});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_9.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_9.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_9.setFocusPainted(false);
	      button_9.setContentAreaFilled(false);
	      button_9.setBorderPainted(false);
	      button_9.setBounds(314, 187, 105, 25);
	      panel_2.add(button_9);
	      
	      JLabel label_34 = new JLabel("아메리칸 치즈");
	      label_34.setHorizontalAlignment(SwingConstants.CENTER);
	      label_34.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_34.setBounds(563, 141, 141, 24);
	      panel_2.add(label_34);
	      
	      JLabel label_35 = new JLabel("");
	      label_35.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_35.setBounds(539, 175, 180, 15);
	      panel_2.add(label_35);
	      
	      JButton button_10 = new JButton("  담기");
	      button_10.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="아메리칸 치즈";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,700});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_10.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_10.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_10.setFocusPainted(false);
	      button_10.setContentAreaFilled(false);
	      button_10.setBorderPainted(false);
	      button_10.setBounds(579, 188, 105, 25);
	      panel_2.add(button_10);
	      
	      JLabel label_36 = new JLabel("아보카도");
	      label_36.setHorizontalAlignment(SwingConstants.CENTER);
	      label_36.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_36.setBounds(809, 151, 141, 24);
	      panel_2.add(label_36);
	      
	      JLabel label_37 = new JLabel("");
	      label_37.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_37.setBounds(799, 176, 180, 15);
	      panel_2.add(label_37);
	      
	      JButton button_11 = new JButton("  담기");
	      button_11.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="아보카도";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_11.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_11.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_11.setFocusPainted(false);
	      button_11.setContentAreaFilled(false);
	      button_11.setBorderPainted(false);
	      button_11.setBounds(829, 191, 105, 25);
	      panel_2.add(button_11);
	      
	      JLabel label_38 = new JLabel("양상추");
	      label_38.setHorizontalAlignment(SwingConstants.CENTER);
	      label_38.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_38.setBounds(48, 375, 141, 24);
	      panel_2.add(label_38);
	      
	      JLabel label_39 = new JLabel("");
	      label_39.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_39.setBounds(24, 409, 180, 15);
	      panel_2.add(label_39);
	      
	      JButton button_12 = new JButton("  담기");
	      button_12.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="양상추";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,400});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_12.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_12.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_12.setFocusPainted(false);
	      button_12.setContentAreaFilled(false);
	      button_12.setBorderPainted(false);
	      button_12.setBounds(64, 422, 105, 25);
	      panel_2.add(button_12);
	      
	      JLabel label_40 = new JLabel("양파");
	      label_40.setHorizontalAlignment(SwingConstants.CENTER);
	      label_40.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_40.setBounds(308, 375, 141, 24);
	      panel_2.add(label_40);
	      
	      JLabel label_41 = new JLabel("");
	      label_41.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_41.setBounds(284, 409, 180, 15);
	      panel_2.add(label_41);
	      
	      JButton button_13 = new JButton("  담기");
	      button_13.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="양파";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_13.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_13.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_13.setFocusPainted(false);
	      button_13.setContentAreaFilled(false);
	      button_13.setBorderPainted(false);
	      button_13.setBounds(324, 422, 105, 25);
	      panel_2.add(button_13);
	      
	      JLabel label_42 = new JLabel("오이");
	      label_42.setHorizontalAlignment(SwingConstants.CENTER);
	      label_42.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_42.setBounds(553, 376, 141, 24);
	      panel_2.add(label_42);
	      
	      JLabel label_43 = new JLabel("");
	      label_43.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_43.setBounds(529, 410, 180, 15);
	      panel_2.add(label_43);
	      
	      JButton button_14 = new JButton("  담기");
	      button_14.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="오이";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_14.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_14.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_14.setFocusPainted(false);
	      button_14.setContentAreaFilled(false);
	      button_14.setBorderPainted(false);
	      button_14.setBounds(569, 423, 105, 25);
	      panel_2.add(button_14);
	      
	      JLabel label_44 = new JLabel("토마토");
	      label_44.setHorizontalAlignment(SwingConstants.CENTER);
	      label_44.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_44.setBounds(799, 386, 141, 24);
	      panel_2.add(label_44);
	      
	      JLabel label_45 = new JLabel("");
	      label_45.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_45.setBounds(789, 411, 180, 15);
	      panel_2.add(label_45);
	      
	      JButton button_15 = new JButton("  담기");
	      button_15.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="토마토";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,300});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_15.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_15.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_15.setFocusPainted(false);
	      button_15.setContentAreaFilled(false);
	      button_15.setBorderPainted(false);
	      button_15.setBounds(819, 426, 105, 25);
	      panel_2.add(button_15);
	      
	      JLabel label_25 = new JLabel("");
	      label_25.setIcon(new ImageIcon("Image\\음식 사진\\슈레드 치즈.png"));
	      label_25.setBounds(274, 10, 200, 150);
	      panel_2.add(label_25);
	      
	      JLabel label_26 = new JLabel("");
	      label_26.setIcon(new ImageIcon("Image\\음식 사진\\아메리칸 치즈.png"));
	      label_26.setBounds(529, 11, 200, 150);
	      panel_2.add(label_26);
	      
	      JLabel label_27 = new JLabel("");
	      label_27.setIcon(new ImageIcon("Image\\음식 사진\\아보카도.png"));
	      label_27.setBounds(775, 21, 200, 150);
	      panel_2.add(label_27);
	      
	      JLabel label_28 = new JLabel("");
	      label_28.setIcon(new ImageIcon("Image\\음식 사진\\양상추.png"));
	      label_28.setBounds(12, 244, 200, 150);
	      panel_2.add(label_28);
	      
	      JLabel label_29 = new JLabel("");
	      label_29.setIcon(new ImageIcon("Image\\음식 사진\\양파.png"));
	      label_29.setBounds(274, 244, 200, 150);
	      panel_2.add(label_29);
	      
	      JLabel label_30 = new JLabel("");
	      label_30.setIcon(new ImageIcon("Image\\음식 사진\\오이.png"));
	      label_30.setBounds(529, 245, 200, 150);
	      panel_2.add(label_30);
	      
	      JLabel label_31 = new JLabel("");
	      label_31.setIcon(new ImageIcon("Image\\음식 사진\\토마토.png"));
	      label_31.setBounds(775, 255, 200, 150);
	      panel_2.add(label_31);
	      
	      JPanel panel_4 = new JPanel();
	      panel_4.setLayout(null);
	      panel_4.setBackground(Color.WHITE);
	      tabbedPane.addTab("토핑2", new ImageIcon("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\토핑2.png"), panel_4, null);
	      
	      JLabel label_61 = new JLabel("올리브");
	      label_61.setHorizontalAlignment(SwingConstants.CENTER);
	      label_61.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_61.setBounds(48, 140, 141, 24);
	      panel_4.add(label_61);
	      
	      JLabel label_62 = new JLabel("");
	      label_62.setIcon(new ImageIcon("Image\\음식 사진\\올리브.png"));
	      label_62.setBounds(24, 10, 200, 150);
	      panel_4.add(label_62);
	      
	      JLabel label_63 = new JLabel("");
	      label_63.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_63.setBounds(24, 174, 180, 15);
	      panel_4.add(label_63);
	      
	      JButton button_21 = new JButton("  담기");
	      button_21.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="올리브";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,300});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_21.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_21.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_21.setFocusPainted(false);
	      button_21.setContentAreaFilled(false);
	      button_21.setBorderPainted(false);
	      button_21.setBounds(64, 187, 105, 25);
	      panel_4.add(button_21);
	      
	      JLabel label_64 = new JLabel("페퍼로니");
	      label_64.setHorizontalAlignment(SwingConstants.CENTER);
	      label_64.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_64.setBounds(309, 141, 141, 24);
	      panel_4.add(label_64);
	      
	      JLabel label_65 = new JLabel("");
	      label_65.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_65.setBounds(285, 175, 180, 15);
	      panel_4.add(label_65);
	      
	      JButton button_22 = new JButton("  담기");
	      button_22.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="페퍼로니";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,300});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_22.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_22.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_22.setFocusPainted(false);
	      button_22.setContentAreaFilled(false);
	      button_22.setBorderPainted(false);
	      button_22.setBounds(325, 188, 105, 25);
	      panel_4.add(button_22);
	      
	      JLabel label_66 = new JLabel("피클");
	      label_66.setHorizontalAlignment(SwingConstants.CENTER);
	      label_66.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_66.setBounds(576, 140, 141, 24);
	      panel_4.add(label_66);
	      
	      JLabel label_67 = new JLabel("");
	      label_67.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_67.setBounds(552, 174, 180, 15);
	      panel_4.add(label_67);
	      
	      JButton button_23 = new JButton("  담기");
	      button_23.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="피클";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_23.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_23.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_23.setFocusPainted(false);
	      button_23.setContentAreaFilled(false);
	      button_23.setBorderPainted(false);
	      button_23.setBounds(592, 187, 105, 25);
	      panel_4.add(button_23);
	      
	      JLabel label_68 = new JLabel("피망");
	      label_68.setHorizontalAlignment(SwingConstants.CENTER);
	      label_68.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_68.setBounds(822, 140, 141, 24);
	      panel_4.add(label_68);
	      
	      JLabel label_69 = new JLabel("");
	      label_69.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_69.setBounds(809, 171, 180, 15);
	      panel_4.add(label_69);
	      
	      JButton button_24 = new JButton("  담기");
	      button_24.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="아보카도";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1000});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_24.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_24.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_24.setFocusPainted(false);
	      button_24.setContentAreaFilled(false);
	      button_24.setBorderPainted(false);
	      button_24.setBounds(838, 187, 105, 25);
	      panel_4.add(button_24);
	      
	      JLabel label_78 = new JLabel("");
	      label_78.setIcon(new ImageIcon("Image\\음식 사진\\페퍼로니.png"));
	      label_78.setBounds(285, 11, 200, 150);
	      panel_4.add(label_78);
	      
	      JLabel label_79 = new JLabel("");
	      label_79.setIcon(new ImageIcon("Image\\음식 사진\\피클.png"));
	      label_79.setBounds(542, 10, 200, 150);
	      panel_4.add(label_79);
	      
	      JLabel label_80 = new JLabel("");
	      label_80.setIcon(new ImageIcon("Image\\음식 사진\\피망.png"));
	      label_80.setBounds(788, 10, 200, 150);
	      panel_4.add(label_80);
	      
	      JLabel label_71 = new JLabel("치킨");
	      label_71.setHorizontalAlignment(SwingConstants.CENTER);
	      label_71.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_71.setBounds(48, 375, 141, 24);
	      panel_4.add(label_71);
	      
	      JLabel label_72 = new JLabel("");
	      label_72.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_72.setBounds(24, 409, 180, 15);
	      panel_4.add(label_72);
	      
	      JButton button_25 = new JButton("  담기");
	      button_25.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="치킨";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,700});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_25.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_25.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_25.setFocusPainted(false);
	      button_25.setContentAreaFilled(false);
	      button_25.setBorderPainted(false);
	      button_25.setBounds(64, 422, 105, 25);
	      panel_4.add(button_25);
	      
	      JButton button_26 = new JButton("  담기");
	      button_26.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="스테이크";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,1500});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_26.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_26.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_26.setFocusPainted(false);
	      button_26.setContentAreaFilled(false);
	      button_26.setBorderPainted(false);
	      button_26.setBounds(323, 423, 105, 25);
	      panel_4.add(button_26);
	      
	      JLabel label_73 = new JLabel("");
	      label_73.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_73.setBounds(283, 410, 180, 15);
	      panel_4.add(label_73);
	      
	      JLabel label_81 = new JLabel("스테이크");
	      label_81.setHorizontalAlignment(SwingConstants.CENTER);
	      label_81.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_81.setBounds(307, 376, 141, 24);
	      panel_4.add(label_81);
	      
	      JLabel label_82 = new JLabel("");
	      label_82.setIcon(new ImageIcon("Image\\음식 사진\\스테이크.png"));
	      label_82.setBounds(283, 245, 200, 150);
	      panel_4.add(label_82);
	      
	      JLabel label_70 = new JLabel("");
	      label_70.setIcon(new ImageIcon("Image\\음식 사진\\치킨.png"));
	      label_70.setBounds(24, 244, 200, 132);
	      panel_4.add(label_70);
	      
	      JPanel panel_3 = new JPanel();
	      panel_3.setLayout(null);
	      panel_3.setBackground(Color.WHITE);
	      tabbedPane.addTab("소스1", new ImageIcon("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\KakaoTalk_20180730_152206952.png"), panel_3, null);
	      
	      JLabel label_85 = new JLabel("소금");
	      label_85.setHorizontalAlignment(SwingConstants.CENTER);
	      label_85.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_85.setBounds(48, 140, 141, 24);
	      panel_3.add(label_85);
	      
	      JLabel label_86 = new JLabel("");
	      label_86.setIcon(new ImageIcon("Image\\음식 사진\\소금.png"));
	      label_86.setBounds(24, 10, 200, 150);
	      panel_3.add(label_86);
	      
	      JLabel label_87 = new JLabel("");
	      label_87.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_87.setBounds(24, 174, 180, 15);
	      panel_3.add(label_87);
	      
	      JButton button_29 = new JButton("  담기");
	      button_29.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="소금";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,100});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_29.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_29.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_29.setFocusPainted(false);
	      button_29.setContentAreaFilled(false);
	      button_29.setBorderPainted(false);
	      button_29.setBounds(64, 187, 105, 25);
	      panel_3.add(button_29);
	      
	      JLabel label_88 = new JLabel("올리브오일");
	      label_88.setHorizontalAlignment(SwingConstants.CENTER);
	      label_88.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_88.setBounds(303, 139, 141, 24);
	      panel_3.add(label_88);
	      
	      JLabel label_89 = new JLabel("");
	      label_89.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_89.setBounds(279, 173, 180, 15);
	      panel_3.add(label_89);
	      
	      JButton button_30 = new JButton("  담기");
	      button_30.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="올리브오일";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,100});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_30.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_30.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_30.setFocusPainted(false);
	      button_30.setContentAreaFilled(false);
	      button_30.setBorderPainted(false);
	      button_30.setBounds(319, 186, 105, 25);
	      panel_3.add(button_30);
	      
	      JLabel label_90 = new JLabel("후추");
	      label_90.setHorizontalAlignment(SwingConstants.CENTER);
	      label_90.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_90.setBounds(567, 139, 141, 24);
	      panel_3.add(label_90);
	      
	      JLabel label_91 = new JLabel("");
	      label_91.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_91.setBounds(543, 173, 180, 15);
	      panel_3.add(label_91);
	      
	      JButton button_31 = new JButton("  담기");
	      button_31.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="후추";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,100});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_31.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_31.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_31.setFocusPainted(false);
	      button_31.setContentAreaFilled(false);
	      button_31.setBorderPainted(false);
	      button_31.setBounds(583, 186, 105, 25);
	      panel_3.add(button_31);
	      
	      JLabel label_92 = new JLabel("이탈리안 드레싱");
	      label_92.setHorizontalAlignment(SwingConstants.CENTER);
	      label_92.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_92.setBounds(819, 139, 141, 24);
	      panel_3.add(label_92);
	      
	      JLabel label_93 = new JLabel("");
	      label_93.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_93.setBounds(795, 173, 180, 15);
	      panel_3.add(label_93);
	      
	      JButton button_32 = new JButton("  담기");
	      button_32.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="이탈리안 드레싱";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_32.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_32.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_32.setFocusPainted(false);
	      button_32.setContentAreaFilled(false);
	      button_32.setBorderPainted(false);
	      button_32.setBounds(835, 186, 105, 25);
	      panel_3.add(button_32);
	      
	      JLabel label_94 = new JLabel("스모크 바베큐");
	      label_94.setHorizontalAlignment(SwingConstants.CENTER);
	      label_94.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_94.setBounds(48, 375, 141, 24);
	      panel_3.add(label_94);
	      
	      JLabel label_95 = new JLabel("");
	      label_95.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_95.setBounds(24, 409, 180, 15);
	      panel_3.add(label_95);
	      
	      JButton button_33 = new JButton("  담기");
	      button_33.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="스모크 바베큐";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_33.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_33.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_33.setFocusPainted(false);
	      button_33.setContentAreaFilled(false);
	      button_33.setBorderPainted(false);
	      button_33.setBounds(64, 422, 105, 25);
	      panel_3.add(button_33);
	      
	      JLabel label_96 = new JLabel("핫칠리");
	      label_96.setHorizontalAlignment(SwingConstants.CENTER);
	      label_96.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_96.setBounds(313, 374, 141, 24);
	      panel_3.add(label_96);
	      
	      JLabel label_97 = new JLabel("");
	      label_97.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_97.setBounds(289, 408, 180, 15);
	      panel_3.add(label_97);
	      
	      JButton button_34 = new JButton("  담기");
	      button_34.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="핫칠리";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_34.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_34.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_34.setFocusPainted(false);
	      button_34.setContentAreaFilled(false);
	      button_34.setBorderPainted(false);
	      button_34.setBounds(329, 421, 105, 25);
	      panel_3.add(button_34);
	      
	      JLabel label_98 = new JLabel("허니 머스타드");
	      label_98.setHorizontalAlignment(SwingConstants.CENTER);
	      label_98.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_98.setBounds(567, 374, 141, 24);
	      panel_3.add(label_98);
	      
	      JLabel label_99 = new JLabel("");
	      label_99.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_99.setBounds(533, 408, 180, 15);
	      panel_3.add(label_99);
	      
	      JButton button_35 = new JButton("  담기");
	      button_35.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="허니머스타드";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_35.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_35.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_35.setFocusPainted(false);
	      button_35.setContentAreaFilled(false);
	      button_35.setBorderPainted(false);
	      button_35.setBounds(583, 421, 105, 25);
	      panel_3.add(button_35);
	      
	      JLabel label_100 = new JLabel("마요네즈");
	      label_100.setHorizontalAlignment(SwingConstants.CENTER);
	      label_100.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_100.setBounds(809, 374, 141, 24);
	      panel_3.add(label_100);
	      
	      JLabel label_101 = new JLabel("");
	      label_101.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_101.setBounds(785, 408, 180, 15);
	      panel_3.add(label_101);
	      
	      JButton button_36 = new JButton("  담기");
	      button_36.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="마요네즈";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_36.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_36.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_36.setFocusPainted(false);
	      button_36.setContentAreaFilled(false);
	      button_36.setBorderPainted(false);
	      button_36.setBounds(835, 421, 105, 25);
	      panel_3.add(button_36);
	      
	      JLabel label_102 = new JLabel("");
	      label_102.setIcon(new ImageIcon("Image\\음식 사진\\올리브오일.png"));
	      label_102.setBounds(279, 9, 200, 150);
	      panel_3.add(label_102);
	      
	      JLabel label_103 = new JLabel("");
	      label_103.setIcon(new ImageIcon("Image\\음식 사진\\후추.png"));
	      label_103.setBounds(533, 9, 200, 150);
	      panel_3.add(label_103);
	      
	      JLabel label_104 = new JLabel("");
	      label_104.setIcon(new ImageIcon("Image\\음식 사진\\이탈리안 드레싱.png"));
	      label_104.setBounds(785, 9, 200, 150);
	      panel_3.add(label_104);
	      
	      JLabel label_105 = new JLabel("");
	      label_105.setIcon(new ImageIcon("Image\\음식 사진\\스모크 바비큐.png"));
	      label_105.setBounds(12, 244, 200, 150);
	      panel_3.add(label_105);
	      
	      JLabel label_106 = new JLabel("");
	      label_106.setIcon(new ImageIcon("Image\\음식 사진\\핫칠리.png"));
	      label_106.setBounds(279, 243, 200, 150);
	      panel_3.add(label_106);
	      
	      JLabel label_107 = new JLabel("");
	      label_107.setIcon(new ImageIcon("Image\\음식 사진\\허니 머스타드.png"));
	      label_107.setBounds(533, 243, 200, 150);
	      panel_3.add(label_107);
	      
	      JLabel label_108 = new JLabel("");
	      label_108.setIcon(new ImageIcon("Image\\음식 사진\\마요네즈.png"));
	      label_108.setBounds(785, 243, 200, 150);
	      panel_3.add(label_108);
	      
	      JPanel panel_5 = new JPanel();
	      panel_5.setLayout(null);
	      panel_5.setBackground(Color.WHITE);
	      tabbedPane.addTab("소스2", new ImageIcon("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\소스2.png"), panel_5, null);
	      
	      JLabel label_109 = new JLabel("디종홀스래디쉬");
	      label_109.setHorizontalAlignment(SwingConstants.CENTER);
	      label_109.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_109.setBounds(48, 140, 141, 24);
	      panel_5.add(label_109);
	      
	      JLabel label_110 = new JLabel("");
	      label_110.setIcon(new ImageIcon("Image\\음식 사진\\디종홀스래디쉬.png"));
	      label_110.setBounds(24, 10, 200, 150);
	      panel_5.add(label_110);
	      
	      JLabel label_111 = new JLabel("");
	      label_111.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_111.setBounds(24, 174, 180, 15);
	      panel_5.add(label_111);
	      
	      JButton button_37 = new JButton("  담기");
	      button_37.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="디종홀스래디쉬";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_37.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_37.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_37.setFocusPainted(false);
	      button_37.setContentAreaFilled(false);
	      button_37.setBorderPainted(false);
	      button_37.setBounds(64, 187, 105, 25);
	      panel_5.add(button_37);
	      
	      JLabel label_112 = new JLabel("스위트어니언");
	      label_112.setHorizontalAlignment(SwingConstants.CENTER);
	      label_112.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_112.setBounds(307, 145, 141, 24);
	      panel_5.add(label_112);
	      
	      JLabel label_113 = new JLabel("");
	      label_113.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_113.setBounds(273, 175, 180, 15);
	      panel_5.add(label_113);
	      
	      JButton button_38 = new JButton("  담기");
	      button_38.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="스위트어니언";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_38.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_38.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_38.setFocusPainted(false);
	      button_38.setContentAreaFilled(false);
	      button_38.setBorderPainted(false);
	      button_38.setBounds(313, 188, 105, 25);
	      panel_5.add(button_38);
	      
	      JLabel label_114 = new JLabel("랜치드레싱");
	      label_114.setHorizontalAlignment(SwingConstants.CENTER);
	      label_114.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_114.setBounds(558, 141, 141, 24);
	      panel_5.add(label_114);
	      
	      JLabel label_115 = new JLabel("");
	      label_115.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_115.setBounds(534, 175, 180, 15);
	      panel_5.add(label_115);
	      
	      JButton button_39 = new JButton("  담기");
	      button_39.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="랜치드레싱";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_39.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_39.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_39.setFocusPainted(false);
	      button_39.setContentAreaFilled(false);
	      button_39.setBorderPainted(false);
	      button_39.setBounds(574, 188, 105, 25);
	      panel_5.add(button_39);
	      
	      JLabel label_116 = new JLabel("사우스 웨스트");
	      label_116.setHorizontalAlignment(SwingConstants.CENTER);
	      label_116.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_116.setBounds(810, 138, 141, 24);
	      panel_5.add(label_116);
	      
	      JLabel label_117 = new JLabel("");
	      label_117.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_117.setBounds(790, 173, 180, 15);
	      panel_5.add(label_117);
	      
	      JButton button_40 = new JButton("  담기");
	      button_40.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="사우스 웨스트";
      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
			//ㄴ	table.updateUI();		      		
				textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_40.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_40.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_40.setFocusPainted(false);
	      button_40.setContentAreaFilled(false);
	      button_40.setBorderPainted(false);
	      button_40.setBounds(826, 188, 105, 25);
	      panel_5.add(button_40);
	      
	      JLabel label_118 = new JLabel("사우전 아일랜드");
	      label_118.setHorizontalAlignment(SwingConstants.CENTER);
	      label_118.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_118.setBounds(48, 375, 141, 24);
	      panel_5.add(label_118);
	      
	      JLabel label_119 = new JLabel("");
	      label_119.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_119.setBounds(24, 409, 180, 15);
	      panel_5.add(label_119);
	      
	      JButton button_41 = new JButton("  담기");
	      button_41.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="사우전 아일랜드";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_41.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_41.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_41.setFocusPainted(false);
	      button_41.setContentAreaFilled(false);
	      button_41.setBorderPainted(false);
	      button_41.setBounds(64, 422, 105, 25);
	      panel_5.add(button_41);
	      
	      JLabel label_120 = new JLabel("레드와인 식초");
	      label_120.setHorizontalAlignment(SwingConstants.CENTER);
	      label_120.setFont(new Font("나눔바른고딕", Font.BOLD, 17));
	      label_120.setBounds(307, 376, 141, 24);
	      panel_5.add(label_120);
	      
	      JLabel label_121 = new JLabel("");
	      label_121.setIcon(new ImageIcon("Image\\밑줄이미지.png"));
	      label_121.setBounds(283, 410, 180, 15);
	      panel_5.add(label_121);
	      
	      JButton button_42 = new JButton("  담기");
	      button_42.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String name="레드와인 식초";
	      		model.insertRow(model.getRowCount(), new Object[]{model.getRowCount()+1,name,200});//담길 데이터
				//ㄴ	table.updateUI();		      		
					textField.setText(Integer.toString(c.sum(model))+"원");
	      	}
	      });
	      button_42.setIcon(new ImageIcon("Image\\장바구니이미지.png"));
	      button_42.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
	      button_42.setFocusPainted(false);
	      button_42.setContentAreaFilled(false);
	      button_42.setBorderPainted(false);
	      button_42.setBounds(323, 423, 105, 25);
	      panel_5.add(button_42);
	      
	      JLabel label_126 = new JLabel("");
	      label_126.setIcon(new ImageIcon("Image\\음식 사진\\스위트 어니언.png"));
	      label_126.setBounds(273, 11, 200, 150);
	      panel_5.add(label_126);
	      
	      JLabel label_127 = new JLabel("");
	      label_127.setIcon(new ImageIcon("Image\\음식 사진\\랜치드레싱.png"));
	      label_127.setBounds(524, 11, 200, 150);
	      panel_5.add(label_127);
	      
	      JLabel label_128 = new JLabel("");
	      label_128.setIcon(new ImageIcon("Image\\음식 사진\\사우스 웨스트.png"));
	      label_128.setBounds(768, 11, 200, 150);
	      panel_5.add(label_128);
	      
	      JLabel label_129 = new JLabel("");
	      label_129.setIcon(new ImageIcon("Image\\음식 사진\\사우전 아일랜드.png"));
	      label_129.setBounds(12, 244, 200, 150);
	      panel_5.add(label_129);
	      
	      JLabel label_130 = new JLabel("");
	      label_130.setIcon(new ImageIcon("Image\\음식 사진\\레드와인식초.png"));
	      label_130.setBounds(273, 245, 200, 150);
	      panel_5.add(label_130);
	      
	      JLabel label_132 = new JLabel("");
	      label_132.setBounds(882, 244, 200, 150);
	      panel_5.add(label_132);
		String header[]= {"No","상품명","가격"};
		String contents[][]= {{"","","0"}};
		
		model = new DefaultTableModel(contents, header) {
			public boolean isCellEditable(int row,int column) {
				return false;
			}
		};
		model.removeRow(model.getRowCount()-1);
		JTable table = new JTable(model);
		table.getColumn("No").setPreferredWidth(100);
		table.getColumn("상품명").setPreferredWidth(170);
		table.getColumn("가격").setPreferredWidth(200);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(79, 669, 490, 256);
		scrollpane.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
		frame.getContentPane().add(scrollpane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(608, 669, 70, 120);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setIcon(new ImageIcon("Image\\선택삭제.png"));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(btnNewButton)) {
					if(model.getRowCount()>0) {
				model.removeRow(model.getRowCount()-1);
				table.updateUI();			
				textField.setText(Integer.toString(c.sum(model))+"원");
					}
		}
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNumRows(0);
				textField.setText("\0원");
			}
		});
		btnNewButton_1.setBounds(608, 805, 70, 120);
		btnNewButton_1.setIcon(new ImageIcon("Image\\전체삭제.png"));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusPainted(false);
		frame.getContentPane().add(btnNewButton_1);
		/*주문하기 버튼*/
		JButton OrderButton = new JButton("");
		OrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(OrderButton)) {
					dao.Order(model, Id);
					new 결제(textField.getText(),model);
					model.setNumRows(0);
					textField.setText("\0원");
				}
			}
		});
		OrderButton.setBounds(785, 754, 305, 120);
		OrderButton.setIcon(new ImageIcon("Image\\주문하기.png"));
		OrderButton.setContentAreaFilled(false);
		OrderButton.setBorderPainted(false);
		OrderButton.setFocusPainted(false);
		frame.getContentPane().add(OrderButton);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL");
		lblNewLabel_1.setBounds(732, 609, 382, 103);
		lblNewLabel_1.setIcon(new ImageIcon("Image\\Total값.png"));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(732, 680, 382, 61);
		textField.setFont(new Font("굴림", Font.PLAIN, 35));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField.setText(String.valueOf(sum)+"원");
		/*테이블과 UI의 업데이트 갱신을 알림*/
		
		
		
		frame.getContentPane().add(textField);		
		textField.setColumns(10);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(0, 0, 1221, 945);
		label_7.setIcon(new ImageIcon("Image\\고객창배경.png"));
		label_7.setBackground(new Color(0, 128, 0));
		frame.getContentPane().add(label_7);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
