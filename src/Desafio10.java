import java.util.Arrays;
import java.util.List;

public class Desafio10 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        List<Integer> numerosMultiplos3 = numerosImpares.stream()
                .filter(n -> n % 3 == 0)
                .toList();

        List<Integer> numerosMultiplos5 = numerosImpares.stream()
                .filter(n -> n % 5 == 0)
                .toList();

        System.out.println("Os números impares multiplos de 3 são: " + numerosMultiplos3 + " e os números multiplos de 5 são: " + numerosMultiplos5);

    }
}
