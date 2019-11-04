# -*- coding: utf-8 -*-

#Escribir un programa que lea un año indicar si es bisiesto. 
#Nota: un año es bisiesto si es un número divisible por 4, pero no si 
#es divisible por 100, excepto que también sea divisible por 400.

#1.almacenar año (entero)
#2.comprobar que es divisible por 4
#3.comprobar si es divisible por 100
#4.si lo es no es bisiesto
#5.comprobar si es divisible por 400
#6.si lo es, es bisiesto

print("--->Comprobar si un año es bisiesto<---")
anno = int(input("Introduce el año> "))
bisiesto = False
if(anno%4==0):
    if(anno%100==0):
        bisiesto = False
        if(anno%400==0):
            bisiesto = True
if(bisiesto==True):
    print(f"El año {anno} es bisiesto")
else:
	print(f"El año {anno} no es bisiesto")
