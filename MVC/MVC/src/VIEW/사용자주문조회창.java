package VIEW;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MODEL.DAO;

public class 사용자주문조회창 {
	private static String id=null;
	private JFrame frame;
	DAO dao = new DAO();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 new 사용자주문조회창(id);
	}

	/**
	 * Create the application.
	 */
	public 사용자주문조회창(String s)
	{
		frame = new JFrame();		 
		frame.setBounds(100, 100, 704, 534);		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String columnNames[] = {"주문번호","상품명","주문날짜"};
		//String data2[][]= {{"a","b"},};		// DB연동안되서 임시로 생성함.   
		String data[][];
		
		data=dao.ConsumerItemView(s);
		// 테이블에 출력할 데이터 배열			
		dao.getConn();//데이터베이스 연결 후 
		   

		DefaultTableModel model = new DefaultTableModel(data,columnNames);
		JTable tbl = new JTable(model);
		
				     
		//JTable tbl = new JTable(data,columnNames);
		
		// Table은 JScrollPane위에 출력해야 컬럼 이름이 출력된다! 명심할것
		
		JScrollPane scoll = new JScrollPane(tbl);
		scoll.setBounds(35, 90, 623, 245);
		frame.add(scoll);
		
		
		 JLabel lblNewLabel = new JLabel();
	      lblNewLabel.setIcon(new ImageIcon("Image\\사용자페이지배경.png"));
	      lblNewLabel.setBounds(0, 0, 826, 494);      
	      
	      frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}

}
