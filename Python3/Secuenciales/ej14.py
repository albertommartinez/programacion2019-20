# -*- coding: utf-8 -*-

#Dado un número de dos cifras, diseñe un algoritmo 
#que permita obtener el número invertido.

#pedir numero de dos cifras
#almacenar en una variable
#multiplicar por -1
#mostrar resultado

print("..::Obtener el número inverso::..")
numero = input("Introduce un número de dos cifras")
if((len(numero)<2)or(len(numero)>2)):
	print("El número debe tener dos digitos")
else:
	inverso = int(numero)*(-1)
	print("El inverso de "+str(numero)+" es "+str(inverso))
