package com.rev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("guitar")// generic stereotype for any Spring-managed component
@Scope("prototype")
@Entity
@Table(name="GUITAR")
public class Guitar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="guitarSequence")
	@SequenceGenerator(allocationSize=1,name="guitarSequence", sequenceName="SQ_GUITAR_PK")
	@Column(name="GUITAR_ID")
	private int id;
	
	@Column(name="GUITAR_MAKE")
	private String make;
	
	@Column(name="GUITAR_MODEL")
	private String model;
	
	@Column(name="GUITAR_COLOR")
	private String color;
	
	public Guitar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guitar(String make, String model, String color) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Guitar [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + "]";
	}
	
	
}
