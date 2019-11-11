# -*- coding: utf-8 -*-

#Crea una aplicación que permita adivinar un número. 
#La aplicación genera un número aleatorio del 1 al 100. 
#A continuación va pidiendo números y va respondiendo si el número a adivinar 
#es mayor o menor que el introducido,a demás de los intentos que te quedan(tienes 10 intentos para acertarlo). 
#El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), 
#si se llega al limite de intentos te muestra el número que había generado.

#almacenar número aleatorio de 1 a 100
#pedir numero
#comprobar si numero coincide con numeroAleatorio
#si coinciden termina, y muestra en cuantos intentos
#si no, incremente el valor de intentos
#vuelve a preguntar el numero
from random import randint

print("...-->ADIVINA EL NÚMERO<--...")
numeroAleatorio = randint(1, 100)
numero = 0
intentos = 0
while((numeroAleatorio!=numero)and(intentos<10)):
	numero = int(input("En que número del 1 al 100 estoy pensando> "))
	if(numero<numeroAleatorio):
		print("El número misterioso es mayor")
	elif(numero>numeroAleatorio):
		print("El número misterioso es menor")
	intentos = intentos + 1
	if(intentos==10):
		print("  GAME OVER  ")
if(intentos!=10):
    print(f"Has acertado en {intentos} intentos, el número es {numeroAleatorio}")

