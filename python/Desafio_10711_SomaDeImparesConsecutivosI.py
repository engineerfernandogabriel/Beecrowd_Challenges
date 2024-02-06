'''
 Leia 2 valores inteiros X e Y. 
 A seguir, calcule e mostre a soma dos números impares entre eles.

ENTRADA
 O arquivo de entrada contém dois valores inteiros.

SAíDA
 O programa deve imprimir um valor inteiro. 
 Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
'''

valueA = int(input())
valueB = int(input())

soma = 0
valueAux = 0

if (valueA != valueB):
    if (valueA > valueB):
        aux = valueA
        valueA = valueB
        valueB = aux
    
    if (valueA % 2 == 0):
        valueAux = valueA + 1
    else:
        valueAux = valueA + 2

    for i in range (valueAux, valueB, 2):
        soma += i
    
    print(soma)
else:
    print(soma)