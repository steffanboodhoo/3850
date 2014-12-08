package objects;

import globals.Attributes.Animal;
import globals.Attributes.Colour;
import globals.Attributes.Country;
import globals.Attributes.Pasturized;
import globals.Attributes.Smell;
import globals.Attributes.Taste;
import globals.Attributes.Texture;
import globals.Attributes.Variety;

import java.util.ArrayList;

import main.Main;

public class Cheeses {
	public static void populate(){
		ArrayList<Smell> smells=new ArrayList<Smell>();
		ArrayList<Taste> tastes=new ArrayList<Taste>();
		ArrayList<Variety> varieties=new ArrayList<Variety>();
		ArrayList<Texture> textures=new ArrayList<Texture>();
		ArrayList<Country> countries=new ArrayList<Country>();
		ArrayList<Colour> colours=new ArrayList<Colour>();
		ArrayList<Animal> animals=new ArrayList<Animal>();
		Pasturized pasturized;
		
		smells.add(Smell.pungent);
		tastes.add(Taste.creamy);tastes.add(Taste.full_flavoured);tastes.add(Taste.nutty);tastes.add(Taste.sweet);
		colours.add(Colour.yellow);
		textures.add(Texture.compact);textures.add(Texture.crumbly);textures.add(Texture.dense);textures.add(Texture.springy);
		varieties.add(Variety.semi_hard);varieties.add(Variety.artisan);
		countries.add(Country.netherlands);
		animals.add(Animal.cow);animals.add(Animal.sheep);animals.add(Animal.goat);
		Cheese c=new Cheese("gouda", Pasturized.both,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);
		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.england);countries.add(Country.great_britan);
		varieties.add(Variety.semi_hard);varieties.add(Variety.artisan);
		textures.add(Texture.compact);textures.add(Texture.crumbly);textures.add(Texture.dense);textures.add(Texture.springy);
		colours.add(Colour.yellow);
		tastes.add(Taste.creamy);tastes.add(Taste.full_flavoured);tastes.add(Taste.nutty);tastes.add(Taste.sweet);
		smells.add(Smell.pungent);

		c=new Cheese("cheddar", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.france);
		varieties.add(Variety.soft_ripened);varieties.add(Variety.soft);
		textures.add(Texture.soft_ripened);
		colours.add(Colour.white);
		tastes.add(Taste.creamy);tastes.add(Taste.mild);
		smells.add(Smell.fresh);

		c=new Cheese("brie", Pasturized.no,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);


		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.italy);
		varieties.add(Variety.hard);varieties.add(Variety.artisan);
		textures.add(Texture.dense);textures.add(Texture.grainy);
		colours.add(Colour.straw);
		tastes.add(Taste.fruity);tastes.add(Taste.nutty);tastes.add(Taste.savoury);tastes.add(Taste.sharp);
		smells.add(Smell.strong);

		c=new Cheese("parmesan", Pasturized.no,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.italy);
		varieties.add(Variety.hard);varieties.add(Variety.artisan);
		textures.add(Texture.dense);textures.add(Texture.grainy);
		colours.add(Colour.straw);
		tastes.add(Taste.fruity);tastes.add(Taste.nutty);tastes.add(Taste.savoury);tastes.add(Taste.sharp);
		smells.add(Smell.strong);

		c=new Cheese("asiago", Pasturized.no,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);


	}
}
