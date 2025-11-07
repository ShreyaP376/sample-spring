package com.example.demo.service;

import com.example.demo.entity.Vehicle;

public class VehicleService {
	
 public String addVehicleDB(Vehicle v) {
		return v.getVehicleId()+" added into DB";	}
 
 public Vehicle getVehiclebyID(int id) {
	 Vehicle v = new Vehicle();
	 v.setVehicleId(5482);
	 v.setVehicleNum("640999");
	 v.setModel("SUV");
	 
	 return v;
 }
 
 public String delVehicleDB(int vId) {
	 return " deleted from DB";
 }

}

