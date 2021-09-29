package hibernate;

import java.util.List;

public class VehiclesP 
{
	private int id;
	
	private String type;
	
	private String registration_no;
	
	private String profile_filepath;
	
	private List<BookingsP> bookings;

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

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getProfile_filepath() {
		return profile_filepath;
	}

	public void setProfile_filepath(String profile_filepath) {
		this.profile_filepath = profile_filepath;
	}

	public List<BookingsP> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingsP> bookings) {
		this.bookings = bookings;
	}
	
	
}
