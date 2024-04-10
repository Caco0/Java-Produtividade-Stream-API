package exemplos.Supplier;

import java.util.List;
// import java.util.function.Supplier;
import java.util.stream.Stream;

//Rerepsenta uma operação que não aceita nenhum argumento e retorna um resultado do tipo T (any)
//É comumente usada para criar ou oferecer novos objetos de um determinado tipo.

public class SupplierExemple {

    public static void main(String[] args) {
        //usar supplier com espressão lambda para fornecer uma saudação personalizada
        // Supplier<String> saudacao = () -> "Olá Como vai você?";

        //usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() ->  "Olá Como vai você?")
        .limit(5)
        .toList(); 

        listaSaudacoes.forEach(System.out::println);
        
    }
}
