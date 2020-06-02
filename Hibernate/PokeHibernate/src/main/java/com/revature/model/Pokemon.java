package com.revature.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="POKEMON")
public class Pokemon implements Serializable{

	private static final long serialVersionUID = 1542318904225343148L;
	
	@Id
	@Column(name="P_ID")
	private int number;
	
	@Column(name="P_NAME", nullable=false, unique=true)
	private String name;
	
	@OneToOne
	private PokemonType type;
	@OneToOne
	private Pokemon evolution;
	@ManyToMany(mappedBy="pokemonOwned")
	private List<Trainer> trainersThatOwn;
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pokemon(int number, String name, PokemonType type, Pokemon evolution, List<Trainer> trainersThatOwn) {
		super();
		this.number = number;
		this.name = name;
		this.type = type;
		this.evolution = evolution;
		this.trainersThatOwn = trainersThatOwn;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PokemonType getType() {
		return type;
	}
	public void setType(PokemonType type) {
		this.type = type;
	}
	public Pokemon getEvolution() {
		return evolution;
	}
	public void setEvolution(Pokemon evolution) {
		this.evolution = evolution;
	}
	public List<Trainer> getTrainersThatOwn() {
		return trainersThatOwn;
	}
	public void setTrainersThatOwn(List<Trainer> trainersThatOwn) {
		this.trainersThatOwn = trainersThatOwn;
	}
	@Override
	public String toString() {
		return "Pokemon [number=" + number + ", name=" + name + ", type=" + type + ", evolution=" + evolution
				+ ", trainersThatOwn=" + trainersThatOwn + "]";
	}
	
}
