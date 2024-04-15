package exemplos.Function;

import java.util.Arrays;
import java.util.List;



//Representa uma função que aceita m argumento do tipo T e retorna um valor do tipo R.
//É utilizada para transformar ou mapear os elemetos do Stream em outro tipo o valores.

public class FunctionExemple {
    public static void main(String[] args) {

        //cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //usar a função para dobra todos os números no Stream e armazená-los em outra lista de números
        // Function<Integer, Integer> dobrar  = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                //mapeia os elementos do Stream e retorna um Stream com os elementos transformados
                .map(n -> n * 2)
                .toList();
                numerosDobrados.forEach(System.out::println);
    }
}
