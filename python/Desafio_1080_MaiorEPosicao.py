'''
 Leia 100 valores inteiros. 
 Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

ENTRADA
 O arquivo de entrada contém 100 números inteiros, positivos e distintos.

SAíDA
 Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
'''

max = 0
position = 0

for i in range (1, 101):
    value = int(input())

    if (value > max):
        max = value
        position = i

print(max)
print(position)