# -*- coding: utf-8 -*-

#Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
#El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

#almacenar cuantos números introduciremos
#almacenar numero
#si es mayor que cero
#incrementa contador de mayores que 0
#si es menor que cero
#incrementa contador de menores que 0
#si es 0 
#incrementa contador de iguales que 0
#mostrar contadores

print("::-... Comparador de valores con 0 ...-::")
contadorNumeros = 0
cantidadNumeros = int(input("¿Cuantos números vas a introducir> ?"))
menor = 0
mayor = 0
cero = 0

while cantidadNumeros > contadorNumeros:
    numero = int(input("Dime un número "))
    if(numero<0):
        menor = menor + 1
    elif(numero>0):
        mayor = mayor + 1
    else:
        cero = cero + 1
    contadorNumeros = contadorNumeros + 1
			
print(f"Finalizamos el recuento con {mayor} números mayores que cero, {menor} menores y {cero} igual a cero.")
