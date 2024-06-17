'''
 Faça um algoritmo para ler um valor A e um valor N. 
 Apoés isso, Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1). 
 Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

ENTRADA
 A entrada contém somente valores inteiros, podendo ser positivos ou negativos. 
 Todos os valores estão na mesma linha.

SAíDA
 A saída contém apenas um valor inteiro.
'''

sum = 0

A = int(input())
N = int(input())

while (N <= 0):
    N = int(input())

for i in range (N):
    sum += A + i

print(sum)