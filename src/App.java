import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> frutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Pera", "Manga", "Uva", "Tâmara"));
        List<String> frutas2 = new ArrayList<>(
                Arrays.asList("Mexerica", "Morango", "Tâmara", "Maçã", "Abacaxi", "Uva"));

        System.out.println("\033[32;1;4m" + "Frutas que existem nas duas listas:" + "\033[m");

        frutas2.forEach(item -> {
            if (frutas.contains(item)) {
                System.out.println(item);
            }
        });
    }
}
