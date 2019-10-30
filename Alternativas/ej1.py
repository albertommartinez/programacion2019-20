# -*- coding: utf-8 -*-

#Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.

#1.almacenar numero1 (real)
#2.almacenar numero2 (real)
#3.restar ambos números
#4.si el resultado es mayor de 0, numero1 es mayor
#5.en caso contrario numero2 es el mayor
#6.si el resultado es 0, son iguales
#7.mostrar el mayor

print("---Introduce dos números y te dire el mayor")
numero1 = float(input("Introduce el primer número> "))
numero2 = float(input("Introduce el segundo número> "))
if((numero1-numero2)>0):
	print("El mayor es ",numero1)
elif((numero1-numero2)<0):
	print("El mayor es ",numero2)
else:
	print("Ambos números son iguales")

