'''
 Faça um programa que leia 5 valores inteiros. 
 Conte quantos destes valores digitados são pares e mostre esta informação.

ENTRADA
 O arquivo de entrada contém 5 valores inteiros quaisquer.

SAíDA
 Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
'''

count = 0

for _ in range(5):
    value = int(input())
    if (value % 2 ==0):
        count += 1

print(f'{count} valores pares')