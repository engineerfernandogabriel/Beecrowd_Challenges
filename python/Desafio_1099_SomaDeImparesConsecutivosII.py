'''
 Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
 Cada caso de teste consiste de dois inteiros X e Y. 
 Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

ENTRADA
 A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
 Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

SAíDA
 Imprima a soma de todos valores ímpares entre X e Y.
'''

n = int(input())

for i in range (n):
    valueX, valueY = list(map(int, input().split()))

    if (valueX > valueY):
        aux = valueX
        valueX = valueY
        valueY = aux

    sum = 0

    for j in range (valueX + 1, valueY):
        if (j % 2 !=0):
            sum += j
    
    print(sum)