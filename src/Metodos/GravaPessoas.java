package Metodos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import Construtores.*;
import java.util.List;

public class GravaPessoas {
    public static void gravar(Pessoa pessoa, List<Pessoa> pessoas){
        pessoas.add(pessoa);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/pessoas.ser"))) {
            oos.writeObject(pessoas);
            System.out.println("Lista de objetos gravada com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void gravar(List<Pessoa> pessoas){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/pessoas.ser"))) {
            oos.writeObject(pessoas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}