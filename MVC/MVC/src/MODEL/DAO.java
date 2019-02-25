package MODEL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAO {
	java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	String sum=null;
	//Connection �κ�
	public Connection getConn() {
		if(conn==null) {
		final String url="jdbc:oracle:thin:@210.110.87.161:1521:xe";
		final String user="system";
		final String password="1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}return conn;
	}//사용자정보수정
	public void MemberUpdate(String id,String add,String tel) {
		getConn();
		String sql="update member set 주소=? , 연락처=? where id=?";
		try {
			pst=conn.prepareStatement(sql);			
			pst.setString(1,add);
			pst.setString(2,tel);
			pst.setString(3,id);
			pst.executeUpdate();	
			//j.setModel(m); 
			//System.out.println(id);
			//System.out.println(add);
			//System.out.println(tel);
			JOptionPane.showMessageDialog(null,"정보수정 완료. 창을 재 실행 해주세요");
		}catch(Exception e) {
			e.printStackTrace();
		}
		close();
	
	}
	//재고품목 변경
	public void SetItemAcount(String item,String cnt,DefaultTableModel m,JTable j) {
		int c=Integer.parseInt(cnt);
		getConn();
		String sql="update menu set Menu_AMOUNT=? where MENU_NAME=?";
		try {
			pst=conn.prepareStatement(sql);			
			pst.setInt(1,c);
			pst.setString(2, item);
			pst.executeUpdate();
			m.fireTableDataChanged();
			//j.setModel(m); 
			JOptionPane.showMessageDialog(null,"수정되었습니다. 창을 재실행해주세요");
		}catch(Exception e) {
			e.printStackTrace();
		}
		close();
	}
	public String[] ConsumerView(String id) {
		String[] ss=new String[6];
		getConn();
	
		try {
			String sql="select * from ord where id=?";			
			pst=conn.prepareStatement(sql);	
			pst.setString(1,id);
			rs=pst.executeQuery();
			if(rs.next()) {
				ss[0]=rs.getString("주문번호");
				ss[1]=rs.getString("주문시간");
				ss[2]=rs.getString("배달상태");
			
				ss[4]=rs.getString("연락처");
				ss[5]=rs.getString("주소");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		try {
			String sql="select sum(가격) from ord where 주문번호=?";			
			pst=conn.prepareStatement(sql);	
			pst.setString(1,ss[0]);
			rs=pst.executeQuery();
			if(rs.next()) {
				ss[3]=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		close();
		
		return ss;
	}
	//데이터 배열을 가져와서 저장해감
	public String [][] ConsumerItemView(String id){
		String[][] str = new String[100][3];
		getConn();
		int cnt=0;
		try {
			String sql="select * from ord where id=?";			
			pst=conn.prepareStatement(sql);	
			pst.setString(1,id);
			rs=pst.executeQuery();
			while(rs.next()) {
				str[cnt][0]=rs.getString(1);
				str[cnt][1]=rs.getString(6);
				str[cnt][2]=rs.getString(5);
				cnt+=1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return str;
	}
	public String[][] ManagerItemView() {
		getConn();
		String[][] str = new String[100][4];
		int cnt=0;
		try {
			String sql="select *from ord";
			pst=conn.prepareStatement(sql);	
			rs=pst.executeQuery();
			while(rs.next()) {
				str[cnt][0]=rs.getString(1);
				str[cnt][1]=rs.getString(2);
				str[cnt][2]=rs.getString(6);
				str[cnt][3]=rs.getString(5);
				cnt+=1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return str;
	}public String[][] ManagerItemCount() {
		getConn();
		String[][] str = new String[100][4];
		int cnt=0;
		try {
			String sql="select *from menu";
			pst=conn.prepareStatement(sql);	
			rs=pst.executeQuery();
			while(rs.next()) {
				str[cnt][0]=rs.getString(1);
				str[cnt][1]=rs.getString(2);
				str[cnt][2]=rs.getString(3);
				str[cnt][3]=rs.getString(4);
				cnt+=1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sum=str[0][0];
		close();
		return str;
	}
	public String ManagerSum() {
		getConn();
		String ss=null;
		String sql="select sum(가격) from ord";
		try {			
			pst=conn.prepareStatement(sql);	
			rs=pst.executeQuery();
			if(rs.next()) {
				ss=rs.getString(1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return ss;
	}
	public String[][] ManagerUserView() {
		getConn();
		String[][] str = new String[100][5];
		int cnt=0;
		try {
			String sql="select *from member";
			pst=conn.prepareStatement(sql);	
			rs=pst.executeQuery();
			while(rs.next()) {
				str[cnt][0]=rs.getString(1);
				str[cnt][1]=rs.getString(2);
				str[cnt][2]=rs.getString(3);
				str[cnt][3]=rs.getString(4);
				str[cnt][4]=rs.getString(5);
				cnt+=1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return str;
	}
	public boolean IsAdmin(String id) {
		getConn();
		String sql="SELECT isAdmin FROM member WHERE id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,id);
			rs=pst.executeQuery();
			rs.next();
			if(rs.getInt(1)==1){
				close();
				return true;
			}else {
				close();
				return false;
			}
			
			//로그인 성공시 true 반환
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return false;
	}
		
	
	public void Order(DefaultTableModel m, String id) {
		getConn();
		String Address=null;
		String phone=null;
		String Date=sqlDate.toString();
		//주문번호 , 주문자ID, 주소, 연락처 , 주문시간, 메뉴, 가격,배달상태
		String OrderNo=null;
		int oldOrdNo;
		String sql="select *from ord order by 주문번호 asc";
		try {
			pst=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs=pst.executeQuery();
			rs.last();
			OrderNo=rs.getString("주문번호").toString();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//주문번호 마지막 불러옴.
		if(OrderNo==null){
			OrderNo="1";
		}else {
			oldOrdNo=Integer.parseInt(OrderNo)+1;
			OrderNo=Integer.toString(oldOrdNo);
		}
		sql="select *from Member where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,id);
			rs=pst.executeQuery();
			if(rs.next()) {
			Address=rs.getString("주소");
			phone=rs.getString("연락처");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<m.getRowCount();i++) {
		sql="insert into Ord values(?,?,?,?,?,?,?,0)";
		try {			
			pst=conn.prepareStatement(sql);			
			pst.setString(1,OrderNo);
			pst.setString(2,id);
			pst.setString(3,Address);
			pst.setString(4, phone);	
			pst.setString(5,Date);
			pst.setString(6,m.getValueAt(i,1).toString());
			pst.setString(7,m.getValueAt(i,2).toString());
			pst.executeUpdate();
			//이후창으로띄움
			sql=null;
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		}
		close();
	}	
	public int insert(MemberVO vo) {
		//getConn();
		int cnt=0;
		String sql="insert into member values(?,?)";
		try {			
			pst=conn.prepareStatement(sql);			
			pst.setString(1, vo.getID());
			pst.setString(2, vo.getPW());
			//pst.setString(3, vo.getNAME());
			//pst.setString(4, vo.getADDRESS());
			//pst.setString(5, vo.getTELEPHONE());
			cnt=pst.executeUpdate();
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public String[] SelectMemberState(String id) {
		String ss[]= {null,null,null,null,null};
		
		getConn();
		String sql="select *from Member where id=?";
		try {
			System.out.println(id);
			pst=conn.prepareStatement(sql);
			pst.setString(1,id);
			rs=pst.executeQuery();
			if(rs.next()) {
			ss[0]=rs.getString("ID");
			ss[1]=rs.getString("PW");
			ss[2]=rs.getString("이름");
			ss[3]=rs.getString("주소");
			ss[4]=rs.getString("연락처");
			System.out.println(ss[2]);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		close();
		return ss;
	}
	public boolean login(String id,String pw) {
		getConn();
		String sql="SELECT id FROM member WHERE id=? AND pw=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,id);
			pst.setString(2,pw);
			rs=pst.executeQuery();
			if(rs.next()) {
				close();				
				return true;
			}else {
				close();	
				return false;
			}
			
			//로그인 성공시 true 반환
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void close() {
		if(pst!=null) {
			try {
				pst.close();
				pst=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
	if(conn!=null) {
		try {
			conn.close();
			conn=null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(rs!=null) {
		try {
			rs.close();
			rs=null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	/*ID PW 찾기 알고리즘*/
	public String FindID(String a,String b) {		
		String data=null;
		getConn();
		String sql="select * from Member where 이름=? AND 연락처=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,a);
			pst.setString(2,b);
			rs=pst.executeQuery();
			if(rs.next()) {
				data=rs.getString("ID");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return data;
	}
	public String FindPW(String a,String b,String c) {
		String data=null;
		getConn();
		String sql="select * from Member where (ID=? AND 연락처=? AND 이름=?)";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,a);
			pst.setString(2,b);
			pst.setString(3,c);
			rs=pst.executeQuery();
			if(rs.next()) {
			data=rs.getString("PW");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return data;
	}
	
}


