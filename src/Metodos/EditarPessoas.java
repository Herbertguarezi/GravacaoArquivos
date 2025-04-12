package Metodos;

import java.util.List;
import java.util.Scanner;
import Construtores.*;

public class EditarPessoas{
    static Scanner scanner = new Scanner(System.in);
    public static void editar(List<Pessoa> pessoas){
        int pessoaEditada;
        System.out.println("==============");
        System.out.println("Selecione uma pessoa para editar: ");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoas.indexOf(pessoa) + " - " + pessoa);
        }
        pessoaEditada = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escreva o novo nome: ");
        String nome = scanner.nextLine();
        //pessoas.get(pessoaEditada).setNome(nome);

        System.out.println("Escreva a nova idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        //pessoas.get(pessoaEditada).setIdade(idade);

        System.out.println("Escreva o novo cpf: ");
        String cpf = scanner.nextLine();
       //pessoas.get(pessoaEditada).setCPF(cpf);

        try{
            Pessoa pessoaNova = new Pessoa(nome, idade, cpf);
            pessoas.set(pessoaEditada, pessoaNova);
            System.out.println("Pessoa editada com sucesso!");
            System.out.println("==============");
            GravaPessoas.gravar(pessoas);
        }catch (Exception e){
            System.out.println("Escreva uma opção válida!");
        }
    }
}
