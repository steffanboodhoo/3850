package objects;

import globals.Attributes;
import globals.Attributes.Country;
import globals.Attributes.Smell;
import globals.Attributes.Taste;
import globals.Attributes.Texture;
import globals.Attributes.Variety;

import java.util.ArrayList;

public class Cheese implements Comparable<Cheese>{
	private String name;
	private Boolean Pasturized;
	private ArrayList<Texture> textures;
	private ArrayList<Variety> varieties;
	private ArrayList<Country> countries;
	private ArrayList<Smell> smells;
	private ArrayList<Taste> tastes;
	private int accuracy;
	
	
	public Cheese(String name, Boolean pasturized, ArrayList<Texture> textures,
			ArrayList<Variety> varieties, ArrayList<Country> countries,
			ArrayList<Smell> smells, ArrayList<Taste> tastes) {
		super();
		this.name = name;
		Pasturized = pasturized;
		this.textures = textures;
		this.varieties = varieties;
		this.countries = countries;
		this.smells = smells;
		this.tastes = tastes;
	}

	public void checkTextures(String[] cTexts){
		int count=0;
		for(String t:cTexts){
			for(Texture text:textures){
				if(t.equalsIgnoreCase(text.toString()))
					count++;
			}
		}
		setAccuracy(getAccuracy() + count*Attributes.bigFields);
	}
	
	public void checkVarieties(String[] cTexts){
		int count=0;
		for(String t:cTexts){
			for(Variety var:varieties){
				if(t.equalsIgnoreCase(var.toString()))
					count++;
			}
		}
		setAccuracy(getAccuracy() + count*Attributes.bigFields);
	}
	
	public void checkCountries(String[] cTexts){
		int count=0;
		for(String t:cTexts){
			for(Country cy:countries){
				if(t.equalsIgnoreCase(cy.toString()))
					count++;
			}
		}
		setAccuracy(getAccuracy() + count*Attributes.bigFields);
	}
	
	public void checkTastes(String[] cTexts){
		int count=0;
		for(String t:cTexts){
			for(Taste tas:tastes){
				if(t.equalsIgnoreCase(tas.toString()))
					count++;
			}
		}
		setAccuracy(getAccuracy() + count*Attributes.bigFields);
	}
	
	public void checkSmells(String[] cTexts){
		int count=0;
		for(String t:cTexts){
			for(Smell sm:smells){
				if(t.equalsIgnoreCase(sm.toString()))
					count++;
			}
		}
		setAccuracy(getAccuracy() + count*Attributes.bigFields);
	}
	

	@Override
	public int compareTo(Cheese cheese){
		if(cheese.getAccuracy()>this.accuracy)
			return -1;
		return 1;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTextures(ArrayList<Texture> textures) {
		this.textures = textures;
	}

	public void setVarieties(ArrayList<Variety> varieties) {
		this.varieties = varieties;
	}

	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}

	public void setSmells(ArrayList<Smell> smells) {
		this.smells = smells;
	}

	public void setTastes(ArrayList<Taste> tastes) {
		this.tastes = tastes;
	}
	
	public String toString(){
		String s="\n\n"+name;
		s+="\npasturized"+this.Pasturized
		+"\ncountries :"+this.countries.toString()
		+"\ntextures :"+this.textures.toString()
		+"\nvarieties :"+this.varieties.toString()
		+"\nsmess: "+this.smells.toString();
		return s;
	}
}

