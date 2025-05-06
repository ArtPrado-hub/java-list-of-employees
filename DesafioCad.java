package Desafios;

import java.util.Scanner;

public class DesafioCad {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        //funcionarios numero maximo
        System.out.println("digite o número de funcionário que deseja cadastrar: ");
        int maxf = terminal.nextInt();
        //caracteristicas
        String[] nome = new String[maxf];

        int cadastrados = 0;
        int interatividade = 0;

        while (interatividade != 3) {
            System.out.println("-----------------------------");
            System.out.println(" >Cadastro de funcionários<");
            System.out.println("-----------------------------");
            System.out.println("[1] cadastrar funcionários");
            System.out.println("[2] listar funcionários");
            System.out.println("[3] encerrar sessao");
            interatividade = terminal.nextInt();
            terminal.nextLine();

            switch (interatividade){
                case(1):
                    if (cadastrados < maxf) {
                        System.out.println("digite o nome do funcionário: ");
                        String NomeFuncionario = terminal.nextLine();
                        nome[cadastrados] = NomeFuncionario;
                        cadastrados++;
                        System.out.println("funcionário cadastrado com sucesso.");
                    }else{
                        System.out.println("a lista de funcionários já está cheia.");
                    }
                    break;
                case(2):
                    if (cadastrados == 0){
                        System.out.println("nenhum funcionário foi encontrado");
                    }else{
                        System.out.println("lista dos funcionários");
                        for (int i = 0; i < nome.length ; i++) {
                            System.out.println(nome[i]);
                        }
                    }
                    break;
                case (3):
                    System.out.println("sessão encerrada");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }
        }
    }
}