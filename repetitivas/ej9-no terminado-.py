# -*- coding: utf-8 -*-

#Mostrar en pantalla los N primero número primos. 
#Se pide por teclado la cantidad de números primos que queremos mostrar.

#almacenar cantidad de números primos
#si numero es mayor que 2 calcular los modulos entre 2 y el numero - 1
#si alguno de esos modulos da distinto de 0, no es primo
#de lo contrario es primo, lo mostramos y repetimos el proceso hasta llegar a N números

print("---[Te doy los números primos que me pidas]---")
cantidad = int(input("Introduce la cantidad de números primos que deseas> "))
numero = 3
y = 0
x = 2
contadorPrimos = 0
primo = False
'''
for x in range(3, cantidad):
    for i in range(2,x):
        if(x%i != 0):
            primo = True
        else:
            primo = False
            break
    else:
        if(primo==True):
            print(f"El número {x} es primo")
'''
while y<cantidad:
    while x<numero:
        if(numero%x==0):
            primo = True
        else:
            primo = False
        x = x + 1
    if(primo==True):
        print(numero)
    y = y + 1
    
                   
		
			
			
	
      

	


		
		
