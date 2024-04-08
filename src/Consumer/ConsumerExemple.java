package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {

    public static void main(String[] args) {
        //cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //usa o consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirPar = numero -> {
        if(numero % 2 == 0){
            System.out.println(numero);
        }
    };
        //chama o método forEach da lista
        numeros.forEach(imprimirPar);

        //chama o método forEach da lista através de uma referência de método Stream
        // numeros.stream().forEach(imprimirPar);
    }
}
