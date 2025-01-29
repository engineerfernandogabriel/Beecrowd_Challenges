'''
 Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
    1 x N = N      2 x N = 2N        ...       10 x N = 10N

ENTRADA
A entrada contém um valor inteiro N (2 < N < 1000).

SAíDA
 Imprima a tabuada de N, conforme o exemplo fornecido.
'''

n = int(input())

for i in range(1, 11):
    value = n * i
    print(f'{i} x {n} = {value}')