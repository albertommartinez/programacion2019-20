# -*- coding: utf-8 -*-
# Calcular la media de tres números pedidos por teclado.
#1.pedir numero1
#2.almacenar numero1
#3.pedir numero2
#4.almacenar numero2
#5.pedir numero3
#6.almacenar numero3

print("== Calcular media de tres números ==")
numero1 = float(input("introducir primer número1> "))
numero2 = float(input("introducir primer número2> "))
numero3 = float(input("introducir primer número3> "))
media = ((numero1+numero2+numero3)/3)
print("La media aritmética de "+str(numero1)+", "+str(numero2)+" y "+str(numero3)+" es "+ str(media))
