package hibernate;

import java.sql.Time;

public class PricesP 
{
	private int id;
	
	private double time_unit_time;
	
	private String time_unit_unit;
	
	private Time time_slot_start;
	
	private Time time_slot_end;
	
	private double price;
	
	private final String price_unit = "RS";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTime_unit_time() {
		return time_unit_time;
	}

	public void setTime_unit_time(double time_unit_time) {
		this.time_unit_time = time_unit_time;
	}

	public String getTime_unit_unit() {
		return time_unit_unit;
	}

	public void setTime_unit_unit(String time_unit_unit) {
		this.time_unit_unit = time_unit_unit;
	}

	public Time getTime_slot_start() {
		return time_slot_start;
	}

	public void setTime_slot_start(Time time_slot_start) {
		this.time_slot_start = time_slot_start;
	}

	public Time getTime_slot_end() {
		return time_slot_end;
	}

	public void setTime_slot_end(Time time_slot_end) {
		this.time_slot_end = time_slot_end;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPrice_unit() {
		return price_unit;
	}
	
	
}
