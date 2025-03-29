import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GravaPessoas {
    public void gravar(Pessoa pessoa, List<Pessoa> pessoas){
        pessoas.add(pessoa);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/pessoas.ser"))) {
            oos.writeObject(pessoas);
            System.out.println("Lista de objetos gravada com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}