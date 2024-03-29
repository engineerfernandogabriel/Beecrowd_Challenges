'''
 Escreva um programa que leia um valor inteiro N. 
 N * 2 linhas de saída serão apresentadas na execução do programa, seguindo a lógica do exemplo abaixo. 
 Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

ENTRADA
 O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

SAíDA
 Imprima a saída conforme o exemplo fornecido.
'''

n = int(input())

for i in range(1, n + 1):
    value2 = i * i
    value3 = value2 * i

    print('%d %d %d' %(i, value2, value3))

    value2 += 1
    value3 += 1

    print('%d %d %d' %(i, value2, value3))