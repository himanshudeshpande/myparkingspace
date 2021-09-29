package controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernate.*;
import microservices.*;


@SpringBootApplication
public class MyparkingspaceSpringboot1Application 
{
	public static void main(String[] args) 
	{
		CreateSession cs = new CreateSession();
		cs.getSession();
		cs.closeSession();

//		categoryEntries();
//		vendorEntries();
//		userEntry();
//		VehicleEntry();
//		spotTypeEntry();
//		pricesEntry();
//		bookingEntry();
		SpringApplication.run(MyparkingspaceSpringboot1Application.class, args);
	}

	private static void categoryEntries()
	{
		CreateSession cs = new CreateSession();
		DBCategory dbc = new DBCategory();
		List<String> cats = new ArrayList();
		cats.add("Hospital");
		cats.add("Malls");
		cats.add("Bank");
		cats.add("Garden");
		cats.add("Church");
		cats.add("Cinema");
		cats.add("Railway Station");
		cats.add("Hotels");
		cats.add("Post office");
		cats.add("School");
		cats.add("Airport");
		
		for(String cat: cats)
		{
			Categories c = new Categories();
			c.setCategory(cat);
			dbc.createCategory(cs.getSession(), c);
		}
		cs.closeSession();


	}

	private static void vendorEntries()
	{
		CreateSession cs = new CreateSession();
		DBVendor dbv=new DBVendor();
		DBCategory dbc = new DBCategory();
		List<Categories> cats;
		Categories cat_malls = dbc.readCategoryByCategory(cs.getSession(), "Malls");
		Categories cat_hospital= dbc.readCategoryByCategory(cs.getSession(), "Hospital");
		Categories cat_railwayStation = dbc.readCategoryByCategory(cs.getSession(), "Railway Station");
		Categories cat_cinemas = dbc.readCategoryByCategory(cs.getSession(), "Cinemas");
		Categories cat_bank = dbc.readCategoryByCategory(cs.getSession(), "Bank");
		Categories cat_church= dbc.readCategoryByCategory(cs.getSession(), "Church");
		Categories cat_airport = dbc.readCategoryByCategory(cs.getSession(), "Airport");
		Categories cat_garden = dbc.readCategoryByCategory(cs.getSession(), "Garden");
		Categories cat_firestation = dbc.readCategoryByCategory(cs.getSession(), "Firestations");
		Categories cat_school = dbc.readCategoryByCategory(cs.getSession(), "School");
		Categories cat_hotel = dbc.readCategoryByCategory(cs.getSession(), "Hotels");


		Vendors v1=new Vendors();
		Address a1= new Address();
		a1.setAddress("talegaon station");
		a1.setCity("pune");
		a1.setCountry("India");
		a1.setPincode("410507");
		a1.setState("maharashtra");
		v1.setAddress(a1);
		Date dr1=new Date(121,8,18);
		v1.setDate_register(dr1);
		Date ds1=new Date(121,8,18);
		v1.setDate_start(ds1);
		v1.setName("phoenix");
		cats = new ArrayList();//new
		cats.add(cat_malls);//new
		dbv.createVendor(cs.getSession(), v1,cats);


		Vendors v2=new Vendors();
		Address a2= new Address();
		a2.setAddress("Pune Station");
		a2.setCity("pune");
		a2.setCountry("India");
		a2.setPincode("411001");
		a2.setState("maharashtra");

		v2.setAddress(a2);

		Date dr2=new Date(121,8,18);
		v2.setDate_register(dr2);

		Date ds2=new Date(121,8,18);
		v2.setDate_start(ds2);

		v2.setName("new pune mall");
		cats = new ArrayList();
		cats.add(cat_malls);
		dbv.createVendor(cs.getSession(), v2,cats);



		Vendors v3=new Vendors();
		Address a3= new Address();
		a3.setAddress("Shivaji nagar");
		a3.setCity("pune");
		a3.setCountry("India");
		a3.setPincode("411003");
		a3.setState("maharashtra");
		v3.setAddress(a3);
		Date dr3=new Date(121,8,18);
		v3.setDate_register(dr3);
		Date ds3=new Date(121,8,18);
		v3.setDate_start(ds3);
		v3.setName("SGS");
		cats = new ArrayList();
		cats.add(cat_malls);
		dbv.createVendor(cs.getSession(), v3,cats);


		Vendors v4=new Vendors();
		Address a4= new Address();
		a4.setAddress("bhavani peth");
		a4.setCity("pune");
		a4.setCountry("India");
		a4.setPincode("411011");
		a4.setState("maharashtra");
		v4.setAddress(a4);
		Date dr4=new Date(121,8,18);
		v4.setDate_register(dr4);
		Date ds4=new Date(121,8,18);
		v4.setDate_start(ds4);
		v4.setName("Kumar Pacific");
		cats = new ArrayList();
		cats.add(cat_malls);
		dbv.createVendor(cs.getSession(), v4,cats);



		Vendors v5=new Vendors();
		Address a5= new Address();
		a5.setAddress("Hadpsar");
		a5.setCity("pune");
		a5.setCountry("India");
		a5.setPincode("411028");
		a5.setState("maharashtra");
		v5.setAddress(a5);
		Date dr5=new Date(121,8,18);
		v5.setDate_register(dr5);
		Date ds5=new Date(121,8,18);
		v5.setDate_start(ds5);
		v5.setName("Amanora");
		cats = new ArrayList();
		cats.add(cat_malls);
		dbv.createVendor(cs.getSession(), v5,cats);


		Vendors v6=new Vendors();
		Address a6= new Address();
		a6.setAddress("Hadpsar");
		a6.setCity("pune");
		a6.setCountry("India");
		a6.setPincode("411028");
		a6.setState("maharashtra");
		v6.setAddress(a6);
		Date dr6=new Date(121,8,18);
		v6.setDate_register(dr6);
		Date ds6=new Date(121,8,18);
		v6.setDate_start(ds6);
		v6.setName("seasons");
		cats = new ArrayList();
		cats.add(cat_malls);
		dbv.createVendor(cs.getSession(), v6,cats);


		Vendors v7=new Vendors();
		Address a7= new Address();
		a7.setAddress("pune station");
		a7.setCity("pune");
		a7.setCountry("India");
		a7.setPincode("411002");
		a7.setState("maharashtra");
		v7.setAddress(a7);
		Date dr7=new Date(121,8,18);
		v7.setDate_register(dr7);
		Date ds7=new Date(121,8,18);
		v7.setDate_start(ds7);
		v7.setName("pune station");
		cats = new ArrayList();
		cats.add(cat_railwayStation);
		dbv.createVendor(cs.getSession(), v7,cats);


		Vendors v8=new Vendors();
		Address a8= new Address();
		a8.setAddress("pimpri");
		a8.setCity("pune");
		a8.setCountry("India");
		a8.setPincode("411015");
		a8.setState("maharashtra");
		v8.setAddress(a8);
		Date dr8=new Date(121,8,18);
		v8.setDate_register(dr8);
		Date ds8=new Date(121,8,18);
		v8.setDate_start(ds8);
		v8.setName("pimpri station");
		cats = new ArrayList();
		cats.add(cat_railwayStation);
		dbv.createVendor(cs.getSession(), v8,cats);


		Vendors v9=new Vendors();
		Address a9= new Address();
		a9.setAddress("pimpri");
		a9.setCity("pune");
		a9.setCountry("India");
		a9.setPincode("411015");
		a9.setState("maharashtra");
		v9.setAddress(a9);
		Date dr9=new Date(121,8,18);
		v9.setDate_register(dr9);
		Date ds9=new Date(121,8,18);
		v9.setDate_start(ds9);
		v9.setName("vishal E-Square");
		cats = new ArrayList();
		cats.add(cat_cinemas);
		dbv.createVendor(cs.getSession(), v9,cats);


		Vendors v10=new Vendors();
		Address a10= new Address();
		a10.setAddress("akurdi station");
		a10.setCity("pune");
		a10.setCountry("India");
		a10.setPincode("411044");
		a10.setState("maharashtra");
		v10.setAddress(a10);
		Date dr10=new Date(121,8,18);
		v10.setDate_register(dr10);
		Date ds10=new Date(121,8,18);
		v10.setDate_start(ds10);
		v10.setName("akurdi station");
		cats = new ArrayList();
		cats.add(cat_railwayStation);
		dbv.createVendor(cs.getSession(), v10,cats);


		Vendors v11=new Vendors();
		Address a11= new Address();
		a11.setAddress("khadki station");
		a11.setCity("pune");
		a11.setCountry("India");
		a11.setPincode("411016");
		a11.setState("maharashtra");
		v11.setAddress(a11);
		Date dr11=new Date(121,8,18);
		v11.setDate_register(dr11);
		Date ds11=new Date(121,8,18);
		v11.setDate_start(ds11);
		v11.setName("khadki station");
		cats = new ArrayList();
		cats.add(cat_railwayStation);
		dbv.createVendor(cs.getSession(), v11,cats);


		Vendors v12=new Vendors();
		Address a12= new Address();
		a12.setAddress("chinchwad station");
		a12.setCity("pune");
		a12.setCountry("India");
		a12.setPincode("411044");
		a12.setState("maharashtra");
		v12.setAddress(a12);
		Date dr12=new Date(121,8,18);
		v12.setDate_register(dr12);
		Date ds12=new Date(121,8,18);
		v12.setDate_start(ds12);
		v12.setName("chinchwad station");
		cats = new ArrayList();
		cats.add(cat_railwayStation);
		dbv.createVendor(cs.getSession(), v12,cats);


		Vendors v13=new Vendors();
		Address a13= new Address();
		a13.setAddress("kothrud");
		a13.setCity("pune");
		a13.setCountry("India");
		a13.setPincode("411038");
		a13.setState("maharashtra");
		v13.setAddress(a13);
		Date dr13=new Date(121,8,18);
		v13.setDate_register(dr13);
		Date ds13=new Date(121,8,18);
		v13.setDate_start(ds13);
		v13.setName("CityPride Kothrud");
		cats = new ArrayList();
		cats.add(cat_cinemas);
		dbv.createVendor(cs.getSession(), v13,cats);


		Vendors v14=new Vendors();
		Address a14= new Address();
		a14.setAddress("talegaon");
		a14.setCity("pune");
		a14.setCountry("India");
		a14.setPincode("410507");
		a14.setState("maharashtra");
		v14.setAddress(a14);
		Date dr14=new Date(121,8,18);
		v14.setDate_register(dr14);
		Date ds14=new Date(121,8,18);
		v14.setDate_start(ds14);
		v14.setName("Shiwaji takies");
		cats = new ArrayList();
		cats.add(cat_cinemas);
		dbv.createVendor(cs.getSession(), v14,cats);




		Vendors v15=new Vendors();
		Address a15= new Address();
		a15.setAddress("deccan");
		a15.setCity("pune");
		a15.setCountry("India");
		a15.setPincode("411030");
		a15.setState("maharashtra");
		v15.setAddress(a15);
		Date dr15=new Date(121,8,18);
		v15.setDate_register(dr15);
		Date ds15=new Date(121,8,18);
		v15.setDate_start(ds15);
		v15.setName("CityPride Deccan");
		cats = new ArrayList();
		cats.add(cat_cinemas);
		dbv.createVendor(cs.getSession(), v15,cats);



		Vendors v16=new Vendors();
		Address a16= new Address();
		a16.setAddress("talegaon");
		a16.setCity("pune");
		a16.setCountry("India");
		a16.setPincode("410507");
		a16.setState("maharashtra");
		v16.setAddress(a16);
		Date dr16=new Date(121,8,18);
		v16.setDate_register(dr16);
		Date ds16=new Date(121,8,18);
		v16.setDate_start(ds16);
		v16.setName("E-square");
		cats = new ArrayList();
		cats.add(cat_cinemas);
		dbv.createVendor(cs.getSession(), v16,cats);



		Vendors v17=new Vendors();
		Address a17= new Address();
		a17.setAddress("Kothrud");
		a17.setCity("pune");
		a17.setCountry("India");
		a17.setPincode("411038");
		a17.setState("maharashtra");
		v17.setAddress(a17);
		Date dr17=new Date(121,8,18);
		v17.setDate_register(dr17);
		Date ds17=new Date(121,8,18);
		v17.setDate_start(ds17);
		v17.setName("SBI Kothrud");
		cats = new ArrayList();
		cats.add(cat_bank);
		dbv.createVendor(cs.getSession(), v17,cats);



		Vendors v18=new Vendors();
		Address a18= new Address();
		a18.setAddress("deccan");
		a18.setCity("pune");
		a18.setCountry("India");
		a18.setPincode("411030");
		a18.setState("maharashtra");
		v18.setAddress(a18);
		Date dr18=new Date(121,8,17);
		v18.setDate_register(dr18);
		Date ds18=new Date(121,8,17);
		v18.setDate_start(ds18);
		v18.setName("HDFC Deccan");
		cats = new ArrayList();
		cats.add(cat_bank);
		dbv.createVendor(cs.getSession(), v18,cats);



		Vendors v19=new Vendors();
		Address a19= new Address();
		a19.setAddress("swargate");
		a19.setCity("pune");
		a19.setCountry("India");
		a19.setPincode("411009");
		a19.setState("maharashtra");
		v19.setAddress(a19);
		Date dr19=new Date(121,8,17);
		v19.setDate_register(dr19);
		Date ds19=new Date(121,8,17);
		v19.setDate_start(ds19);
		v19.setName("ICICI Swargate");
		cats = new ArrayList();
		cats.add(cat_bank);
		dbv.createVendor(cs.getSession(), v19,cats);



		Vendors v20=new Vendors();
		Address a20= new Address();
		a20.setAddress("katraj");
		a20.setCity("pune");
		a20.setCountry("India");
		a20.setPincode("411030");
		a20.setState("maharashtra");
		v20.setAddress(a20);
		Date dr20=new Date(121,8,17);
		v20.setDate_register(dr20);
		Date ds20=new Date(121,8,17);
		v20.setDate_start(ds20);
		v20.setName("IDBI katraj");
		cats = new ArrayList();
		cats.add(cat_bank);
		dbv.createVendor(cs.getSession(), v20,cats);



		Vendors v21=new Vendors();
		Address a21= new Address();
		a21.setAddress("camp pune");
		a21.setCity("pune");
		a21.setCountry("India");
		a21.setPincode("411003");
		a21.setState("maharashtra");
		v21.setAddress(a21);
		Date dr21=new Date(121,8,17);
		v21.setDate_register(dr21);
		Date ds21=new Date(121,8,17);
		v21.setDate_start(ds21);
		v21.setName("BOI camp pune");
		cats = new ArrayList();
		cats.add(cat_bank);
		dbv.createVendor(cs.getSession(), v21,cats);



		Vendors v22=new Vendors();
		Address a22= new Address();
		a22.setAddress("wakad centre");
		a22.setCity("pune");
		a22.setCountry("India");
		a22.setPincode("411057");
		a22.setState("maharashtra");
		v22.setAddress(a22);
		Date dr22=new Date(121,8,17);
		v22.setDate_register(dr22);
		Date ds22=new Date(121,8,17);
		v22.setDate_start(ds22);
		v22.setName("Birla hospital");
		cats = new ArrayList();
		cats.add(cat_hospital);
		dbv.createVendor(cs.getSession(), v22,cats);



		Vendors v23=new Vendors();
		Address a23= new Address();
		a23.setAddress("shiwaji nagar");
		a23.setCity("pune");
		a23.setCountry("India");
		a23.setPincode("411003");
		a23.setState("maharashtra");
		v23.setAddress(a23);
		Date dr23=new Date(121,8,17);
		v23.setDate_register(dr23);
		Date ds23=new Date(121,8,17);
		v23.setDate_start(ds23);
		v23.setName("Sasoon");
		cats = new ArrayList();
		cats.add(cat_hospital);
		dbv.createVendor(cs.getSession(), v23,cats);


		Vendors v24=new Vendors();
		Address a24= new Address();
		a24.setAddress("baner");
		a24.setCity("pune");
		a24.setCountry("India");
		a24.setPincode("411045");
		a24.setState("maharashtra");
		v24.setAddress(a24);
		Date dr24=new Date(121,8,17);
		v24.setDate_register(dr24);
		Date ds24=new Date(121,8,17);
		v24.setDate_start(ds24);
		v24.setName("jupiter hospital");
		cats = new ArrayList();
		cats.add(cat_hospital);
		dbv.createVendor(cs.getSession(), v24,cats);



		Vendors v25=new Vendors();
		Address a25= new Address();
		a25.setAddress("deccan");
		a25.setCity("pune");
		a25.setCountry("India");
		a25.setPincode("411030");
		a25.setState("maharashtra");
		v25.setAddress(a25);
		Date dr25=new Date(121,8,17);
		v25.setDate_register(dr25);
		Date ds25=new Date(121,8,17);
		v25.setDate_start(ds25);
		v25.setName("poona hospital");
		cats = new ArrayList();
		cats.add(cat_hospital);
		dbv.createVendor(cs.getSession(), v25,cats);



		Vendors v26=new Vendors();
		Address a26= new Address();
		a26.setAddress("talegaon");
		a26.setCity("pune");
		a26.setCountry("India");
		a26.setPincode("410507");
		a26.setState("maharashtra");
		v26.setAddress(a26);
		Date dr26=new Date(121,8,17);
		v26.setDate_register(dr26);
		Date ds26=new Date(121,8,17);
		v26.setDate_start(ds26);
		v26.setName("Mauli hospital");
		cats = new ArrayList();
		cats.add(cat_hospital);
		dbv.createVendor(cs.getSession(), v26,cats);



		Vendors v27=new Vendors();
		Address a27= new Address();
		a27.setAddress("camp pune");
		a27.setCity("pune");
		a27.setCountry("India");
		a27.setPincode("411003");
		a27.setState("maharashtra");
		v27.setAddress(a27);
		Date dr27=new Date(121,8,17);
		v27.setDate_register(dr27);
		Date ds27=new Date(121,8,17);
		v27.setDate_start(ds27);
		v27.setName("St. Xavier's Church Camp");
		cats = new ArrayList();
		cats.add(cat_church);
		dbv.createVendor(cs.getSession(), v27,cats);



		Vendors v28=new Vendors();
		Address a28= new Address();
		a28.setAddress("cantonement pune");
		a28.setCity("pune");
		a28.setCountry("India");
		a28.setPincode("411028");
		a28.setState("maharashtra");
		v28.setAddress(a28);
		Date dr28=new Date(121,8,17);
		v28.setDate_register(dr28);
		Date ds28=new Date(121,8,17);
		v28.setDate_start(ds28);
		v28.setName("Lord Christ church Empress Garden");
		cats = new ArrayList();
		cats.add(cat_church);
		dbv.createVendor(cs.getSession(), v28,cats);



		Vendors v29=new Vendors();
		Address a29= new Address();
		a29.setAddress("aundh");
		a29.setCity("pune");
		a29.setCountry("India");
		a29.setPincode("411007");
		a29.setState("maharashtra");
		v29.setAddress(a29);
		Date dr29=new Date(121,8,17);
		v29.setDate_register(dr29);
		Date ds29=new Date(121,8,17);
		v29.setDate_start(ds29);
		v29.setName("St Peters Church Aundh");
		cats = new ArrayList();
		cats.add(cat_church);
		dbv.createVendor(cs.getSession(), v29,cats);



		Vendors v30=new Vendors();
		Address a30= new Address();
		a30.setAddress("camp pune");
		a30.setCity("pune");
		a30.setCountry("India");
		a30.setPincode("411002");
		a30.setState("maharashtra");
		v30.setAddress(a30);
		Date dr30=new Date(121,8,17);
		v30.setDate_register(dr30);
		Date ds30=new Date(121,8,17);
		v30.setDate_start(ds30);
		v30.setName("St Anne's Church Camp");
		cats = new ArrayList();
		cats.add(cat_church);
		dbv.createVendor(cs.getSession(), v30,cats);



		Vendors v31=new Vendors();
		Address a31= new Address();
		a31.setAddress("kalyaninagar");
		a31.setCity("pune");
		a31.setCountry("India");
		a31.setPincode("411041");
		a31.setState("maharashtra");
		v31.setAddress(a31);
		Date dr31=new Date(121,8,17);
		v31.setDate_register(dr31);
		Date ds31=new Date(121,8,17);
		v31.setDate_start(ds31);
		v31.setName("King edward Church Kalyaninagar");
		cats = new ArrayList();
		cats.add(cat_church);
		dbv.createVendor(cs.getSession(), v31,cats);




		Vendors v32=new Vendors();
		Address a32= new Address();
		a32.setAddress("viman nagar");
		a32.setCity("pune");
		a32.setCountry("India");
		a32.setPincode("411014");
		a32.setState("maharashtra");
		v32.setAddress(a32);
		Date dr32=new Date(121,8,17);
		v32.setDate_register(dr32);
		Date ds32=new Date(121,8,17);
		v32.setDate_start(ds32);
		v32.setName("pune airport");
		cats = new ArrayList();
		cats.add(cat_airport);
		dbv.createVendor(cs.getSession(), v32,cats);



		Vendors v33=new Vendors();
		Address a33= new Address();
		a33.setAddress("Saswad");
		a33.setCity("pune");
		a33.setCountry("India");
		a33.setPincode("411021");
		a33.setState("maharashtra");
		v33.setAddress(a33);
		Date dr33=new Date(121,8,17);
		v33.setDate_register(dr33);
		Date ds33=new Date(121,8,17);
		v33.setDate_start(ds33);
		v33.setName("saswad airport");
		dbv.createVendor(cs.getSession(), v33,cats);


		Vendors v34=new Vendors();
		Address a34= new Address();
		a34.setAddress("Swargate");
		a34.setCity("pune");
		a34.setCountry("India");
		a34.setPincode("411042");
		a34.setState("maharashtra");
		v34.setAddress(a34);
		Date dr34=new Date(121,8,17);
		v34.setDate_register(dr34);
		Date ds34=new Date(121,8,17);
		v34.setDate_start(ds34);
		v34.setName("saras bag");
		cats = new ArrayList();
		cats.add(cat_garden);
		dbv.createVendor(cs.getSession(), v34,cats);



		Vendors v35=new Vendors();
		Address a35= new Address();
		a35.setAddress("Singhgad road");
		a35.setCity("pune");
		a35.setCountry("India");
		a35.setPincode("411024");
		a35.setState("maharashtra");
		v35.setAddress(a35);
		Date dr35=new Date(121,8,17);
		v35.setDate_register(dr35);
		Date ds35=new Date(121,8,17);
		v35.setDate_start(ds35);
		v35.setName("pul deshpande garden");
		cats = new ArrayList();
		cats.add(cat_garden);
		dbv.createVendor(cs.getSession(), v35,cats);


		Vendors v36=new Vendors();
		Address a36= new Address();
		a36.setAddress("J.M road");
		a36.setCity("pune");
		a36.setCountry("India");
		a36.setPincode("411005");
		a36.setState("maharashtra");
		v36.setAddress(a36);
		Date dr36=new Date(121,8,17);
		v36.setDate_register(dr36);
		Date ds36=new Date(121,8,17);
		v36.setDate_start(ds36);
		v36.setName("sambhaji garden");
		cats = new ArrayList();
		cats.add(cat_garden);
		dbv.createVendor(cs.getSession(), v36,cats);


		Vendors v37=new Vendors();
		Address a37= new Address();
		a37.setAddress("hadpsar");
		a37.setCity("pune");
		a37.setCountry("India");
		a37.setPincode("411013");
		a37.setState("maharashtra");
		v37.setAddress(a37);
		Date dr37=new Date(121,8,17);
		v37.setDate_register(dr37);
		Date ds37=new Date(121,8,17);
		v37.setDate_start(ds37);
		v37.setName("Empress garden");
		cats = new ArrayList();
		cats.add(cat_garden);
		dbv.createVendor(cs.getSession(), v37,cats);


		Vendors v38=new Vendors();
		Address a38= new Address();
		a38.setAddress("prabhat road");
		a38.setCity("pune");
		a38.setCountry("India");
		a38.setPincode("411004");
		a38.setState("maharashtra");
		v38.setAddress(a38);
		Date dr38=new Date(121,8,17);
		v38.setDate_register(dr38);
		Date ds38=new Date(121,8,17);
		v38.setDate_start(ds38);
		v38.setName("kamala nehru garden");
		cats = new ArrayList();
		cats.add(cat_garden);
		dbv.createVendor(cs.getSession(), v38,cats);


		Vendors v39=new Vendors();
		Address a39= new Address();
		a39.setAddress("nal stop");
		a39.setCity("pune");
		a39.setCountry("India");
		a39.setPincode("411004");
		a39.setState("maharashtra");
		v39.setAddress(a39);
		Date dr39=new Date(121,8,17);
		v39.setDate_register(dr39);
		Date ds39=new Date(121,8,17);
		v39.setDate_start(ds39);
		v39.setName("PMC fireStation nal stop");
		cats = new ArrayList();
		cats.add(cat_firestation);
		dbv.createVendor(cs.getSession(), v39,cats);


		Vendors v41=new Vendors();
		Address a41= new Address();
		a41.setAddress("ghole road");
		a41.setCity("pune");
		a41.setCountry("India");
		a41.setPincode("411003");
		a41.setState("maharashtra");
		v41.setAddress(a41);
		Date dr41=new Date(121,8,17);
		v41.setDate_register(dr41);
		Date ds41=new Date(121,8,17);
		v41.setDate_start(ds41);
		v41.setName("PMC fireStation Ghole road");
		cats = new ArrayList();
		cats.add(cat_firestation);
		dbv.createVendor(cs.getSession(), v41,cats);


		Vendors v40=new Vendors();
		Address a40= new Address();
		a40.setAddress("shiwahi chowk talegaon");
		a40.setCity("pune");
		a40.setCountry("India");
		a40.setPincode("410507");
		a40.setState("maharashtra");
		v40.setAddress(a40);
		Date dr40=new Date(121,8,17);
		v40.setDate_register(dr40);
		Date ds40=new Date(121,8,17);
		v40.setDate_start(ds40);
		v40.setName("india fire station");
		cats = new ArrayList();
		cats.add(cat_firestation);
		dbv.createVendor(cs.getSession(), v40,cats);


		Vendors v42=new Vendors();
		Address a42= new Address();
		a42.setAddress("Undri");
		a42.setCity("pune");
		a42.setCountry("India");
		a42.setPincode("411060");
		a42.setState("maharashtra");
		v42.setAddress(a42);
		Date dr42=new Date(121,8,17);
		v42.setDate_register(dr42);
		Date ds42=new Date(121,8,17);
		v42.setDate_start(ds42);
		v42.setName("Orchids The International School");
		cats = new ArrayList();
		cats.add(cat_school);
		dbv.createVendor(cs.getSession(), v42,cats);


		Vendors v43=new Vendors();
		Address a43= new Address();
		a43.setAddress("Pimpri-Chinchwad");
		a43.setCity("pune");
		a43.setCountry("India");
		a43.setPincode("411057");
		a43.setState("maharashtra");
		v43.setAddress(a43);
		Date dr43=new Date(121,8,17);
		v43.setDate_register(dr43);
		Date ds43=new Date(121,8,17);
		v43.setDate_start(ds43);
		v43.setName("Vidya Valley World School, Wakad CBSE");
		cats = new ArrayList();
		cats.add(cat_school);
		dbv.createVendor(cs.getSession(), v43,cats);


		Vendors v44=new Vendors();
		Address a44= new Address();
		a44.setAddress("Pimple Saudagar");
		a44.setCity("pune");
		a44.setCountry("India");
		a44.setPincode("411017");
		a44.setState("maharashtra");
		v44.setAddress(a44);
		Date dr44=new Date(121,8,17);
		v44.setDate_register(dr44);
		Date ds44=new Date(121,8,17);
		v44.setDate_start(ds44);
		v44.setName("SNBP International School");
		cats = new ArrayList();
		cats.add(cat_school);
		dbv.createVendor(cs.getSession(), v44,cats);


		Vendors v45=new Vendors();
		Address a45= new Address();
		a45.setAddress("St Vincent St, Camp");
		a45.setCity("pune");
		a45.setCountry("India");
		a45.setPincode("411001");
		a45.setState("maharashtra");
		v45.setAddress(a45);
		Date dr45=new Date(121,8,17);
		v45.setDate_register(dr45);
		Date ds45=new Date(121,8,17);
		v45.setDate_start(ds45);
		v45.setName("St. Vincent's High School");
		cats = new ArrayList();
		cats.add(cat_school);
		dbv.createVendor(cs.getSession(), v45,cats);


		Vendors v46=new Vendors();
		Address a46= new Address();
		a46.setAddress("5-A, General Bhagat Marg, Camp");
		a46.setCity("pune");
		a46.setCountry("India");
		a46.setPincode("411001");
		a46.setState("maharashtra");
		v46.setAddress(a46);
		Date dr46=new Date(121,8,17);
		v46.setDate_register(dr46);
		Date ds46=new Date(121,8,17);
		v46.setDate_start(ds46);
		v46.setName("The Bishop's School");
		cats = new ArrayList();
		cats.add(cat_school);
		dbv.createVendor(cs.getSession(), v46,cats);


		Vendors v47=new Vendors();
		Address a47= new Address();
		a47.setAddress("Kausarbaug, Kondhwa Khurd");
		a47.setCity("pune");
		a47.setCountry("India");
		a47.setPincode("411048");
		a47.setState("maharashtra");
		v47.setAddress(a47);
		Date dr47=new Date(121,8,17);
		v47.setDate_register(dr47);
		Date ds47=new Date(121,8,17);
		v47.setDate_start(ds47);
		v47.setName("TAHARI HOUSE");
		cats = new ArrayList();
		cats.add(cat_hotel);
		dbv.createVendor(cs.getSession(), v47,cats);


		Vendors v48=new Vendors();
		Address a48= new Address();
		a48.setAddress("Vishal Nagar");
		a48.setCity("pune");
		a48.setCountry("India");
		a48.setPincode("411027");
		a48.setState("maharashtra");
		v48.setAddress(a48);
		Date dr48=new Date(121,8,17);
		v48.setDate_register(dr48);
		Date ds48=new Date(121,8,17);
		v48.setDate_start(ds48);
		v48.setName("CopaCabana");
		cats = new ArrayList();
		cats.add(cat_hotel);
		dbv.createVendor(cs.getSession(), v48,cats);


		Vendors v49=new Vendors();
		Address a49= new Address();
		a49.setAddress("Pimpri-Chinchwad");
		a49.setCity("pune");
		a49.setCountry("India");
		a49.setPincode("411057");
		a49.setState("maharashtra");
		v49.setAddress(a49);
		Date dr49=new Date(121,8,17);
		v49.setDate_register(dr49);
		Date ds49=new Date(121,8,17);
		v49.setDate_start(ds49);
		v49.setName("Pakwan Food Tradition Veg Restaurant");
		cats = new ArrayList();
		cats.add(cat_hotel);
		dbv.createVendor(cs.getSession(), v49,cats);


		Vendors v50=new Vendors();
		Address a50= new Address();
		a50.setAddress("Shivajinagar");
		a50.setCity("pune");
		a50.setCountry("India");
		a50.setPincode("411005");
		a50.setState("maharashtra");
		v50.setAddress(a50);
		Date dr50=new Date(121,8,17);
		v50.setDate_register(dr50);
		Date ds50=new Date(121,8,17);
		v50.setDate_start(ds50);
		v50.setName("Little Italy Restaurant");
		cats = new ArrayList();
		cats.add(cat_hotel);
		dbv.createVendor(cs.getSession(), v50,cats);	

		cs.closeSession();
	}

