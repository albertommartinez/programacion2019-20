# -*- coding: utf-8 -*-

#El director de una escuela está organizando un viaje de estudios, y requiere 
#determinar cuánto debe cobrar a cada alumno y cuánto debe pagar 
#a la compañía de viajes por el servicio. 
#La forma de cobrar es la siguiente: 
#    -si son 100 alumnos o más, el costo por cada alumno es de 65 euros; 
#    -de 50 a 99 alumnos, el costo es de 70 euros 
#    -de 30 a 49, de 95 euros
#    -si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
#Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

#almacenar el número de alumnos
#si son 100 o más cada alumno paga 65 y la compañia recibe 65*alumnos
#si son entre 50 y 99 el costo es 70 y la compañia recibe 70*alumnos
#si son entre 30 y 49 el costo es 95 y la compañia recibe 95*alumnos
#si son menos de 30 el coste por alumnos es 4000/alumnos y la compañia recibe 4000

print("---[Calculo viaje escolar en autobus]---")
alumnos = int(input("Introduce el número de alumnos> ")) 
if(alumnos>=100): #Si la cantidad de alumnos es mayor o igual a 100
    costeAlumno = 65
    gananciaEmpresa = 65*alumnos
elif((alumnos>50)and(alumnos<99)): #Si la cantidad de alumnos es mayor que 50 y manor que 99
    costeAlumno = 70
    gananciaEmpresa = 70*alumnos
elif((alumnos>30)and(alumnos<49)): #Si la cantidad de alumnos es mayor a 30 y menor a 49
    costeAlumno = 95
    gananciaEmpresa = 95*alumnos
else: #Si son menos de 30 alumnos
    costeAlumno = 4000/alumnos
    gananciaEmpresa = 4000

print(f"Los alumnos deberán pagar {costeAlumno} y la empresa cobrará {gananciaEmpresa}")
