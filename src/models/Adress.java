package models;

import model.enums.City;

public class Adress {
	
	private City city;
	private String streetOrHouseTitle;
	private int	 houseNo;
	
	public Adress() {
		city = City.Ventspils;
		streetOrHouseTitle = "Null";
		houseNo = 0;
	}
	
	public Adress(City city, String streetorhousetitle, int houseno) {
		
		this.city = city;
		streetOrHouseTitle = streetorhousetitle;
		houseNo = houseno;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getStreetOrHouseTitle() {
		return streetOrHouseTitle;
	}

	public void setStreetOrHouseTitle(String streetOrHouseTitle) {
		this.streetOrHouseTitle = streetOrHouseTitle;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", streetOrHouseTitle=" + streetOrHouseTitle + ", houseNo=" + houseNo + "]";
	}
	
	
	
	
}
