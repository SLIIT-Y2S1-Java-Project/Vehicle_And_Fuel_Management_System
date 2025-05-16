package Model;

public class Managerstaff {
	private int id;
	private String name;
    private String address;
    private String email;
    private String gender;
    private String userName;
    private String password;
    
  
	public Managerstaff(int id, String name, String address, String email, String gender, String userName, String password) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}
	
	
	  public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getAddress() {
			return address;
		}

		public String getEmail() {
			return email;
		}

		public String getGender() {
			return gender;
		}

		public String getUserName() {
			return userName;
		}

		public String getPassword() {
			return password;
		}


}
