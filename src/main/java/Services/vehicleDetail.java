package Services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controller.DBConnect;
import Model.vehicleDetailModel;



public class vehicleDetail {

	
			public void insertData(vehicleDetailModel serviceModel) {
				try {
					
					String serviceID = serviceModel.getServiceId();
					String custUserName	= serviceModel.getCustUserName();
					String custName	= serviceModel.getCustName();
					String custPhone = serviceModel.getCustPhone();
					String serviceType = serviceModel.getServiceType();
					String vehicleBrand	= serviceModel.getVehicleBrand();
					String bodyType	= serviceModel.getBodyType();
					String manufYear = serviceModel.getManufYear();
					String serviceDescription = serviceModel.getServiceDescription();
					
					DBConnect db = new DBConnect();
					
					Statement stmt = DBConnect.getConnection().createStatement();
					
					String sql = "INSERT INTO serviceDetail VALUES('"+0+"', '"+serviceID+"', '"+custUserName+"', '"+custName+"', '"+custPhone+"','"+serviceType+"', '"+vehicleBrand+"', '"+bodyType+"', '"+manufYear+"', '"+serviceDescription+"')";
					
					stmt.executeUpdate(sql);
					
					stmt.close();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
//			public boolean validate(adminModel admin) {
//				try {
//					String user = admin.getAdminUserName();
//					String pass = admin.getAdminPassword();
			
								
//			String sql = "SELECT adminName FROM admin WHERE adminUserName = '"+user+"' AND adminPassword = '"+pass+"'";
//			
//			Statement stmt = DBConnect.getConnection().createStatement();
//			
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			if(rs.next()) {
//	            return true;
//	        }
//			
//			stmt.close();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
			public ArrayList<ArrayList<String>> showData(vehicleDetailModel vehicle) {
				try {
					
					ArrayList<ArrayList<String>> serviceDetails = new ArrayList<>();
					
					Statement stmt = DBConnect.getConnection().createStatement();
					
					String sql = "SELECT * FROM serviceDetail";
					
					ResultSet rs1 = stmt.executeQuery(sql);
					
					while(rs1.next()) {
						ArrayList<String> serviceDetail = new ArrayList<>();

						serviceDetail.add(rs1.getString("serviceId"));
						serviceDetail.add(rs1.getString("custUserName"));
						serviceDetail.add(rs1.getString("custName"));
						serviceDetail.add(rs1.getString("custPhone"));
						serviceDetail.add(rs1.getString("serviceType"));
						serviceDetail.add(rs1.getString("vehicleBrand"));
						serviceDetail.add(rs1.getString("bodyType"));
						serviceDetail.add(rs1.getString("manufYear"));
						serviceDetail.add(rs1.getString("serviceDescription"));
						
						
					}
					
					return serviceDetails;
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				return null;
			}
			
			public int updateData(vehicleDetailModel vehicle){
				try {
					Statement stmt = (Statement) DBConnect.getConnection().createStatement();
					
					String sql = "UPDATE serviceDetail SET serviceId='"+0+"', custUserName='"+vehicle.getCustPhone()+"', custName='"+vehicle.getCustName()+"', custPhone='"+vehicle.getCustPhone()+"',  serviceType='"+vehicle.getServiceType()+"', vehicleBrand='"+vehicle.getVehicleBrand()+"', bodyType='"+vehicle.getBodyType()+"', manufYear='"+vehicle.getManufYear()+"', serviceDescription='"+vehicle.getServiceDescription()+"' WHERE custUserName ='"+vehicle.getCustPhone()+"'";
					
					int noOfRows = stmt.executeUpdate(sql);
					
					return noOfRows;
				}catch(Exception e) {
					e.printStackTrace();
				}
				return 0;
			}
			
			public ArrayList<String> showDetails2(vehicleDetailModel vehicle) {
				try {
					String sql = "SELECT * FROM serviceDetail WHERE custUserName='"+vehicle.getCustPhone()+"'"; 
					
					Statement stmt = (Statement) DBConnect.getConnection().createStatement();
					
					ArrayList<String> list = new ArrayList<String>();
					
					ResultSet rs1 = stmt.executeQuery(sql);
					
					if(rs1.next()) {
						list.add(rs1.getString("serviceId"));
						list.add(rs1.getString("custUserName"));
						list.add(rs1.getString("custName"));
						list.add(rs1.getString("custPhone"));
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
			
				public int deleteData(vehicleDetailModel vehicle) {
					try {
						String serviceID = vehicle.getServiceId();
						String username = vehicle.getCustPhone();
						
						
						String sql = "DELETE FROM serviceDetail WHERE  ServiceId = '"+serviceID+"' AND  custUserName = '"+username+"';";
						
						Statement stmt = DBConnect.getConnection().createStatement();
						
						int noOfRows = stmt.executeUpdate(sql);
						
						return noOfRows;
						
					}catch(Exception e) {
						return 0;
					}
				}
		
	}
