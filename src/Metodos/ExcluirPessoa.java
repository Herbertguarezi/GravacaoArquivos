package Metodos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import Construtores.*;

public class ExcluirPessoa {
    static Scanner scanner = new Scanner(System.in);
    public static void exclui(List<Pessoa> pessoas){
        String pessoaExcluida;
        System.out.println("==============");
        System.out.println("Selecione uma pessoa para excluir: ");
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoas.indexOf(pessoa) + " - " + pessoa);
        }
        System.out.println("clear - Excluir todas as pessoas");
        pessoaExcluida = scanner.nextLine();
        try {
            if(pessoaExcluida.equals("clear")){
                pessoas.clear();
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/pessoas.ser"))) {
                    oos.writeObject(pessoas);
                    System.out.println("Lista de pessoas limpa!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                pessoas.remove(Integer.parseInt(pessoaExcluida));
                System.out.println("Pessoa excluida com sucesso");
            }
            System.out.println("==============");
            GravaPessoas.gravar(pessoas);
        }catch (Exception e){
            System.out.println("Escolha uma opção válida");
        }

    }
}
