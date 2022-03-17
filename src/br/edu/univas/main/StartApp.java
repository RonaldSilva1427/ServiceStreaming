package br.edu.univas.main;
import br.edu.univas.vo.Player;
import java.util.ArrayList;
import java.util.Scanner;

import static br.edu.univas.main.Menu.*;

public class StartApp {

    private static Scanner sc = new Scanner(System.in);

    private static ArrayList<Player> playerList = new ArrayList<>();

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

// Cadastra os players
    public static void cadastroPlayer() {
        System.out.println("Você escolheu a opção cadastro de Player");

        menuPlayer();

        Player player = new Player();
        String x = sc.nextLine();
        player.setName(x);
        String y = sc.nextLine();
        player.setSite(y);
        playerList.add(player);

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

    public static void tipo() {
        System.out.println("Você escolheu a opção Cadastro de Titulo");
        menuDeTitulo();

        int opcaoTitulo2;
        opcaoTitulo2 = sc.nextInt();
        if (opcaoTitulo2 == 1){
            sc.nextLine();



        }else if(opcaoTitulo2 == 2){



        }else {
            System.out.println("\uD83D\uDEABOpção invalida!\uD83D\uDEAB");
            System.out.println("Pressione a tecla ENTER para voltar ao menu");

        }
        sc.nextLine();

        continuar();

    }

    public static void pesquisaTitulo() {
        System.out.println("Você escolheu a opção pesquisar");

        continuar();

    }


    public static void fim() {
        System.out.println("---------------------------");
        System.out.println("|A aplicação foi encerrada|");
        System.out.println("|            º ͜º          |");
        System.out.println("---------------------------");
        System.exit(0);

    }

   // public static void tipo() {
   //     System.out.println("Você escolheu a opção Tipo 'Séries ou Filme'");
   //  }

    public static void titulo() {
        System.out.println("Você escolheu a opção Título:");


    }

    public static void elenco() {
        System.out.println("Você escolheu a opção Elenco:");
    }

    public static void descricao() {
        System.out.println("Você escolheu a opção Descrição:");
    }

    public static void genero() {
        System.out.println("Você escolheu a opção Gênero:");
    }

    public static void diretor() {
        System.out.println("Você escolheu a opção Diretor:");
    }

    public static void classificacaoEtaria() {
        System.out.println("Você escolheu a opção Classificação Etária:");
    }

    public static void plataforma() {
        System.out.println("Você escolheu a opção Plataforma:");
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