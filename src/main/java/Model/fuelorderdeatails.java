package Model;

public class fuelorderdeatails {
	private int id;
	private String orderid;
    private String type;
    private String date;
    private String price;
    private String phone;
    private String supplier;
    
	public fuelorderdeatails(int id, String orderid, String type, String date, String price, String phone,
			String supplier) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.type = type;
		this.date = date;
		this.price = price;
		this.phone = phone;
		this.supplier = supplier;
	}
	
	
	public int getId() {
		return id;
	}
	public String getOrderid() {
		return orderid;
	}
	public String getType() {
		return type;
	}
	public String getDate() {
		return date;
	}
	public String getPrice() {
		return price;
	}
	public String getPhone() {
		return phone;
	}
	public String getSupplier() {
		return supplier;
	}
    
	
    
	
}
