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

import javax.swing.JTable;

import java.awt.Color;

public class 관리자사용자조회창 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					관리자사용자조회창 frame = new 관리자사용자조회창();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public 관리자사용자조회창() {
		DAO dao=new DAO();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693	, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	;
		String columnNames[] = {"사용자ID","사용자PW","사용자이름","주소","전화번호"};
		//String data2[][]= {{"a","b","c","d","e"},};		// DB연동안되서 임시로 생성함.   
		String data[][];
		
		data=dao.ManagerUserView();
		// 테이블에 출력할 데이터 배열			
		dao.getConn();//데이터베이스 연결 후 
		   

		    DefaultTableModel model = new DefaultTableModel(data,columnNames){
				public boolean isCellEditable(int row,int column) {
					return false;
				}
			};
		JTable tbl = new JTable(model);
		tbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tbl.getColumn("사용자ID").setPreferredWidth(100);
		tbl.getColumn("사용자PW").setPreferredWidth(100);
		tbl.getColumn("사용자이름").setPreferredWidth(100);
		tbl.getColumn("주소").setPreferredWidth(170);
		tbl.getColumn("전화번호").setPreferredWidth(200);    
		//JTable tbl = new JTable(data,columnNames);
		
		// Table은 JScrollPane위에 출력해야 컬럼 이름이 출력된다! 명심할것
		
		JScrollPane scoll = new JScrollPane(tbl);
		scoll.setBounds(35, 90, 623, 245);
		contentPane.add(scoll);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 681, 471);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("Image\\관리자사용자조회배경.jpg"));
		
		
		getContentPane().setLayout(null);
		setVisible(true);
	}
	
}
