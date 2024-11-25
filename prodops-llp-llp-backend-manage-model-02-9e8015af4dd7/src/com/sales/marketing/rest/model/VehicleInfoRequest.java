package com.sales.marketing.rest.model;


public class VehicleInfoRequest {
	
	public final String vin;
	public final String year;
	public final String make;
	public final String model;
	//public final String color;
	public final String style;
	public final Integer leaseYears;
	
	public VehicleInfoRequest(String vin, String year, String make, String model,
			String style, Integer years ) {
		this.vin = vin;
		this.year =year;
		this.leaseYears = years;
		this.make = make;
		this.model = model;
		this.style = style;
	}
	
}
