package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="payments")
@Table(name="payments")
public class Payments 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private double price_booking;
	
	@Column(nullable=false)
	private double penalty;
	
	@Column(nullable=false)
	private double overtime_dues;
	
	@Column(nullable=false)
	private double paid;
	
	@OneToOne
	private Bookings booking;

	public double getPrice_booking() {
		return price_booking;
	}

	public void setPrice_booking(double price_booking) {
		this.price_booking = price_booking;
	}

	public double getPenalty() {
		return penalty;
	}

	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}

	public double getOvertime_dues() {
		return overtime_dues;
	}

	public void setOvertime_dues(double overtime_dues) {
		this.overtime_dues = overtime_dues;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public Bookings getBooking() {
		return booking;
	}

	public void setBooking(Bookings booking) {
		this.booking = booking;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Payments [id=" + id + ", price_booking=" + price_booking + ", penalty=" + penalty + ", overtime_dues="
				+ overtime_dues + ", paid=" + paid + ", booking=" + booking + "]";
	}
	
	public PaymentsP toPOJO()
	{
		PaymentsP p = new PaymentsP();
		p.setId(id);
		p.setOvertime_dues(overtime_dues);
		p.setPaid(paid);
		p.setPenalty(penalty);
		p.setPrice_booking(price_booking);
		return p;
	}
}
