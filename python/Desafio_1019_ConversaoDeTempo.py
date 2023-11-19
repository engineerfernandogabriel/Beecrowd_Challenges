'''
 Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato 
horas:minutos:segundos.

ENTRADA
 O arquivo de entrada contém um valor inteiro N.

SAíDA
 Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
'''

valorTempo = int(input())

horas = valorTempo // 3600

resto = valorTempo % 3600
minutos = resto / 60

resto = resto % 60
segundos = resto

print('%d:%d:%d' %(horas, minutos, segundos))
