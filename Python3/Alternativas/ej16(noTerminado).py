# -*- coding: utf-8 -*-

#La política de cobro de una compañía telefónica es: 
#cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, 
#los siguientes tres, 80 céntimos, 
#los siguientes dos minutos, 70 céntimos, 
#y a partir del décimo minuto, 50 céntimos. 
#Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. 
#Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

#1.almacenar duración de la llamada
#2.almacenar si es domingo
#3.almacenar si es tarde o mañana
#4.si la duración es menor o igual a 5
#5.si es por la mañana duracion*1.15
#6.si es por la tarde duracion*1.10
#7.pero si es domingo duracion*1.03