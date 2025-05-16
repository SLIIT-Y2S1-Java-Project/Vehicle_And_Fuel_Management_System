package Services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import Controller.DBConnect;
import Model.CustomerModel;
import Model.adminModel;
import Model.staffModel;



public class customerSevices {
	public void insertData(CustomerModel custModel) {
		try {
			
			String name = custModel.getCustName();
			String address = custModel.getCustAddress();
			String email = custModel.getCustEmail();
			String gender = custModel.getCustGender();
			String user = custModel.getCustUserName();
			String pass = custModel.getCustPassword();
			
			// DBConnect db = new DBConnect();
			
			Statement stmt = DBConnect.getConnection().createStatement();

			
			String sql = "INSERT INTO customer VALUES('"+0+"', '"+name+"', '"+address+"', '"+email+"', '"+gender+"', '"+user+"', '"+pass+"')";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean validate(CustomerModel customer) {
		try {
			
			String user = customer.getCustUserName();
			String pass = customer.getCustPassword();
			
			String sql = "SELECT custUserName FROM customer WHERE custUserName = '"+user+"' AND custPassword = '"+pass+"'";
			
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

	
public ArrayList<ArrayList<String>> showData(CustomerModel customer) {
		
	    ArrayList<ArrayList<String>> allCustomerDetails = new ArrayList<>(); // ArrayList to store all rows

	    try {
	        Statement stmt = (Statement) DBConnect.getConnection().createStatement();

	        String sql = "SELECT * FROM customer";

	        ResultSet rs1 = stmt.executeQuery(sql);	

	        while(rs1.next()) {
	            ArrayList<String> customerDetails = new ArrayList<>(); // ArrayList to store details of one row
	            customerDetails.add(rs1.getString("custName"));
	            customerDetails.add(rs1.getString("custAddress"));
	            customerDetails.add(rs1.getString("custEmail"));
	            customerDetails.add(rs1.getString("custGender"));
	            customerDetails.add(rs1.getString("custUserName"));
	            customerDetails.add(rs1.getString("custPassword"));
	            
	            allCustomerDetails.add(customerDetails); // Add the details of one row to the main ArrayList
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return allCustomerDetails; // Return the ArrayList containing details of all rows
	}
	
//	public ArrayList<String> showData2(CustomerModel customer) {
//		try {
//			Statement stmt = (Statement) DBConnect.getConnection().createStatement();
//			
//			String user = staff.getStaffUserName();
//			
//			String sql1 = "SELECT * FROM staff WHERE staffUserName='"+user+"'";
//			
//			ResultSet rs1 = stmt.executeQuery(sql1);
//			
//			ArrayList<String> staffDetails = new ArrayList<>();
//			
//			if(rs1.next()) {
//				staffDetails.add(rs1.getString("staffName"));
//				staffDetails.add(rs1.getString("staffAddress"));
//				staffDetails.add(rs1.getString("staffEmail"));
//				staffDetails.add(rs1.getString("staffGender"));
//				staffDetails.add(rs1.getString("staffUserName"));
//				staffDetails.add(rs1.getString("staffPassword"));
//				
//				return staffDetails;
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

//	
//	public boolean updateData(adminModel admin){
//	
//
//		try {
//			String name = admin.getAdminName();
//			String address = admin.getAdminAddress();
//			String email = admin.getAdminEmail();
//			String gender = admin.getAdminGender();
//			String user = admin.getAdminUserName();
//			String pass = admin.getAdminPassword();
//			
//			String sql = "UPDATE admin SET adminName='"+name+"', adminAddress='"+address+"', adminEmail='"+email+"', adminGender='"+gender+"', adminUserName='"+user+"', adminPassword='"+pass+"' WHERE adminUserName ='"+user+"'";
//			
//			Statement stmt = DBConnect.getConnection().createStatement();
//			stmt.executeUpdate(sql);
//			
//			return true;
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
//
//	public boolean deleteData(adminModel admin) {
//		try {
//			String username = admin.getAdminUserName();
//			String password = admin.getAdminPassword();
//			
//			String sql = "DELETE FROM admin WHERE adminUserName = '"+username+"' AND adminPassword = '"+password+"';";
//			
//			Statement stmt = DBConnect.getConnection().createStatement();
//			
//			stmt.executeUpdate(sql);
//			
//			return true;
//			
//		}catch(Exception e) {
//			return false;
//		}
//	}
}
