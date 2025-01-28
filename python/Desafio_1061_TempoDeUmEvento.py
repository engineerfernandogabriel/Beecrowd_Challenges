'''
 Pedrinho está organizando um evento em sua Universidade. 
 O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
 O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
 Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

ENTRADA
 Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. 
 Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. 
 Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

SAíDA
 Na saída, deve ser apresentada a duração do evento, no seguinte formato:

    W dia(s)
    X hora(s)
    Y minuto(s)
    Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
'''

infoDiaInicial = input().split()
diaInicial = int(infoDiaInicial[1])
infoHoraInicial = input().split()
horaInicial = int(infoHoraInicial[0])
minutoInicial = int(infoHoraInicial[2])
segundoInicial = int(infoHoraInicial[4])

infoDiaFinal = input().split()
diaFinal = int(infoDiaFinal[1])
infoHoraFinal = input().split()
horaFinal = int(infoHoraFinal[0])
minutoFinal = int(infoHoraFinal[2])
segundoFinal = int(infoHoraFinal[4])

diaInicialTotal = (diaInicial * 86400) + (horaInicial * 3600) + (minutoInicial * 60) + segundoInicial;
diaFinalTotal = (diaFinal * 86400) + (horaFinal * 3600) + (minutoFinal * 60) + segundoFinal;

duracaoTotal = diaFinalTotal - diaInicialTotal

if (duracaoTotal <=0 ):
    duracaoTotal = duracaoTotal + 86400

dia = duracaoTotal // 86400

tempoRestante = duracaoTotal % 86400
hora = tempoRestante / 3600

tempoRestante = tempoRestante % 3600
minuto = tempoRestante / 60

segundo = tempoRestante % 60

print(f'{dia} dia(s)')
print(f'{hora} hora(s)')
print(f'{minuto} minuto(s)')
print(f'{segundo} segundo(s)')