(deftemplate cheese-data
	(slot name)
	(multislot pasturized)
	(multislot milk-source)
	(multislot country)
	(multislot variety)
	(multislot texture)
	(multislot color)
	(multislot flavor)
	(multislot aroma)
	(multislot vegetarian)
	(slot accuracy
		(type NUMBER)
		(default 0))
)

(deffacts cheeses
 (cheese-data 
	(name gouda)
	(pasturized yes no)
	(milk-source cow goat sheep)
	(country netherlands)
	(variety semi-hard artisan)
	(texture compact crumbly dense springy)
	(color yellow)
	(flavor creamy full-flavoured nutty sweet)
	(aroma pungent)
	(vegetarian no))


 (cheese-data 
	(name cheddar)
	(pasturized yes)
	(milk-source cow)
	(country england great-britian)
	(variety hard artisan processed)
	(texture compact crumbly)
	(color pale-yellow)
	(flavor creamy sharp)
	(aroma -)
	(vegetarian no))


 (cheese-data 
	(name brie)
	(pasturized no)
	(milk-source cow)
	(country france)
	(variety soft soft-ripened)
	(texture soft-ripened)
	(color white)
	(flavor creamy mild)
	(aroma fresh)
	(vegetarian no))


 (cheese-data 
	(name parmesean)
	(pasturized no)
	(milk-source cow)
	(country italy)
	(variety hard artisan)
	(texture dense grainy)
	(color straw)
	(flavor fruity nutty savoury sharp)
	(aroma strong)
	(vegetarian no))


 (cheese-data 
	(name asiago)
	(pasturized no)
	(milk-source cow)
	(country italy)
	(variety hard)
	(texture compact crumbly open smoothe)
	(color yellow)
	(flavor full-flavoured mild sharp milky)
	(aroma pungent)
	(vegetarian no))


 	(cheese-data 
	(name feta)
	(pasturized yes no)
	(milk-source goat sheep)
	(country greece)
	(variety soft brined)
	(texture creamy crumbly grainy open)
	(color white)
	(flavor full-flavoured salty tangy)
	(aroma nutty strong)
	(vegetarian no))


 (cheese-data 
	(name mascarpone)
	(pasturized yes)
	(milk-source cow)
	(country italy)
	(variety soft processed)
	(texture creamy smoothe spreadable)
	(color white)
	(flavor buttery creamy mild milky)
	(aroma fresh)
	(vegetarian yes))



	 (cheese-data 
	(name swiss)
	(pasturized yes)
	(milk-source cow)
	(country united-states)
	(variety hard artisan processed)
	(texture firm)
	(color pale-yellow)
	(flavor nutty sweet)
	(aroma -)
	(vegetarian yes))


	(cheese-data 
	(name pepper-jack)
	(pasturized yes)
	(milk-source cow)
	(country united-states)
	(variety semi-soft)
	(texture creamy smoothe)
	(color cream)
	(flavor herbaceous sharp spicy)
	(aroma aromatic herbal)
	(vegetarian yes))

	(cheese-data 
	(name paneer)
	(pasturized yes)
	(milk-source cow water-buffalo)
	(country india)
	(variety fresh firm)
	(texture chewy firm crumbly)
	(color white)
	(flavor milky)
	(aroma fresh milky)
	(vegetarian yes))

	(cheese-data 
	(name cottage-cheese)
	(pasturized yes no)
	(milk-source cow)
	(country united-states united-kingdom)
	(variety soft artisan processed)
	(texture creamy crumbly)
	(color white)
	(flavor sweet)
	(aroma -)
	(vegetarian n-))

	(cheese-data 
	(name swaledale)
	(pasturized no)
	(milk-source cow sheep)
	(country england great-britian)
	(variety medium-firm brined)
	(texture firm)
	(color yellow)
	(flavor smoothe sweet)
	(aroma floral)
	(vegetarian yes))

	(cheese-data 
	(name calcagno)
	(pasturized yes)
	(milk-source sheep)
	(country italy)
	(variety hard artisan)
	(texture firm flaky smoothe)
	(color pale-yellow)
	(flavor herbaceous savoury sweet)
	(aroma herbal)
	(vegetarian no))

	(cheese-data 
	(name crozier)
	(pasturized yes)
	(milk-source sheep)
	(country ireland)
	(variety semi-soft artisan blue-veined)
	(texture chalky creamy crumbly)
	(color pale-yellow )
	(flavor acidic creamy mild)
	(aroma rich strong)
	(vegetarian yes))

	(cheese-data 
	(name juustoleipa)
	(pasturized yes)
	(milk-source cow goat reindeer)
	(country finland)
	(variety semi-hard artisan)
	(texture chewy firm)
	(color white)
	(flavor salty sweet)
	(aroma fresh pleasant sweet)
	(vegetarian no))

	(cheese-data 
	(name tupi)
	(pasturized yes)
	(milk-source cow goat sheep)
	(country catalonia)
	(variety soft artisan)
	(texture creamy)
	(color white)
	(flavor spicy)
	(aroma pungent)
	(vegetarian -))

	(cheese-data 
	(name romano)
	(pasturized yes no)
	(milk-source cow goat sheep)
	(country italy)
	(variety hard)
	(texture brittle crumbly dense flacky-hard)
	(color pale-yellow)
	(flavor mild sharp tangy)
	(aroma strong)
	(vegetarian yes))

	(cheese-data 
	(name anejo-anchilado)
	(pasturized yes)
	(milk-source cow goat)
	(country mexico)
	(variety semi-hard)
	(texture crumbly firm)
	(color white)
	(flavor salty sharp spicy strong)
	(aroma nutty strong)
	(vegetarian no))

	(cheese-data 
	(name broncha)
	(pasturized yes)
	(milk-source cow goat)
	(country united-states)
	(variety semi-hard artisan)
	(texture creamy)
	(color straw)
	(flavor creamy mild)
	(aroma -)
	(vegetarian no))

	(cheese-data 
	(name crottin-du-chavignol)
	(pasturized no)
	(milk-source goat)
	(country france)
	(variety hard artisan soft-ripened)
	(texture crumbly smoothe)
	(color white)
	(flavor full-flavoured nutty)
	(aroma goaty)
	(vegetarian no))

	(cheese-data 
	(name geitost)
	(pasturized yes)
	(milk-source cow goat)
	(country norway)
	(variety semi-hard whey)
	(texture firm)
	(color golden-orange)
	(flavor burnt-caramel)
	(aroma sweet)
	(vegetarian no))

	(cheese-data 
	(name feta)
	(pasturized yes no)
	(milk-source goat sheep)
	(country greece)
	(variety soft brined)
	(texture creamy crumbly grainy open)
	(color white)
	(flavor full-flavoured salty tangy)
	(aroma nutty strong)
	(vegetarian no))

	(cheese-data 
	(name weichkaese)
	(pasturized yes no)
	(milk-source cow)
	(country germany)
	(variety soft smear-ripened)
	(texture creamy smoothe)
	(color pale-yellow)
	(flavor buttery creamy)
	(aroma -)
	(vegetarian no))

	(cheese-data 
	(name limburger)
	(pasturized yes)
	(milk-source cow)
	(country belgium germany netherlands)
	(variety semi-soft smear-ripened)
	(texture creamy crumbly firm smoothe)
	(color straw)
	(flavor grassy mild mushroomy)
	(aroma stinky)
	(vegetarian no))

	(cheese-data 
	(name kanterkaas)
	(pasturized yes)
	(milk-source cow)
	(country netherlands)
	(variety hard artisan)
	(texture firm open)
	(color yellow)
	(flavor spicy strong tangy)
	(aroma aromatic pleasant)
	(vegetarian -))


	(cheese-data 
	(name huntsman)
	(pasturized yes no)
	(milk-source cow)
	(country england great-britian)
	(variety semi-hard hard)
	(texture creamy crumbly dense firm smoothe)
	(color golden-orange)
	(flavor mild nutty spicy strong tangy)
	(aroma strong sweet)
	(vegetarian -))

	(cheese-data 
	(name adelost)
	(pasturized yes)
	(milk-source cow)
	(country sweden)
	(variety semi-soft blue-veined)
	(texture creamy)
	(color blue)
	(flavor sharp salty tangy)
	(aroma nutty)
	(vegetarian no))

	(cheese-data 
	(name vasterbottenost)
	(pasturized yes)
	(milk-source cow)
	(country sweden)
	(variety hard artisan)
	(texture crumbly grainy open)
	(color pale-yellow)
	(flavor full-flavoured salty sweet)
	(aroma aromatic strong)
	(vegetarian no))

	(cheese-data 
	(name caciocavallo)
	(pasturized yes)
	(milk-source cow)
	(country italy)
	(variety soft)
	(texture springy stringy)
	(color yellow)
	(flavor salty sharp spicy)
	(aroma earthy fruity strong)
	(vegetarian no))

	(cheese-data 
	(name colby)
	(pasturized yes)
	(milk-source cow)
	(country united-states)
	(variety semi-hard)
	(texture firm open springy)
	(color yellow)
	(flavor sweet)
	(aroma mild sweet)
	(vegetarian no))

	(cheese-data 
	(name abondance)
	(pasturized no)
	(milk-source cow)
	(country france)
	(variety semi-hard artisan)
	(texture creamy open supple)
	(color pale-yellow)
	(flavor acidic buttery fruity sweet)
	(aroma nutty)
	(vegetarian no))

	(cheese-data 
	(name etorki)
	(pasturized yes)
	(milk-source sheep)
	(country france)
	(variety hard artisan)
	(texture smoothe supple)
	(color ivory)
	(flavor burnt-caramel sweet)
	(aroma earthy)
	(vegetarian no))

	(cheese-data 
	(name mamirolle)
	(pasturized yes)
	(milk-source cow)
	(country canada france)
	(variety semi-soft artisan)
	(texture chewy supple)
	(color ivory)
	(flavor buttery fruity salty sweet)
	(aroma earthy pungent)
	(vegetarian no))

	(cheese-data 
	(name muenster)
	(pasturized yes)
	(milk-source cow)
	(country united-states)
	(variety soft processed)
	(texture elastic smoothe supple)
	(color pale-yellow)
	(flavor mild savoury sharp)
	(aroma pungent)
	(vegetarian -))
	
	(cheese-data 
	(name applewood)
	(pasturized yes)
	(milk-source cow)
	(country england great-britian)
	(variety semi-hard)
	(texture dense crumbly)
	(color yellow)
	(flavor smokey spicy)
	(aroma smokey)
	(vegetarian yes))
)