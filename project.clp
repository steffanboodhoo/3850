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

(assert (cheese-data 
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
)


