'''
 Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, 
o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

ENTRADA
 O arquivo de entrada contém duas linhas de dados. 
 Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

SAíDA
 A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço
após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
'''

linha1 = input().split(" ")
linha2 = input().split(" ")

codigoPc1, quantidadePc1, valorPc1 = linha1

codigoPc2, quantidadePc2, valorPC2 = linha2

valorPagar = (int(quantidadePc1) * float(valorPc1)) + (int(quantidadePc2) * float(valorPC2))

print(f'VALOR A PAGAR: R$ {valorPagar:.2f}')
#print('VALOR A PAGAR: R$ %.2f' %valorPagar)