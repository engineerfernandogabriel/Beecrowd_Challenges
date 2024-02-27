'''
 Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
 Calcule e imprima a média semestral. 
 Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). 
 Cada nota deve ser validada separadamente.

ENTRADA
 A entrada contém vários valores reais, positivos ou negativos. 
 O programa deve ser encerrado quando forem lidas duas notas válidas.

SAíDA
 Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
 Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
 O valor deve ser apresentado com duas casas após o ponto decimal.
'''

sum = 0
count = 0

while(count < 2):
    value = float(input())

    if(value >= 0 and value <= 10):
        sum += value
        count += 1
    else:
        print('nota invalida')

media = sum / 2

print('media = %.2f' %media)