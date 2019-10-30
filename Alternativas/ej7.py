# -*- coding: utf-8 -*-

#Realiza un algoritmo que calcule la potencia, para ello 
#pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
#-El exponente sea positivo, sólo tienes que imprimir la potencia.
#-El exponente sea 0, el resultado es 1.
#-El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

#1.almacenar base (int)
#2.almacenar exponente (int)
#3.si el exponente es positivo realizamos base**exponente
#4.si el exponente es 0 mostramos 1
#5.si el exponente es negativo realizamos 1/base**(exponente*(-1))

print("--->Calculadora de potencias<---")
base = float(input("Introducir base> "))
exponente = float(input("Introducir exponente> "))

if(exponente<0):
    resultado = 1/base**(exponente*(-1))
elif(exponente==0):
	resultado = 1
else:
	resultado = base**exponente

print(f"El resultado de{base}^{exponente} es {resultado}")
