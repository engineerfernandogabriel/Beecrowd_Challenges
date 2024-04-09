'''
 Escreva um programa que leia dois valores X e Y. 
 A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.

ENTRADA
 O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

SAíDA
 Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. 
 Não deve haver espaço em branco após o último valor da linha.
'''

x, y = list(map(int, input().split()))

count = 0
result = ""

for i in range(1, y + 1):
    result += str(i) + " "
    count += 1

    if (count == x or i == y):
        print(result.rstrip())
        result = ""
        count = 0
