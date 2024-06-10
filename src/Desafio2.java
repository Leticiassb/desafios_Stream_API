import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import static java.util.Arrays.stream;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numerosPares.stream()
                .reduce(0, somar);


        System.out.println("O resultado da soma dos números pares é: " + resultado);




        }
    }

