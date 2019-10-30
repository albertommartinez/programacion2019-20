# -*- coding: utf-8 -*-

#Realizar un programa que lea una cadena por teclado 
#y convierta las mayúsculas a minúsculas y viceversa.

#almacenar cadena
#recorrer elementos de la cadena
#comprobar en cada iteración si es letra y mayúscula
#en el caso, transformar a minúscula
#y si es minúscula transformar a mayúscula

print("---Mayúsculas a minúsculas y viceversa---")
cadena1 = input("Introduce una cadena> ")
cadena2 = ""  
for caracter in cadena1:
    if((caracter>="a")and(caracter<="z")):
        caracter = caracter.upper()
        cadena2 = cadena2 + caracter
    elif((caracter>="A")and(caracter<="Z")):
        caracter = caracter.lower()
        cadena2 = cadena2 + caracter
print(f"Cadena original {cadena1} y cadena cambiada {cadena2}")
	

