# -*- coding: utf-8 -*-
#Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
#1.elegir fahrenheit a celsius o celsis a fahrenheit
#2.almacenar elección
#3.pedir dato en la unidad de la elección anterior
#4.aplicar la fórmula oportuna para F a C: C = (F-32)*(5/9)
#de C a F: F=C*(9/5)+32

print("==..::Conversor de unidades de temperatura::..==")
print(" 1.Celsius a Fahrenheit")
print(" 2.Fahrenheit a Celsius")
opcion = input("Selecciona el calculo deseado> ")
if(opcion=='1'):
	celsius = float(input("Introduce los grados celsius> "))
	fahrenheit = celsius*(9/5)+32
	print(str(celsius)+"grados celsius equivalen a "+str(fahrenheit)+" grados fahrenheit")
elif(opcion=='2'):
	fahrenheit = float(input("Introduce los grados fahrenheit> "))
	celsius = (fahrenheit-32)*(5/9)
	print(str(fahrenheit)+"grados fahrenheit equivalen a "+str(celsius)+" grados celsius")