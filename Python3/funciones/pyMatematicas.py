# -*- coding: utf-8 -*-
'''
Funciones matemáticas útiles

@author: Alberto Miguel Martínez Jiménez
'''

'''
 devuelve si el entero pasado por parámetro
 es primo o no    
 @param numero int
 @return boolean
'''
def esPrimo(numero):
    i=2
    while i<numero:
        if(numero%i==0):
            return False
    return True

'''
devuelve la longitud de un número entero
@param numero int
@return longitud int
'''
def potencia(base,exponente):
    return base**exponente

'''
devuelve la longitud de un número entero
@param numero int
@return longitud int
'''
def digitos(numero):
    return len(numero)
 
'''
devuelve la concatenación de dos números enteros    
@param numeroA int
@param numeroB int
@return numeroC int
'''
def juntaNumeros(numeroA,numeroB):
    return int(str(numeroA)+str(numeroB))

'''
devuelve el número pasado por par�metro
en orden inverso
@param numero int
@return invertido int
'''
def voltea(numero):
    i = 0
    invertido = 0
    longitud = digitos(numero)
    
    while(i<longitud):
        invertido = juntaNumeros(invertido, numero%10)
        numero = numero/10
        i = i + 1
    return invertido
        
'''
devuelve el primer número primo
desde un entero pasado por parámetro
@param numero int
@return numero int 
'''
def siguientePrimo(numero):
    while(not esPrimo(numero)):
        numero = numero + 1
    return numero

'''
devuelve true si el número pasado por parámetro
es capicúa    
@param numero int
@return boolean
'''
def esCapicua(numero):
    if(numero==voltea(numero)):
        return True
    else:
        return False

'''
devuelve el digito de la posición n pasada
por parámetro
@param n int
@return int 
'''        
def digitoN(numero,n):
    return numero[n]
        
'''
devuelve la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.    
@param numero int
@param digito int
@return int
'''
def posicionDeDigito(numero,digito):
    i = 0
    while i<digitos(numero):
        if(digito==digitoN(numero,i)):
            return i
        i = i + 1
    return -1

'''
quita una cantidad de cifras pasadas por parámetro
al número pasado    
@param numero int
@param nCifras int
@return int
'''
def quitarPorDetras(numero,nCifras):
    i = 0
    while i<nCifras:
        numero = numero/10
        i = i + 1
    return int(numero)

'''
quita el número de cifras pasada por parámetro a un 
valor entero pasado    
@param numero int
@param nCifras int
@return int
''' 
def quitarPorDelante(numero,nCifras):   
    longitud = digitos(numero)
    posicionCorte = longitud - nCifras
    divisor = 10
    
    if(posicionCorte>0):
        i = 0
        while i<posicionCorte:
            divisor = divisor*10
            i = i + 1
        return numero&divisor
    return -1    

'''
concatena dos números enteros por detras    
@param numeroA int
@param numeroB int
@return int
'''
def pegarPorDetras(numeroA,numeroB):
    return int(str(numeroA)+str(numeroB))

'''
concatena dos números enteros por delante
@param numeroA int
@param numeroB int
@return int
'''
def pegarPorDelante(numeroA,numeroB):
    return int(str(numeroB)+str(numeroA))  


'''
devuelve parte de un número pasado por parámetro
desde uno a otro indice pasado    
@param numero int
@param posicionInicio int
@param posicionFinal int
@return int
'''
def trozoDeNumero(numero,posicionInicio,posicionFinal):
    longitud = digitos(numero)
    numero = quitarPorDetras(numero,(longitud-posicionFinal))
    numero = quitarPorDelante(numero,posicionInicio)  
    return numero;


if __name__ == "__main__":
    print("esPrimo()")
    print("5-> "+esPrimo(5))
    print("4-> "+esPrimo(4))
    print("\n")
    print("potencia()")
    print("5^2="+potencia(5, 2))
    print("\n")
    print("digitos(123456789) : "+digitos(123456789))
    print("\n")
    print("juntaNumeros(50,4) : "+juntaNumeros(50,4))
    print("\n")
    print("voltea(123456789) : "+voltea(123456789))
    print("\n")
    print("siguientePrimo(4) : "+siguientePrimo(4))
    print("\n")
    print("esCapicua(454) : "+esCapicua(454))
    print("esCapicua(123) : "+esCapicua(123))
    print("\n")
    print("digitoN(12345,3) : "+digitoN(12345,3))
    print("\n")
    print("posicionDeDigito(123456789,5) : "+posicionDeDigito(123456789,5))
    print("\n")
    print("quitarPorDetras(123456789,3) : "+quitarPorDetras(123456789,3))
    print("\n")
    print("quitarPorDelante(123456789,3) : "+quitarPorDelante(123456789,3))
    print("\n")
    print("pegarPorDetras(12345,6789)"+pegarPorDetras(12345,6789))
    print("\n")
    print("pegarPorDelante(12345,6789)"+pegarPorDelante(12345,6789))
    print("\n")
    print("trozoDeNumero(123456789,3,7) :"+trozoDeNumero(123456789, 3, 7))
    















