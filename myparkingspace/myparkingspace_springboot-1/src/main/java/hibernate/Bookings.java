package hibernate;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="bookings")
@Table(name="bookings")
public class Bookings 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String type;
	
	@Column(nullable=false)
	private Date date;
	
	@Column(nullable=false)
	private Time start_time;
	
	@Column(nullable=false)
	private Time end_time;
	
	@ManyToOne
	private Vehicles vehicle;
	
	@OneToOne
	private Payments payment;
	
	@Column(nullable=false)
	private Time time_in;
	
	@Column(nullable=false)
	private Time time_out;
	
	@ManyToOne
	private SpotTypes spot_type;

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

	public Vehicles getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicles vehicle) {
		this.vehicle = vehicle;
	}

	public Payments getPayment() {
		return payment;
	}

	public void setPayment(Payments payment) {
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

	public SpotTypes getSpot_types() {
		return spot_type;
	}

	public void setSpot_types(SpotTypes spot_type) {
		this.spot_type = spot_type;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Bookings [id=" + id + ", type=" + type + ", date=" + date + ", start_time=" + start_time + ", end_time="
				+ end_time + ", vehicle=" + vehicle + ", payment=" + payment + ", time_in=" + time_in + ", time_out="
				+ time_out + ", spot_type=" + spot_type + "]";
	}

	public BookingsP toPOJO()
	{
		BookingsP b = new BookingsP();
		b.setDate(date);
		b.setEnd_time(end_time);
		b.setId(id);
		if(payment!=null)
			b.setPayment(payment.toPOJO());
		b.setStart_time(start_time);
		b.setTime_in(time_in);
		b.setTime_out(time_out);
		b.setType(type);
		b.setVendor_address(spot_type.getVendor().getAddress());
		b.setVendor_name(spot_type.getVendor().getName());
		b.setVehicle_registration_no(vehicle.getRegistration_no());
		return b;
	}
}
