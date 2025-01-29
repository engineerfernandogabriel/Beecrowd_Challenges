'''
 Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
 Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
 Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
o segundo valor tem peso 3 e o terceiro valor tem peso 5.

ENTRADA
 O arquivo de entrada contém um valor inteiro N na primeira linha. 
 Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

SAíDA
 Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
'''

n = int(input())

for i in range (n):
    value1, value2, value3 = list(map(float, input().split()))

    media = ((value1 * 2) + (value2 * 3) + (value3 * 5)) / 10

    print(f'{media:.1f}')