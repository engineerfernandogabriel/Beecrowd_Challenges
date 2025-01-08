'''
 A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

           SALARIO          PERCENTUAL DE AJUSTE
        0 - 400                     15%
        400,01 - 800                12%
        800,01 - 1200               10%
        1200,01 - 2000               7%
        Acima de 2000                4%

 Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, 
em percentual.

ENTRADA
 A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

SAíDa
 Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o
percentual de reajuste ganho, conforme exemplo abaixo.
'''

salario = float(input())

novoSalario = 0
percentual = 0

if (salario <=400):
    novoSalario = salario * 1.15
    percentual = 15
elif (salario > 400 and salario <= 800):
    novoSalario = salario * 1.12
    percentual = 12
elif (salario > 800 and salario <= 1200):
    novoSalario = salario * 1.10
    percentual = 10
elif (salario > 1200 and salario <= 2000):
    novoSalario = salario * 1.07
    percentual = 7
else:
    novoSalario = salario * 1.04
    percentual = 4

reajuste = novoSalario - salario

print(f'Novo salario: {novoSalario:.2f}')
print(f'Reajuste ganho: {reajuste:.2f}')
print(f'Em percentual: {percentual} %%')