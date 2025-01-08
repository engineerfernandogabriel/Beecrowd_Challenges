'''
 Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

    Perimetro = XX.X

 Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

    Area = XX.X

ENTRADA
 A entrada contém três valores reais.

SAíDA
 O resultado deve ser apresentado com uma casa decimal.
'''

values = list(map(float, input().split()))

valueA, valueB, valueC = values

if (valueA < valueB + valueC 
    and valueB < valueA + valueC
    and valueC < valueA + valueB) :

    perimeter = valueA + valueB + valueC

    print('Perimetro = %.1f' %perimeter)
else :
    area = (valueA + valueB) * valueC / 2

    print('Area = %.1f' %area)