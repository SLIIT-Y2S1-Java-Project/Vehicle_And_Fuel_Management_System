package Services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

import Controller.DBConnect;

import Model.Manager;

public class ManagerMemberDBUtil {
		
		private static boolean isSuccess;
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
	    
		
		public static boolean validateManager(String username, String password) {
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from manager where UserName='"+username+"' and Password='"+password+"'";
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

		
		public static List<Manager> getManager(String userName) {
			
			ArrayList<Manager>  manager = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from manager";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);
					String username = rs.getString(5);
					String password = rs.getString(6);
					
					 Manager mang = new Manager(id,name,email,phone,username,password);
					 manager.add(mang);
				}
				
			} catch (Exception e) {
				
			}
			
			return  manager;	
		}
	    
		public static List< Manager> homeback() {
			
			ArrayList< Manager>  manager = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from manager";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);
					String username = rs.getString(5);
					String password = rs.getString(6);
					
					 Manager mang = new  Manager(id,name,email,phone,username,password);
					 manager.add(mang);
				}
				
			} catch (Exception e) {
				
			}
			
			return  manager;	
		}
	    public static boolean insertManager(String name, String email, String phone, String username, String password) {
	    	
	    	boolean isSuccess = false;
	    	
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into manager values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
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
	    
	    public static boolean updateManager(String id, String name, String email, String phone, String username, String password) {
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update manager set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
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
	 
	    public static List<Manager> getManagerDetails(String Id) {
	    	
	    	int convertedID = Integer.parseInt(Id);
	    	
	    	ArrayList<Manager> manager = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from manager where id='"+convertedID+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String name = rs.getString(2);
	    			String email = rs.getString(3);
	    			String phone = rs.getString(4);
	    			String username = rs.getString(5);
	    			String password = rs.getString(6);
	    			
	    			Manager mang = new Manager(id,name,email,phone,username,password);
	    			manager.add(mang);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return manager;	
	    }
	    
	    
	 public static List<Manager> getAllManagerDetails() {
	    
	    	
	    	
	    	ArrayList<Manager> manag = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from manager";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String name = rs.getString(2);
	    			String email = rs.getString(3);
	    			String phone = rs.getString(4);
	    			String username = rs.getString(5);
	    			String password = rs.getString(6);
	    			
	    			 Manager c = new Manager(id,name,email,phone,username,password);
	    			 manag.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return manag;	
	    }
	    
	    
	    public static boolean deleteManager(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from manager where id='"+convId+"'";
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
