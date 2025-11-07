package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
public class VehicleController {
	VehicleService vs = new VehicleService();
	
	@PostMapping("addVehicle")
	String addVehicle(@RequestBody Vehicle v) {
		return vs.addVehicleDB(v);
	}
	
	@GetMapping("getVehicle")
	Vehicle getVehicle() {
		return vs.getVehiclebyID(12);
	}
	
	@DeleteMapping("deleteVehicle/{vehicleId}")
	String deleteVehicle(@PathVariable int vehicleId) {
		return vs.delVehicleDB(vehicleId);
	}

}
