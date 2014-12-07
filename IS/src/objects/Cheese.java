package objects;

import globals.Attributes;
import globals.Attributes.Animal;
import globals.Attributes.Colour;
import globals.Attributes.Country;
import globals.Attributes.Pasturized;
import globals.Attributes.Smell;
import globals.Attributes.Taste;
import globals.Attributes.Texture;
import globals.Attributes.Variety;

import java.util.ArrayList;

public class Cheese implements Comparable<Cheese>{
	private String name;
	private Pasturized pasturized;
	private Boolean Vegetarian;
	private ArrayList<Texture> textures;
	private ArrayList<Variety> varieties;
	private ArrayList<Country> countries;
	private ArrayList<Smell> smells;
	private ArrayList<Taste> tastes;
	private ArrayList<Colour> colours;
	private ArrayList<Animal> animals;
	private int accuracy;
	
	
	public Cheese(String name, Pasturized pasturized,
			ArrayList<Animal> animals,
			ArrayList<Country> countries,
			ArrayList<Variety> varieties,
			ArrayList<Texture> textures,
			ArrayList<Colour> colours,			
			ArrayList<Taste> tastes,
			ArrayList<Smell> smells,
			Boolean vegetarian) {
		super();
		this.name = name;
		this.pasturized = pasturized;
		this.Vegetarian =vegetarian;
		this.animals = animals;
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
	public void checkColours(String[] cTexts){
		int count=0;
		for(String t:cTexts){
			for(Colour cr:colours){
				if(t.equalsIgnoreCase(cr.toString()))
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
		s+="\npasturized"+this.pasturized
		+"\ncountries :"+this.countries.toString()
		+"\ntextures :"+this.textures.toString()
		+"\nvarieties :"+this.varieties.toString()
		+"\nsmess: "+this.smells.toString();
		return s;
	}
}

