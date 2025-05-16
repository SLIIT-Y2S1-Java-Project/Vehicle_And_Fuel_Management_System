package Model;

public class Fuelsellesdetails {
	private int id;
    private String type;
    private String liters;
    private String date;
    private String noOfCustomers;
    private String branch;
    
    
	public Fuelsellesdetails(int id, String type, String liters, String date, String noOfCustomers, String branch) {
	
		this.id = id;
		this.type = type;
		this.liters = liters;
		this.date = date;
		this.noOfCustomers = noOfCustomers;
		this.branch = branch;
		
	}
	
	
	public int getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getLiters() {
		return liters;
	}
	public String getDate() {
		return date;
	}
	public String getNoOfCustomers() {
		return noOfCustomers;
	}
	public String getBranch() {
		return branch;
	}
    
    
   
    
    


}
