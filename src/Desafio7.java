import java.util.Arrays;
import java.util.List;

public class Desafio7 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

        System.out.println(numeros.stream().sorted().toList().get(numeros.size() - 2));

    }
}