	private static void userEntry()
	{
		CreateSession cs = new CreateSession();

		DBUser dbu=new DBUser();
		
		List<String> first_names = new ArrayList();
		List<String> last_names = new ArrayList();
		
		first_names.add("Himanshu");last_names.add("Deshpande");
		first_names.add("Sahil");last_names.add("Kshirsagar");
		first_names.add("Aishwarya");last_names.add("Pawar");
		first_names.add("Prerna");last_names.add("Mohite");
		first_names.add("Amit");last_names.add("Khendake");
		first_names.add("Rutuja");last_names.add("Patil");
		first_names.add("Akshay");last_names.add("Ringe");
		first_names.add("Aaditya");last_names.add("Kulkarni");
		first_names.add("Rina");last_names.add("Borchate");
		first_names.add("Aniket");last_names.add("Korde");
		first_names.add("Vaishnavi");last_names.add("Thorat");
		first_names.add("Dipak");last_names.add("Mani");
		first_names.add("Shraddha");last_names.add("Sabne");
		first_names.add("Kalpesh");last_names.add("Desle");
		first_names.add("Kiran");last_names.add("Kittur");
		first_names.add("Pranav");last_names.add("Kolhe");
		first_names.add("Shantanu");last_names.add("Dedhe");
		first_names.add("Rushikesh");last_names.add("Vaijapurkar");
		first_names.add("Manasi");last_names.add("Sarnaik");
		first_names.add("Apoorva");last_names.add("Adhikari");
		first_names.add("Sudhir");last_names.add("Phadke");
		
		long mob = 7777777777L;
		for(String last:last_names)
		{
			for(String first:first_names)
			{
				Name n1=new Name();
				n1.setFirst_name(first);
				n1.setLast_name(last);
				
				Users u1=new Users();
				u1.setEmail(first+"."+last+"@gmail.com");
				u1.setMobile(mob++);
				u1.setName(n1);
				u1.setPassword(last+"@"+first);
				
				dbu.createUser(cs.getSession(), u1);
			}
		}
		cs.closeSession();
	}

