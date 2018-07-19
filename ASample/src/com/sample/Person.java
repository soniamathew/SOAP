package com.sample;
import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = -5577579081118070434L;
	
	private String FirstName;
	private String LastName;
	private String MiddleName;
	private int Age;
	private int ID;
	

	public String getFName() {
		return FirstName;
	}

	public void setFName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLName() {
		return LastName;
	}

	public void setLName(String LastName) {
		this.LastName = LastName;
	}

	
	public String getMName() {
		return MiddleName;
	}

	public void setMName(String MiddleName) {
		this.MiddleName = MiddleName;
	}
	
	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public int getId() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}
	
	@Override
	public String toString(){
		return ID+"::"+FirstName+"::"+MiddleName+"::"+LastName+"::"+Age;
	}

}