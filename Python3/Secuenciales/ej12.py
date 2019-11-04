# -*- coding: utf-8 -*-
import math
#Pide al usuario dos pares de números x1,y2 y x2,y2, que representen 
#dos puntos en el plano. Calcula y muestra la distancia entre ellos.

#1.pedir el valor x del punto1
#2.almacenar x1
#3.pedir el valor y del punto1
#4.almacenar y1
#5.pedir el valor x del punto2
#6.almacenar x2
#7.pedir el valor y del punto2
#8.almacenar y2
#9.aplicar fórmula distancia = math.sqrt((x2-x1)**2+(y2-y1)**2)
#10.mostrar distancia

#pedir datos
print("==::Calcular la distancia entre dos puntos cartesianos::==")
print("--Valores del punto 1")
x1 = float(input("Introduce la coordena X del punto1> "))
y1 = float(input("Introduce la coordena Y del punto1> "))
print("--Valores del punto 2")
x2 = float(input("Introduce la coordena X del punto2> "))
y2 = float(input("Introduce la coordena Y del punto2> "))

#calculo
distancia = round(math.sqrt((x2-x1)**2+(y2-y1)**2),2)

#mostrar
print("la distancia entre los puntos "+str(x1)+", "+str(y1)+" y "+str(x2)+", "+str(y2)+" es "+str(distancia))
