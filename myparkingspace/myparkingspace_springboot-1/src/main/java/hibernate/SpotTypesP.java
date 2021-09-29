package hibernate;

import java.util.List;

public class SpotTypesP 
{
	private int id;
	
	private String type;
	
	private int no_of_spot;
	
	private List<PricesP> spot_type_prices;
	
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

	public int getNo_of_spot() {
		return no_of_spot;
	}

	public void setNo_of_spot(int no_of_spot) {
		this.no_of_spot = no_of_spot;
	}

	public List<PricesP> getSpot_type_prices() {
		return spot_type_prices;
	}

	public void setSpot_type_prices(List<PricesP> spot_type_prices) {
		this.spot_type_prices = spot_type_prices;
	}

	public List<BookingsP> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingsP> bookings) {
		this.bookings = bookings;
	}
	
	
}
