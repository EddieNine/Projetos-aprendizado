package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(100);
        numeros.add(10);
        numeros.add(78);
        numeros.add(4);
        numeros.add(-32);
        numeros.add(4);
        numeros.add(8);

        Collections.sort(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
