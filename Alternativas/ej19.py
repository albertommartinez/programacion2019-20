# -*- coding: utf-8 -*-

#Escribe un programa que pida un número entero entre uno y doce 
#e imprima el número de días que tiene el mes correspondiente.

#almacenar numeroMes (int)
#si numeroMes es mayor a 1 y menor a 12
#si numeroMes = 2 es Febrero 28 dias y 29 si el año es bisiesto
#si no, si numeroMes es menor que 8,calculamos el módulo de 2
#si es 1 tiene 31 dias, si es 0, 30 o 28 si es febrero
#si el numeroMes es mayor que 7, calculamos el módulo 2
#si es 0 tiene 30 dias, si es 1, 31

print("---#Calcular días del mes#---")
numeroMes = int(input("Introduce el número correspondiente a un mes> "))
if((numeroMes>0)and(numeroMes<13)):
    if(numeroMes==2):
        print("El mes es febrero y tiene 28 días,excepto si el año es bisiesto que tendría 29")
    else:
        if(numeroMes<8):
            if(numeroMes%2==1):
                print("Este mes tiene 31 días")
            else:
                print("Este mes tiene 30 días")
        else:
            if(numeroMes%2==1):
                print("Este mes tiene 30 días")
            else:
                print("Este mes tiene 31 días")