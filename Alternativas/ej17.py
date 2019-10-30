# -*- coding: utf-8 -*-

#Realiza un programa que pida por teclado el resultado (dato entero) 
#obtenido al lanzar un dado de seis caras y muestre por pantalla 
#el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
#Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
#Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.

#almacenar numero (int)
#si numero>6 o numero<1 muestra "ERROR: número incorrecto"
#si numero = 1 devuelve "SEIS"
#si numero = 2 devuelve "CINCO"
#si numero = 3 devuelve "CUATRO"
#si numero = 4 devuelve "TRES"
#si numero = 5 devuelve "DOS"
#si numero = 6 devuelve "UNO"

print("^_^---Lado Opuesto del dado---^_^")
lado = int(input("De que lado quieres conocer su opuesto> "))
if((lado>0)and(lado<7)):
    if(lado==1):
        opuesto = "SEIS"
    elif(lado==2):
        opuesto = "CINCO"
    elif(lado==3):
        opuesto = "CUATRO"
    elif(lado==4):
        opuesto = "TRES"
    elif(lado==5):
        opuesto = "DOS"
    elif(lado==6):
        opuesto = "UNO"
    print(f"El lado opuesto de {lado} es {opuesto}")     
else:
    print("ERROR: número incorrecto.")
