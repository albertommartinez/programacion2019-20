# -*- coding: utf-8 -*-

#Mostrar en pantalla los N primero número primos. 
#Se pide por teclado la cantidad de números primos que queremos mostrar.

#almacenar cantidad de números primos
#si numero es mayor que 2 calcular los modulos entre 2 y el numero - 1
#si alguno de esos modulos da distinto de 0, no es primo
#de lo contrario es primo, lo mostramos y repetimos el proceso hasta llegar a N números

print("---[Te doy los números primos que me pidas]---")
cantidad = int(input("Introduce la cantidad de números primos que deseas> "))
numero = 2
x = 2
contadorPrimos = 0
primo = True

while contadorPrimos<cantidad:
    while (primo==True)and(x<=(numero**(1/2))):
        if(numero%x!=0):
            primo = True
        else:
            primo = False
        x = x + 1
    if(primo==True):
        contadorPrimos = contadorPrimos + 1
        print(numero)
    numero = numero + 1
 
   
                   
		
			
			
	
      

	


		
		
