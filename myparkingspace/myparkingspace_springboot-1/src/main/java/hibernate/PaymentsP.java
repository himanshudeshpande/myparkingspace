package hibernate;

import javax.persistence.Column;
import javax.persistence.OneToOne;

public class PaymentsP 
{
private int id;
	
	private double price_booking;
	
	private double penalty;
	
	private double overtime_dues;
	
	private double paid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
}
