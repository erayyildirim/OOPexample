package tr.org.linux.kamp.book;

import java.util.ArrayList;

public class Customer {
	private String userName;
	private String userSurname;
	private int purchaseCount;
	private ArrayList<Purchase> purchaseHistory = new ArrayList<>();

	

	public Customer() {

	}

	public Customer(String userName, String userSurname) {
		this.userName = userName;
		this.userSurname = userSurname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public int getPurchaseCount() {
		return purchaseCount;
	}
	
	public ArrayList<Purchase> getPurchaseHistory() {
		return purchaseHistory;
	}

	public void setPurchaseHistory(ArrayList<Purchase> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}

	public void setPurchaseCount(int purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public void placePurchase(Purchase purchase) {
		purchaseHistory.add(purchase);
		purchaseCount++;
	}
	

}
