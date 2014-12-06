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

;checking to see if the value is contained since $? means 0 or more
(defrule cheese-pasturized	
	(cheese-data 
		(pasturized $? ?pVal $?)) ;pval is input from the user
=>
	(modify ?cheese-data(accuracy (+ ?acVal 5) ))
)



(defrule make-bad-buys
 ?prospect <- (prospect (name $?name)
(assets rich)
 (age ?months))
=>
 (printout t "Prospect: " ?name crlf ; Note: not ?name 
 			"rich" crlf ?months 
 			" months old" crlf crlf)
 (modify ?prospect (assets poor)))



(defrule bye-bye
 ?bad-prospect <- (prospect (assets poor) (name ?name))
=>
 (retract ?bad-prospect)
 (printout t "bye-bye " ?name crlf))