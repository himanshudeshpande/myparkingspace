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

@Entity(name="user_vehicles")
@Table(name="user_vehicles")
public class Vehicles
{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(nullable=false)
		private String type;
		
		@Column(nullable=false)
		private String registration_no;
		
		@Column(nullable=false)
		private String profile_filepath;
		
		@ManyToOne
		private Users user;
		
		@OneToMany(mappedBy="vehicle")
		private List<Bookings> bookings;

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

		public Users getUser() {
			return user;
		}

		public void setUser(Users user) {
			this.user = user;
		}

		public List<Bookings> getBookings() {
			return bookings;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Vehicles [id=" + id + ", type=" + type + ", registration_no=" + registration_no
					+ ", profile_filepath=" + profile_filepath + ", user=" + user + ", bookings=" + bookings + "]";
		}

		
		public VehiclesP toPOJO()
		{
			VehiclesP v = new VehiclesP();
			v.setId(id);
			v.setProfile_filepath(profile_filepath);
			v.setRegistration_no(registration_no);
			v.setType(type);
			List<BookingsP> bp = new ArrayList();
			for(Bookings booking:bookings)
			{
				bp.add(booking.toPOJO());
			}
			v.setBookings(bp);
			return v;
		}
		
}