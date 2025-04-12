package Metodos;

import java.util.List;
import java.util.Scanner;
import Construtores.*;

public class Menu {
    public static void menu(List<Pessoa> pessoas){
        Scanner scanner = new Scanner(System.in);
        String opcao = "0";
        do {
            System.out.println("Digite a opção: ");
            System.out.println("1. Cadastro de Pessoa: ");
            System.out.println("2. Listagem de Pessoas: ");
            System.out.println("3. Excluir Pessoas: ");
            System.out.println("4. Editar Pessoas: ");
            System.out.println("0. Sair: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome da pessoa á ser cadastrada: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade da pessoa á ser cadastrada:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o nome da pessoa á ser cadastrada: ");
                    String cpf = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nome, idade, cpf);
                    GravaPessoas.gravar(pessoa, pessoas);
                    break;
                case "2":
                    LePessoas.mostrarPessoas(pessoas);
                    break;
                case "3":
                    ExcluirPessoa.exclui(pessoas);
                    break;
                case "4":
                    EditarPessoas.editar(pessoas);
                    break;
            }

        } while(!opcao.equals("0"));

    }
}
