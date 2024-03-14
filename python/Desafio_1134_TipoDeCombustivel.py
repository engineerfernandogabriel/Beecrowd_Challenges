'''
 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
 Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
 Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
 O programa será encerrado quando o código informado for o número 4.

ENTRADA
 A entrada contém apenas valores inteiros e positivos.

SAíDA
 Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
'''

condition = True
countAlcool = 0
countGas = 0
countDiesel = 0

while(condition):
    fuelType = int(input())

    if(fuelType == 4):
        condition = False
    if(fuelType == 3):
        countDiesel += 1
    if(fuelType == 2):
        countGas += 1
    if(fuelType == 1):
        countAlcool += 1

print('MUITO OBRIGADO')
print('Alcool: %d' %countAlcool)
print('Gasolina: %d' %countGas)
print('Diesel: %d' %countDiesel)