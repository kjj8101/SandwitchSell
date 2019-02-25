package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import MODEL.DAO;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 관리자재고창 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private   DefaultTableModel model;
	private JTable tbl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new 관리자재고창();
			
	}

	/**
	 * Create the frame.
	 */
	public 관리자재고창() {
		DAO dao=new DAO();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("변경 품목");
		lblNewLabel_1.setBounds(56, 310, 78, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(320, 352, 132, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("변경수량");
		label.setBounds(326, 313, 57, 15);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("변경");
		btnNewButton.setIcon(new ImageIcon("Image\\변경버튼.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dao.SetItemAcount(textField_1.getText(),textField.getText(),model,tbl);
			}
		});
		btnNewButton.setBounds(480, 309, 160, 107);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(35, 86, 622, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		String columnNames[] = {"No","상품명","가격","수량"};
		//String data2[][]= {{"a","b","c","d"},};		// DB연동안되서 임시로 생성함.   
		String data[][];
		data=dao.ManagerItemCount();
		// 테이블에 출력할 데이터 배열
			
			//dao.getConn();//데이터베이스 연결 후 
		   

		     model = new DefaultTableModel(data,columnNames){
				public boolean isCellEditable(int row,int column) {
					return false;
				}
			};
		JTable tbl = new JTable(model);
		
		
		tbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int a=tbl.getSelectedRow();				
				textField_1.setText(tbl.getValueAt(a,1).toString());
				
			}
		});
		tbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tbl.getColumn("No").setPreferredWidth(40);
		tbl.getColumn("상품명").setPreferredWidth(250);
		tbl.getColumn("가격").setPreferredWidth(250);
		tbl.getColumn("수량").setPreferredWidth(50);
				    		     
		//JTable tbl = new JTable(data,columnNames);
				    
		// Table은 JScrollPane위에 출력해야 컬럼 이름이 출력된다! 명심할것
		
		 JScrollPane scoll = new JScrollPane(tbl);
		 scoll.setBounds(0, 0, 623, 245);
		panel.add(scoll);
		
		
		getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(56, 352, 132, 38);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("변");
		lblNewLabel.setBounds(0, 0, 690, 466);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("Image\\관리자재고조회배경.jpg"));
		setVisible(true);
	}

	
}
