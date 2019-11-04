# -*- coding: utf-8 -*-

#Pide una cadena y un carácter por teclado y muestra cuantas 
#veces aparece el carácter en la cadena.

#almacenar cadena
#almacenar caracter
#usar método count con el caracter como parametro

print("--->Buscar carácter en una cadena<---")
cadena = input("Introduce una cadena> ")
caracter = input("Introduce un carácter a buscar en la cadena> ")
ocurrencias = cadena.count(caracter)
print(f"Se han encontrado {ocurrencias} coincidencias")
