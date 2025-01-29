'''
  Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    I=1 J=7
    I=1 J=6
    I=1 J=5
    I=3 J=7
    I=3 J=6
    I=3 J=5
    ...
    I=9 J=7
    I=9 J=6
    I=9 J=5

ENTRADA
 Não há nenhuma entrada neste problema.

SAíDA
 Imprima a sequencia conforme exemplo abaixo
'''

for i in range (1, 10, 2):
    for j in range (7, 4, -1):
        print(f'I={i} J={j}')