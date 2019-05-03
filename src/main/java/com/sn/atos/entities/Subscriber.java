package com.sn.atos.entities;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Subscriber {
	
    @GeneratedValue
	private Long id;
	private String numero	;

	@Relationship(type = "Nobmre_Appel",direction=Relationship.INCOMING)
	private List<Subscriber> amies = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Subscriber> getAmies() {
		return amies;
	}

	public void setAmies(List<Subscriber> amies) {
		this.amies = amies;
	}

	
}
