package hibernate;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity(name="prices")
@Table(name="prices")
public class Prices 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private double time_unit_time;
	
	@Column(nullable=false)
	private String time_unit_unit;
	
	@Column(nullable=false)
	private Time time_slot_start;
	
	@Column(nullable=false)
	private Time time_slot_end;
	
	@ManyToOne
	private SpotTypes spot_type;
	
	@Column(nullable=false)
	private double price;
	
	@Column(nullable=false)
	private final String price_unit = "RS";

	
	
	public String getPrice_unit() {
		return price_unit;
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

	public SpotTypes getSpot_type() {
		return spot_type;
	}

	public void setSpot_type(SpotTypes spot_type) {
		this.spot_type = spot_type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Prices [id=" + id + ", time_unit_time=" + time_unit_time + ", time_unit_unit=" + time_unit_unit
				+ ", time_slot_start=" + time_slot_start + ", time_slot_end=" + time_slot_end + ", spot_type="
				+ spot_type + ", price=" + price + "]";
	}
	
	public PricesP toPOJO()
	{
		PricesP p = new PricesP();
		p.setId(id);
		p.setPrice(price);
		p.setTime_slot_end(time_slot_end);
		p.setTime_slot_start(time_slot_start);
		p.setTime_unit_time(time_unit_time);
		p.setTime_unit_unit(time_unit_unit);
		return p;
	}
}
