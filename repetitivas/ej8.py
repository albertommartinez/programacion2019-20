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
    tiempo = time.gmtime(time.time())
    print(tiempo.tm_hour,":",tiempo.tm_min,":",tiempo.tm_sec)
    time.sleep(1)
    contador = contador + 1
    if(os.name=="posix"): #Si el SO es linux o mac
        os.system("clear")
    elif(os.name=="nt"): #Si el SO es windows
        os.system("cls")
    print("\/\/\/CRONOMETRO\/\/\/")
   
	
	
