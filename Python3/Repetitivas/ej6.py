# -*- coding: utf-8 -*-

#Escribe un programa que dados dos números 
#uno real (base) y un entero positivo (exponente)
#saque por pantalla el resultado de la potencia. 
#No se puede utilizar el operador de potencia.

#almacenar base (float)
#almacenar exponente (int+)
#mostrar resultado de base**exponente

print("^^---Resolver potencias---^^")
base = float(input("Introduce la base> "))
exponente = int(input("Introduce el expoente(debe ser positivo)> "))
if(exponente>0):
	print("El resultado es ", base**exponente)
else:
	print("El exponente debe ser positivo")
