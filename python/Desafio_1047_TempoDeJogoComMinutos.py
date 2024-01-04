'''
 Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

 Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

ENTRADA
 Quatro números inteiros representando a hora de início e fim do jogo.

SAíDA
 Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”.
'''

horaInicial, minutoInicial, horaFinal, minutoFinal = list(map(int, input().split()))

minutoInicial = minutoInicial  + (horaInicial * 60)
minutoFinal = minutoFinal + (horaFinal * 60)

duracao = minutoFinal - minutoInicial

if (duracao <= 0):
    duracao = duracao + (24 * 60)

duracaoHoras = duracao // 60
duracaoMinutos = duracao % 60

print('O JOGO DUROU %d HORA(S) E %d MINUTO(S)' %(duracaoHoras, duracaoMinutos))