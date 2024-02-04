'''
 Leia um valor inteiro X. 
 Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

ENTRADA
 A entrada será um valor inteiro positivo.

SAíDA
 A saída será uma sequência de seis números ímpares.
'''

value = int(input())

if(value % 2 == 0):
    value +=1

for i in range (6):
    print(value)
    value += 2