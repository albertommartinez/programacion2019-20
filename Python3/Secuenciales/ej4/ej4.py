# -*- coding: utf-8 -*-
#Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
#pedir numeroA
#almacenar en variable numeroA
#pedir numeroB
#mostrar numeroA + numeroB
#mostrar numeroA - numeroB
#mostrar numeroA * numeroB
#mostrar numeroA / numeroB

print("Mostrar + - * / de dos números")
numeroA = float(input("Introduce número A> "))
numeroB = float(input("Introduce número B> "))
print("Suma> "+str(numeroA+numeroB))
print("Resta> "+str(numeroA-numeroB))
print("Producto> "+str(numeroA*numeroB))
if(numeroB!=0):
	print("Cociente> "+str(numeroA/numeroB))
else:
	print("no se puede dividir entre 0")