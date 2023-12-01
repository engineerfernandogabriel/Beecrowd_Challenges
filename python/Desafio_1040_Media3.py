'''
 Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. 
 Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem 
"Media: ". 
 Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". 
 Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". 
 Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

 No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. 
 Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. 
 Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem 
"Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). 
 Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido 
da média final para esse aluno.

ENTRADA
 A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

SAíDA
 Todas as respostas devem ser apresentadas com uma casa decimal. 
 As mensagens devem ser impressas conforme a descrição do problema. 
 Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
'''

notas = list(map(float, input().split()))

n1, n2, n3, n4 = notas

media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0

if (media >= 7) :
    print('Media: %.1f' %media)
    print('Aluno aprovado.')
elif (media < 5) :
    print('Media: %.1f' %media)
    print('Aluno reprovado.')
else :
    notaExame = float(input())
    mediaFinal = (media + notaExame) / 2.0

    print('Media: %.1f' %media)
    print('Aluno em exame.')
    print('Nota do exame: %.1f' %notaExame)

    if (mediaFinal >= 5) :
        print('Aluno aprovado.')
        print('Media final: %.1f' %mediaFinal)
    elif :
        print('Aluno reprovado.')
        print('Media final: %.1f' %mediaFinal)
