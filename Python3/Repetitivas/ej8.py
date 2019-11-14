# -*- coding: utf-8 -*-
import time
import os
#Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

#bucle muestra cada segundo la hora, minuto y segundo
#y limpia la pantalla

print("\/\/\/CRONOMETRO\/\/\/")
contador = 0
while True:
    #print(contador)
    #tiempo = time.gmtime(time.time())
    #print(tiempo.tm_hour,":",tiempo.tm_min,":",tiempo.tm_sec)
    print(horas,":",minutos,".",segundos)
    time.sleep(1)
    if  segundos < 59:
	segundos += 1
    else:
	segundo = 0
	minutos += 1
	
    if  minutos < 59:
	minutos += 1
    else:
	minutos = 0
	horas += 1
    contador = contador + 1
    if(os.name=="posix"): #Si el SO es linux o mac
        os.system("clear")
    elif(os.name=="nt"): #Si el SO es windows
        os.system("cls")
    print("\/\/\/CRONOMETRO\/\/\/")
   
	
	
