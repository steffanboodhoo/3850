package objects;

import globals.Attributes.Country;
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
		
		
		Cheese c=new Cheese("name of cheese", null, textures, varieties, countries, smells, tastes);
		Main.cheeses.add(c);
	}
}
