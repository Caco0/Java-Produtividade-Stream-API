package exemplos.Consumer;

import java.util.Arrays;
import java.util.List;


// Representa uma operação que aceita um argumento do tipo T (any) e não retorna nenhum resultado(Void)
// É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar o próprio elemento.
// E não retorna nenhum valor


public class ConsumerExemple {

    public static void main(String[] args) {
        //cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        
    }
}
