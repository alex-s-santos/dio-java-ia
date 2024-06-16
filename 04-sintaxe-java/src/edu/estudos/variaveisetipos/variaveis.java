package edu.estudos.variaveisetipos;

public class variaveis {
    public static void main (String [] arg) {
        final int NUMERO_QUALQUER = 123465; //para declarar uma constante (não pode mudar o valor)
        double salario = 2950.53;
        String nome = "Alex"; //String representa texto, mas não é primitivo, ele é uma classe
        boolean verdade = true;

        System.out.println(NUMERO_QUALQUER);
        System.out.println(salario);
        System.out.println(nome);
        System.out.println(verdade);

        salario = 3695.73; //Redeclaração de variáveis
        System.out.println(salario);
    }
}
