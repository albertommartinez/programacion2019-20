# -*- coding: utf-8 -*-

#Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
#sustituye la aparición del primer carácter en la cadena por el segundo carácter.

#almacenar cadena
#almacenar caracter1 
#si es de no longitud 1 se vuelve a pedir
#almacenar caracter2
#si es de no longitud 1 se vuelve a pedir
#nueva_Cadena = cadena.replace(caracter1,caracter2)

print("<[---Sustituir carácter en una cadena---]>")
cadena = input("Introduce una cadena> ")
while True:
    caracter1 = input("Introduce el caracter a sustituir> ")
    if((len(caracter1))==1): break
while True:
    caracter2 = input("Introduce el nuevo caracter > ")
    if((len(caracter2))==1): break

nueva_Cadena = cadena.replace(caracter1,caracter2)
print(f"la cadena <{cadena}> quedo como <{nueva_Cadena}>")
