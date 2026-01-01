'''
 Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
 Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.


                    Vertebrado
            Ave                 Mamifero
    Carnivoro Onivoro       Onivoro Herbivoro
    Aguia     Pomba         Homem    Vaca


                    Invertebrado
            Inseto                     Anelideo
    Hematofogo Herbivoro         Hematofogo     Onivoro
    Pulga     Lagarta          Sangessuga    Minhooca


ENTRADA
 A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

SAíDa
 Imprima o nome do animal correspondente à entrada fornecida.
'''

grupoAnimal = input()
classeAnimal = input()
alimentacaoAnimal = input()

if (grupoAnimal == "vertebrado"):
    if (classeAnimal == "ave"):
        if (alimentacaoAnimal == "carnivoro"):
            print("aguia")
        else :
            print("pomba")
    elif (classeAnimal == "mamifero"):
        if (alimentacaoAnimal == "onivoro"):
            print("homem")
        else :
            print("vaca")
else :
    if (classeAnimal == "inseto"):
        if (alimentacaoAnimal == "hematofago"):
            print("pulga")
        else :
            print("lagarta")
    elif (classeAnimal == "anelideo"):
        if (alimentacaoAnimal == "hematofago"):
            print("sanguessuga")
        else:
            print("minhoca")