# -*- coding: utf-8 -*-

#Escribir un programa que imprima 
#todos los números pares entre dos números que se le pidan al usuario.

#almacenar inicio del rango de enteros
#almacenar fin del rango de enteros
#calcular módulo 2 del elemento del rango
#si el resultado es 0, por lo tanto es par, se muestra

print("..:: Mostrar números pares de un rango ::..")
inicio = int(input("Introduce el valor de inicio del rango> "))
fin = int(input("Introduce el valor final del rango> "))
iterador = inicio
for iterador in range(inicio,fin):
	if(iterador%2==0):#si el resultado del módulo 2 es 0, es par
		print(iterador)
