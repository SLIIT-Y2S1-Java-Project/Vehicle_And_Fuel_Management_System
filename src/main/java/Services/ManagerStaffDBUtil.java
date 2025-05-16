package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Controller.DBConnect;
import Model.Managerstaff;

public class ManagerStaffDBUtil {
	
		
		private static boolean isSuccess;
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
	    
		public static boolean validateStaff(String username, String password) {
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from staff where staffUserName='"+username+"' and staffPassword='"+password+"'";
				rs = stmt.executeQuery(sql);
				
				if (rs.next()) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
		}
		
		
		public static List<Managerstaff> getstaff(String userName) {
			
			ArrayList<Managerstaff> staff = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from staff";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String address = rs.getString(3);
					String email = rs.getString(4);
					String gender = rs.getString(5);
					String username = rs.getString(6);
					String password = rs.getString(7);
					
					Managerstaff cus = new Managerstaff(id, name, address, email, gender, username, password);
					staff.add(cus);
				}
				
			} catch (Exception e) {
				
			}
			
			return staff;	
		}
	    
		public static List<Managerstaff> homeback() {
			
			ArrayList<Managerstaff> staff = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from staff";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String address = rs.getString(3);
					String email = rs.getString(4);
					String gender = rs.getString(5);
					String username = rs.getString(6);
					String password = rs.getString(7);
					
					Managerstaff cus = new Managerstaff(id, name, address, email, gender, username, password);
					staff.add(cus);
				}
				
			} catch (Exception e) {
				
			}
			
			return staff;	
		}
	    public static boolean insertstaff(String name,String address,String email,String gender,String username,String password) {
	    	
	    	boolean isSuccess = false;
	    	
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into staff values (0,'"+name+"','"+address+"','"+email+"','"+gender+"','"+username+"','"+password+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	 	
	    	return isSuccess;
	    }
	    
	    public static boolean updatestaff(String id,String name,String address,String email,String gender,String username,String password) {
	    	
	    	
	    	
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update staff set staffName='"+name+"',staffAddress='"+address+"',staffEmail='"+email+"',staffGender='"+gender+"',staffUserName='"+username+"',staffPassword='"+password+"'"
	    				+ "where staffId='"+id+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	    public static List<Managerstaff> getstaffDetails(String Id) {
	    	
	    	int convertedID = Integer.parseInt(Id);
	    	
	    	ArrayList<Managerstaff> staff = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from staff where id='"+convertedID+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String address = rs.getString(3);
					String email = rs.getString(4);
					String gender = rs.getString(5);
					String username = rs.getString(6);
					String password = rs.getString(7);
					
					Managerstaff cus = new Managerstaff(id, name, address, email, gender, username, password);
					staff.add(cus);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return staff;	
	    }
	 public static List<Managerstaff> getAllstaffDetails() {
	    
	    	
	    	
	    	ArrayList<Managerstaff> staff = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from staff";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String address = rs.getString(3);
					String email = rs.getString(4);
					String gender = rs.getString(5);
					String username = rs.getString(6);
					String password = rs.getString(7);
					
					Managerstaff cus = new Managerstaff(id, name, address, email, gender, username, password);
					staff.add(cus);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return staff;	
	    }
	    
	    
	    public static boolean deletestaff(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from staff where staffId='"+convId+"'";
	    		int r = stmt.executeUpdate(sql);
	    		
	    		if (r > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }

}
