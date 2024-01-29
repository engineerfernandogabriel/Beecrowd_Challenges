'''
 Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
 Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

ENTRADA
 A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
 Pelo menos um destes números será positivo.

SAíDA
 O primeiro valor de saída é a quantidade de valores positivos. 
 A próxima linha deve mostrar a média dos valores positivos digitados.
'''

values = []
count = 0
sum = 0

for _ in range(6):
    values.append(float(input()))

for value in values:
    if(value > 0):
        count += 1
        sum += value

media = sum / count

print('%d valores positivos' %count)
print('%.1f' %media)