# -*- coding: utf-8 -*-

#Una persona adquirió un producto para pagar en 20 meses. 
#El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. 
#Realizar un programa para determinar cuánto debe pagar mensualmente 
#y el total de lo que pagará después de los 20 meses.

#mensualidadBase = 10
#mensualidadBase*2
#mostrar mensualidadBase
#repetir 20 veces

print("----Mostrar Mensualidad----")
mensualidad = 10
total = mensualidad
print(f"Mensualidad 1 : {mensualidad}")
for iteracion in range(1,20):
	mensualidad = mensualidad*2
	total = total + mensualidad 
	print(f"Mensualidad {iteracion+1} : {mensualidad}")
print(f"Total pagado trás 20 meses---> {total}")
