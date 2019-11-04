# -*- coding: utf-8 -*-

#Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) 
#después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).

#pedir cuantas monedas de 2e
#almacenar en variable e2
#pedir cuantas monedas de 1e
#almacenar en variable e1
#pedir cuantas monedas de 50c
#almacenar en variable c50
#pedir cuantas monedas de 20c
#almacenar en variable c20
#pedir cuantas monedas de 10c
#almacenar en variable c10
#euros = (e2*2)+e1
#centimos = c50+c20+10
#si centimos > 100 -> añadir a euro
#y los centimos restantes siguen en variables de centimos

e2 = float(input("Cuantas monedas de 2 euros>"))
e1 = float(input("Cuantas monedas de 1 euros>"))
c50 = float(input("Cuantas monedas de 0'50 centimos>"))
c20 = float(input("Cuantas monedas de 0'20 centimos>"))
c10 = float(input("Cuantas monedas de 0'10 centimos>"))

euros = (e2*2)+e1
centimos = c50+c20+c10
transEuros = centimos//100
euros = euros + transEuros
centimos = centimos%100

print(str(euros)+" euros "+str(centimos)+" centimos") 

