import java.util.Arrays;
import java.util.List;

public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

        List<Integer> quadradoDosNumeros = numeros.stream().map(n -> n * n).toList();

        int somaDosQuadrados = quadradoDosNumeros.stream().reduce(0, Integer::sum);

        System.out.println("A soma do quadrado dos números é igual a: " + somaDosQuadrados);
    }
}
