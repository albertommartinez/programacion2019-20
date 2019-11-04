# -*- coding: utf-8 -*-

#Un alumno desea saber cual será su calificación final 
#en la materia de Algoritmos. 
#Dicha calificación se compone de los siguientes porcentajes:
#* 55% del promedio de sus tres calificaciones parciales.
#* 30% de la calificación del examen final.
#* 15% de la calificación de un trabajo final.

#1.pedir nota parcial1
#2.almacenar parcial1
#3.pedir nota parcial2
#4.almacenar parcial2
#5.pedir nota parcial3
#6.almacenar parcial3
#7.pedir nota examenFinal
#8.almacenar examenFinal
#9.pedir nota trabajoFinal
#10.almacenar trabajoFinal
#11.calificacion = (0.55*((parcial1+parcial2+parcial3)/3))+(examenFinal*0.30)+(trabajoFinal*0.15)

print("==Calculo de nota final==")
parcial1=float(input("Introduce nota del parcial 1> "))
parcial2=float(input("Introduce nota del parcial 2> "))
parcial3=float(input("Introduce nota del parcial 3> "))
examenFinal=float(input("Introduce nota del examen final> "))
trabajoFinal=float(input("Introduce nota del trabajo Final> "))
calificacion = (0.55*((parcial1+parcial2+parcial3)/3))+(examenFinal*0.30)+(trabajoFinal*0.15)
print("La calificación final del alumno es "+str(calificacion))
