# -*- coding: utf-8 -*-

#Realizar un programa que compruebe si una cadena contiene una subcadena. 
#Las dos cadenas se introducen por teclado.

#almacenar cadena
#almacenar subcadena
#respuesta = cadena.find(subcadena)
#si devuelve mayor a -1, contiene la subcadena
#si devuelve -1, no contiene la subcadena

print("#--->Buscar subcadena<---#")
cadena = str(input("Introduce una cadena> "))
subcadena = str(input("Introduce la cadena a buscar dentro de la cadena anterior> "))
if((cadena.find(subcadena))==-1):
    print("No se han encontrado coincidencias.")
else:
    print("Hay coincidencias.")
