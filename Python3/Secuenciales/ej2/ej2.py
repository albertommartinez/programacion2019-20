# -*- coding: utf-8 -*-
#Calcular el perímetro y área de un rectángulo dada su base y su altura.
#1.pedir base
#2.almacenarla en variable
#3.pedir altura
#4.almacenarla en variable
#5.realizar calculo
#6.mostrar resultado

print("==Calcular área y Perímetro de un rectángulo==")
base = float(input("Introduce el valor de la base> "))
altura = float(input("Introduce el valor de la altura> "))
print("El valor del perímetro es "+str((base+altura)*2))
print("El valor del área es "+str(base*altura))