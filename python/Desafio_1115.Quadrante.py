'''
 Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
 Para cada ponto escrever o quadrante a que ele pertence. 
 O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

ENTRADA
 A entrada contém vários casos de teste. 
 Cada caso de teste contém 2 valores inteiros.

SAíDA
 Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
'''

condition = True

while(condition):
    x, y = list(map(int, input().split()))

    if ( x == 0 or y == 0):
        condition = False
    elif (x > 0 and y > 0):
        print('primeiro')
    elif (x > 0 and y < 0):
        print('quarto')
    elif (x < 0 and y > 0):
        print('segundo')
    else:
        print('terceiro')