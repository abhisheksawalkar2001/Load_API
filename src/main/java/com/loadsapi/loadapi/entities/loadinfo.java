package com.loadsapi.loadapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class loadinfo {
	
	@Id
	private long shipperid;
	
	
	private String loadingPoint;
	private String unloadingPoint;
	private String ProductType;
	private String TruckType;
	private String noOfTruck;
	private String weight;
	private String comment;
	private String date;
	
	
	public loadinfo(long shipperid, String loadingPoint, String unloadingPoint, String productType, String truckType,
			String noOfTruck, String weight, String comment, String date) {
		super();
		this.shipperid = shipperid;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.ProductType = productType;
		this.TruckType = truckType;
		this.noOfTruck = noOfTruck;
		this.weight = weight;
		this.comment = comment;
		this.date = date;
	}


	public long getShipperid() {
		return shipperid;
	}


	public void setShipperid(long shipperid) {
		this.shipperid = shipperid;
	}


	public String getLoadingPoint() {
		return loadingPoint;
	}


	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}


	public String getUnloadingPoint() {
		return unloadingPoint;
	}


	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}


	public String getProductType() {
		return ProductType;
	}


	public void setProductType(String productType) {
		ProductType = productType;
	}


	public String getTruckType() {
		return TruckType;
	}


	public void setTruckType(String truckType) {
		TruckType = truckType;
	}


	public String getNoOfTruck() {
		return noOfTruck;
	}


	public void setNoOfTruck(String noOfTruck) {
		this.noOfTruck = noOfTruck;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public loadinfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "loadinfo [shipperid=" + shipperid + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
				+ unloadingPoint + ", ProductType=" + ProductType + ", TruckType=" + TruckType + ", noOfTruck="
				+ noOfTruck + ", weight=" + weight + ", comment=" + comment + ", date=" + date + "]";
	}
	
	
	
}
