# -*- coding: utf-8 -*-

#Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo 
#que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.

#pedir valor variable A
#almacenar A
#pedir valor variable B
#almacenar B
#mostrar variable A
#mostrar variable B
#almacenar valor de A en variable AUX
#almacenar valor de B en AUX
#almacenar valor de AUX en B
#mostrar variable A
#mostrar variable B

print("==::Intercambiar valores de variables::==")
a = int(input("Introduce un valor entero para la variable A> "))
b = int(input("Introduce un valor entero para la variable B> "))
print("Antes")
print("A: "+str(a))
print("B: "+str(b))
aux = a
a = b
b = aux
print("Ahora")
print("A: "+str(a))
print("B: "+str(b))
