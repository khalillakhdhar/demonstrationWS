package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Min(value = 18)
	private int age;
	private String nom_complet;
	private String adresse;
	@Column(length = 20)
	private String tel;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom_complet() {
		return nom_complet;
	}
	public void setNom_complet(String nom_complet) {
		this.nom_complet = nom_complet;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, @Min(18) int age, String nom_complet, String adresse, String tel) {
		super();
		this.id = id;
		this.age = age;
		this.nom_complet = nom_complet;
		this.adresse = adresse;
		this.tel = tel;
	}
	
	
	
	
	
	

}
