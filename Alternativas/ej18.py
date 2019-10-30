# -*- coding: utf-8 -*-

#Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
#Si introducimos otro número nos da un error.

#almacenamos dia de la semana (int)
#si dia > 7 o menor 1 devolvemos mensaje de error
#si dia = 1 devolvemos "lunes"
#si dia = 2 devolvemos "martes"
#si dia = 3 devolvemos "miércoles"
#si dia = 4 devolvemos "jueves"
#si dia = 5 devolvemos "viernes"
#si dia = 6 devolvemos "sábado"
#si dia = 7 devolvemos "domingo"

print("--->Devuelve el nombre del día según posición en la semana<---")
dia = int(input("Introduce día(ej:1)> "))
if((dia>0)and(dia<8)):
    if(dia==1):
        dia = "LUNES"
    elif(dia==2):
        dia = "MARTES"
    elif(dia==3):
        dia = "MIERCOLES"
    elif(dia==4):
        dia = "JUEVES"
    elif(dia==5):
        dia = "VIERNES"
    elif(dia==6):
        dia = "SABADO"
    elif(dia==7):
        dia = "DOMINGO"

    print(f"El día es {dia}")     
else:
    print("ERROR: número incorrecto.")
