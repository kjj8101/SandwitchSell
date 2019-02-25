package MODEL;

public class TestCart {
	public static void main(String[]args) {
	/* 멤버객체  */
	//MemberVO vo= new MemberVO("abc","dee");
	/* DB 연결 */
	DAO dao =new DAO();
	/* 카트 객체 */
	Cart c= new Cart();
	
	c.AddCartItem("밥",100);
	c.AddCartItem("김치",5000);
	c.AddCartItem("치즈",80);	
	c.ShowCartList();
	System.out.println("총합:"+c.CartTotalSum());
	System.out.println("인덱스 :"+c.getCartIndex());


}
}
