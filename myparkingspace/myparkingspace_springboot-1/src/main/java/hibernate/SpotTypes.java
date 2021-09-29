package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name="spot_types")
@Table(name="spot_types")
public class SpotTypes 
{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private int id;
	
	@Column(nullable=false)
	private String type;
	
	@Column(nullable=false)
	private int no_of_spot;
	
	@ManyToOne
	private Vendors vendor;
	
	@OneToMany(mappedBy="spot_type")
	private List<Prices> spot_type_prices;
	
	@OneToMany(mappedBy="spot_type")
	private List<Bookings> bookings;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNo_of_spot() {
		return no_of_spot;
	}

	public void setNo_of_spot(int no_of_spot) {
		this.no_of_spot = no_of_spot;
	}

	public Vendors getVendor() {
		return vendor;
	}

	public void setVendor(Vendors vendor) {
		this.vendor = vendor;
	}

	public List<Prices> getSpot_type_prices() {
		return spot_type_prices;
	}

	public List<Bookings> getBooking() {
		return bookings;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "SpotTypes [id=" + id + ", type=" + type + ", no_of_spot=" + no_of_spot + ", vendor=" + vendor
				+ ", spot_type_prices=" + spot_type_prices + ", bookings=" + bookings + "]";
	}

	public SpotTypesP toPOJO()
	{
		SpotTypesP st = new SpotTypesP();
		st.setId(id);
		st.setNo_of_spot(no_of_spot);
		st.setType(type);
		
		List<BookingsP> bk = new ArrayList();
		for(Bookings booking:bookings)
		{
			bk.add(booking.toPOJO());
		}
		st.setBookings(bk);
		
		List<PricesP> pc = new ArrayList();
		for(Prices price:spot_type_prices)
		{
			pc.add(price.toPOJO());
		}
		st.setSpot_type_prices(pc);
		
		return st;
	}
}
