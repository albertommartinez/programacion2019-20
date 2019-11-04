# -*- coding: utf-8 -*-

#La asociación de vinicultores tiene como política fijar un precio inicial
#al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. 
#Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, 
#se requiere determinar cuánto recibirá un productor por la uva que entrega 
#en un embarque, considerando lo siguiente: si es de tipo A, se le 
#cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2. 
#Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
#Realice un algoritmo para determinar la ganancia obtenida.

#almacenar precio inicial (real)
#almacenar tipo (str(1))
#almacenar tamaño (int)
#almacenar cantidad kilos (real)
#si es tipo A y tamaño1 le sumamos 0.20 al precio inicial obteniendo el precioKilo
#si es tipo A y tamaño2 le sumamos 0.30 al precio inicial obteniendo el precioKilo
#si es tipo B y tamaño1 le sumamos 0.30 al precio inicial obteniendo el precioKilo
#si es tipo B y tamaño2 le sumamos 0.50 al precio inicial obteniendo el precioKilo
#muliplicamos precioKilo por la cantidad de kilo

#pedir datos
print("..::Calcular ganancia vinicultores::..")
precioInicial = float(input("Introduce el precio inicial del kilo de uva> "))
tipo = input("Introduce tipo de uva(A/B)> ")
tipo = tipo.upper()
tamano = int(input("Introduce tamaño(1, 2)> "))
cantidad = float(input("Introduce la cantidad de uva(Kg)> "))

#calculos
if(tipo == "A"):
    if(tamano == 1):
        precioKilo = precioInicial + 0.20
    if(tamano == 2):
        precioKilo = precioInicial + 0.30
if(tipo == "B"):
    if(tamano == 1):
        precioKilo = precioInicial + 0.30
    if(tamano == 2):
        precioKilo = precioInicial + 0.50

ganancia = cantidad*precioKilo 

#mostrar resultado
print(f"La ganancia total ha si de {ganancia}")
