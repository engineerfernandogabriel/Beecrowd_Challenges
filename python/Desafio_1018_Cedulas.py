'''
 Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
 As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

ENTRADA
 O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

SAíDA
 Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
 Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
'''

valor = int(input())

notas100 = valor // 100

restante = valor % 100
notas50 = restante / 50

restante = restante % 50
notas20 = restante / 20

restante = restante % 20
notas10 = restante / 10

restante = restante % 10
notas5 = restante / 5

restante = restante % 5
notas2 = restante / 2

restante = restante % 2
notas1 = restante

print(valor)
print('%d nota(s) de R$ 100,00' %notas100)
print('%d nota(s) de R$ 50,00' %notas50)
print('%d nota(s) de R$ 20,00' %notas20)
print('%d nota(s) de R$ 10,00' %notas10)
print('%d nota(s) de R$ 5,00' %notas5)
print('%d nota(s) de R$ 2,00' %notas2)
print('%d nota(s) de R$ 1,00' %notas1)
