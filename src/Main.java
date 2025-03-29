import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        String opcao = "0";
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        GravaPessoas gravaPessoas = new GravaPessoas();
        LePessoas lePessoas = new LePessoas();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/pessoas.ser"))) {
           List<Pessoa> pessoasListas = lePessoas.ler(pessoas);
           for (Pessoa pessoa : pessoasListas){
               pessoas.add(pessoa);
           }
        } catch (IOException e) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/pessoas.ser"));
            oos.writeObject(pessoas);
        }

        do {
            System.out.println("Digite a opção: ");
            System.out.println("1. Cadastro de Pessoa: ");
            System.out.println("2. Listagem de Pessoas: ");
            System.out.println("0. Sair: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome da pessoa á ser cadastrada: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade da pessoa á ser cadastrada:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nome, idade);
                    gravaPessoas.gravar(pessoa, pessoas);
                    break;
                case "2":
                    lePessoas.mostrarPessoas(pessoas);
                    break;
            }

        } while(!opcao.equals("0"));

    }
}
