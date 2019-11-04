# -*- coding: utf-8 -*-

#Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
#circunferencias y las clasifique en uno de estos estados:

#-exteriores distanciaCentros>sumaRadios
#-tangentes exteriores distanciaCentros=sumaRadios
#-secantes distanciaCentros>restaRadios
#-tangentes interiores distanciaCentros=restaRadios
#-interiores distanciaCentros<restaRadios
#-concéntricas (x1,y1)=(x2,y2)

#pedir datos
print("---[Clasificación de circunferencias]---")
print("---Circunferencia1")
x1 = float(input("coordenada X del centro> "))
y1 = float(input("coordenada Y del centro> "))
radio1 = float(input("Radio de la circunferencia> "))
print("---Circunferencia2")
x2 = float(input("coordenada X del centro> "))
y2 = float(input("coordenada Y del centro> "))
radio2 = float(input("Radio de la circunferencia> "))

#calculos
distanciaCentros = (((x2-x1)**2)+((y2-y1)**2))**(1/2)
sumaRadios = radio1 + radio2
restaRadios = radio2 - radio1

if(distanciaCentros>sumaRadios):
	print("Las circunferencias son exteriores")
if(distanciaCentros==sumaRadios):
	print("Las circunferencias son tangentes exteriores")
if(distanciaCentros>restaRadios):
	print("Las circunferencias son secantes")
if(distanciaCentros==restaRadios):
	print("Las circunferencias son tangentes interiores")
if(distanciaCentros<restaRadios):
	print("Las circunferencias son interiores")
if(distanciaCentros==0):
	print("Las circunferencias son concéntricas")
	



