'''
 Faça um programa que leia 6 valores. 
 Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
 A seguir, mostre a quantidade de valores positivos digitados.

ENTRADA
 Seis valores, negativos e/ou positivos.

SAíDA
 Imprima uma mensagem dizendo quantos valores positivos foram lidos.
'''

values = []
count =0

for _ in range(6):
    values.append(float(input()))

for value in values:
    if (value > 0):
        count += 1

print('%s valores positivos' %count)