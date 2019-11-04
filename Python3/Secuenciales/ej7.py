# -*- coding: utf-8 -*-
#Realiza un programa que reciba una cantidad de minutos
#y muestre por pantalla a cuantas horas y minutos corresponde.
#1.pedir número de minutos
#2.almacenar minutos
#3.calcular horas dividiendo entre 60
#4.almacenar horas
#5.calcular módulo de 60 para calcular minutos restantes

print("..::Calcular horas::..")
cMinutos = int(input("Introduce cantidad de minutos> "))
horas = cMinutos//60
minutos = cMinutos%60
print(str(cMinutos)+" son "+str(horas)+" horas y "+str(minutos)+" minutos")