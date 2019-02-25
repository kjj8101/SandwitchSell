package MODEL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class Cart {
	private int CartIndex = 0; // 카트 번호 순서.
	private int TotalSum = 0;// 카트에 담긴 물건 총합계
	private ArrayList<String> CartList = new ArrayList<String>();
	private ArrayList<Integer> CartPriceList = new ArrayList<Integer>();

	public Cart() {

	}

	/*
	 * ====================카트 데이터 관련 메소드==========================================
	 */
	/* 카트 데이터 추가 */
	public void AddCartItem(String Item, int Price) {
		this.CartList.add(Item);
		this.CartPriceList.add(Price);
		// CartIndex+=1;
	}

	/* 카트데이터 전체 삭제 */
	public void RemoveCartItem() {
		this.CartList.clear();
		this.CartPriceList.clear();
	}


	/* 카트데이터 선택 삭제 */
	public void RemoveCartItem(int index) {
		this.CartList.remove(index);
		this.CartPriceList.remove(index);
	}
	

	public int sum(DefaultTableModel m) {
		int sum = 0;
		for (int i = 0; i < m.getRowCount(); i++) {
			sum += Integer.parseInt(m.getValueAt(i, 2).toString());

		}
		return sum;
	}

	/*
	 * ====================카트 인덱스 관련 메소드==========================================
	 */
	public int setCartIndex(int a) {
		return this.CartIndex = a;
	}

	public int getCartIndex() {
		return this.CartIndex;
	}

	/* ====================카트 출력기능 메소드========================================== */
	public int CartTotalSum() {// 카트에 담긴 물품 총합계 계산하는 메소드
		for (int i = 0; i < getCartList().size(); i++) {
			this.TotalSum += getCartPriceList().get(i);
		}
		return this.TotalSum;
	}

	public void ShowCartList() {
		if (getCartList().get(0) == null) {
			System.out.println("데이터없음");
			return;
		}
		for (int i = 0; i < getCartList().size(); i++) {
			System.out.print(getCartList().get(i) + " : " + getCartPriceList().get(i) + "\n");
		}
	}

	/*
	 * ====================카트 배열리스트 관련 메소드==========================================
	 */
	public ArrayList<String> getCartList() {
		return CartList;
	}

	public void setCartList(ArrayList<String> cartList) {
		CartList = cartList;
	}

	public ArrayList<Integer> getCartPriceList() {
		return CartPriceList;
	}

	public void setCartPriceList(ArrayList<Integer> cartPriceList) {
		CartPriceList = cartPriceList;
	}
}
