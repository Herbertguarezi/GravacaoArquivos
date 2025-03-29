import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LePessoas {
    public List<Pessoa> ler(List<Pessoa> pessoas) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/pessoas.ser"))) {
             pessoas = (List<Pessoa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
    public void mostrarPessoas(List<Pessoa> pessoas){
        System.out.println("");
        System.out.println("Pessoas");
        System.out.println("==============");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
        System.out.println("==============");
        System.out.println("");
    }
}