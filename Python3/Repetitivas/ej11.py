# -*- coding: utf-8 -*-

#Suponiendo que hemos introducido una cadena por teclado 
#que representa una frase (palabras separadas por espacios). 
#realiza un programa que cuente cuantas palabras tiene.

#almacenar la cadena introducida
#usar el método split(), para fragmentar la cadena en palabras
#usar len() para contar las palabras

print("---]>Contar palabras de una cadena<[---")
cadena = input("Introducir una cadena> ")

print(f"Hay {len(cadena.split())} palabras")
