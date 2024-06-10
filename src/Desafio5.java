import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        double numerosMaiores5 = numeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow(() -> new NoSuchElementException("Não foi possivel calcular a média."));

        System.out.println("A média dos números maiores que 5 é: " + numerosMaiores5);





    }
}
