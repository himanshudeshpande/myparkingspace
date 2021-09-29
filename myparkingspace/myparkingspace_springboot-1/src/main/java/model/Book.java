package model;

import java.util.Calendar;

public class Book 
{
	private Calendar begin_time;
	private Calendar end_time;
	private int vehicle_id;
	private int spot_type_id;
	
	

	public Calendar getBegin_time() {
		return begin_time;
	}



	public void setBegin_time(Calendar begin_time) {
		this.begin_time = begin_time;
	}



	public Calendar getEnd_time() {
		return end_time;
	}



	public void setEnd_time(Calendar end_time) {
		this.end_time = end_time;
	}



	public int getVehicle_id() {
		return vehicle_id;
	}



	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}



	public int getSpot_type_id() {
		return spot_type_id;
	}



	public void setSpot_type_id(int spot_type_id) {
		this.spot_type_id = spot_type_id;
	}



	@Override
	public String toString() {
		return "Book [begin_time=" + begin_time + ", end_time=" + end_time + "]";
	}
	
	
}
