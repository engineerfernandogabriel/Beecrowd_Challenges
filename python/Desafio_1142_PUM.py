'''
 Escreva um programa que leia um valor inteiro N. 
 Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

ENTRADA
 O arquivo de entrada contém um número inteiro positivo N.

SAíDA
 Imprima a saída conforme o exemplo fornecido.
'''

n = int(input())
count = 1

for i in range(n):
    n1 = count
    n2 = count + 1
    n3 = count + 2
    print('%d %d %d PUM' %(n1, n2, n3))

    count += 4