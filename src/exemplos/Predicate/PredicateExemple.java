package exemplos.Predicate;

import java.util.Arrays;
import java.util.List;

// Representa uma função que aceita argumento do tipo T e retorna um valor do tipo boolean.
// É comumente usada para filtrar os elementos do Stream com base em alguma condição.

public class PredicateExemple {
    public static void main(String[] args) {
        //cria uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "JavaScript", "Kotlyn", "Python", "C", "Ruby", "C#");

        //cria um predicate que verifica se a palavra tem ais de 5 caracteres
        // Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;


        //usar o Stream para filtrar as palavras que tem mais de 5 caracteres e imprimir.
        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
}
