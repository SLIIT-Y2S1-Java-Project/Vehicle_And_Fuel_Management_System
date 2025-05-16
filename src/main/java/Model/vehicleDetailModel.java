package Model;

public class vehicleDetailModel {
	private String serviceId;	
	private String custUserName;
	private String custName;
	private String custPhone;	
	private String serviceType;	
	private String vehicleBrand;	
	private String bodyType;	
	private String manufYear;	
	private String serviceDescription;
	
	
	public String getServiceId() {
		return serviceId;
	}
	public String getCustUserName() {
		return custUserName ;
	}
	public String getCustName() {
		return custUserName;
	}
	public String getCustCity() {
		return custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public String getServiceType() {
		return serviceType;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public String getBodyType() {
		return bodyType;
	}
	public String getManufYear() {
		return manufYear;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	
	
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public void setManufYear(String manufYear) {
		this.manufYear = manufYear;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	

}
