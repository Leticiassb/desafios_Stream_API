import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio15 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(-10, -15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

       boolean numeroNegativo = numeros.stream().anyMatch(n -> n < 0);

       List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0).toList();

       if(numeroNegativo){
           System.out.println("Há nesta lista número(s) negativo(s): " + numerosNegativos);
       } else {
           System.out.println("Não há números negativos nesta lista.");
       }


    }
}
