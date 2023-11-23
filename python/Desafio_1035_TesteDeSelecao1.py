'''
 Leia 4 valores inteiros A, B, C e D. 
 A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, 
ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

ENTRADA
 Quatro números inteiros A, B, C e D.

SAíDA
 Mostre a respectiva mensagem após a validação dos valores.
'''

valores = list(map(int, input().split()))

valueA, valueB, valueC, valueD = valores

if (valueB > valueC) & \
    (valueD > valueA) & \
    (valueC + valueD > valueA + valueB) & \
    (valueC > 0) & \
    (valueD > 0) & \
    (valueA % 2 == 0): 
    print('Valores aceitos')
else:
    print('Valores nao aceitos')
