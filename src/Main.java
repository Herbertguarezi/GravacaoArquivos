import java.io.*;
import java.util.List;
import Metodos.*;
import Construtores.*;

public class Main {
    public static void main(String args[]) throws IOException{
        List<Pessoa> pessoas = ValidaArquivo.validaArquivo();
        Menu.menu(pessoas);
    }
}
