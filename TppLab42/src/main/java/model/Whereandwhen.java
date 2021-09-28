package model;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Entity implementation class for Entity: Whereandwhen
 *
 */
@Entity

@NamedQuery(name = "Whereandwhen.findAll", query = "select w from Whereandwhen w")
public class Whereandwhen implements Serializable {

	   
	public Whereandwhen(String country, String mounth, int day, int year) {
		super();
		Country = country;
		Mounth = mounth;
		Day = day;
		Year = year;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int ID;
	private String Country;
	private String Mounth;
	private int Day;
	private int Year;
	private static final long serialVersionUID = 1L;

	
	@OneToMany(targetEntity = model.Type.class)
	private List<Type> types;
	
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}

	
	@Override
	public String toString() {
		return "Whereandwhen [ID=" + ID + ", Country=" + Country + ", Mounth=" + Mounth + ", Day=" + Day + ", Year="
				+ Year + "]";
	}
	public Whereandwhen() {
		super();
	}   
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}   
	public String getCountry() {
		return this.Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}   
	public String getMounth() {
		return this.Mounth;
	}

	public void setMounth(String Mounth) {
		this.Mounth = Mounth;
	}   
	public int getDay() {
		return this.Day;
	}

	public void setDay(int Day) {
		this.Day = Day;
	}   
	public int getYear() {
		return this.Year;
	}

	public void setYear(int Year) {
		this.Year = Year;
	}
   
}
