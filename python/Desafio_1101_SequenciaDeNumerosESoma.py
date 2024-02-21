'''
 Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). 
 Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

ENTRADA
 O arquivo de entrada contém um número não determinado de valores M e N. 
 A última linha de entrada vai conter um número nulo ou negativo.

SAíDA
 Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
'''

condition = True

while(condition):
    x, y = list(map(int, input().split()))

    if ( x > 0 and y > 0):
        sum = 0

        if (x > y):
            aux = x
            x = y
            y = aux
        
        for i in range (x, y + 1):
            sum += i
            print('%d ' %i, end="")
        
        print('Sum=%d' %sum)

    else:
        condition = False