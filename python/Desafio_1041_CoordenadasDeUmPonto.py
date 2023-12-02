'''
 Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
 A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem 
(x = y = 0).

    Q2   |   Q1
   ----  |  -----
    Q3   |   Q4

 Se o ponto estiver na origem, escreva a mensagem “Origem”.

 Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

ENTRADA
 A entrada contem as coordenadas de um ponto.

SAíDA
 A saída deve apresentar o quadrante em que o ponto se encontra.
'''

coordenadas = list(map(float, input().split()))

valueX, valueY = coordenadas

if (valueX > 0 and valueY > 0) :
    print('Q1')
elif (valueX > 0 and valueY < 0) :
    print('Q4')
elif (valueX < 0 and valueY > 0) :
    print ('Q2');
elif (valueX < 0 and valueY < 0) :
    print('Q3')
elif (valueX == 0 and valueY == 0) :
    print('Origem')
elif (valueX != 0 and valueY == 0) : 
    print('Eixo X')
elif (valueX == 0 and valueY != 0) :
    print('Eixo Y')
