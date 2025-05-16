package Services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controller.DBConnect;
import Model.vehicleServiceModel;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

public class vehicleService {
		public void insertData(vehicleServiceModel serviceModel) {
			try {
				
				String custName	= serviceModel.getCustName();
				String custCity	= serviceModel.getCustCity();
				String custPhone = serviceModel.getCustPhone();
				String custUserName	= serviceModel.getCustUserName();
				String custPassword	= serviceModel.getCustPassword();
				String serviceType = serviceModel.getServiceType();
				String vehicleBrand	= serviceModel.getVehicleBrand();
				String bodyType	= serviceModel.getBodyType();
				String manufYear = serviceModel.getManufYear();
				String serviceDescription = serviceModel.getServiceDescription();
				
				
				DBConnect db = new DBConnect();
				
				Statement stmt = db.getConnection().createStatement();
				
				String sql = "INSERT INTO serviceOrder VALUES('"+0+"', '"+custName+"', '"+custCity+"', '"+custPhone+"', '"+custUserName+"', '"+custPassword+"', '"+serviceType+"', '"+vehicleBrand+"', '"+bodyType+"', '"+manufYear+"', '"+serviceDescription+"')";
				
				stmt.executeUpdate(sql);
				
				stmt.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
//		public boolean validate(adminModel admin) {
//			try {
//				String user = admin.getAdminUserName();
//				String pass = admin.getAdminPassword();
//				
//				String sql = "SELECT adminName FROM admin WHERE adminUserName = '"+user+"' AND adminPassword = '"+pass+"'";
//				
//				Statement stmt = DBConnect.getConnection().createStatement();
//				
//				ResultSet rs = stmt.executeQuery(sql);
//				
//				if(rs.next()) {
//		            return true;
//		        }
//				
//				stmt.close();
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			return false;
//		}
//		
		public ArrayList<ArrayList<String>> showData(vehicleServiceModel vehicle) {
			try {
				
				ArrayList<ArrayList<String>> serviceDetails = new ArrayList<>();
				
				Statement stmt = DBConnect.getConnection().createStatement();
				
				String sql = "SELECT * FROM serviceOrder";
				
				ResultSet rs1 = stmt.executeQuery(sql);
				
				while(rs1.next()) {
					ArrayList<String> serviceDetail = new ArrayList<>();

					serviceDetail.add(rs1.getString("serviceId"));
					serviceDetail.add(rs1.getString("custName"));
					serviceDetail.add(rs1.getString("custCity"));
					serviceDetail.add(rs1.getString("custPhone"));
					serviceDetail.add(rs1.getString("custUserName"));
					serviceDetail.add(rs1.getString("custPassword"));
					
					serviceDetail.add(rs1.getString("serviceType"));
					serviceDetail.add(rs1.getString("vehicleBrand"));
					serviceDetail.add(rs1.getString("bodyType"));
					serviceDetail.add(rs1.getString("manufYear"));
					serviceDetail.add(rs1.getString("serviceDescription"));
					
					serviceDetails.add(serviceDetail);
					
				}
				
				return serviceDetails;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public int updateData(vehicleServiceModel vehicle){

			try {
				Statement stmt = (Statement) DBConnect.getConnection().createStatement();
				
				String sql = "UPDATE serviceOrder SET serviceId='"+0+"', custName='"+vehicle.getCustName()+"', custCity='"+vehicle.getCustCity()+"', custPhone='"+vehicle.getCustPhone()+"', custUserName='"+vehicle.getCustUserName()+"', custPassword='"+vehicle.getCustPassword()+"', serviceType='"+vehicle.getServiceType()+"', vehicleBrand='"+vehicle.getVehicleBrand()+"', bodyType='"+vehicle.getBodyType()+"', manufYear='"+vehicle.getManufYear()+"', serviceDescription='"+vehicle.getServiceDescription()+"' WHERE custUserName ='"+vehicle.getCustUserName()+"'";
				
				int noOfRows = stmt.executeUpdate(sql);
				
				return noOfRows;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		
		public ArrayList<String> showDetails2(vehicleServiceModel vehicle) {
			try {
				String sql = "SELECT * FROM serviceOrder WHERE custUserName='"+vehicle.getCustUserName()+"'"; 
				
				Statement stmt = (Statement) DBConnect.getConnection().createStatement();
				
				ArrayList<String> list = new ArrayList<String>();
				
				ResultSet rs1 = stmt.executeQuery(sql);
				
				if(rs1.next()) {
					list.add(rs1.getString("serviceId"));
					list.add(rs1.getString("custName"));
					list.add(rs1.getString("custCity"));
					list.add(rs1.getString("custPhone"));
					list.add(rs1.getString("custUserName"));
					list.add(rs1.getString("custPassword"));
					list.add(rs1.getString("serviceType"));
					list.add(rs1.getString("vehicleBrand"));
					list.add(rs1.getString("bodyType"));
					list.add(rs1.getString("manufYear"));
					list.add(rs1.getString("serviceDescription"));
					
					return list;
				}
	
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		

		public int deleteData(vehicleServiceModel vehicle) {
			try {
				String username = vehicle.getCustUserName();
				String password = vehicle.getCustPassword();
				
				String sql = "DELETE FROM serviceOrder WHERE  custUserName = '"+username+"' AND  custPassword = '"+password+"';";
				
				Statement stmt = DBConnect.getConnection().createStatement();
				
				int noOfRows = stmt.executeUpdate(sql);
				
				
				if(noOfRows < 0) {
					throw new MyException("Deletion Error !");
				}
				
				return noOfRows;
				
			}catch(Exception e) {
				return 0;
			}
		}
}	

