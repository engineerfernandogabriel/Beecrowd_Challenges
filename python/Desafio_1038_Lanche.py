'''
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
 A seguir, calcule e mostre o valor da conta a pagar.

 CODIGO        ESPECIFICACAO        PREÇO
   01         Cachorro-Quente       R$4,00
   02         X-salada              R$4,50
   03         X-bacon               R$5,00
   04         Torrada simples       R$2,00
   05         Refrigerante          R$1,50

ENTRADA
 O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

SAíDa
 O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
'''

valores = list(map(int, input().split()))

code, quantity = valores

if code == 1 :
    total = 4.00 * quantity;
elif code == 2 :
    total = 4.50 * quantity;
elif code == 3 :
    total = 5.00 * quantity;
elif code == 4 :
    total = 2.00 * quantity
elif code == 5 :
    total = 1.50 * quantity
else:
    total = 0.00
    
print('Total: R$ %.2f' %total)
