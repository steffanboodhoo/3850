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
		varieties.add(Variety.hard);
		textures.add(Texture.compact);textures.add(Texture.crumbly);textures.add(Texture.open);textures.add(Texture.smoothe);
		colours.add(Colour.yellow);
		tastes.add(Taste.full_flavoured);tastes.add(Taste.mild);tastes.add(Taste.milky);tastes.add(Taste.sharp);
		smells.add(Smell.pungent);

		c=new Cheese("asiago", Pasturized.no,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.goat);animals.add(Animal.sheep);
		countries.add(Country.greece);
		varieties.add(Variety.soft);varieties.add(Variety.brined);
		textures.add(Texture.creamy);textures.add(Texture.crumbly);textures.add(Texture.open);textures.add(Texture.grainy);
		colours.add(Colour.white);
		tastes.add(Taste.full_flavoured);tastes.add(Taste.salty);tastes.add(Taste.tangy);
		smells.add(Smell.nutty);smells.add(Smell.strong);

		c=new Cheese("feta", Pasturized.both,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.italy);
		varieties.add(Variety.soft);varieties.add(Variety.processed);
		textures.add(Texture.creamy);textures.add(Texture.smoothe);textures.add(Texture.spreadable);
		colours.add(Colour.white);
		tastes.add(Taste.buttery);tastes.add(Taste.creamy);tastes.add(Taste.mild);tastes.add(Taste.milky);
		smells.add(Smell.fresh);

		c=new Cheese("mascarpone", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,true);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.united_states);
		varieties.add(Variety.hard);varieties.add(Variety.artisan);varieties.add(Variety.processed);
		textures.add(Texture.firm);
		colours.add(Colour.pale_yellow);
		tastes.add(Taste.buttery);tastes.add(Taste.creamy);tastes.add(Taste.mild);tastes.add(Taste.milky);
		smells.add(Smell.fresh);

		c=new Cheese("swiss", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,true);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.united_states);
		varieties.add(Variety.semi_soft);
		textures.add(Texture.creamy);textures.add(Texture.smoothe);
		colours.add(Colour.cream);
		tastes.add(Taste.herbaceous);tastes.add(Taste.sharp);tastes.add(Taste.spicy);
		smells.add(Smell.aromatic);smells.add(Smell.herbal);

		c=new Cheese("pepper jack", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,true);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);animals.add(Animal.waterbuffalo);
		countries.add(Country.india);
		varieties.add(Variety.fresh_firm);
		textures.add(Texture.chewy);textures.add(Texture.crumbly);textures.add(Texture.firm);
		colours.add(Colour.white);
		tastes.add(Taste.milky);
		smells.add(Smell.fresh);smells.add(Smell.milky);

		c=new Cheese("paneer", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,true);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.united_kingdom);countries.add(Country.united_states);
		varieties.add(Variety.soft);varieties.add(Variety.artisan);varieties.add(Variety.processed);
		textures.add(Texture.creamy);textures.add(Texture.crumbly);
		colours.add(Colour.white);
		tastes.add(Taste.sweet);
		smells.add(Smell.unknown);

		c=new Cheese("cottage cheese", Pasturized.both,animals, countries,varieties,textures,colours,tastes,smells,null);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);
		countries.add(Country.england);countries.add(Country.great_britan);
		varieties.add(Variety.medium_firm);varieties.add(Variety.brined);
		textures.add(Texture.firm);
		colours.add(Colour.yellow);
		tastes.add(Taste.sweet);tastes.add(Taste.smoothe);
		smells.add(Smell.floral);

		c=new Cheese("swaledale", Pasturized.no,animals, countries,varieties,textures,colours,tastes,smells,true);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.sheep);
		countries.add(Country.italy);
		varieties.add(Variety.hard);varieties.add(Variety.artisan);
		textures.add(Texture.firm);textures.add(Texture.flaky);textures.add(Texture.smoothe);
		colours.add(Colour.pale_yellow);
		tastes.add(Taste.herbaceous);tastes.add(Taste.savoury);tastes.add(Taste.sweet);
		smells.add(Smell.herbal);

		c=new Cheese("calcagno", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.sheep);
		countries.add(Country.ireland);
		varieties.add(Variety.semi_soft);varieties.add(Variety.artisan);varieties.add(Variety.blue_veined);
		textures.add(Texture.chalky);textures.add(Texture.creamy);textures.add(Texture.crumbly);
		colours.add(Colour.pale_yellow);
		tastes.add(Taste.acidic);tastes.add(Taste.creamy);tastes.add(Taste.mild);
		smells.add(Smell.rich);smells.add(Smell.strong);

		c=new Cheese("crozier", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,true);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);animals.add(Animal.goat);animals.add(Animal.reindeer);
		countries.add(Country.finland);
		varieties.add(Variety.semi_hard);varieties.add(Variety.artisan);
		textures.add(Texture.chewy);textures.add(Texture.firm);
		colours.add(Colour.white);
		tastes.add(Taste.salty);tastes.add(Taste.sweet);
		smells.add(Smell.fresh);smells.add(Smell.pleasant);smells.add(Smell.sweet);

		c=new Cheese("juustoleipa", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);animals.add(Animal.goat);animals.add(Animal.sheep);
		countries.add(Country.catalonia);
		varieties.add(Variety.soft);varieties.add(Variety.artisan);
		textures.add(Texture.creamy);
		colours.add(Colour.white);
		tastes.add(Taste.spicy);
		smells.add(Smell.pungent);

		c=new Cheese("tupi", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,null);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);animals.add(Animal.goat);animals.add(Animal.sheep);
		countries.add(Country.italy);
		varieties.add(Variety.hard);
		textures.add(Texture.brittle);textures.add(Texture.crumbly);textures.add(Texture.dense);textures.add(Texture.flacky_hard);
		colours.add(Colour.pale_yellow);
		tastes.add(Taste.mild);tastes.add(Taste.sharp);tastes.add(Taste.tangy);
		smells.add(Smell.strong);

		c=new Cheese("romano", Pasturized.both,animals, countries,varieties,textures,colours,tastes,smells,true);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);animals.add(Animal.goat);
		countries.add(Country.mexico);
		varieties.add(Variety.semi_hard);
		textures.add(Texture.crumbly);textures.add(Texture.firm);
		colours.add(Colour.white);
		tastes.add(Taste.salty);tastes.add(Taste.sharp);tastes.add(Taste.spicy);tastes.add(Taste.strong);
		smells.add(Smell.strong);

		c=new Cheese("anejo enchilado", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);

		//_______________________________________________________________________________________
		smells=new ArrayList<Smell>();tastes=new ArrayList<Taste>();varieties=new ArrayList<Variety>();textures=new ArrayList<Texture>();countries=new ArrayList<Country>();colours=new ArrayList<Colour>();animals=new ArrayList<Animal>();
		
		animals.add(Animal.cow);animals.add(Animal.goat);
		countries.add(Country.united_states);
		varieties.add(Variety.semi_hard);varieties.add(Variety.artisan);
		textures.add(Texture.creamy);
		colours.add(Colour.straw);
		tastes.add(Taste.creamy);tastes.add(Taste.mild);
		smells.add(Smell.unknown);

		c=new Cheese("broncha", Pasturized.yes,animals, countries,varieties,textures,colours,tastes,smells,false);
		Main.cheeses.add(c);


	}
}
