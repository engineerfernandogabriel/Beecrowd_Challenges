'''
 Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

ENTRADA
 A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
 Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 
SAíDA
 Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
'''

n = int(input())
inTotal = 0
outTotal = 0

for i in range (n):
    value = int(input())

    if (value >= 10 and value <=20):
        inTotal += 1
    else:
        outTotal += 1

print('%d in' %inTotal)
print('%d out' %outTotal)