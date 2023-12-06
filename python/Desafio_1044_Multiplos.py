'''
 Leia 2 valores inteiros (A e B). 
 Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

ENTRADA
 A entrada contém valores inteiros.

SAíDA
 A saída deve conter uma das mensagens conforme descrito acima.
'''

values = list(map(int, input().split()))

valueA, valueB = values

if (valueA % valueB == 0 or valueB % valueA ==0) :
    print('Sao Multiplos')
else :
    print('Nao sao Multiplos')
