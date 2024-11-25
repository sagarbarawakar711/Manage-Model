package com.sales.marketing.rest.model;

import java.util.List;

public class VehicleInfoResponse {
	
	public final String vin;
	public final String year;
	public final String make;
	public final String model;
	public final String style;
	public final Integer leaseYears;	
	public final Integer averageOdometer;
	public final Price wholeSalePrice;
	public final List<Price> AdjustedPricing;
	
	public VehicleInfoResponse(String vin, String year, String make, String model,
			String style, Integer years, Integer averageOdometer, Price wholeSale, List<Price> adjPriceList ) {
		this.vin = vin;
		this.year =year;
		this.leaseYears = years;
		this.make = make;
		this.model = model;
		this.style = style;
		this.AdjustedPricing = adjPriceList;
		this.wholeSalePrice = wholeSale;
		this.averageOdometer= averageOdometer;
	}
	
	public static class Price {
		public final Integer average;
		public final Integer above;
		public final Integer below;
		
		public Price(Integer avg, Integer below, Integer above) {
			this.above = above;
			this.average = avg;
			this.below = below;
		}
		
	}
	
}
