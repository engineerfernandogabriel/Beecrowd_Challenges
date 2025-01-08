'''
 Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em 
branco e em seguida, os valores na sequência como foram lidos.

ENTRADA
 A entrada contem três números inteiros.

SAíDA
 Imprima a saída conforme foi especificado.
'''

values = list(map(int, input().split()))

valueA, valueB, valueC = values

maior = 0
meio = 0
menor = 0

if (valueA < valueB and valueA < valueC) :
    menor = valueA

    if (valueB < valueC):
        meio = valueB
        maior = valueC
    else :
        meio = valueC
        maior = valueB
elif (valueB < valueC) :
    menor = valueB

    if (valueA < valueC) :
        meio = valueA
        maior = valueC
    else :
        meio = valueC
        maior = valueA
else :
    menor = valueC

    if (valueA < valueB) : 
        meio = valueA
        maior = valueB
    else :
        meio = valueB
        maior = valueA

print(f'{menor}')
print(f'{meio}')
print(f'{maior}')
print('')
print(f'{valueA}')
print(f'{valueB}')
print(f'{valueC}')