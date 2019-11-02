# -*- coding: utf-8 -*-

#Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
#El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
#Escribir un algoritmo que determine la hora de llegada a la ciudad B.

#1.pedir segudos
#2.almacenar segundos
#3.MM = segundos//60
#4.SS = segundos%60
#5.HH = MM//60
#6.MM = MM%60
#7. Mostrar HH MM SS

print("..::Conversor de segundos a horas:minutos:segundos")
segundos = int(input("Introduce los segundos a transformar> "))

mm = segundos//60#pasar segundos a minutos
ss = segundos%60#los restantes se asignan a los segundos
hh = mm//60#pasar minutos a horas
mm%+60#los restantes se agregan a minutos

print(str(segundos)+" son "+str(hh)+" horas, "+str(mm)+" munutos, "+str(ss)+" segundos")