	private static void VehicleEntry()
	{
		CreateSession cs = new CreateSession();

		DBVehicle dbv=new DBVehicle();
		DBUser dbu=new DBUser();
		List<Users> users = dbu.getAllUsers(cs.getSession());
		int num = 1000;
		for(Users user: users)
		{
			for(int i=0;i<20;i++)
			{
				Vehicles v1=new Vehicles();
				v1.setProfile_filepath("");
				v1.setRegistration_no("MH 12 AA "+num++);
				if(i%2==0)
					v1.setType("bike");
				else
					v1.setType("car");
				v1.setUser(user);
				dbv.createVehicle(cs.getSession(), v1, user);
			}
		}

		cs.closeSession();
	}

	private static void spotTypeEntry()
	{

		CreateSession cs = new CreateSession();

		DBSpotType dbs=new DBSpotType();

		DBVendor dbv=new DBVendor();

		List<Vendors> vendors=dbv.readAllVendors(cs.getSession());

		for(Vendors vendor:vendors)
		{
			SpotTypes st=new SpotTypes();
			st.setType("bike");
			st.setNo_of_spot(100);
			st.setVendor(vendor);

			dbs.createSpotType(cs.getSession(), st, vendor);

			st=new SpotTypes();
			st.setType("car");
			st.setNo_of_spot(80);
			st.setVendor(vendor);

			dbs.createSpotType(cs.getSession(), st, vendor);

		}	
		cs.closeSession();
	}

