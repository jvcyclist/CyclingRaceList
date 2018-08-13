package pl.karas.cyclingracelist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cyclist")
public class Cyclist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "team")
	private String team;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "bthyear")
	private String bthyear;
	
	 @Column(name = "category")
	 private String category;

	 public Cyclist() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBthyear() {
		return bthyear;
	}

	public void setBthyear(String bthyear) {
		this.bthyear = bthyear;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Cyclist(String firstName, String lastName, String team, String sex, String bthyear, String category) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.sex = sex;
		this.bthyear = bthyear;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Cyclist [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", team=" + team + ", sex="
				+ sex + ", bthyear=" + bthyear + ", category=" + category + "]";
	} 
	 
	 
	 
	 
}

