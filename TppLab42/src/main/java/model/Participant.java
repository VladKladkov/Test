package model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import model.Type;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.CascadeType.REMOVE;

/**
 * Entity implementation class for Entity: Participant
 *
 */
@Entity

@NamedQuery(name = "Participant.findAll", query = "select p from Participant p")
public class Participant implements Serializable {

	   
	@Override
	public String toString() {
		return "Participant [ID=" + ID + ", Team=" + Team + ", Name=" + Name + ", Surname=" + Surname + ", Age=" + Age
				+ ", Type=" + Type + "]";
	}
	public Participant(String team, String name, String surname, int age, model.Type type) {
		super();
		Team = team;
		Name = name;
		Surname = surname;
		Age = age;
		Type = type;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int ID;
	private String Team;
	private String Name;
	private String Surname;
	private int Age;
	@ManyToOne(targetEntity = model.Type.class, cascade = { ALL, REMOVE })
	private Type Type;
	private static final long serialVersionUID = 1L;

	public Participant() {
		super();
	}   
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}   
	public String getTeam() {
		return this.Team;
	}

	public void setTeam(String Team) {
		this.Team = Team;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getSurname() {
		return this.Surname;
	}

	public void setSurname(String Surname) {
		this.Surname = Surname;
	}   
	public int getAge() {
		return this.Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}   
	public Type getType() {
		return this.Type;
	}

	public void setType(Type Type) {
		this.Type = Type;
	}
   
}
