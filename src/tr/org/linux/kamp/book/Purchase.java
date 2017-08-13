package tr.org.linux.kamp.book;

public class Purchase {
	protected String purchaseDate;
	protected String shippingDate; 
	protected int deliveryLenght;
	protected ShoppingCard purchasingCard;
	
	
	
	public Purchase(String purchaseDate, String shippingDate,
			int deliveryLenght, ShoppingCard purchasingCard) {
		super();
		this.purchaseDate = purchaseDate;
		this.shippingDate = shippingDate;
		this.deliveryLenght = deliveryLenght;
		this.purchasingCard = purchasingCard;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}
	public int getDeliveryLenght() {
		return deliveryLenght;
	}
	public void setDeliveryLenght(int deliveryLenght) {
		this.deliveryLenght = deliveryLenght;
	}
	public ShoppingCard getPurchasingCard() {
		return purchasingCard;
	}
	public void setPurchasingCard(ShoppingCard purchasingCard) {
		this.purchasingCard = purchasingCard;
	}
	
	
	
}
