'''
 A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
 Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
 Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
 Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

    - Quantos GRENAIS fizeram parte da estatística.
    - O número de vitórias do Inter.
    - O número de vitórias do Grêmio.
    - O número de Empates.
    - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

ENTRADA
 O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
 Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

SAíDA
 Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
 Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
 
 Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
'''

condition = True
inter = 0
gremio = 0
draws = 0
totalGames = 0

while(condition):
    interGoals, gremioGoals = list(map(int, input().split()))

    if(interGoals > gremioGoals):
        inter += 1
    elif(interGoals < gremioGoals):
        gremio += 1
    else:
        draws +=1

    totalGames += 1

    n = 0

    while(n < 1 or n > 2):
        print('Novo grenal (1-sim 2-nao)')
        n = int(input())

        if(n == 2):
            condition = False

if(inter > gremio):
    winner = 'Inter venceu mais'
elif(inter < gremio):
    winner = 'Gremio venceu mais'
else:
    winner = 'Nao houve vencedor'

print('%s grenais' %totalGames)
print('Inter:%d' %inter)
print('Gremio:%d' %gremio)
print('Empates:%d' %draws)
print('%s' %winner)