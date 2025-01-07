'''
 Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
 Utilize a fórmula:

 MaiorAB = (a+b+abs(a-b))/2

 Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
 Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
 O arquivo de entrada contém três valores inteiros.

SAíDA
 Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
'''

valores = list(map(int, input().split()))

valueA, valueB, valueC = valores

maior = (valueA + valueB + abs(valueA - valueB)) / 2

if maior < valueC:
    maior = valueC

print(f'{maior} eh o maior')
#print('%d eh o maior' %maior)