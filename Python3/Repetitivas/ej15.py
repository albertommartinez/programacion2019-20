# -*- coding: utf-8 -*-

#Introducir una cadena de caracteres e indicar si es un palíndromo. 
#Una palabra palíndroma es aquella que se lee igual adelante que atrás.

#almacenar cadena
#invertir cadena
#si cadena invertida y la origina son iguales, es palidromo

print(":::--¿Es palíndromo?--:::") 
cadena = str(input("Introduce una cadena> "))
cadenaInvertida = cadena[::-1] #Invierte la cadena
if(cadena==cadenaInvertida):
    print(f"La palabra {cadena} es un palíndromo")
else:
	print(f"La palabra {cadena} no es un palíndromo")
