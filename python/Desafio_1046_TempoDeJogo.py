'''
 Leia a hora inicial e a hora final de um jogo. 
 A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima 
de 1 hora e máxima de 24 horas.

ENTRADA
 A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

SAíDA
 Apresente a duração do jogo conforme exemplo abaixo.
    "O JOGO DUROU XXX HORA(S)"
'''

values = list(map(int, input().split()))

horaInicial, horaFinal = values

duracao = 0

if (horaInicial < horaFinal):
    duracao = horaFinal - horaInicial
else:
    duracao = (24 - horaInicial) + horaFinal

print('O JOGO DUROU %d HORA(S)' %duracao)
