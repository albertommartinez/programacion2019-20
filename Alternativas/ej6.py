# -*- coding: utf-8 -*-

#Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

#1.almacenar letra (str)
#2.volver a almacenar letra en ora variable (str)
#3.transformar una de las letras a mayuscula
#4.comparar ambas variables
#5.si son iguales la letra es mayuscula
#6.si por el contrarios son distintos la letra sera minuscula

print("---Descubrir si una letra es mayúscula---")
letra1 = input("Introducir letra(mayúscula o miniscula)> ")
if(len(letra1)==1):
    if(letra1.isdigit()):
        print("El caracter es un número")
    else:
        letra2 = letra1
        if((letra2.upper())==letra1):
            print(f"{letra1} es mayúscula")
        else:
            print(f"{letra1} es minúscula")
