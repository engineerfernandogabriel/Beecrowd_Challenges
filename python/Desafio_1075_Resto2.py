'''
 Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

ENTRADA
 A entrada contém um valor inteiro N (N < 10000).

SAíDA
 Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
'''

n = int(input())

for i in range (10000):
    if ( i % n == 2):
        print(i)