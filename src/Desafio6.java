import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

        List<Integer> numerosMaior10 = numeros.stream()
                .filter(n -> n >10)
                .toList();

        if(!numerosMaior10.isEmpty()){
            System.out.println("Os números maiores que 10 na lista são: " + numerosMaior10);
        } else {
            System.out.println("Não há números maiores que '10' ná lista");
        }




    }
}
