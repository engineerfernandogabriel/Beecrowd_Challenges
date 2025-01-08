'''
 Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. 
 A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem
adequada:
    se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
    se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
    se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
    se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

ENTRADA
 A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

SAíDA
 Imprima todas as classificações do triângulo especificado na entrada.
'''

values = list(map(float, input().split()))

valueA, valueB, valueC = values

maior = 0
meio = 0
menor = 0

if (valueA > valueB and  valueA > valueC):
    maior = valueA

    if (valueB > valueC):
        meio = valueB
        menor = valueC
    else:
        meio = valueC
        menor = valueB
elif (valueB > valueA and valueB > valueC):
    maior = valueB

    if (valueA > valueC):
        meio = valueA
        menor = valueC
    else:
        meio = valueC
        menor = valueA
else:
    maior = valueC

    if (valueA > valueC):
        meio = valueA
        menor = valueB
    else:
        meio = valueB
        menor = valueA

if (maior >= meio + menor):
    print('NAO FORMA TRIANGULO')
else:
    if (maior**2 == meio**2 + menor**2):
        print('TRIANGULO RETANGULO')
    
    if (maior**2 > meio**2 + menor**2):
        print('TRIANGULO OBTUSANGULO')

    if (maior**2 < meio**2 + menor**2):
        print('TRIANGULO ACUTANGULO')

    if (maior == meio and maior == menor):
        print('TRIANGULO EQUILATERO')
    elif (maior == meio or maior == menor or meio == menor):
        print('TRIANGULO ISOSCELES')