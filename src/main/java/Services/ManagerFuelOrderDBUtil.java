package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Controller.DBConnect;

import Model.fuelorderdeatails;

public class ManagerFuelOrderDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validatefuelOrder(String orderid) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from fuelorderdeatails where orderid='"+orderid+"'";
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
	
	public static List<fuelorderdeatails> getFuelOrder(String orderid) {
		
		ArrayList<fuelorderdeatails> FuelOrder = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from fuelorderdeatails";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String oid = rs.getString(2);
				String type = rs.getString(3);
				String date = rs.getString(4);
				String price = rs.getString(5);
				String phone = rs.getString(6);
				String supplier = rs.getString(7);
				
				fuelorderdeatails cus = new fuelorderdeatails(id, oid, type, date, price, phone, supplier);
				FuelOrder.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return FuelOrder;	
	}
    
	public static List<fuelorderdeatails> homeback() {
		
ArrayList<fuelorderdeatails> FuelOrder = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from fuelorderdeatails";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String oid = rs.getString(2);
				String type = rs.getString(3);
				String date = rs.getString(4);
				String price = rs.getString(5);
				String phone = rs.getString(6);
				String supplier = rs.getString(7);
				
				fuelorderdeatails cus = new fuelorderdeatails(id, oid, type, date, price, phone, supplier);
				FuelOrder.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return FuelOrder;		
	}
    public static boolean insertfuelorder(String orderid, String type, String date, String price, String phone,String supplier) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into fuelorderdeatails values (0,'"+orderid+"','"+type+"','"+date+"','"+price+"','"+phone+"','"+supplier+"')";
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
    
    public static boolean updatefuelorder(String id,String orderid, String type, String date, String price, String phone,String supplier) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update fuelorderdeatails set orderid='"+orderid+"',FuelType='"+type+"',Date='"+date+"',Price='"+price+"',phone='"+phone+"',Supplier='"+supplier+"'"
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
 
    public static List<fuelorderdeatails> getFuelOrderDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);
    	
    	ArrayList<fuelorderdeatails> Fuel = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from fuelorderdeatails where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while (rs.next()) {
				int id = rs.getInt(1);
				String oid = rs.getString(2);
				String type = rs.getString(3);
				String date = rs.getString(4);
				String price = rs.getString(5);
				String phone = rs.getString(6);
				String supplier = rs.getString(7);
				
				fuelorderdeatails cus = new fuelorderdeatails(id, oid, type, date, price, phone, supplier);
				Fuel.add(cus);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return Fuel;	
    }
 public static List<fuelorderdeatails> getAllFuelDetails() {
    
    	
    	
    	ArrayList<fuelorderdeatails> Fuel = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from fuelorderdeatails";
    		rs = stmt.executeQuery(sql);
    		
    		while (rs.next()) {
				int id = rs.getInt(1);
				String oid = rs.getString(2);
				String type = rs.getString(3);
				String date = rs.getString(4);
				String price = rs.getString(5);
				String phone = rs.getString(6);
				String supplier = rs.getString(7);
				
				fuelorderdeatails cus = new fuelorderdeatails(id, oid, type, date, price, phone, supplier);
				Fuel.add(cus);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return Fuel;	
    }
    
    
    public static boolean deleteFuelOrder(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from fuelorderdeatails where id='"+convId+"'";
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
