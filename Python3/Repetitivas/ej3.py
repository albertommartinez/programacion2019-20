# -*- coding: utf-8 -*-

#Algoritmo que pida caracteres e imprima ‘VOCAL’ 
#si son vocales y ‘NO VOCAL’ en caso contrario, 
#el programa termina cuando se introduce un espacio.

#almacenar caracter
#identificar si es una letra
#si es una letra transformar a minúscula
#si es igual a 'a' o 'e' o 'i' o 'o' o 'u' es vocal
# si no, es no vocal
#si no lo es pedir otro caracter
#si caracter es espacio termina el programa

print("--->Encontrar vocales<---")
caracter = ""
vocal = False
while caracter!=" ":
	caracter = input("Introduce un caracter> ")
	caracter = caracter.lower
	if(caracter=="a"):
		vocal = True
	elif(caracter=="e"):
		vocal = True
	elif(caracter=="i"):
		vocal = True
	elif(caracter=="o"):
		vocal = True
	elif(caracter=="u"):
		vocal = True
	else:
		vocal = False
	if(vocal == True):
		print("VOCAL")
	else:
		print("NO VOCAL")
		

