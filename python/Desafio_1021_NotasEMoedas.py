'''
 Leia um valor de ponto flutuante com duas casas decimais. 
 Este valor representa um valor monetário. 
 A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
 As notas consideradas são de 100, 50, 20, 10, 5, 2. 
 As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
 A seguir mostre a relação de notas necessárias.

ENTRADA
 O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

SAíDA
 Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

 Obs: Utilize ponto (.) para separar a parte decimal.
'''

valor = float(input())

notas = valor // 1
moedas = (valor % 1) * 100

notas100 = notas // 100

restanteNotas = notas % 100
notas50 = restanteNotas / 50

restanteNotas = restanteNotas % 50
notas20 = restanteNotas / 20

restanteNotas = restanteNotas % 20
notas10 = restanteNotas / 10

restanteNotas = restanteNotas % 10
notas5 = restanteNotas / 5

restanteNotas = restanteNotas % 5
notas2 = restanteNotas / 2

restanteNotas = restanteNotas % 2
moedas1r = restanteNotas

moedas50 = moedas / 50

restanteMoedas = moedas % 50
moedas25 = restanteMoedas / 25

restanteMoedas = restanteMoedas % 25
moedas10 = restanteMoedas / 10

restanteMoedas = restanteMoedas % 10
moedas5 = restanteMoedas / 5

restanteMoedas = restanteMoedas % 5
moedas1 = restanteMoedas

print('NOTAS:')
print(f'{notas100} nota(s) de R$ 100.00')
#print('%d nota(s) de R$ 100.00' %notas100)

print(f'{notas50} nota(s) de R$ 50.00')
#print('%d nota(s) de R$ 50.00' %notas50)

print(f'{notas20} nota(s) de R$ 20.00')
#print('%d nota(s) de R$ 20.00' %notas20)

print(f'{notas10} nota(s) de R$ 10.00')
#print('%d nota(s) de R$ 10.00' %notas10)

print(f'{notas5} nota(s) de R$ 5.00')
#print('%d nota(s) de R$ 5.00' %notas5)

print(f'{notas2} nota(s) de R$ 2.00')
#print('%d nota(s) de R$ 2.00' %notas2)

print('MOEDAS:')
print(f'{moedas1r} moeda(s) de R$ 1.00')
#print('%d moeda(s) de R$ 1.00' %moedas1r)

print(f'{moedas50} moeda(s) de R$ 0.50')
#print('%d moeda(s) de R$ 0.50' %moedas50)

print(f'{moedas25} moeda(s) de R$ 0.25')
#print('%d moeda(s) de R$ 0.25' %moedas25)

print(f'{moedas10} moeda(s) de R$ 0.10')
#print('%d moeda(s) de R$ 0.10' %moedas10)

print(f'{moedas5} moeda(s) de R$ 0.05')
#print('%d moeda(s) de R$ 0.05' %moedas5)

print(f'{moedas1} moeda(s) de R$ 0.01')
#print('%d moeda(s) de R$ 0.01' %moedas1)