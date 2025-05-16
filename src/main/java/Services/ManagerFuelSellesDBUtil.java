package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Controller.DBConnect;
import Model.Fuelsellesdetails;

public class ManagerFuelSellesDBUtil {
	
		
		private static boolean isSuccess;
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
	    
		public static boolean validatefuelselle(String NoOfCustomers, String branch) {
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from fuelsellesdetails where Noofcustomers='"+NoOfCustomers+"' and Branch='"+branch+"'";
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
		
		
		public static List<Fuelsellesdetails> getFuelsell() {
			
			ArrayList<Fuelsellesdetails> Fuelsell = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from fuelsellesdetails";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String type = rs.getString(2);
					String liters = rs.getString(3);
					String date = rs.getString(4);
					String NoOfCustomers = rs.getString(5);
					String branch = rs.getString(6);
					
					Fuelsellesdetails cus = new Fuelsellesdetails(id, type, liters, date, NoOfCustomers, branch);
				
					Fuelsell.add(cus);
				}
				
			} catch (Exception e) {
				
			}
			
			return Fuelsell;	
		}
	    
	
	    public static boolean insertFuelsell(String type, String liters, String date, String NoOfCustomers, String branch) {
	    	
	    	boolean isSuccess = false;
	    	
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into fuelsellesdetails values (0,'"+type+"','"+liters+"','"+date+"','"+NoOfCustomers+"','"+branch+"')";
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
	    
	    public static boolean updateFuelsell(String id, String type, String liters, String date, String NoOfCustomers, String branch) {
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update fuelsellesdetails set Fuel Type='"+type+"',Liters='"+liters+"',Date='"+date+"',Noofcustomers='"+NoOfCustomers+"',Branch='"+branch+"'"
	    				+ "where id='"+id+"'";
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
	 
	    
	    
	    
	    public static boolean deleteFuelsell(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from fuelsellesdetails where id='"+convId+"'";
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
