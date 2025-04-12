package Metodos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import Construtores.*;

public class ValidaArquivo {
    public static List<Pessoa> validaArquivo() throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        LePessoas lePessoas = new LePessoas();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/pessoas.ser"))) {
            List<Pessoa> pessoasListas = lePessoas.ler(pessoas);
            pessoas.addAll(pessoasListas);
        } catch (IOException e) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/pessoas.ser"));
            oos.writeObject(pessoas);
        }
        return pessoas;
    }

}
