package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class BookingsP 
{
	private String vendor_name;
	
	private Address vendor_address;
	
	private int id;
	
	private String type;
	
	private Date date;
	
	private Time start_time;
	
	private Time end_time;
		
	private PaymentsP payment;
	
	private Time time_in;
	
	private Time time_out;
	
	private String vehicle_registration_no;
	
	

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public Address getVendor_address() {
		return vendor_address;
	}

	public void setVendor_address(Address vendor_address) {
		this.vendor_address = vendor_address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public Time getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}

	public PaymentsP getPayment() {
		return payment;
	}

	public void setPayment(PaymentsP payment) {
		this.payment = payment;
	}

	public Time getTime_in() {
		return time_in;
	}

	public void setTime_in(Time time_in) {
		this.time_in = time_in;
	}

	public Time getTime_out() {
		return time_out;
	}

	public void setTime_out(Time time_out) {
		this.time_out = time_out;
	}

	public String getVehicle_registration_no() {
		return vehicle_registration_no;
	}

	public void setVehicle_registration_no(String vehicle_registration_no) {
		this.vehicle_registration_no = vehicle_registration_no;
	}
	
	
	
	
}
