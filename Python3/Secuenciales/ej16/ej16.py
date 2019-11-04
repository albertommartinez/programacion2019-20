# -*- coding: utf-8 -*-

#Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados 
#por una distancia d. El que está detrás viaja a una velocidad mayor. 
#Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) 
#y sus respectivas velocidades (km/h) y con esto determinar y mostrar 
#en que tiempo (minutos) alcanzará el vehículo más rápido al otro.

#pedir distancia
#almacenar distancia
#pedir velocidad mayor
#almacenar velocidadMayor
#pedir velocidad menor
#almacenar velocidadMenor
#tiempo = distancia/(velocidadMayor-velocidadMenor)
#tiempo(min) = tiempo*60
#mostrar tiempo

print("Calculará el tiempo en alcanzar un coche a otro siendo más rápido el segundo")
distancia = float(input("Introduce la distancia entre los coches(km)> "))
velocidadMayor = float(input("Introduce la velocidad del coche más rápido, el de atrás(km/h)> "))
velocidadMenor = float(input("Introduce la velocidad del coche menos rápido, el de delante(km/h)> "))
tiempo = (distancia/(velocidadMayor-velocidadMenor))*60

print("Los vehiculos se alcanzaran en "+str(tiempo)+" minutos")