	private static void pricesEntry()
	{
		CreateSession cs = new CreateSession();

		DBSpotType dbs=new DBSpotType();

		DBPrices dbp=new DBPrices();

		List<SpotTypes> spots=dbs.readAllSpotTypes(cs.getSession());
		List<Time> zones = new ArrayList();
		List<Double> prices2 = new ArrayList();
		List<Double> prices4 = new ArrayList();
		zones.add(new Time(6, 0, 0));prices2.add(new Double(10));prices4.add(new Double(20));
		zones.add(new Time(10, 0, 0));prices2.add(new Double(15));prices4.add(new Double(30));
		zones.add(new Time(14, 0, 0));prices2.add(new Double(10));prices4.add(new Double(20));
		zones.add(new Time(18, 0, 0));prices2.add(new Double(20));prices4.add(new Double(40));
		zones.add(new Time(22, 0, 0));
		
		
		for(SpotTypes spot:spots)
		{
			for(int i=0;i<4;i++)
			{
				Prices p = new Prices();
				if(spot.getType().equals("bike"))
					p.setPrice(prices2.get(i));
				else
					p.setPrice(prices4.get(i));
				p.setTime_unit_time(1);
				p.setTime_unit_unit("HR");
				p.setSpot_type(spot);
				p.setTime_slot_start(zones.get(i));
				p.setTime_slot_end(zones.get(i+1));
				dbp.createPrices(cs.getSession(), p, spot);
			}
		}	
		cs.closeSession();
	}
	
