# -*- coding: utf-8 -*-

#Una compañía de transporte internacional tiene servicio en algunos países de 
#América del Norte, América Central, América del Sur, Europa y Asia. 
#El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido. 
#Lo anterior se muestra en la tabla:
#ZONA          UBICACIÓN                          COSTO/GRAMO
#1         América del Norte                     24.00 euros
#2         América Central                       20.00 euros
#3         América del Sur                       21.00 euros
#4         Europa                                10.00 euros
#5         Asia                                  18.00 euros
#Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y de seguridad. 
#Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

#almacenar peso
#almacenar zona
#si zona es 1 costeGr = 24.00 
#si zona es 2 costeGr = 20.00
#si zona es 3 costeGr = 21.00
#si zona es 4 costeGr = 10.00
#si zona es 5 costeGr = 18.00  
#coste = peso*costreGr
#mostrar coste 

print("---Calcular coste del envío--")
peso = int(input("Introduzca el peso del paquete(gr)> "))
print("------------------------------------------------------------")
print("ZONA          UBICACIÓN                          COSTO/GRAMO")
print(" 1         América del Norte                     24.00 euros")
print(" 2         América Central                       20.00 euros")
print(" 3         América del Sur                       21.00 euros")
print(" 4         Europa                                10.00 euros")
print(" 5         Asia                                  18.00 euros")
print("------------------------------------------------------------")
zona = int(input("Introduzca la zona a enviar> "))

if(zona==1):
    costeGr = 24.00
elif(zona==2):
    costeGr = 20.00
elif(zona==3):
    costeGr = 21.00
elif(zona==4):
    costeGr = 10.00
elif(zona==5):
    costeGr = 18.00

coste = peso*costeGr
print(f"El precio del envío es {coste} euros")



