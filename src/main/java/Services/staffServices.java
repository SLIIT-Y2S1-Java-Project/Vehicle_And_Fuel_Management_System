package Services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controller.DBConnect;
import Model.staffModel;

public class staffServices {
	public void insertData(staffModel stfModel) {
		try {
			
			String name = stfModel.getStaffName();
			String address = stfModel.getStaffAddress();
			String email = stfModel.getStaffEmail();
			String gender = stfModel.getStaffGender();
			String user = stfModel.getStaffUserName();
			String pass = stfModel.getStaffPassword();
			
			DBConnect db = new DBConnect();
			
			Statement stmt = DBConnect.getConnection().createStatement();

String sql = "INSERT INTO staff VALUES('"+0+"', '"+name+"', '"+address+"', '"+email+"', '"+gender+"', '"+user+"', '"+pass+"')";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean validate(staffModel staff) {
		try {
			String user = staff.getStaffUserName();
			String pass = staff.getStaffPassword();
			
			String sql = "SELECT staffName FROM staff WHERE staffUserName = '"+user+"' AND staffPassword = '"+pass+"'";
			
			Statement stmt = DBConnect.getConnection().createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
	            return true;
	        }
			
			stmt.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<String> showData(staffModel staff) {
		try {
			Statement stmt = DBConnect.getConnection().createStatement();
			
			String sql = "SELECT * FROM staff WHERE staffUserName='"+staff.getStaffUserName()+"' AND staffPassword='"+staff.getStaffPassword()+"'";
			
			ResultSet rs1 = stmt.executeQuery(sql);
			
			ArrayList<String> staffDetails = new ArrayList<>();
			
			if(rs1.next()) {
				staffDetails.add(rs1.getString("staffName"));
				staffDetails.add(rs1.getString("staffAddress"));
				staffDetails.add(rs1.getString("staffEmail"));

				staffDetails.add(rs1.getString("staffGender"));
				staffDetails.add(rs1.getString("staffUserName"));
				staffDetails.add(rs1.getString("staffPassword"));
				
				return staffDetails;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updateData(staffModel staff){
	

		try {
			String name = staff.getStaffName();
			String address = staff.getStaffAddress();
			String email = staff.getStaffEmail();
			String gender = staff.getStaffGender();
			String user = staff.getStaffUserName();
			String pass = staff.getStaffPassword();

			String sql = "UPDATE staff SET staffName='"+name+"', staffAddress='"+address+"', staffEmail='"+email+"', staffGender='"+gender+"', staffUserName='"+user+"', staffPassword='"+pass+"' WHERE staffUserName ='"+user+"'";
			
			Statement stmt = DBConnect.getConnection().createStatement();
			stmt.executeUpdate(sql);
			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	public boolean deleteData(staffModel staff) {
		try {
			String username = staff.getStaffUserName();
			String password = staff.getStaffPassword();

			String sql = "DELETE FROM staff WHERE staffUserName = '"+username+"' AND staffPassword = '"+password+"';";
			
			Statement stmt = DBConnect.getConnection().createStatement();
			
			stmt.executeUpdate(sql);
			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}

