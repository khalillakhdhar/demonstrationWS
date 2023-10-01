package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titre,description;
	private double prix;
	//static List<Produit> listProduits=new ArrayList<Produit>();
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit(String titre, String description, double prix) {
		super();
		this.titre = titre;
		this.description = description;
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Produit [titre=" + titre + ", description=" + description + ", prix=" + prix + "]";
	}
	
	/*public void testPrix()
	{
		this.prix=-10;
	}
*/
/*	public void ReadList()
	{
		for(Produit p:listProduits)
		{
			System.out.println(p.toString());
		}
		
	}
	*/
}
