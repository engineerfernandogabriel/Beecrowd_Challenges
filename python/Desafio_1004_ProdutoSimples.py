'''
 Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
 A seguir mostre a variável PROD com mensagem correspondente.   

ENTRADA
 O arquivo de entrada contém 2 valores inteiros.

SAíDA
 Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. 
 Não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
'''

valueA = int(input())
valueB = int(input())

produto = valueA * valueB

print('PROD = %i' %produto)