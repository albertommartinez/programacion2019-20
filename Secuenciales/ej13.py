# -*- coding: utf-8 -*-
import math
#Realizar un algoritmos que lea un número y que muestre su raíz cuadrada
#y su raíz cúbica. Python no tiene ninguna función predefinida que permita 
#calcular la raíz cúbica, ¿cómo se puede calcular?

#pedir número
#almacenarlo en una variable
#raiz2 = math.sqrt(numero)
#raiz3 = numero**(1/3) -elevamos a 1/3 porque es equivalente a raiz cúbica
#mostrar raiz2 raiz3

print("..::Calcular raiz cuadrada y cúbica::..")
numero = float(input("Introducir número para hacer los calculos> "))

raiz2 = round(math.sqrt(numero),2)
raiz3 = round(numero**(1/3),2)

print("La raiz cuadrada de "+str(numero)+" es "+str(raiz2))
print("La raiz cúbica de "+str(numero)+" es "+str(raiz3))
 
