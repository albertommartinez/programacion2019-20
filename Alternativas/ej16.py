# -*- coding: utf-8 -*-

#La política de cobro de una compañía telefónica es: 
#cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que 
#los primeros cinco minutos cuestan 1 euro, 
#los siguientes tres, 80 céntimos, 
#los siguientes dos minutos, 70 céntimos, 
#y a partir del décimo minuto, 50 céntimos. 
#Además, se carga un impuesto de 3 % cuando es domingo, 
#y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. 
#Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

#almacenar tiempo
#almacenar dia

#si la llamada dura 10 minutos o más el precio es 3 euros + impuestos
#si la llamada dura menos de 10 minutos y más de 8 el precio es de 2,5 euros + impuestos
#si la llamada dura menos de 8 minutos y más de 5 el precio es de 1,8 euros + impuestos
#si la llamada  dura menos de 5 minutos el precio es de 1euro + impuestos

#si diaSemana = domingo precio = coste*1.03
#de lo contrario almacenar si es mañana o tarde
#si es por la mañana precio = precio*1.15
#si es por la tarde precio = precio*1.10
#mostrar precio

print("--[Tarificación Telefónica]--")
#Recoger datos
duracion = int(input("Introducir duración de la llamada(minutos)> "))
dia = int(input("Introduce dia de la semana(ej:2-martes)> "))

#Cálculo de precio base

if(duracion>=10):
	precio = 3
elif((duracion<10)and(duracion>8)):
	precio = 2.50
elif((duracion<8)and(duracion>5)):
	precio = 1.15
elif((duracion<5)and(duracion>0)):
	precio = 1
else:
	print("La duración introducida no es válida")

#Cálculo de impuestos	

if((dia>0)and(dia<8)):
	if(dia=="7"):	
		total = precio*1.03
	else:
		turno = input("En turno de mañana o tarde> ")
		turno = turno.lower
		if(turno=="mañana"):
			total = precio*1.15
		else:
			total = precio*1.10
#Mostrar resultado
print(f"el total a pagar es {total}")
	