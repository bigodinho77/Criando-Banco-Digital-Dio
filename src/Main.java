import Modelos.Gato;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("bichi",12,"amarelo"));
            add(new Gato("nito",1,"branco"));
            add(new Gato("nitinho",2,"verde"));
        }};

        System.out.println(gatos);
        }
    }