# -*- coding: utf-8 -*-

#Pide al usuario dos números y muestra la "distancia" entre ellos 
#(el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

#1.pedir numero1
#2.almacenar numero1
#3.pedir numero2
#4.almacenar numero2
#5.obtener el número mayor
#6.calcular distancia mediante la fórmula: abs(max-min)

print("..::Distancia entre dos números::..")
numero1 = float(input("Introduce número1> "))
numero2 = float(input("Introduce número2> "))
if(numero1>numero2):
	max = numero1
	min = numero2
elif(numero2>numero1):
	max = numero2 
	min = numero1
else:
	print("Ambos son el mismo número")
print("La distancia entre "+str(numero1)+" y "+str(numero2)+" es "+str(abs(max-min)))
