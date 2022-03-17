package br.edu.univas.main;

public class Menu {

    public static void menuPrincipal() {

        System.out.println("------------------------------------------");
        System.out.println("|Bem-Vindo ao catálogo de Séries e Filmes|");
        System.out.println("|----------------------------------------|");
        System.out.println("| Nesta aplicação você poderá fazer sua  |");
        System.out.println("|   pesquisa ou nos ajudar indicando     |");
        System.out.println("|         seus filmes e séries           |");
        System.out.println("|----------------------------------------|");

        System.out.println("|----------------------------------------|");
        System.out.println("| Selecione a opção abaixo:              |");
        System.out.println("| 1 - Cadastro de Player                 |");
        System.out.println("| 2 - Cadastro de Título                 |");
        System.out.println("| 3 - Pesquisa de Títulos                |");
        System.out.println("| 4 - Sair                               |");
        System.out.println("|----------------------------------------|");
    }

    public static void menuPlayer() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Informe as informações abaixo:         |");
        System.out.println("| 1 - Nome:.......                       |");
        System.out.println("| 2 - Site:.......                       |");
        System.out.println("|----------------------------------------|");
    }

    public static void menuPlayer2(){
        System.out.println("\n|----------------------------------------|");
        System.out.println("| Deseja cadastrar outro player?         |");
        System.out.println("| 1 - Sim                                |");
        System.out.println("| 2 - Não                                |");
        System.out.println("|----------------------------------------|");
    }

    public static void pesquisaTitulo() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Selecione seu tipo de pesquisa:        |");
        System.out.println("| 1 - Pesquisa                           |");
        System.out.println("| 2 - Recomendação por Gênero            |");
        System.out.println("| 3 - Recomendação Aleatória             |");
        System.out.println("|----------------------------------------|");

    }

    public static void menuTituloTipo() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Selecione a opção abaixo:              |");
        System.out.println("| 1 - Filme:.......                      |");
        System.out.println("| 2 - Série:.......                      |");
        System.out.println("|----------------------------------------|");

    }

    public static void menuDeTitulo() {

        System.out.println("|----------------------------------------|");
        System.out.println("| Selecione a opção abaixo:              |");
        System.out.println("| 1 - Tipo (Série ou Filme)              |");
        System.out.println("| 2 - Título                             |");
        System.out.println("| 3 - Elenco                             |");
        System.out.println("| 4 - Descrição                          |");
        System.out.println("| 5 - Gênero                             |");
        System.out.println("| 6 - Diretor                            |");
        System.out.println("| 7 - Classificação Etária               |");
        System.out.println("| 8 - Plataforma                         |");
        System.out.println("|----------------------------------------|");
    }

    public static void elenco() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Informe as pessoas participantes:      |");
        System.out.println("|----------------------------------------|");
    }

    public static void descricao() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Informe as descrições da Serie ou Filme|");
        System.out.println("|----------------------------------------|");
    }

    public static void genero() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Informe o Gênero:                      |");
        System.out.println("|----------------------------------------|");
    }

    public static void diretor() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Informe as pessoas participantes:      |");
        System.out.println("|----------------------------------------|");
    }

    public static void classificacaoEtaria() {

        System.out.println("\n|----------------------------------------|");
        System.out.println("| Informe a classificação etária:        |");
        System.out.println("|----------------------------------------|");
    }

    public static void plataforma() {

        System.out.println("\n|------------------------------------------|");
        System.out.println("| Informe as plataformas:                  |");
        System.out.println("| 1 - Netflix                              |");
        System.out.println("| 2 - Amazon                               |");
        System.out.println("|------------------------------------------|");
    }

}
