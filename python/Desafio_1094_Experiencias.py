'''
 Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos 
de um laboratório o qual ela é responsável. 
 
 Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

 Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
 
 Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a 
quantidade de cobaias utilizadas em cada experimento.

ENTRADA
 A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
 
 Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere 
Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

SAíDA
 Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total 
de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
'''

n = int(input())
total = 0
totalC = 0
totalR = 0
totalS = 0

for i in range(n):
    values = input().split()
    
    quantia = int(values[0])
    tipo = values[1]

    total += quantia

    if (tipo == 'C'):
        totalC += quantia
    elif (tipo == 'R'):
        totalR += quantia
    else :
        totalS += quantia

    percentC = (totalC / total) * 100
    percentR = (totalR / total) * 100
    percentS = (totalS / total) * 100

print('Total: %d cobaias' %total)
print('Total de coelhos: %d' %totalC)
print('Total de ratos: %d' %totalR)
print('Total de sapos: %d' %totalS)
print('Percentual de coelhos: %.2f %%' %percentC)
print('Percentual de ratos: %.2f %%' %percentR)
print('Percentual de sapos: %.2f %%' %percentS)