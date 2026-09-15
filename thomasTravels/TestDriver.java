package com.thomasTravels;

public class TestDriver {
	
	public static void main(String[] args) {
		
		
		//Driver object
		
		Driver[] drivers=new Driver[5];
		
		drivers[0]=new Driver(101,"Fayaz","CAR",5000.0);
		drivers[1]=new Driver(102,"hari","bike",456.0);
		drivers[2]=new Driver(103,"Krishna","Car",5823.0);
		drivers[3]=new Driver(104,"ranjith","auto",5214.0);
		drivers[4]=new Driver(105,"lokesh","lorry",124.0);
		
		//Travel object
		Travel travel=new Travel();
		
		//Travel class methods 
		System.out.println("===========================================");
		//Method one
		System.out.println(travel.isCarDriver(drivers[4]));
		
		System.out.println("===========================================");

		//Method two
		System.out.println(travel.RetrivebyDriverId(drivers,106));
		System.out.println(travel.RetrivebyDriverId(drivers,101));
		System.out.println(travel.RetrivebyDriverId(drivers,103));
		
		
		System.out.println("===========================================");
		//Method three
		
		int bike=travel.RetriveCountOfDriver(drivers,"bike");
		int car=travel.RetriveCountOfDriver(drivers,"car");
		int lorry=travel.RetriveCountOfDriver(drivers,"lorry");
		int auto=travel.RetriveCountOfDriver(drivers,"auto");
		
		System.out.println("the bike count is "+bike);
		System.out.println("the bike count is "+car);
		System.out.println("the bike count is "+lorry);
		System.out.println("the bike count is "+auto);
		
		System.out.println("===========================================");
		
		Driver[] newDrivers= travel.retriveDriver(drivers, "car"); 
		for(Driver newDriver:newDrivers) {
			System.out.println(newDriver);
		}
		
		System.out.println("===========================================");
		System.out.println(travel.RetriveMaximumDistanceTravelledDriver(drivers));
	}

}
