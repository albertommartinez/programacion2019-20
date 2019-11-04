# -*- coding: utf-8 -*-
import math
#Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
#pedir catetoA
#almacenar en variable
#pedir catetoB
#almacenar en variable
#realizar el calculo hipotenusa = raiz(catetoA^2 + catetoB^2)
#mostrar hipotenusa

print("==Calcular Hipotenusa de triangulo rectángulo==")
catetoA = float(input("Introduce el valor del cateto A>"))
catetoB = float(input("Introduce el valor del cateto B>"))
hipotenusa = math.sqrt(catetoA**2+catetoB**2)
print("El valor de la hipotenusa es "+ str(hipotenusa))
