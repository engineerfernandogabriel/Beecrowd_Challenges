'''
 Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. 
 Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

ENTRADA
 A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

SAíDA
 Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

 Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
'''

n = int(input())

for i in range (n):
    x, y = list(map(float, input().split()))

    if ( y == 0):
        print('divisao impossivel')
    else:
        result = x / y

        print('%.1f' %result)