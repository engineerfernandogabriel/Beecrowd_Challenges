'''
 Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
 Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

ENTRADA
 A entrada contém vários casos de teste. 
 Cada caso contém dois valores inteiros X e Y. 
 A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

SAíDA
 Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
'''

numbersDifferent = True

while(numbersDifferent):
    x, y = list(map(int, input().split()))

    if ( x != y):
        if(x < y):
            print('Crescente')
        else:
            print('Decrescente')
    else:
        numbersDifferent = False