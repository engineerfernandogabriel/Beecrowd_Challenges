'''
 Leia 5 valores Inteiros. 
 A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram 
positivos e quantos valores digitados foram negativos.

ENTRADA
 O arquivo de entrada contém 5 valores inteiros quaisquer.

SAíDA
 Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
'''

par = 0
impar = 0
positivo = 0
negativo = 0

for _ in range(5):
    value = int(input())

    if (value % 2 == 0):
        par += 1
    else:
        impar += 1

    if (value > 0):
        positivo += 1
    elif (value < 0):
        negativo += 1
    
print('%d valor(es) par(es)' %par)
print('%d valor(es) impar(es)' %impar)
print('%d valor(es) positivo(s)' %positivo)
print('%d valor(es) negativo(s)' %negativo)