'''
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 	
    I=0 J=1
    I=0 J=2
    I=0 J=3
    I=0.2 J=1.2
    I=0.2 J=2.2
    I=0.2 J=3.2
    .....
    I=2 J=?
    I=2 J=?
    I=2 J=?

ENTRADA
 Não há nenhuma entrada neste problema.

SAíDA
 Imprima a sequencia conforme exemplo abaixo.
'''

i = float(0)
j = float(1)

while(i <= 2):
    if (i == 0 or i == 1 or i > 1.8) :
        print(f'I={i:.0f} J={j:.0f}')
        print(f'I={i:.0f} J={j + 1:.0f}')
        print(f'I={i:.0f} J={j + 2:.0f}')
    else:
        print(f'I={i:.1f} J={j:.1f}')
        print(f'I={i:.1f} J={j + 1:.1f}')
        print(f'I={i:.1f} J={j + 2:.1f}')

    i += 0.2
    j += 0.2