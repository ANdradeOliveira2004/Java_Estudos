import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Joana");
        pessoas.add("Lucas");
        pessoas.add("Pedro");
        pessoas.add("Antonio");

        System.out.println(pessoas);

//        //Removendo o nome inserido incorretamente.
        pessoas.remove("Pedro");

        System.out.println(pessoas);
    }
}
