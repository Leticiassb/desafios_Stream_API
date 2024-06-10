import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio18 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

        Set<Integer> setNumeros = new HashSet<>();  // set para guardar primeira ocorrencia de cada numero
        List<Integer> numerosRepetidos = numeros.stream()  // percorre toda a lista
                .filter(n -> !setNumeros.add(n))  // filtra pelos que não são adicionados à setNumeros (repetidos)
                .toList();   // adiciona à nova lista os números repetidos

        System.out.println("Os únicos números que se repetem na lista são: " + numerosRepetidos);


    }
}
