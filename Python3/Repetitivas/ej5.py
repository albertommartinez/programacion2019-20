# -*- coding: utf-8 -*-

#Escribe un programa que pida el limite inferior y superior de un intervalo. 
#Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 
#A continuación se van introduciendo números hasta que introduzcamos el 0. 
#Cuando termine el programa dará las siguientes informaciones:
#    -La suma de los números que están dentro del intervalo (intervalo abierto).
#    -Cuantos números están fuera del intervalo.
#    -Informa si hemos introducido algún número igual a los límites del intervalo.

#almacenar limiteInferior
#almacenar limiteSuperior
#si limiteSuperior < limiteInferior volver a pedir limites
#cuando los limites sean válidos 
#almacenamos enteros
#hasta que sea 0
#y mostrará:
#la suma de los números dentro del intervalo
#cuantos están fuera del intervalo
#si alguno es igual a los límites

print("---Intervalos---")
limiteInferior = 0
limiteSuperior = 0
sumaNumero = 0
fueraIntervalo = 0
while True:
	while limiteSuperior<=limiteInferior:
		limiteInferior = int(input("Introduce el limite inferior del intervalo> "))
		limiteSuperior = int(input("Introduce el limite superior del intervalo> ")) 
	while True:
		numero = int(input("Introduce un número entero(0 para salir)> "))
		if(numero==0): #No consigo que funcione el salir
			break
		if((numero>=limiteInferior)and(numero<=limiteSuperior)):#Dentro del intervalo
			sumaNumero = sumaNumero + numero
		elif((numero==limiteInferior)or(numero==limiteSuperior)):#Coinciden con alguno de los límites
			igualLimites = True
		else:#Fuera del intervalo
			fueraIntervalo = fueraIntervalo + 1
		
