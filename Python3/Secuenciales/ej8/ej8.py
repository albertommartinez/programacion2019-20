# -*- coding: utf-8 -*-
#Un vendedor recibe un sueldo base mas un 10% extra 
#por comisión de sus ventas, el vendedor desea saber cuanto 
#dinero obtendrá por concepto de comisiones por las tres ventas 
#que realiza en el mes y el total que recibirá en el mes 
#tomando en cuenta su sueldo base y comisiones.

#pedir sueldo base
#almacenar sueldo base
#pedir precio producto
#almacenar precio producto
#comision = (precioProducto*0.10)*3
#totalMes = sueldoBase+comision

print("==..::Calcular comisión::..==")
sueldoBase = float(input("Introduce el sueldo base> "))
precioProducto = float(input("Introduce el precio del producto> "))
comision = (precioProducto*0.10)*3
totalMes = sueldoBase+comision
print("El vendedor este mes recibira un total de "+str(totalMes)+" del cúal por comisiones es "+str(comision))
