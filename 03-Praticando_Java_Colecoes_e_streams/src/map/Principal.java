package map;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(0, "Claudia");
        clientes.put(1, "Claudia");
        clientes.put(2, "Diomeneis");

        //visualizando o Map
        System.out.println(clientes);

        //Buscando elemento
        System.out.println(clientes.get(1));




    }
}
