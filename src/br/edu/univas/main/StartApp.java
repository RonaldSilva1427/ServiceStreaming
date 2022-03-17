package br.edu.univas.main;
import br.edu.univas.vo.*;

import java.util.ArrayList;
import java.util.Scanner;

import static br.edu.univas.main.Menu.*;

public class StartApp {

    private static Scanner sc = new Scanner(System.in);

    private static ArrayList<Player> playerList = new ArrayList<>();
    private static ArrayList<Titulo> tituloList = new ArrayList<>();
    private static ArrayList<Elenco> elencoList = new ArrayList<>();
    private static ArrayList<Descricao> descricaoList = new ArrayList<>();
    private static ArrayList<Genero> generoList = new ArrayList<>();
    private static ArrayList<Diretor> diretorList = new ArrayList<>();
    private static ArrayList<ClassificacaoEtaria> classificacaoEtariaList = new ArrayList<>();

    public static void main (String [] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            Menu.menuPrincipal();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastroPlayer();
                    break;

                case 2:
                    tipo();
                    break;

                case 3:
                    pesquisaTitulo();
                    break;


                case 4:
                    fim();
                    break;

                default:
                    System.out.println("\uD83D\uDEABOpção invalida! Por favor, digite uma opção correta!\uD83D\uDEAB");
            }
        } while (opcao != 0 || opcao == 0);
    }

    // Volta para o menu principal
    public static void continuar() {
        System.out.println("\nPressione a tecla ENTER para voltar ao menu");
        Scanner scContinuar = new Scanner(System.in);
        scContinuar.nextLine();

    }

    // Cadastra os Players
    public static void cadastroPlayer() {
        System.out.println("Você escolheu a opção cadastro de Player");

        // Ele aparece a primeira pagina para guardar as informaçoes
        menuPlayer();

        Player player = new Player();
        String x = sc.nextLine();
        player.setName(x);
        String y = sc.nextLine();
        player.setSite(y);
        playerList.add(player);

        // Aqui ele pergunta de voce deseja cadastrar novamente
        menuPlayer2();

        int opcaoPlayer2;
        opcaoPlayer2 = sc.nextInt();
        if (opcaoPlayer2 == 1){
            sc.nextLine();
            cadastroPlayer();
        }else if(opcaoPlayer2 == 2){

            for (int i = 0; i < playerList.size(); i++) {
                Player player2 = playerList.get(i);
                if (player2 != null) {
                    System.out.println("Nome: " + player2.getName());
                    System.out.println("Site: " + player2.getSite());
                }
            }
            continuar();
        }else {
            System.out.println("\uD83D\uDEABOpção invalida!\uD83D\uDEAB");
            System.out.println("Pressione a tecla ENTER para voltar ao menu");

        }
        sc.nextLine();

    }

    // Cadastra o tipo (No cadastro de Titulo)
    public static void tipo() {
        System.out.println("Você escolheu a opção Cadastro de Titulo");
        menuDeTitulo();

        int opcaoTitulo2;
        opcaoTitulo2 = sc.nextInt();
        if (opcaoTitulo2 == 1){
            sc.nextLine();
            System.out.println("Você escolheu a opção Serie!");

            titulo();
            Titulo titulo = new Titulo();
            String a = sc.nextLine();
            titulo.setTitulo(a);
            tituloList.add(titulo);

            elenco();
            Elenco elenco = new Elenco();
            String b = sc.nextLine();
            elenco.setElenco(b);
            elencoList.add(elenco);

            descricao();
            Descricao descricao = new Descricao();
            String c = sc.nextLine();
            descricao.setDescricao(c);
            descricaoList.add(descricao);

            genero();
            Genero genero = new Genero();
            String d = sc.nextLine();
            genero.setGenero(d);
            generoList.add(genero);

            diretor();
            Diretor diretor = new Diretor();
            String e = sc.nextLine();
            diretor.setDiretor(e);
            diretorList.add(diretor);

            classificacaoEtaria();
            ClassificacaoEtaria classificacaoEtaria = new ClassificacaoEtaria();
            String x = sc.nextLine();
            classificacaoEtaria.setClassificacaoEtaria(x);
            classificacaoEtariaList.add(classificacaoEtaria);

            plataforma();
            Plataforma plataforma = new Plataforma();
            String g = sc.nextLine();
            plataforma.setPlataforma(g);

        }else if(opcaoTitulo2 == 2){
            System.out.println("Você escolheu a opção Filme!");

            titulo();
            Titulo titulo = new Titulo();
            String a = sc.nextLine();
            titulo.setTitulo(a);
            tituloList.add(titulo);

            elenco();
            Elenco elenco = new Elenco();
            String b = sc.nextLine();
            elenco.setElenco(b);
            elencoList.add(elenco);

            descricao();
            Descricao descricao = new Descricao();
            String c = sc.nextLine();
            descricao.setDescricao(c);
            descricaoList.add(descricao);

            genero();
            Genero genero = new Genero();
            String d = sc.nextLine();
            genero.setGenero(d);
            generoList.add(genero);

            diretor();
            Diretor diretor = new Diretor();
            String e = sc.nextLine();
            diretor.setDiretor(e);
            diretorList.add(diretor);

            classificacaoEtaria();
            ClassificacaoEtaria classificacaoEtaria = new ClassificacaoEtaria();
            String x = sc.nextLine();
            classificacaoEtaria.setClassificacaoEtaria(x);
            classificacaoEtariaList.add(classificacaoEtaria);

            plataforma();
            Plataforma plataforma = new Plataforma();
            String g = sc.nextLine();
            plataforma.setPlataforma(g);


        }else {
            System.out.println("\uD83D\uDEABOpção invalida!\uD83D\uDEAB");
            System.out.println("Pressione a tecla ENTER para voltar ao menu");

        }
        sc.nextLine();

        continuar();

    }


    /*-public static String leitorString(Scanner x){
        String aux = x.nextLine();
        return aux;

    }
    */


}


   /* //1 - Cadastro de Player
    String nome;
        System.out.println("Digite o nome do Streamer!");
                nome = sc.nextLine();


                ArrayList<Player> playerList = new ArrayList<>();

        for (int i = 0; i < playerList.size(); i++) {
        Player player = playerList.get(i);
        if (player != null) {
        System.out.println("Nome: " + player.getName());
        System.out.println("Site: " + player.getSite());
        }
        }

    */