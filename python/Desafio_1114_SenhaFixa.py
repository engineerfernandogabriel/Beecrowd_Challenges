'''
 Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
 Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
 Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
 Considere que a senha correta é o valor 2002. 

ENTRADA
 A entrada é composta por vários casos de testes contendo valores inteiros.

SAíDA
 Para cada valor lido mostre a mensagem correspondente à descrição do problema. 
'''

PASSWORD = 2002
passwordKey = 0

while(passwordKey != PASSWORD):
    passwordKey = int(input())

    if (passwordKey == PASSWORD):
        print('Acesso Permitido')
    else:
        print('Senha Invalida')