	private static void bookingEntry()
	{
		CreateSession cs = new CreateSession();
		
		DBVehicle dbv = new DBVehicle();
		List<Vehicles> vehicles = dbv.readAllVehicle(cs.getSession());
		
		DBSpotType dbst = new DBSpotType();
		List<SpotTypes> spots = dbst.readAllSpotTypes(cs.getSession());
		
		DBBookings dbb = new DBBookings();
		DBPayments dbp = new DBPayments();
		
		for(int i=1;i<20;i++)
		{
			for(SpotTypes spot:spots)
			{
				for(Prices price:spot.getSpot_type_prices())
				{
					if(spot.getType().equals("bike"))
					{
						for(int j=0,k=0;k<100;j++)
						{
							if(vehicles.get(j).getType().equals("bike"))
							{
								Bookings booking = new Bookings();
								Payments payment = new Payments();
								
								booking.setDate(new Date(121,8,i));
								booking.setStart_time(price.getTime_slot_start());
								booking.setTime_in(price.getTime_slot_start());
								booking.setEnd_time(price.getTime_slot_end());
								booking.setTime_out(price.getTime_slot_end());
								booking.setType("past");
								dbb.createBooking(cs.getSession(), booking, spot, vehicles.get(j), null);
								
								
								payment.setOvertime_dues(0);
								payment.setPaid(price.getPrice()*4);
								payment.setPenalty(0);
								payment.setPrice_booking(price.getPrice()*4);
								dbp.createPayment(cs.getSession(), booking, payment);
								
								booking.setPayment(payment);
								dbb.updateBooking(cs.getSession(), booking);
								
								k++;
							}
						}
					}
					else
					{
						for(int j=0,k=0;k<80;j++)
						{
							if(vehicles.get(j).getType().equals("car"))
							{
								Bookings booking = new Bookings();
								Payments payment = new Payments();
								
								booking.setDate(new Date(121,8,i));
								booking.setStart_time(price.getTime_slot_start());
								booking.setTime_in(price.getTime_slot_start());
								booking.setEnd_time(price.getTime_slot_end());
								booking.setTime_out(price.getTime_slot_end());
								booking.setType("past");
								dbb.createBooking(cs.getSession(), booking, spot, vehicles.get(j), null);
								
								
								payment.setOvertime_dues(0);
								payment.setPaid(price.getPrice()*4);
								payment.setPenalty(0);
								payment.setPrice_booking(price.getPrice()*4);
								dbp.createPayment(cs.getSession(), booking, payment);
								
								booking.setPayment(payment);
								dbb.updateBooking(cs.getSession(), booking);
								
								k++;
							}
						}
					}
				}
			}
		}
		
		cs.closeSession();
	}

}
