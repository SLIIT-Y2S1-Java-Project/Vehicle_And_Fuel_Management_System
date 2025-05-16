package Model;

public class adminModel{
	private int adminId;
	private String adminName;
	private String adminAddress;
	private String adminEmail;
	private String adminGender;
	private String adminUserName;
	private String adminPassword;
	
	
	public adminModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public adminModel(int adminId, String adminName, String adminAddress, String adminEmail, String adminGender,
			String adminUserName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminAddress = adminAddress;
		this.adminEmail = adminEmail;
		this.adminGender = adminGender;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "adminModel [adminId=" + adminId + ", adminName=" + adminName + ", adminAddress=" + adminAddress
				+ ", adminEmail=" + adminEmail + ", adminGender=" + adminGender + ", adminUserName=" + adminUserName
				+ ", adminPassword=" + adminPassword + "]";
	}

	public int getAdminId() {
		return adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public String getAdminAddress() {
		return adminAddress;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public String getAdminGender() {
		return adminGender;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	
	
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
}
