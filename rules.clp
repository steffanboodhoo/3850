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


(defrule cheese-test
	(cheese-data(name ?names) (pasturized ?pasturized))
=>
	(printout t $?names" "$?pasturized crlf crlf)
)

;;UP Pasturized value, MS milk source value

;;UP pasturized ----------------------------------------------------------------------------
(defrule cheese-pasturized
	(UP ?userPass)
	?f<-(cheese-data (name ?cheeseName)(pasturized $?cheesePas)(pasturized-check no)(accuracy ?Acc))
=>	
	(printout t ?cheeseName crlf)
	(printout t ?userPass"   "$?cheesePas crlf)
	(printout t "old value"?Acc )
	(if    (member ?userPass $?cheesePas)
	 then 
		 (bind ?Acc (+ 5 ?Acc))
		 (modify  ?f (accuracy ?Acc)(pasturized-check yes))
	 )
	(printout t "         new value"?Acc crlf)
)
;; MS milk source --------------------------------------------------------------------------
(defrule cheese-milk-source
	(MS ?userMilk)
	?f<-(cheese-data (name ?cheeseName)(milk-source $?cheeseMilk)(milk-source-check no)(accuracy ?Acc))
=>	
	(printout t ?cheeseName crlf)
	(printout t ?userMilk"   "$?cheeseMilk crlf)
	(printout t "old value"?Acc )
	(if    (member ?userMilk $?cheeseMilk)
	 then 
		 (bind ?Acc (+ 5 ?Acc))
		 (modify  ?f (accuracy ?Acc)(milk-source-check yes))
	 )
	(printout t "         new value"?Acc crlf)
)
;; TX texture --------------------------------------------------------------------------
(defrule cheese-texture
	(TX ?userTexture)
	?f<-(cheese-data (name ?cheeseName)(texture $?cheeseTexture)(texture-check no)(accuracy ?Acc))
=>	
	(printout t ?cheeseName crlf)
	(printout t ?userMilk"   "$?cheeseMilk crlf)
	(printout t "old value"?Acc )
	(if    (member ?userTexture $?cheeseTexture)
	 then 
		 (bind ?Acc (+ 5 ?Acc))
		 (modify  ?f (accuracy ?Acc)(texture-check yes))
	 )
	(printout t "         new value"?Acc crlf)
)


(defrule test-facts
	(UP ?userPass)
=>
	(printout t ?userPass "value" crlf)
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