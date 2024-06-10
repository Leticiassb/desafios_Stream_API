import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

        Predicate<Integer> isPositivo = numero -> numero >= 0;

        boolean numerosPositivos = numeros.stream()
                .allMatch(isPositivo);

        System.out.println("Todos os números da lista são positivos? " + numerosPositivos);


    }
}
