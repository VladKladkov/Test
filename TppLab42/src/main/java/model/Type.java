package model;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import model.Whereandwhen;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.CascadeType.REMOVE;

/**
 * Entity implementation class for Entity: Type
 *
 */
@Entity

@NamedQuery(name = "Type.findAll", query = "select t from Type t")
public class Type implements Serializable {


	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int ID;
	private String Type;
	private String Name;
	private String SpecialCondition;
	@ManyToOne(targetEntity = model.Whereandwhen.class, cascade = { ALL, REMOVE })
	private Whereandwhen WhereandWhen;
	private static final long serialVersionUID = 1L;

	@OneToMany(targetEntity = model.Participant.class)
	private List<Participant> participants;

	public Type(String type, String name, String specialCondition, Whereandwhen whereandWhen) {
		super();
		Type = type;
		Name = name;
		SpecialCondition = specialCondition;
		WhereandWhen = whereandWhen;
	}

	@Override
	public String toString() {
		return "Type [ID=" + ID + ", Type=" + Type + ", Name=" + Name + ", SpecialCondition=" + SpecialCondition
				+ ", WhereandWhen=" + WhereandWhen + "]";
	}

	public List<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	public Type() {
		super();
	}   
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}   
	public String getType() {
		return this.Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getSpecialCondition() {
		return this.SpecialCondition;
	}

	public void setSpecialCondition(String SpecialCondition) {
		this.SpecialCondition = SpecialCondition;
	}   
	public Whereandwhen getWhereandWhen() {
		return this.WhereandWhen;
	}

	public void setWhereandWhen(Whereandwhen WhereandWhen) {
		this.WhereandWhen = WhereandWhen;
	}

}
