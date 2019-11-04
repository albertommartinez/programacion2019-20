# -*- coding: utf-8 -*-

#Escribir un algoritmo para calcular la nota final de un estudiante, considerando que 
#por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. 
#Imprime el resultado obtenido por el estudiante.

#1.pedir número de respuestas correctas
#2.almacenar número de respuestas correctas
#3.pedir número de respuestas incorrectas
#4.almacenar número de respuestas incorrectas
#5.notaFinal = (respuestasCorrectas*5)-respuestas incorrectas 
#6.mostrar nota

print("^-^ Calcular nota media ^-^")
correctas = int(input("Introduce cantidad de respuestas correctas> "))
incorrectas = int(input("Introduce catidad de respuestas incorrectas> "))

notaFinal = (correctas*5)-incorrectas

print("La nota final es "+str(notaFinal))