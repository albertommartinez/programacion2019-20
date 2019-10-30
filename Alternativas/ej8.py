# -*- coding: utf-8 -*-

#Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
#mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
#dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
#imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

#1.almacenar nota (int)
#2.almacenar edad (int)
#3.almacenar sexo (str[1])
#4.si nota mayor o igual a 5 y edad mayor o igual a 18, comprobar si sexo es 'F'
#5.si sexo es 'F' devuelve ÀCEPTADA
#6.si sexo es 'M' devuelve POSIBLE’
#7.si no cumple condiciones devuelve 'NO ACEPTADA'

print("..::Acceso Matriculación::..")
nota = int(input("Introduce nota> "))
edad = int(input("Introduce edad> "))
sexo = str(input("Introduce sexo(F/M)>"))
sexo = sexo.upper()
if(nota>=5)and(edad>=18):
    if(sexo=="F"):
        print("ACEPTADA")
    elif(sexo=="M"):
        print("POSIBLE")
else:
    print("NO ACEPTADA")
