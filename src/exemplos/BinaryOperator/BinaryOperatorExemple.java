package exemplos.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream().reduce(0, somar);

        System.out.println("O resultado da soma é: "+ resultado);
    }
}
