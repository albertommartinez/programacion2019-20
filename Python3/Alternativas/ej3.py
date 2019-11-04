# -*- coding: utf-8 -*-

#Escribe un programa que lea un número e indique si es par o impar.

#1.almacenar numero (int)
#2.calcular a numero el módulo 2
#3.si el resultado es 0, numero es par
#4.si el resultado es 1, numero es impar

print("..::Calcular si un número es par o impar")
numero = int(input("Introduce un número entero> "))
if(numero%2!=0):
	print(f"{numero} es impar")
else:
	print(f"{numero} es par")
