package com.thomasTravels;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
	
		return	driver.getDriverCategory().equalsIgnoreCase("car");
	}
	
	//==============================================================
	
	public String RetrivebyDriverId(Driver[] drivers ,int driverId) {
		
		for(Driver driver :drivers) {
			
			if(driver.getDriverId()==driverId) {
				return "Driver name is <"+driver.getDriverName()+"> Belonging to the category <"+driver.getDriverCategory()+"> traveled <"+driver.getDriverTotalDistance()+"> KM so far. ";
			}
			
		}
		return "driver not found";
	}
	//============================================================
	
	public int RetriveCountOfDriver(Driver[] drivers,String catagory) {
		int count=0;
		for(Driver driver : drivers ) {
			if(driver.getDriverCategory().equalsIgnoreCase(catagory)) {
				count++;
			}
		}
		
		 return count ;
	 }
	//===================================================================
	
	public Driver[] retriveDriver(Driver[] drivers,String catagory) {
		int count=0;
		for(Driver driver:drivers) {
			if(driver.getDriverCategory().equalsIgnoreCase(catagory)) {
				count++;
			}
		}
		
		Driver[] newDrivers=new Driver[count];
		
		int index=0;
		
		for(Driver driver:drivers) {
			
			if(driver.getDriverCategory().equalsIgnoreCase(catagory)) {
				 newDrivers[index]=driver;
				 index++;
			}
			
		}
		
		return newDrivers;
	}
	//===================================================================
	public Driver RetriveMaximumDistanceTravelledDriver(Driver[] driver) {
		
		Driver newDistance=driver[0];
		
		for(Driver distance:driver) {
			if(distance.getDriverTotalDistance()>newDistance.getDriverTotalDistance()) {
				newDistance=distance;
			}
		}
		return newDistance;
	}
	//==================================================================
	
	
	
	
	
	
	
	
	
	
	}
