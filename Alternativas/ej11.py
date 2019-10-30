# -*- coding: utf-8 -*-

#Programa que lea 3 datos de entrada A, B y C. 
#Estos corresponden a las dimensiones de los lados de un triángulo. 
#El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
#    -Si se cumple Pitágoras entonces es triángulo rectángulo
#    -Si sólo dos lados del triángulo son iguales entonces es isósceles.
#    -Si los 3 lados son iguales entonces es equilátero.
#    -Si no se cumple ninguna de las condiciones anteriores, es escaleno.

#1.almacenar A (real)
#2.almacenar B (real)
#3.almacenar C (real)
#4.si A,B y C son iguales es equilatero
#5.de lo contrario, comprobamos si dos son iguales, en ese caso es isósceles
#6.de lo contrario, calculamos el lado mayor para identificar la hipotenusa
#6.aplicamos Pitágoras, para comprobar si es rectángulo
#7.de lo contrario es escaleno

#Pedir datos
print("--->Triángulos<---")
ladoA = float(input("Introduce lado A> "))
ladoB = float(input("Introduce lado B> "))
ladoC = float(input("Introduce lado C> "))

#Calculos
if((ladoA==ladoB)and(ladoB==ladoC)): #si los tres lados son iguales
    print("El triángulo es equilatero")
elif((ladoA==ladoB)or(ladoB==ladoC)):
	print("El triángulo es isósceles")
else:
	if(ladoA>ladoB)and(ladoB>ladoC): #identificar catetos e hipotenusa
		hipotenusa = ladoA
		catetoA = ladoB
		catetoB = ladoC
	if(ladoB>ladoA)and(ladoA>ladoC):
		hipotenusa = ladoB
		catetoA = ladoA
		catetoB = ladoC
	if(ladoC>ladoA)and(ladoC>ladoB):
		hipotenusa = ladoC
		catetoA = ladoA
		catetoB = ladoB 
	
	if(hipotenusa**2==catetoA**2+catetoB**2): #si cumple Pitágoras es rectángulo sino escaleno
		print("El triángulo es rectángulo")
	else:
		print("El triángulo es escaleno")

