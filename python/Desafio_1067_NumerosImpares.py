'''
 Leia um valor inteiro X (1 <= X <= 1000). 
 Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

ENTRADA
 O arquivo de entrada contém 1 valor inteiro qualquer.

SAíDA
 Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
'''

value = int(input())

for i in range(1, value + 1, 1):
    if(i % 2 != 0):
        print(i)