package com.example.demo.entity;

import java.time.LocalDate;

public class Vehicle {

	private int vehicleId;
	private String ownerName;
	private String vehicleNum;
	private String model;
	private LocalDate lastServiceDate;
	private LocalDate nextServiceDue;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getVehicleNum() {
		return vehicleNum;
	}
	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public LocalDate getLastServiceDate() {
		return lastServiceDate;
	}
	public void setLastServiceDate(LocalDate lastServiceDate) {
		this.lastServiceDate = lastServiceDate;
	}
	public LocalDate getNextServiceDue() {
		return nextServiceDue;
	}
	public void setNextServiceDue(LocalDate nextServiceDue) {
		this.nextServiceDue = nextServiceDue;
	}
	
}
