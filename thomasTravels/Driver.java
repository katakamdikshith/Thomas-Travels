package com.thomasTravels;

public class Driver {
	
	
	private int driverId;
	private String driverName;
	private String driverCategory;
	private double driverTotalDistance;
	
	public Driver() {
		
	}
	
	public Driver(int driverId,String driverName,String driverCategory,double driverTotalDistance) {
		
		this.driverId=driverId;
		this.driverName=driverName;
		this.driverCategory=driverCategory;
		this.driverTotalDistance=driverTotalDistance;
		
	}
	
	public int getDriverId() {
		return this.driverId;
	}
	
	public String getDriverName() {
		return this.driverName;
	}
	
	public String getDriverCategory() {
		return this.driverCategory;
	}
	
	public double getDriverTotalDistance() {
		return this.driverTotalDistance;
	}
	
	public void setDriverId(int driverId) {
		this.driverId=driverId;
	}
	
	public void setDriverName(String driverName) {
		this.driverName=driverName;;
	}
	
	public void setDriverCategory(String driverCategory) {
		this.driverCategory=driverCategory;
	}
	
	public void setDriverTotalDistance(double driverTotalDistance) {
		this.driverTotalDistance=driverTotalDistance;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverCategory=" + driverCategory
				+ ", driverTotalDistance=" + driverTotalDistance + "]";
	}
	
	

}
