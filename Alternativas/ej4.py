# -*- coding: utf-8 -*-

#Crea un programa que pida al usuario dos números y
#muestre su división si el segundo no es cero, o un 
#mensaje de aviso en caso contrario.

#1.almacear primer número (real)
#2.almacenar segundo número (real)
#3.si numero2 es distinto de 0
#4.divide el primero entre el segundo
#5.en caso contrario muestra mensaje de aviso

print("--->Dividir dos números<---")
numero1 = float(input("Introduce el dividendo> "))
numero2 = float(input("Introduce el divisor> "))
if(numero2==0):
	print("---------------------------------")
	print("  no se puede dividir entre 0")
	print("---------------------------------")
else:
	print(numero1," / ",numero2," = ",numero1/numero2)
